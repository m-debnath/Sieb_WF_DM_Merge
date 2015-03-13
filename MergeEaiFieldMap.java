import java.util.*;
import java.awt.Frame;
import com.rits.cloning.*;

public class MergeEaiFieldMap {
	public MergeEaiFieldMap() {
		super();
	}

	public ArrayList<EaiFieldMap> compareEaiFieldMapList(Frame frame, String DataMapName, String Comments, String DestinationComponentName, String DestinationValidation, String sName, String ParentComponentMapName, String SourceComponentName, String SourceSearchSpecification, String SourceValidation, ArrayList<EaiFieldMap> listOfEaiFieldMapLowerArg, ArrayList<EaiFieldMap> listOfEaiFieldMapHigherArg)  throws CloneNotSupportedException {
		ArrayList<EaiFieldMap> listOfEaiFieldMapCommonMerged = new ArrayList<EaiFieldMap>();
		ArrayList<EaiFieldMap> listOfEaiFieldMapLowerMerged = new ArrayList<EaiFieldMap>();
		ArrayList<EaiFieldMap> listOfEaiFieldMapHigherMerged = new ArrayList<EaiFieldMap>();
		ArrayList<EaiFieldMap> listOfEaiFieldMapFinalMerged = new ArrayList<EaiFieldMap>();
		ArrayList<EaiFieldMap> listOfEaiFieldMapLower = new ArrayList<EaiFieldMap>(listOfEaiFieldMapLowerArg);
		ArrayList<EaiFieldMap> listOfEaiFieldMapHigher = new ArrayList<EaiFieldMap>(listOfEaiFieldMapHigherArg);
		int lowerMatchCtr, higherMatchCtr, lowerCtr, lowerAuxCtr, higherAuxCtr, higherCtr, mergedAuxCtr;
		//Placing the common Process Props in listOfEaiFieldMapCommonMerged

		for (lowerMatchCtr=0; lowerMatchCtr<listOfEaiFieldMapLower.size(); lowerMatchCtr++)
		{
			for (higherMatchCtr=0; higherMatchCtr<listOfEaiFieldMapHigher.size(); higherMatchCtr++)
			{
				if (listOfEaiFieldMapLower.get(lowerMatchCtr).DestinationFieldName.equals(listOfEaiFieldMapHigher.get(higherMatchCtr).DestinationFieldName))
				{
					EaiFieldMap temp;
					Cloner cloner = new Cloner();
					temp = cloner.deepClone(listOfEaiFieldMapLower.get(lowerMatchCtr));
					if (!listOfEaiFieldMapLower.get(lowerMatchCtr).equals(listOfEaiFieldMapHigher.get(higherMatchCtr)))
					{
						ConflictFieldMapUI conflictFieldMapUI = new ConflictFieldMapUI(frame);
						conflictFieldMapUI.setDatamapName(DataMapName);
						conflictFieldMapUI.setICName(sName);
						conflictFieldMapUI.setSrcCompName(SourceComponentName);
						conflictFieldMapUI.setTrgtCompName(DestinationComponentName);
						conflictFieldMapUI.setSrcSrchSpec(SourceSearchSpecification);
						conflictFieldMapUI.setPrntCompName(ParentComponentMapName);
						conflictFieldMapUI.setLowerSrcExp(listOfEaiFieldMapLower.get(lowerMatchCtr).SourceFieldExpression);
						conflictFieldMapUI.setLowerTrgtFieldName(listOfEaiFieldMapLower.get(lowerMatchCtr).DestinationFieldName);
						conflictFieldMapUI.setLowerComments(listOfEaiFieldMapLower.get(lowerMatchCtr).Comments);
						conflictFieldMapUI.setHigherSrcExp(listOfEaiFieldMapHigher.get(higherMatchCtr).SourceFieldExpression);
						conflictFieldMapUI.setHigherTrgtFieldName(listOfEaiFieldMapHigher.get(higherMatchCtr).DestinationFieldName);
						conflictFieldMapUI.setHigherComments(listOfEaiFieldMapHigher.get(higherMatchCtr).Comments);
						conflictFieldMapUI.setNewSrcExp(listOfEaiFieldMapLower.get(lowerMatchCtr).SourceFieldExpression);
						conflictFieldMapUI.setNewTrgtFieldName(listOfEaiFieldMapLower.get(lowerMatchCtr).DestinationFieldName);
						conflictFieldMapUI.setNewComments(listOfEaiFieldMapLower.get(lowerMatchCtr).Comments);
						//conflictFieldMapUI.setModal(true);
						conflictFieldMapUI.setVisible(true);
						temp.SourceFieldExpression = conflictFieldMapUI.finalSrcExp;
						temp.DestinationFieldName = conflictFieldMapUI.finalTrgtFieldName;
						temp.Comments = conflictFieldMapUI.finalComments;
					}
					listOfEaiFieldMapCommonMerged.add(temp);
				}
			}
		}

		//Placing the lower extra Process Props in listOfEaiFieldMapLowerMerged
		for (lowerCtr=0; lowerCtr<listOfEaiFieldMapLower.size(); lowerCtr++)
		{
			for (higherAuxCtr=0; higherAuxCtr<listOfEaiFieldMapHigher.size(); higherAuxCtr++)
			{
				if (listOfEaiFieldMapLower.get(lowerCtr).DestinationFieldName.equals(listOfEaiFieldMapHigher.get(higherAuxCtr).DestinationFieldName))
				{
					break;
				}
			}
			if (higherAuxCtr == listOfEaiFieldMapHigher.size())
			{
				listOfEaiFieldMapLowerMerged.add(listOfEaiFieldMapLower.get(lowerCtr));
			}
		}

		//Placing the higher extra Process Props in listOfEaiFieldMapHigherMerged
		for (higherCtr=0; higherCtr<listOfEaiFieldMapHigher.size(); higherCtr++)
		{
			for (lowerAuxCtr=0; lowerAuxCtr<listOfEaiFieldMapLower.size(); lowerAuxCtr++)
			{
				if (listOfEaiFieldMapHigher.get(higherCtr).DestinationFieldName.equals(listOfEaiFieldMapLower.get(lowerAuxCtr).DestinationFieldName))
				{
					break;
				}
			}
			if (lowerAuxCtr == listOfEaiFieldMapLower.size())
			{
				listOfEaiFieldMapHigherMerged.add(listOfEaiFieldMapHigher.get(higherCtr));
			}
		}

		//listOfEaiFieldMapFinalMerged = listOfEaiFieldMapCommonMerged + listOfEaiFieldMapLowerMerged + listOfEaiFieldMapHigherMerged
		listOfEaiFieldMapFinalMerged.addAll(listOfEaiFieldMapCommonMerged);
		listOfEaiFieldMapFinalMerged.addAll(listOfEaiFieldMapLowerMerged);
		listOfEaiFieldMapFinalMerged.addAll(listOfEaiFieldMapHigherMerged);

		return listOfEaiFieldMapFinalMerged;
	}
}