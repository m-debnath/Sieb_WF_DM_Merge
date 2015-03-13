import java.util.*;
import java.awt.Frame;
import com.rits.cloning.*;

public class MergeEaiMapArgument {
	public MergeEaiMapArgument() {
		super();
	}

	public ArrayList<EaiMapArgument> compareEaiMapArgumentList(int choice, Frame frame, String sName, ArrayList<EaiMapArgument> listOfEaiMapArgumentLowerArg, ArrayList<EaiMapArgument> listOfEaiMapArgumentHigherArg) throws CloneNotSupportedException {
		ArrayList<EaiMapArgument> listOfEaiMapArgumentCommonMerged = new ArrayList<EaiMapArgument>();
		ArrayList<EaiMapArgument> listOfEaiMapArgumentLowerMerged = new ArrayList<EaiMapArgument>();
		ArrayList<EaiMapArgument> listOfEaiMapArgumentHigherMerged = new ArrayList<EaiMapArgument>();
		ArrayList<EaiMapArgument> listOfEaiMapArgumentFinalMerged = new ArrayList<EaiMapArgument>();
		ArrayList<EaiMapArgument> listOfEaiMapArgumentLower = new ArrayList<EaiMapArgument>(listOfEaiMapArgumentLowerArg);
		ArrayList<EaiMapArgument> listOfEaiMapArgumentHigher = new ArrayList<EaiMapArgument>(listOfEaiMapArgumentHigherArg);
		int lowerMatchCtr, higherMatchCtr, lowerCtr, lowerAuxCtr, higherAuxCtr, higherCtr, mergedAuxCtr;
		//Placing the common Process Props in listOfEaiMapArgumentCommonMerged

		for (lowerMatchCtr=0; lowerMatchCtr<listOfEaiMapArgumentLower.size(); lowerMatchCtr++)
		{
			for (higherMatchCtr=0; higherMatchCtr<listOfEaiMapArgumentHigher.size(); higherMatchCtr++)
			{
				if (listOfEaiMapArgumentLower.get(lowerMatchCtr).sName.equals(listOfEaiMapArgumentHigher.get(higherMatchCtr).sName))
				{
					Cloner cloner = new Cloner();
					EaiMapArgument temp;
					switch (choice)
					{
					case 0:
						temp = cloner.deepClone(listOfEaiMapArgumentLower.get(lowerMatchCtr));
						if (!listOfEaiMapArgumentLower.get(lowerMatchCtr).equals(listOfEaiMapArgumentHigher.get(higherMatchCtr)))
						{
							ConflictEaiMapArgument conflictEaiMapArgument = new ConflictEaiMapArgument(frame);
							conflictEaiMapArgument.setDataMapName(sName);
							conflictEaiMapArgument.setArgumentName(listOfEaiMapArgumentLower.get(lowerMatchCtr).sName);
							conflictEaiMapArgument.setLowerDisplayName(listOfEaiMapArgumentLower.get(lowerMatchCtr).DisplayName);
							conflictEaiMapArgument.setLowerDataType(listOfEaiMapArgumentLower.get(lowerMatchCtr).DataType);
							conflictEaiMapArgument.setLowerComments(listOfEaiMapArgumentLower.get(lowerMatchCtr).Comments);
							conflictEaiMapArgument.setHigherDisplayName(listOfEaiMapArgumentHigher.get(higherMatchCtr).DisplayName);
							conflictEaiMapArgument.setHigherDataType(listOfEaiMapArgumentHigher.get(higherMatchCtr).DataType);
							conflictEaiMapArgument.setHigherComments(listOfEaiMapArgumentHigher.get(higherMatchCtr).Comments);
							conflictEaiMapArgument.setNewDisplayName(temp.DisplayName);
							conflictEaiMapArgument.setNewDataType(temp.DataType);
							conflictEaiMapArgument.setNewComments(temp.Comments);
							conflictEaiMapArgument.setVisible(true);
							temp.DisplayName = conflictEaiMapArgument.DisplayName;
							temp.DataType = conflictEaiMapArgument.DataType;
							temp.Comments = conflictEaiMapArgument.Comments;
						}
						listOfEaiMapArgumentCommonMerged.add(temp);
						break;
					case 1:
						temp = cloner.deepClone(listOfEaiMapArgumentLower.get(lowerMatchCtr));
						listOfEaiMapArgumentCommonMerged.add(temp);
						break;
					case 2:
						temp = cloner.deepClone(listOfEaiMapArgumentHigher.get(higherMatchCtr));
						listOfEaiMapArgumentCommonMerged.add(temp);
						break;
					default:
						break;
					}
				}
			}
		}

		//Placing the lower extra Process Props in listOfEaiMapArgumentLowerMerged
		for (lowerCtr=0; lowerCtr<listOfEaiMapArgumentLower.size(); lowerCtr++)
		{
			for (higherAuxCtr=0; higherAuxCtr<listOfEaiMapArgumentHigher.size(); higherAuxCtr++)
			{
				if (listOfEaiMapArgumentLower.get(lowerCtr).sName.equals(listOfEaiMapArgumentHigher.get(higherAuxCtr).sName))
				{
					break;
				}
			}
			if (higherAuxCtr == listOfEaiMapArgumentHigher.size())
			{
				listOfEaiMapArgumentLowerMerged.add(listOfEaiMapArgumentLower.get(lowerCtr));
			}
		}

		//Placing the higher extra Process Props in listOfEaiMapArgumentHigherMerged
		for (higherCtr=0; higherCtr<listOfEaiMapArgumentHigher.size(); higherCtr++)
		{
			for (lowerAuxCtr=0; lowerAuxCtr<listOfEaiMapArgumentLower.size(); lowerAuxCtr++)
			{
				if (listOfEaiMapArgumentHigher.get(higherCtr).sName.equals(listOfEaiMapArgumentLower.get(lowerAuxCtr).sName))
				{
					break;
				}
			}
			if (lowerAuxCtr == listOfEaiMapArgumentLower.size())
			{
				listOfEaiMapArgumentHigherMerged.add(listOfEaiMapArgumentHigher.get(higherCtr));
			}
		}

		//listOfEaiMapArgumentFinalMerged = listOfEaiMapArgumentCommonMerged + listOfEaiMapArgumentLowerMerged + listOfEaiMapArgumentHigherMerged
		listOfEaiMapArgumentFinalMerged.addAll(listOfEaiMapArgumentCommonMerged);
		listOfEaiMapArgumentFinalMerged.addAll(listOfEaiMapArgumentLowerMerged);
		listOfEaiMapArgumentFinalMerged.addAll(listOfEaiMapArgumentHigherMerged);

		return listOfEaiMapArgumentFinalMerged;
	}
}