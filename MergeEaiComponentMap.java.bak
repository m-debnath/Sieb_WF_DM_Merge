import java.util.*;
import java.awt.Frame;
import com.rits.cloning.*;

public class MergeEaiComponentMap {

	public MergeEaiComponentMap() {
		super();
	}

	public ArrayList<EaiComponentMap> compareEaiComponentMapList(int option, Frame frame, String Comments, String DestinationObjectName, String sName, String SourceObjectName, ArrayList<EaiComponentMap> listOfEaiComponentMapLowerArg, ArrayList<EaiComponentMap> listOfEaiComponentMapHigherArg) throws CloneNotSupportedException {
		ArrayList<EaiComponentMap> listOfEaiComponentMapCommonMerged = new ArrayList<EaiComponentMap>();
		ArrayList<EaiComponentMap> listOfEaiComponentMapLowerMerged = new ArrayList<EaiComponentMap>();
		ArrayList<EaiComponentMap> listOfEaiComponentMapHigherMerged = new ArrayList<EaiComponentMap>();
		ArrayList<EaiComponentMap> listOfEaiComponentMapFinalMerged = new ArrayList<EaiComponentMap>();
		ArrayList<EaiComponentMap> listOfEaiComponentMapLower = new ArrayList<EaiComponentMap>(listOfEaiComponentMapLowerArg);
		ArrayList<EaiComponentMap> listOfEaiComponentMapHigher = new ArrayList<EaiComponentMap>(listOfEaiComponentMapHigherArg);
		int lowerMatchCtr, higherMatchCtr, lowerCtr, lowerAuxCtr, higherAuxCtr, higherCtr, mergedAuxCtr;
		//Placing the common Process Props in listOfEaiComponentMapCommonMerged

		for (lowerMatchCtr=0; lowerMatchCtr<listOfEaiComponentMapLower.size(); lowerMatchCtr++)
		{
			for (higherMatchCtr=0; higherMatchCtr<listOfEaiComponentMapHigher.size(); higherMatchCtr++)
			{
				if (listOfEaiComponentMapLower.get(lowerMatchCtr).sName.equals(listOfEaiComponentMapHigher.get(higherMatchCtr).sName))
				{
					Cloner cloner = new Cloner();						
					EaiComponentMap temp;
					switch (option)
					{
					case 0:
						temp = cloner.deepClone(listOfEaiComponentMapLower.get(lowerMatchCtr));
						temp.SetListOfEaiFieldMap(new MergeEaiFieldMap().compareEaiFieldMapList(frame, sName, listOfEaiComponentMapLower.get(lowerMatchCtr).Comments, listOfEaiComponentMapLower.get(lowerMatchCtr).DestinationComponentName, listOfEaiComponentMapLower.get(lowerMatchCtr).DestinationValidation, listOfEaiComponentMapLower.get(lowerMatchCtr).sName, listOfEaiComponentMapLower.get(lowerMatchCtr).ParentComponentMapName, listOfEaiComponentMapLower.get(lowerMatchCtr).SourceComponentName, listOfEaiComponentMapLower.get(lowerMatchCtr).SourceSearchSpecification, listOfEaiComponentMapLower.get(lowerMatchCtr).SourceValidation, listOfEaiComponentMapLower.get(lowerMatchCtr).GetListOfEaiFieldMap(), listOfEaiComponentMapHigher.get(higherMatchCtr).GetListOfEaiFieldMap()));
						if (!listOfEaiComponentMapLower.get(lowerMatchCtr).equals(listOfEaiComponentMapHigher.get(higherMatchCtr)))
						{
							ConflictEaiComponentMap conflictEaiComponentMap = new ConflictEaiComponentMap(frame,listOfEaiComponentMapLower.get(lowerMatchCtr).GetListOfEaiFieldMap(),listOfEaiComponentMapHigher.get(higherMatchCtr).GetListOfEaiFieldMap(),temp.GetListOfEaiFieldMap());
							conflictEaiComponentMap.setDataMapName(sName);
							conflictEaiComponentMap.setICName(listOfEaiComponentMapLower.get(lowerMatchCtr).sName);
							conflictEaiComponentMap.setLowerSrcCmpntName(listOfEaiComponentMapLower.get(lowerMatchCtr).SourceComponentName);
							conflictEaiComponentMap.setLowerTrgtCmpntName(listOfEaiComponentMapLower.get(lowerMatchCtr).DestinationComponentName);
							conflictEaiComponentMap.setLowerSrcSrchSpec(listOfEaiComponentMapLower.get(lowerMatchCtr).SourceSearchSpecification);
							conflictEaiComponentMap.setLowerPrntCmpntName(listOfEaiComponentMapLower.get(lowerMatchCtr).ParentComponentMapName);
							conflictEaiComponentMap.setHigherSrcCmpntName(listOfEaiComponentMapHigher.get(higherMatchCtr).SourceComponentName);
							conflictEaiComponentMap.setHigherTrgtCmpntName(listOfEaiComponentMapHigher.get(higherMatchCtr).DestinationComponentName);
							conflictEaiComponentMap.setHigherSrcSrchSpec(listOfEaiComponentMapHigher.get(higherMatchCtr).SourceSearchSpecification);
							conflictEaiComponentMap.setHigherPrntCmpntName(listOfEaiComponentMapHigher.get(higherMatchCtr).ParentComponentMapName);
							conflictEaiComponentMap.setNewSrcCmpntName(temp.SourceComponentName);
							conflictEaiComponentMap.setNewTrgtCmpntName(temp.DestinationComponentName);
							conflictEaiComponentMap.setNewSrcSrchSpec(temp.SourceSearchSpecification);
							conflictEaiComponentMap.setNewPrntCmpntName(temp.ParentComponentMapName);
							conflictEaiComponentMap.setVisible(true);
							temp.SourceComponentName = conflictEaiComponentMap.SourceComponentName;
							temp.DestinationComponentName = conflictEaiComponentMap.DestinationComponentName;
							temp.SourceSearchSpecification = conflictEaiComponentMap.SourceSearchSpecification;
							temp.ParentComponentMapName = conflictEaiComponentMap.ParentComponentMapName;
							temp.SetListOfEaiFieldMap(conflictEaiComponentMap.GetListOfEaiFieldMap());
						}
						listOfEaiComponentMapCommonMerged.add(temp);
						break;
					case 1:
						temp = cloner.deepClone(listOfEaiComponentMapLower.get(lowerMatchCtr));
						listOfEaiComponentMapCommonMerged.add(temp);
						break;
					case 2:
						temp = cloner.deepClone(listOfEaiComponentMapHigher.get(higherMatchCtr));
						listOfEaiComponentMapCommonMerged.add(temp);
						break;
					default:
						break;
					}
				}
			}
		}

		//Placing the lower extra Process Props in listOfEaiComponentMapLowerMerged
		for (lowerCtr=0; lowerCtr<listOfEaiComponentMapLower.size(); lowerCtr++)
		{
			for (higherAuxCtr=0; higherAuxCtr<listOfEaiComponentMapHigher.size(); higherAuxCtr++)
			{
				if (listOfEaiComponentMapLower.get(lowerCtr).sName.equals(listOfEaiComponentMapHigher.get(higherAuxCtr).sName))
				{
					break;
				}
			}
			if (higherAuxCtr == listOfEaiComponentMapHigher.size())
			{
				listOfEaiComponentMapLowerMerged.add(listOfEaiComponentMapLower.get(lowerCtr));
			}
		}

		//Placing the higher extra Process Props in listOfEaiComponentMapHigherMerged
		for (higherCtr=0; higherCtr<listOfEaiComponentMapHigher.size(); higherCtr++)
		{
			for (lowerAuxCtr=0; lowerAuxCtr<listOfEaiComponentMapLower.size(); lowerAuxCtr++)
			{
				if (listOfEaiComponentMapHigher.get(higherCtr).sName.equals(listOfEaiComponentMapLower.get(lowerAuxCtr).sName))
				{
					break;
				}
			}
			if (lowerAuxCtr == listOfEaiComponentMapLower.size())
			{
				listOfEaiComponentMapHigherMerged.add(listOfEaiComponentMapHigher.get(higherCtr));
			}
		}

		//listOfEaiComponentMapFinalMerged = listOfEaiComponentMapCommonMerged + listOfEaiComponentMapLowerMerged + listOfEaiComponentMapHigherMerged
		listOfEaiComponentMapFinalMerged.addAll(listOfEaiComponentMapCommonMerged);
		listOfEaiComponentMapFinalMerged.addAll(listOfEaiComponentMapLowerMerged);
		listOfEaiComponentMapFinalMerged.addAll(listOfEaiComponentMapHigherMerged);

		return listOfEaiComponentMapFinalMerged;
	}
}