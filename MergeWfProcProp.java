import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;
import java.util.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;
import java.awt.Frame;
import com.rits.cloning.*;

public class MergeWfProcProp {

	public ArrayList<RepositoryWfProcessProp> compareProcPropList(int choice, Frame frame, String ProcessName, ArrayList<RepositoryWfProcessProp> listOfrepWfProcPropLowerArg, ArrayList<RepositoryWfProcessProp> listOfrepWfProcPropHigherArg) throws CloneNotSupportedException {
		ArrayList<RepositoryWfProcessProp> listOfrepWfProcPropCommonMerged = new ArrayList<RepositoryWfProcessProp>();
		ArrayList<RepositoryWfProcessProp> listOfrepWfProcPropLowerMerged = new ArrayList<RepositoryWfProcessProp>();
		ArrayList<RepositoryWfProcessProp> listOfrepWfProcPropHigherMerged = new ArrayList<RepositoryWfProcessProp>();
		ArrayList<RepositoryWfProcessProp> listOfrepWfProcPropFinalMerged = new ArrayList<RepositoryWfProcessProp>();
		ArrayList<RepositoryWfProcessProp> listOfrepWfProcPropLower = new ArrayList<RepositoryWfProcessProp>(listOfrepWfProcPropLowerArg);
		ArrayList<RepositoryWfProcessProp> listOfrepWfProcPropHigher = new ArrayList<RepositoryWfProcessProp>(listOfrepWfProcPropHigherArg);
		int lowerMatchCtr, higherMatchCtr, lowerCtr, lowerAuxCtr, higherAuxCtr, higherCtr, mergedAuxCtr;
		//Placing the common Process Props in listOfrepWfProcPropCommonMerged

		for (lowerMatchCtr=0; lowerMatchCtr<listOfrepWfProcPropLower.size(); lowerMatchCtr++)
		{
			for (higherMatchCtr=0; higherMatchCtr<listOfrepWfProcPropHigher.size(); higherMatchCtr++)
			{
				if (listOfrepWfProcPropLower.get(lowerMatchCtr).Name2.equals(listOfrepWfProcPropHigher.get(higherMatchCtr).Name2))
				{
					RepositoryWfProcessProp temp;
					Cloner cloner = new Cloner();
					switch (choice)
					{
					case 0:
						temp = cloner.deepClone(listOfrepWfProcPropLower.get(lowerMatchCtr));
						if (!listOfrepWfProcPropLower.get(lowerMatchCtr).equals(listOfrepWfProcPropHigher.get(higherMatchCtr)))
						{
							ConflictWfProcProp conflictWfProcProp = new ConflictWfProcProp(frame);
							conflictWfProcProp.setWfName(ProcessName);
							conflictWfProcProp.setPPName(listOfrepWfProcPropLower.get(lowerMatchCtr).Name2);

							conflictWfProcProp.setLowerDispName(listOfrepWfProcPropLower.get(lowerMatchCtr).DisplayName);
							conflictWfProcProp.setLowerInOut(listOfrepWfProcPropLower.get(lowerMatchCtr).InOut);
							conflictWfProcProp.setLowerBC(listOfrepWfProcPropLower.get(lowerMatchCtr).BusinessComponent);
							conflictWfProcProp.setLowerVF(listOfrepWfProcPropLower.get(lowerMatchCtr).VirtualField);
							conflictWfProcProp.setLowerDefaultString(listOfrepWfProcPropLower.get(lowerMatchCtr).DefaultString);
							conflictWfProcProp.setLowerDefaultDate(listOfrepWfProcPropLower.get(lowerMatchCtr).DefaultDate);
							conflictWfProcProp.setLowerDataType(listOfrepWfProcPropLower.get(lowerMatchCtr).DataType);
							conflictWfProcProp.setLowerIO(listOfrepWfProcPropLower.get(lowerMatchCtr).IntegrationObject);
							conflictWfProcProp.setLowerDefaultNumber(listOfrepWfProcPropLower.get(lowerMatchCtr).DefaultNumber);
							conflictWfProcProp.setLowerCorrelator(listOfrepWfProcPropLower.get(lowerMatchCtr).CorrelatorFlag);
							conflictWfProcProp.setLowerInactive(listOfrepWfProcPropLower.get(lowerMatchCtr).Inactive);
							conflictWfProcProp.setLowerComments(listOfrepWfProcPropLower.get(lowerMatchCtr).Comments);
							conflictWfProcProp.setLowerAccessMode(listOfrepWfProcPropLower.get(lowerMatchCtr).AccessMode);

							conflictWfProcProp.setHigherDispName(listOfrepWfProcPropHigher.get(higherMatchCtr).DisplayName);
							conflictWfProcProp.setHigherInOut(listOfrepWfProcPropHigher.get(higherMatchCtr).InOut);
							conflictWfProcProp.setHigherBC(listOfrepWfProcPropHigher.get(higherMatchCtr).BusinessComponent);
							conflictWfProcProp.setHigherVF(listOfrepWfProcPropHigher.get(higherMatchCtr).VirtualField);
							conflictWfProcProp.setHigherDefaultString(listOfrepWfProcPropHigher.get(higherMatchCtr).DefaultString);
							conflictWfProcProp.setHigherDefaultDate(listOfrepWfProcPropHigher.get(higherMatchCtr).DefaultDate);
							conflictWfProcProp.setHigherDataType(listOfrepWfProcPropHigher.get(higherMatchCtr).DataType);
							conflictWfProcProp.setHigherIO(listOfrepWfProcPropHigher.get(higherMatchCtr).IntegrationObject);
							conflictWfProcProp.setHigherDefaultNumber(listOfrepWfProcPropHigher.get(higherMatchCtr).DefaultNumber);
							conflictWfProcProp.setHigherCorrelator(listOfrepWfProcPropHigher.get(higherMatchCtr).CorrelatorFlag);
							conflictWfProcProp.setHigherInactive(listOfrepWfProcPropHigher.get(higherMatchCtr).Inactive);
							conflictWfProcProp.setHigherComments(listOfrepWfProcPropHigher.get(higherMatchCtr).Comments);
							conflictWfProcProp.setHigherAccessMode(listOfrepWfProcPropHigher.get(higherMatchCtr).AccessMode);

							conflictWfProcProp.setNewDispName(temp.DisplayName);
							conflictWfProcProp.setNewInOut(temp.InOut);
							conflictWfProcProp.setNewBC(temp.BusinessComponent);
							conflictWfProcProp.setNewVF(temp.DataType, temp.VirtualField);
							conflictWfProcProp.setNewDefaultString(temp.DefaultString);
							conflictWfProcProp.setNewDefaultDate(temp.DefaultDate);
							conflictWfProcProp.setNewDataType(temp.DataType);
							conflictWfProcProp.setNewIO(temp.IntegrationObject);
							conflictWfProcProp.setNewDefaultNumber(temp.DefaultNumber);
							conflictWfProcProp.setNewCorrelator(temp.CorrelatorFlag);
							conflictWfProcProp.setNewInactive(temp.Inactive);
							conflictWfProcProp.setNewComments(temp.Comments);
							conflictWfProcProp.setNewAccessMode(temp.AccessMode);

							conflictWfProcProp.setVisible(true);

							temp.AccessMode = conflictWfProcProp.AccessMode;
							temp.BusinessComponent = conflictWfProcProp.BusinessComponent;
							temp.Comments = conflictWfProcProp.Comments;
							temp.CorrelatorFlag = conflictWfProcProp.CorrelatorFlag;
							temp.DataType = conflictWfProcProp.DataType;
							temp.DefaultDate = conflictWfProcProp.DefaultDate;
							temp.DefaultNumber = conflictWfProcProp.DefaultNumber;
							temp.DefaultString = conflictWfProcProp.DefaultString;
							temp.DisplayName = conflictWfProcProp.DisplayName;
							temp.InOut = conflictWfProcProp.InOut;
							temp.Inactive = conflictWfProcProp.Inactive;
							temp.IntegrationObject = conflictWfProcProp.IntegrationObject;
							temp.VirtualField = conflictWfProcProp.VirtualField;
						}
						listOfrepWfProcPropCommonMerged.add(temp);
						break;
					case 1:
						temp = cloner.deepClone(listOfrepWfProcPropLower.get(lowerMatchCtr));
						listOfrepWfProcPropCommonMerged.add(temp);
						break;
					case 2:
						temp = cloner.deepClone(listOfrepWfProcPropHigher.get(higherMatchCtr));
						listOfrepWfProcPropCommonMerged.add(temp);
						break;
					default:
						break;
					}
				}
			}
		}

		//Placing the lower extra Process Props in listOfrepWfProcPropLowerMerged
		for (lowerCtr=0; lowerCtr<listOfrepWfProcPropLower.size(); lowerCtr++)
		{
			for (higherAuxCtr=0; higherAuxCtr<listOfrepWfProcPropHigher.size(); higherAuxCtr++)
			{
				if (listOfrepWfProcPropLower.get(lowerCtr).Name2.equals(listOfrepWfProcPropHigher.get(higherAuxCtr).Name2))
				{
					break;
				}
			}
			if (higherAuxCtr == listOfrepWfProcPropHigher.size())
			{
				listOfrepWfProcPropLowerMerged.add(listOfrepWfProcPropLower.get(lowerCtr));
			}
		}

		//Placing the higher extra Process Props in listOfrepWfProcPropHigherMerged
		for (higherCtr=0; higherCtr<listOfrepWfProcPropHigher.size(); higherCtr++)
		{
			for (lowerAuxCtr=0; lowerAuxCtr<listOfrepWfProcPropLower.size(); lowerAuxCtr++)
			{
				if (listOfrepWfProcPropHigher.get(higherCtr).Name2.equals(listOfrepWfProcPropLower.get(lowerAuxCtr).Name2))
				{
					break;
				}
			}
			if (lowerAuxCtr == listOfrepWfProcPropLower.size())
			{
				listOfrepWfProcPropHigherMerged.add(listOfrepWfProcPropHigher.get(higherCtr));
			}
		}

		//listOfrepWfProcPropFinalMerged = listOfrepWfProcPropCommonMerged + listOfrepWfProcPropLowerMerged + listOfrepWfProcPropHigherMerged
		listOfrepWfProcPropFinalMerged.addAll(listOfrepWfProcPropCommonMerged);
		listOfrepWfProcPropFinalMerged.addAll(listOfrepWfProcPropLowerMerged);
		listOfrepWfProcPropFinalMerged.addAll(listOfrepWfProcPropHigherMerged);

		return listOfrepWfProcPropFinalMerged;
	}
}