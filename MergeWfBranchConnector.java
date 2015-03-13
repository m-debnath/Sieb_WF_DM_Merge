import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;
import java.util.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;
import java.awt.Frame;
import com.rits.cloning.*;

public class MergeWfBranchConnector {

	public ArrayList<RepositoryWfBranchConnector> compareBranchConnList(int choice, Frame frame, String sName, ArrayList<RepositoryWfBranchConnector> listOfrepWfBrnchConnLower, ArrayList<RepositoryWfBranchConnector> listOfrepWfBrnchConnHigher, ArrayList<RepositoryWfStep> listOfrepWfStepMerged) throws CloneNotSupportedException {
		ArrayList<RepositoryWfBranchConnector> listOfrepWfBrnchConnCommonMerged = new ArrayList<RepositoryWfBranchConnector>();
		ArrayList<RepositoryWfBranchConnector> listOfrepWfBrnchConnLowerMerged = new ArrayList<RepositoryWfBranchConnector>();
		ArrayList<RepositoryWfBranchConnector> listOfrepWfBrnchConnHigherMerged = new ArrayList<RepositoryWfBranchConnector>();
		ArrayList<RepositoryWfBranchConnector> listOfrepWfBrnchConnFinalMerged = new ArrayList<RepositoryWfBranchConnector>();
		int lowerMatchCtr, higherMatchCtr, lowerCtr, lowerAuxCtr, higherAuxCtr, higherCtr, mergedAuxCtr;
		//Placing the common Process Props in listOfrepWfBrnchConnCommonMerged
		for (lowerMatchCtr=0; lowerMatchCtr<listOfrepWfBrnchConnLower.size(); lowerMatchCtr++)
		{
			for (higherMatchCtr=0; higherMatchCtr<listOfrepWfBrnchConnHigher.size(); higherMatchCtr++)
			{
				if (listOfrepWfBrnchConnLower.get(lowerMatchCtr).Name2.equals(listOfrepWfBrnchConnHigher.get(higherMatchCtr).Name2))
				{
					
					RepositoryWfBranchConnector temp;
					Cloner cloner = new Cloner();
					switch(choice)
					{
					case 0:
						temp = cloner.deepClone(listOfrepWfBrnchConnLower.get(lowerMatchCtr));

						if (!listOfrepWfBrnchConnLower.get(lowerMatchCtr).equals(listOfrepWfBrnchConnHigher.get(higherMatchCtr)))
						{
							ConflictWfBranchConnector conflictWfBranchConnector = new ConflictWfBranchConnector(frame);
							conflictWfBranchConnector.setWFName(sName);
							conflictWfBranchConnector.setBranchConnName(listOfrepWfBrnchConnLower.get(lowerMatchCtr).Name2);

							conflictWfBranchConnector.setLowerFromStep(listOfrepWfBrnchConnLower.get(lowerMatchCtr).FromStepName);
							conflictWfBranchConnector.setLowerToStep(listOfrepWfBrnchConnLower.get(lowerMatchCtr).ToStepName);

							conflictWfBranchConnector.setHigherFromStep(listOfrepWfBrnchConnHigher.get(higherMatchCtr).FromStepName);
							conflictWfBranchConnector.setHigherToStep(listOfrepWfBrnchConnHigher.get(higherMatchCtr).ToStepName);

							conflictWfBranchConnector.setNewFromStep(temp.FromStepName);
							conflictWfBranchConnector.setNewToStep(listOfrepWfStepMerged, temp.ToStepName);

							conflictWfBranchConnector.setVisible(true);

							temp.FromStepName = conflictWfBranchConnector.FinalFromStepName;
							temp.ToStepName = conflictWfBranchConnector.FinalToStepName;
						}
						break;
					case 1:
						temp = cloner.deepClone(listOfrepWfBrnchConnLower.get(lowerMatchCtr));
						break;
					case 2:
						temp = cloner.deepClone(listOfrepWfBrnchConnHigher.get(higherMatchCtr));
						break;
					default:
						temp = cloner.deepClone(listOfrepWfBrnchConnLower.get(lowerMatchCtr));
						break;
					}
					if (!listOfrepWfBrnchConnLower.get(lowerMatchCtr).Layout.equals(listOfrepWfBrnchConnHigher.get(higherMatchCtr).Layout))
					{
						String sBranhConnName = new String(temp.Name2);
						String sFromStepName = new String(temp.FromStepName);
						String sToStepName = new String(temp.ToStepName);
						String sBranchConnLayout = new String(temp.Layout);
						String sFromStepLayout = new String("");
						String sToStepLayout = new String("");
						String [] sFromStepLoc = new String[4];
						String [] sToStepLoc = new String[4];
						int [] iFromStepLoc = new int[4];
						int [] iToStepLoc = new int[4];
						int [] iBranchConnLoc = new int[4];
						
						for (int stepCtr = 0; stepCtr < listOfrepWfStepMerged.size(); stepCtr++)
						{
							if (listOfrepWfStepMerged.get(stepCtr).Name3.equals(sFromStepName))
							{
								sFromStepLayout = listOfrepWfStepMerged.get(stepCtr).Layout;
							}
							if (listOfrepWfStepMerged.get(stepCtr).Name3.equals(sToStepName))
							{
								sToStepLayout = listOfrepWfStepMerged.get(stepCtr).Layout;
							}
						}
						sFromStepLoc = sFromStepLayout.substring(sFromStepLayout.indexOf("r")+4,sFromStepLayout.indexOf("9*F")).split(" ");
						for (int i = 0; i < sFromStepLoc.length; i++)
						{
							iFromStepLoc[i] = Integer.parseInt(sFromStepLoc[i]);
						}
						sToStepLoc = sToStepLayout.substring(sToStepLayout.indexOf("r")+4,sToStepLayout.indexOf("9*F")).split(" ");
						for (int i = 0; i < sToStepLoc.length; i++)
						{
							iToStepLoc[i] = Integer.parseInt(sToStepLoc[i]);
						}

						String sBranchConnOldLayoutTo = new String(sBranchConnLayout.substring(sBranchConnLayout.indexOf("P")+4,sBranchConnLayout.indexOf("4*",sBranchConnLayout.indexOf("P")+4)));
						String sBranchConnOldLayoutFrom = new String(sBranchConnLayout.substring(sBranchConnLayout.indexOf("P07*")+4,sBranchConnLayout.indexOf("4*",sBranchConnLayout.indexOf("P07*")+4)));
						
						iBranchConnLoc[0] = iFromStepLoc[2];
						iBranchConnLoc[1] = iFromStepLoc[1] + ((iFromStepLoc[3] - iFromStepLoc[1]) / 2);
						iBranchConnLoc[2] = iToStepLoc[0];
						iBranchConnLoc[3] = iToStepLoc[1] + ((iToStepLoc[3] - iToStepLoc[1]) / 2);

						String sBranchConnNewLayoutTo = new String(iBranchConnLoc[2] + " " + iBranchConnLoc[3]);
						String sBranchConnNewLayoutFrom = new String(iBranchConnLoc[0] + " " + iBranchConnLoc[1]);

						sBranchConnLayout = sBranchConnLayout.replaceAll(sBranchConnOldLayoutTo, sBranchConnNewLayoutTo);
						sBranchConnLayout = sBranchConnLayout.replaceAll(sBranchConnOldLayoutFrom, sBranchConnNewLayoutFrom);

						temp.Layout = sBranchConnLayout;
					}
					listOfrepWfBrnchConnCommonMerged.add(temp);
				}
			}
		}

		//Placing the lower extra Process Props in listOfrepWfBrnchConnLowerMerged
		for (lowerCtr=0; lowerCtr<listOfrepWfBrnchConnLower.size(); lowerCtr++)
		{
			for (higherAuxCtr=0; higherAuxCtr<listOfrepWfBrnchConnHigher.size(); higherAuxCtr++)
			{
				if (listOfrepWfBrnchConnLower.get(lowerCtr).Name2.equals(listOfrepWfBrnchConnHigher.get(higherAuxCtr).Name2))
				{
					break;
				}
			}
			if (higherAuxCtr == listOfrepWfBrnchConnHigher.size())
			{
				listOfrepWfBrnchConnLowerMerged.add(listOfrepWfBrnchConnLower.get(lowerCtr));
			}
		}

		//Placing the higher extra Process Props in listOfrepWfBrnchConnHigherMerged
		for (higherCtr=0; higherCtr<listOfrepWfBrnchConnHigher.size(); higherCtr++)
		{
			for (lowerAuxCtr=0; lowerAuxCtr<listOfrepWfBrnchConnLower.size(); lowerAuxCtr++)
			{
				if (listOfrepWfBrnchConnHigher.get(higherCtr).Name2.equals(listOfrepWfBrnchConnLower.get(lowerAuxCtr).Name2))
				{
					break;
				}
			}
			if (lowerAuxCtr == listOfrepWfBrnchConnLower.size())
			{
				listOfrepWfBrnchConnHigherMerged.add(listOfrepWfBrnchConnHigher.get(higherCtr));
			}
		}

		//listOfrepWfBrnchConnFinalMerged = listOfrepWfBrnchConnCommonMerged + listOfrepWfBrnchConnLowerMerged + listOfrepWfBrnchConnHigherMerged
		listOfrepWfBrnchConnFinalMerged.addAll(listOfrepWfBrnchConnCommonMerged);
		listOfrepWfBrnchConnFinalMerged.addAll(listOfrepWfBrnchConnLowerMerged);
		listOfrepWfBrnchConnFinalMerged.addAll(listOfrepWfBrnchConnHigherMerged);

		return listOfrepWfBrnchConnFinalMerged;
	}
}