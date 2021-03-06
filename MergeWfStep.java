import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;
import java.util.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;
import java.awt.Frame;
import com.rits.cloning.*;

public class MergeWfStep {
	public ArrayList<RepositoryWfStep> compareWfStep(int choice, Frame frame, ArrayList<RepositoryWfProcessProp> listOfRepositoryWfProcessPropMerged, String ProcessName, ArrayList<RepositoryWfStep> listOfrepWfStepLowerArg, ArrayList<RepositoryWfStep> listOfrepWfStepHigherArg) throws CloneNotSupportedException {
		ArrayList<String> xmlListOfStepAttrLower, xmlListOfStepAttrHigher;
		ArrayList<String> xmlListOfWfStepBranchAttrLower, xmlListOfWfStepBranchAttrHigher;
		ArrayList<String> xmlListOfWfStepIOArgumentAttrLower, xmlListOfWfStepIOArgumentAttrHigher;
		ArrayList<String> xmlListOfWfStepRecipientAttrLower, xmlListOfWfStepRecipientAttrHigher;
		ArrayList<String> xmlListOfWfBranchCriteriaAttrLower, xmlListOfWfBranchCriteriaAttrHigher;
		ArrayList<String> xmlListOfWfBranchCriteriaValueAttrLower, xmlListOfWfBranchCriteriaValueAttrHigher;


		String StepType;

		RepositoryWfStep repWfStepLower, repWfStepHigher;
		RepositoryWfStepBranch repWfStepBranchLower, repWfStepBranchHigher;
		RepositoryWfStepIOArgument repWfStepIOArgumentLower, repWfStepIOArgumentHigher;
		RepositoryWfStepRecipient repWfStepRecipientLower, repWfStepRecipientHigher;
		RepositoryWfBranchCriteria repWfBranchCriteriaLower, repWfBranchCriteriaHigher;
		RepositoryWfBranchCriteriaValue repWfBranchCriteriaValueLower, repWfBranchCriteriaValueHigher;

		final ArrayList<RepositoryWfStep> listOfrepWfStepLower, listOfrepWfStepHigher;

		ArrayList<RepositoryWfStep> listOfrepWfStepCommonMerged, listOfrepWfStepLowerMerged, listOfrepWfStepHigherMerged, listOfrepWfStepFinalMerged;
		ArrayList<RepositoryWfStepBranch> listOfrepWfStepBranchLower, listOfrepWfStepBranchHigher, listOfrepWfStepBranchCommonMerged, listOfrepWfStepBranchLowerMerged, listOfrepWfStepBranchHigherMerged, listOfrepWfStepBranchFinalMerged;
		ArrayList<RepositoryWfStepIOArgument> listOfrepWfStepIOArgumentLower, listOfrepWfStepIOArgumentHigher, listOfrepWfStepIOArgumentCommonMerged, listOfrepWfStepIOArgumentLowerMerged, listOfrepWfStepIOArgumentHigherMerged, listOfrepWfStepIOArgumentFinalMerged;
		ArrayList<RepositoryWfStepRecipient> listOfrepWfStepRecipientLower, listOfrepWfStepRecipientHigher, listOfrepWfStepRecipientCommonMerged, listOfrepWfStepRecipientLowerMerged, listOfrepWfStepRecipientHigherMerged, listOfrepWfStepRecipientFinalMerged;
		ArrayList<RepositoryWfBranchCriteria> listOfrepWfBranchCriteriaLower, listOfrepWfBranchCriteriaHigher, listOfrepWfBranchCriteriaCommonMerged, listOfrepWfBranchCriteriaLowerMerged, listOfrepWfBranchCriteriaHigherMerged, listOfrepWfBranchCriteriaFinalMerged;
		ArrayList<RepositoryWfBranchCriteriaValue> listOfrepWfBranchCriteriaValueLower, listOfrepWfBranchCriteriaValueHigher, listOfrepWfBranchCriteriaValueCommonMerged, listOfrepWfBranchCriteriaValueLowerMerged, listOfrepWfBranchCriteriaValueHigherMerged, listOfrepWfBranchCriteriaValueFinalMerged;


		//Consolidating common Process Properties in both Wfs using Array List
		listOfrepWfStepCommonMerged = new ArrayList<RepositoryWfStep>();
		listOfrepWfStepLowerMerged = new ArrayList<RepositoryWfStep>();
		listOfrepWfStepHigherMerged = new ArrayList<RepositoryWfStep>();
		listOfrepWfStepFinalMerged = new ArrayList<RepositoryWfStep>();
		listOfrepWfStepLower = new ArrayList<RepositoryWfStep>(listOfrepWfStepLowerArg);
		listOfrepWfStepHigher = new ArrayList<RepositoryWfStep>(listOfrepWfStepHigherArg);
		int lowerMatchStepCtr, higherMatchStepCtr, lowerStepCtr, lowerAuxStepCtr, higherAuxStepCtr, higherStepCtr, mergedAuxStepCtr;
		int lowerMatchStepIOArgumentCtr, higherMatchStepIOArgumentCtr, lowerStepIOArgumentCtr, lowerAuxStepIOArgumentCtr, higherAuxStepIOArgumentCtr, higherStepIOArgumentCtr, mergedAuxStepIOArgumentCtr;
		int lowerMatchStepRecipientCtr, higherMatchStepRecipientCtr, lowerStepRecipientCtr, lowerAuxStepRecipientCtr, higherAuxStepRecipientCtr, higherStepRecipientCtr, mergedAuxStepRecipientCtr;
		int lowerMatchStepBranchCtr, higherMatchStepBranchCtr, lowerStepBranchCtr, lowerAuxStepBranchCtr, higherAuxStepBranchCtr, higherStepBranchCtr, mergedAuxStepBranchCtr;
		int lowerMatchBranchCriteriaCtr, higherMatchBranchCriteriaCtr, lowerBranchCriteriaCtr, lowerAuxBranchCriteriaCtr, higherAuxBranchCriteriaCtr, higherBranchCriteriaCtr, mergedAuxBranchCriteriaCtr;
		int lowerMatchBranchCriteriaValueCtr, higherMatchBranchCriteriaValueCtr, lowerBranchCriteriaValueCtr, lowerAuxBranchCriteriaValueCtr, higherAuxBranchCriteriaValueCtr, higherBranchCriteriaValueCtr, mergedAuxBranchCriteriaValueCtr;

		//Placing the common Process Props in listOfrepWfStepCommonMerged
		for (lowerMatchStepCtr=0; lowerMatchStepCtr<listOfrepWfStepLower.size(); lowerMatchStepCtr++)
		{
			for (higherMatchStepCtr=0; higherMatchStepCtr<listOfrepWfStepHigher.size(); higherMatchStepCtr++)
			{
				if (listOfrepWfStepLower.get(lowerMatchStepCtr).Name3.equals(listOfrepWfStepHigher.get(higherMatchStepCtr).Name3))
				{
					Cloner cloner = new Cloner();
					RepositoryWfStep temp;
					switch(choice)
					{
						case 0:
							temp = cloner.deepClone(listOfrepWfStepLower.get(lowerMatchStepCtr));
							if (!listOfrepWfStepLower.get(lowerMatchStepCtr).equals(listOfrepWfStepHigher.get(higherMatchStepCtr)))
							{
								ArrayList<RepositoryWfStepBranch> ListOfRepositoryWfStepBranchForMatchedStepLower = cloner.deepClone(listOfrepWfStepLower.get(lowerMatchStepCtr).GetListOfRepositoryWfStepBranch());
								ArrayList<RepositoryWfStepIOArgument> ListOfRepositoryWfStepIOArgumentForMatchedStepLower = cloner.deepClone(listOfrepWfStepLower.get(lowerMatchStepCtr).GetListOfRepositoryWfStepIOArgument());
								ArrayList<RepositoryWfStepRecipient> ListOfRepositoryWfStepRecipientForMatchedStepLower = cloner.deepClone(listOfrepWfStepLower.get(lowerMatchStepCtr).GetListOfRepositoryWfStepRecipient());

								ArrayList<RepositoryWfStepBranch> ListOfRepositoryWfStepBranchForMatchedStepHigher =  cloner.deepClone(listOfrepWfStepHigher.get(higherMatchStepCtr).GetListOfRepositoryWfStepBranch());
								ArrayList<RepositoryWfStepIOArgument> ListOfRepositoryWfStepIOArgumentForMatchedStepHigher = cloner.deepClone(listOfrepWfStepHigher.get(higherMatchStepCtr).GetListOfRepositoryWfStepIOArgument());
								ArrayList<RepositoryWfStepRecipient> ListOfRepositoryWfStepRecipientForMatchedStepHigher = cloner.deepClone(listOfrepWfStepHigher.get(higherMatchStepCtr).GetListOfRepositoryWfStepRecipient());
								//Comparing RepositoryWfStepRecipients
								listOfrepWfStepRecipientCommonMerged = new ArrayList<RepositoryWfStepRecipient>();
								listOfrepWfStepRecipientLowerMerged = new ArrayList<RepositoryWfStepRecipient>();
								listOfrepWfStepRecipientHigherMerged = new ArrayList<RepositoryWfStepRecipient>();
								listOfrepWfStepRecipientFinalMerged = new ArrayList<RepositoryWfStepRecipient>();

								for (lowerMatchStepRecipientCtr=0; lowerMatchStepRecipientCtr<ListOfRepositoryWfStepRecipientForMatchedStepLower.size(); lowerMatchStepRecipientCtr++)
								{
									for (higherMatchStepRecipientCtr=0; higherMatchStepRecipientCtr<ListOfRepositoryWfStepRecipientForMatchedStepHigher.size(); higherMatchStepRecipientCtr++)
									{
										if (ListOfRepositoryWfStepRecipientForMatchedStepLower.get(lowerMatchStepRecipientCtr).Name2.equals(ListOfRepositoryWfStepRecipientForMatchedStepHigher.get(higherMatchStepRecipientCtr).Name2))
										{
											listOfrepWfStepRecipientCommonMerged.add(ListOfRepositoryWfStepRecipientForMatchedStepLower.get(lowerMatchStepRecipientCtr));
										}
									}
								}
								for (lowerStepRecipientCtr=0; lowerStepRecipientCtr<ListOfRepositoryWfStepRecipientForMatchedStepLower.size(); lowerStepRecipientCtr++)
								{
									for (higherAuxStepRecipientCtr=0; higherAuxStepRecipientCtr<ListOfRepositoryWfStepRecipientForMatchedStepHigher.size(); higherAuxStepRecipientCtr++)
									{
										if (ListOfRepositoryWfStepRecipientForMatchedStepLower.get(lowerStepRecipientCtr).Name2.equals(ListOfRepositoryWfStepRecipientForMatchedStepHigher.get(higherAuxStepRecipientCtr).Name2))
										{
											break;
										}
									}
									if (higherAuxStepRecipientCtr == ListOfRepositoryWfStepRecipientForMatchedStepHigher.size())
									{
										listOfrepWfStepRecipientLowerMerged.add(ListOfRepositoryWfStepRecipientForMatchedStepLower.get(lowerStepRecipientCtr));
									}
								}
								for (higherStepRecipientCtr=0; higherStepRecipientCtr<ListOfRepositoryWfStepRecipientForMatchedStepHigher.size(); higherStepRecipientCtr++)
								{
									for (lowerAuxStepRecipientCtr=0; lowerAuxStepRecipientCtr<ListOfRepositoryWfStepRecipientForMatchedStepLower.size(); lowerAuxStepRecipientCtr++)
									{
										if (ListOfRepositoryWfStepRecipientForMatchedStepHigher.get(higherStepRecipientCtr).Name2.equals(ListOfRepositoryWfStepRecipientForMatchedStepLower.get(lowerAuxStepRecipientCtr).Name2))
										{
											break;
										}
									}
									if (lowerAuxStepRecipientCtr == ListOfRepositoryWfStepRecipientForMatchedStepLower.size())
									{
										listOfrepWfStepRecipientHigherMerged.add(ListOfRepositoryWfStepRecipientForMatchedStepHigher.get(higherStepRecipientCtr));
									}
								}
								listOfrepWfStepRecipientFinalMerged.addAll(listOfrepWfStepRecipientCommonMerged);
								listOfrepWfStepRecipientFinalMerged.addAll(listOfrepWfStepRecipientLowerMerged);
								listOfrepWfStepRecipientFinalMerged.addAll(listOfrepWfStepRecipientHigherMerged);

								//Comparing RepositoryWfStepIOArguments
								listOfrepWfStepIOArgumentCommonMerged = new ArrayList<RepositoryWfStepIOArgument>();
								listOfrepWfStepIOArgumentLowerMerged = new ArrayList<RepositoryWfStepIOArgument>();
								listOfrepWfStepIOArgumentHigherMerged = new ArrayList<RepositoryWfStepIOArgument>();
								listOfrepWfStepIOArgumentFinalMerged = new ArrayList<RepositoryWfStepIOArgument>();

								for (lowerMatchStepIOArgumentCtr=0; lowerMatchStepIOArgumentCtr<ListOfRepositoryWfStepIOArgumentForMatchedStepLower.size(); lowerMatchStepIOArgumentCtr++)
								{
									for (higherMatchStepIOArgumentCtr=0; higherMatchStepIOArgumentCtr<ListOfRepositoryWfStepIOArgumentForMatchedStepHigher.size(); higherMatchStepIOArgumentCtr++)
									{
										if (ListOfRepositoryWfStepIOArgumentForMatchedStepLower.get(lowerMatchStepIOArgumentCtr).Name2.equals(ListOfRepositoryWfStepIOArgumentForMatchedStepHigher.get(higherMatchStepIOArgumentCtr).Name2))
										{
											listOfrepWfStepIOArgumentCommonMerged.add(ListOfRepositoryWfStepIOArgumentForMatchedStepLower.get(lowerMatchStepIOArgumentCtr));
										}
									}
								}
								for (lowerStepIOArgumentCtr=0; lowerStepIOArgumentCtr<ListOfRepositoryWfStepIOArgumentForMatchedStepLower.size(); lowerStepIOArgumentCtr++)
								{
									for (higherAuxStepIOArgumentCtr=0; higherAuxStepIOArgumentCtr<ListOfRepositoryWfStepIOArgumentForMatchedStepHigher.size(); higherAuxStepIOArgumentCtr++)
									{
										if (ListOfRepositoryWfStepIOArgumentForMatchedStepLower.get(lowerStepIOArgumentCtr).Name2.equals(ListOfRepositoryWfStepIOArgumentForMatchedStepHigher.get(higherAuxStepIOArgumentCtr).Name2))
										{
											break;
										}
									}
									if (higherAuxStepIOArgumentCtr == ListOfRepositoryWfStepIOArgumentForMatchedStepHigher.size())
									{
										listOfrepWfStepIOArgumentLowerMerged.add(ListOfRepositoryWfStepIOArgumentForMatchedStepLower.get(lowerStepIOArgumentCtr));
									}
								}
								for (higherStepIOArgumentCtr=0; higherStepIOArgumentCtr<ListOfRepositoryWfStepIOArgumentForMatchedStepHigher.size(); higherStepIOArgumentCtr++)
								{
									for (lowerAuxStepIOArgumentCtr=0; lowerAuxStepIOArgumentCtr<ListOfRepositoryWfStepIOArgumentForMatchedStepLower.size(); lowerAuxStepIOArgumentCtr++)
									{
										if (ListOfRepositoryWfStepIOArgumentForMatchedStepHigher.get(higherStepIOArgumentCtr).Name2.equals(ListOfRepositoryWfStepIOArgumentForMatchedStepLower.get(lowerAuxStepIOArgumentCtr).Name2))
										{
											break;
										}
									}
									if (lowerAuxStepIOArgumentCtr == ListOfRepositoryWfStepIOArgumentForMatchedStepLower.size())
									{
										listOfrepWfStepIOArgumentHigherMerged.add(ListOfRepositoryWfStepIOArgumentForMatchedStepHigher.get(higherStepIOArgumentCtr));
									}
								}
								listOfrepWfStepIOArgumentFinalMerged.addAll(listOfrepWfStepIOArgumentCommonMerged);
								listOfrepWfStepIOArgumentFinalMerged.addAll(listOfrepWfStepIOArgumentLowerMerged);
								listOfrepWfStepIOArgumentFinalMerged.addAll(listOfrepWfStepIOArgumentHigherMerged);

								//Comparing RepositoryWfStepBranchs
								listOfrepWfStepBranchCommonMerged = new ArrayList<RepositoryWfStepBranch>();
								listOfrepWfStepBranchLowerMerged = new ArrayList<RepositoryWfStepBranch>();
								listOfrepWfStepBranchHigherMerged = new ArrayList<RepositoryWfStepBranch>();
								listOfrepWfStepBranchFinalMerged = new ArrayList<RepositoryWfStepBranch>();

								for (lowerMatchStepBranchCtr=0; lowerMatchStepBranchCtr<ListOfRepositoryWfStepBranchForMatchedStepLower.size(); lowerMatchStepBranchCtr++)
								{
									for (higherMatchStepBranchCtr=0; higherMatchStepBranchCtr<ListOfRepositoryWfStepBranchForMatchedStepHigher.size(); higherMatchStepBranchCtr++)
									{

										if (ListOfRepositoryWfStepBranchForMatchedStepLower.get(lowerMatchStepBranchCtr).Name2.equals(ListOfRepositoryWfStepBranchForMatchedStepHigher.get(higherMatchStepBranchCtr).Name2))
										{
											ArrayList<RepositoryWfBranchCriteria> ListOfRepositoryWfBranchCriteriaForMatchedStepLower = cloner.deepClone(ListOfRepositoryWfStepBranchForMatchedStepLower.get(lowerMatchStepBranchCtr).GetListOfRepositoryWfBranchCriteria());
											ArrayList<RepositoryWfBranchCriteria> ListOfRepositoryWfBranchCriteriaForMatchedStepHigher = cloner.deepClone(ListOfRepositoryWfStepBranchForMatchedStepHigher.get(higherMatchStepBranchCtr).GetListOfRepositoryWfBranchCriteria());

											//Comparing Branch Criteria
											listOfrepWfBranchCriteriaCommonMerged = new ArrayList<RepositoryWfBranchCriteria>();
											listOfrepWfBranchCriteriaLowerMerged = new ArrayList<RepositoryWfBranchCriteria>();
											listOfrepWfBranchCriteriaHigherMerged = new ArrayList<RepositoryWfBranchCriteria>();
											listOfrepWfBranchCriteriaFinalMerged = new ArrayList<RepositoryWfBranchCriteria>();

											for (lowerMatchBranchCriteriaCtr=0; lowerMatchBranchCriteriaCtr<ListOfRepositoryWfBranchCriteriaForMatchedStepLower.size(); lowerMatchBranchCriteriaCtr++)
											{
												for (higherMatchBranchCriteriaCtr=0; higherMatchBranchCriteriaCtr<ListOfRepositoryWfBranchCriteriaForMatchedStepHigher.size(); higherMatchBranchCriteriaCtr++)
												{
													if (ListOfRepositoryWfBranchCriteriaForMatchedStepLower.get(lowerMatchBranchCriteriaCtr).Name2.equals(ListOfRepositoryWfBranchCriteriaForMatchedStepHigher.get(higherMatchBranchCriteriaCtr).Name2))
													{
														ArrayList<RepositoryWfBranchCriteriaValue> ListOfRepositoryWfBranchCriteriaValueForMatchedStepLower =cloner.deepClone(ListOfRepositoryWfBranchCriteriaForMatchedStepLower.get(lowerMatchBranchCriteriaCtr).GetListOfRepositoryWfBranchCriteriaValue());
														ArrayList<RepositoryWfBranchCriteriaValue> ListOfRepositoryWfBranchCriteriaValueForMatchedStepHigher = cloner.deepClone(ListOfRepositoryWfBranchCriteriaForMatchedStepHigher.get(higherMatchBranchCriteriaCtr).GetListOfRepositoryWfBranchCriteriaValue());

														//Comparing Branch Criteria Value
														listOfrepWfBranchCriteriaValueCommonMerged = new ArrayList<RepositoryWfBranchCriteriaValue>();
														listOfrepWfBranchCriteriaValueLowerMerged = new ArrayList<RepositoryWfBranchCriteriaValue>();
														listOfrepWfBranchCriteriaValueHigherMerged = new ArrayList<RepositoryWfBranchCriteriaValue>();
														listOfrepWfBranchCriteriaValueFinalMerged = new ArrayList<RepositoryWfBranchCriteriaValue>();

														for (lowerMatchBranchCriteriaValueCtr=0; lowerMatchBranchCriteriaValueCtr<ListOfRepositoryWfBranchCriteriaValueForMatchedStepLower.size(); lowerMatchBranchCriteriaValueCtr++)
														{
															for (higherMatchBranchCriteriaValueCtr=0; higherMatchBranchCriteriaValueCtr<ListOfRepositoryWfBranchCriteriaValueForMatchedStepHigher.size(); higherMatchBranchCriteriaValueCtr++)
															{
																if (ListOfRepositoryWfBranchCriteriaValueForMatchedStepLower.get(lowerMatchBranchCriteriaValueCtr).Name2.equals(ListOfRepositoryWfBranchCriteriaValueForMatchedStepHigher.get(higherMatchBranchCriteriaValueCtr).Name2))
																{
																	listOfrepWfBranchCriteriaValueCommonMerged.add(ListOfRepositoryWfBranchCriteriaValueForMatchedStepLower.get(lowerMatchBranchCriteriaValueCtr));
																}
															}
														}
														for (lowerBranchCriteriaValueCtr=0; lowerBranchCriteriaValueCtr<ListOfRepositoryWfBranchCriteriaValueForMatchedStepLower.size(); lowerBranchCriteriaValueCtr++)
														{
															for (higherAuxBranchCriteriaValueCtr=0; higherAuxBranchCriteriaValueCtr<ListOfRepositoryWfBranchCriteriaValueForMatchedStepHigher.size(); higherAuxBranchCriteriaValueCtr++)
															{
																if (ListOfRepositoryWfBranchCriteriaValueForMatchedStepLower.get(lowerBranchCriteriaValueCtr).Name2.equals(ListOfRepositoryWfBranchCriteriaValueForMatchedStepHigher.get(higherAuxBranchCriteriaValueCtr).Name2))
																{
																	break;
																}
															}
															if (higherAuxBranchCriteriaValueCtr == ListOfRepositoryWfBranchCriteriaValueForMatchedStepHigher.size())
															{
																listOfrepWfBranchCriteriaValueLowerMerged.add(ListOfRepositoryWfBranchCriteriaValueForMatchedStepLower.get(lowerBranchCriteriaValueCtr));
															}
														}
														for (higherBranchCriteriaValueCtr=0; higherBranchCriteriaValueCtr<ListOfRepositoryWfBranchCriteriaValueForMatchedStepHigher.size(); higherBranchCriteriaValueCtr++)
														{
															for (lowerAuxBranchCriteriaValueCtr=0; lowerAuxBranchCriteriaValueCtr<ListOfRepositoryWfBranchCriteriaValueForMatchedStepLower.size(); lowerAuxBranchCriteriaValueCtr++)
															{
																if (ListOfRepositoryWfBranchCriteriaValueForMatchedStepHigher.get(higherBranchCriteriaValueCtr).Name2.equals(ListOfRepositoryWfBranchCriteriaValueForMatchedStepLower.get(lowerAuxBranchCriteriaValueCtr).Name2))
																{
																	break;
																}
															}
															if (lowerAuxBranchCriteriaValueCtr == ListOfRepositoryWfBranchCriteriaValueForMatchedStepLower.size())
															{
																listOfrepWfBranchCriteriaValueHigherMerged.add(ListOfRepositoryWfBranchCriteriaValueForMatchedStepHigher.get(higherBranchCriteriaValueCtr));
															}
														}
														listOfrepWfBranchCriteriaValueFinalMerged.addAll(listOfrepWfBranchCriteriaValueCommonMerged);
														listOfrepWfBranchCriteriaValueFinalMerged.addAll(listOfrepWfBranchCriteriaValueLowerMerged);
														listOfrepWfBranchCriteriaValueFinalMerged.addAll(listOfrepWfBranchCriteriaValueHigherMerged);
														//End Comparing Branch Criteria Value

														ListOfRepositoryWfBranchCriteriaForMatchedStepLower.get(lowerMatchBranchCriteriaCtr).SetListOfRepositoryWfBranchCriteriaValue(listOfrepWfBranchCriteriaValueFinalMerged);

														listOfrepWfBranchCriteriaCommonMerged.add(ListOfRepositoryWfBranchCriteriaForMatchedStepLower.get(lowerMatchBranchCriteriaCtr));
													}
												}
											}
											for (lowerBranchCriteriaCtr=0; lowerBranchCriteriaCtr<ListOfRepositoryWfBranchCriteriaForMatchedStepLower.size(); lowerBranchCriteriaCtr++)
											{
												for (higherAuxBranchCriteriaCtr=0; higherAuxBranchCriteriaCtr<ListOfRepositoryWfBranchCriteriaForMatchedStepHigher.size(); higherAuxBranchCriteriaCtr++)
												{
													if (ListOfRepositoryWfBranchCriteriaForMatchedStepLower.get(lowerBranchCriteriaCtr).Name2.equals(ListOfRepositoryWfBranchCriteriaForMatchedStepHigher.get(higherAuxBranchCriteriaCtr).Name2))
													{
														break;
													}
												}
												if (higherAuxBranchCriteriaCtr == ListOfRepositoryWfBranchCriteriaForMatchedStepHigher.size())
												{
													listOfrepWfBranchCriteriaLowerMerged.add(ListOfRepositoryWfBranchCriteriaForMatchedStepLower.get(lowerBranchCriteriaCtr));
												}
											}
											for (higherBranchCriteriaCtr=0; higherBranchCriteriaCtr<ListOfRepositoryWfBranchCriteriaForMatchedStepHigher.size(); higherBranchCriteriaCtr++)
											{
												for (lowerAuxBranchCriteriaCtr=0; lowerAuxBranchCriteriaCtr<ListOfRepositoryWfBranchCriteriaForMatchedStepLower.size(); lowerAuxBranchCriteriaCtr++)
												{
													if (ListOfRepositoryWfBranchCriteriaForMatchedStepHigher.get(higherBranchCriteriaCtr).Name2.equals(ListOfRepositoryWfBranchCriteriaForMatchedStepLower.get(lowerAuxBranchCriteriaCtr).Name2))
													{
														break;
													}
												}
												if (lowerAuxBranchCriteriaCtr == ListOfRepositoryWfBranchCriteriaForMatchedStepLower.size())
												{
													listOfrepWfBranchCriteriaHigherMerged.add(ListOfRepositoryWfBranchCriteriaForMatchedStepHigher.get(higherBranchCriteriaCtr));
												}
											}
											listOfrepWfBranchCriteriaFinalMerged.addAll(listOfrepWfBranchCriteriaCommonMerged);
											listOfrepWfBranchCriteriaFinalMerged.addAll(listOfrepWfBranchCriteriaLowerMerged);
											listOfrepWfBranchCriteriaFinalMerged.addAll(listOfrepWfBranchCriteriaHigherMerged);
											//Comparing Branch Criteria

											ListOfRepositoryWfStepBranchForMatchedStepLower.get(lowerMatchStepBranchCtr).SetListOfRepositoryWfBranchCriteria(listOfrepWfBranchCriteriaFinalMerged);
											ListOfRepositoryWfStepBranchForMatchedStepLower.get(lowerMatchStepBranchCtr).SetExpression();

											listOfrepWfStepBranchCommonMerged.add(ListOfRepositoryWfStepBranchForMatchedStepLower.get(lowerMatchStepBranchCtr));
										}
									}
								}
								for (lowerStepBranchCtr=0; lowerStepBranchCtr<ListOfRepositoryWfStepBranchForMatchedStepLower.size(); lowerStepBranchCtr++)
								{
									for (higherAuxStepBranchCtr=0; higherAuxStepBranchCtr<ListOfRepositoryWfStepBranchForMatchedStepHigher.size(); higherAuxStepBranchCtr++)
									{
										if (ListOfRepositoryWfStepBranchForMatchedStepLower.get(lowerStepBranchCtr).Name2.equals(ListOfRepositoryWfStepBranchForMatchedStepHigher.get(higherAuxStepBranchCtr).Name2))
										{
											break;
										}
									}
									if (higherAuxStepBranchCtr == ListOfRepositoryWfStepBranchForMatchedStepHigher.size())
									{
										listOfrepWfStepBranchLowerMerged.add(ListOfRepositoryWfStepBranchForMatchedStepLower.get(lowerStepBranchCtr));
									}
								}
								for (higherStepBranchCtr=0; higherStepBranchCtr<ListOfRepositoryWfStepBranchForMatchedStepHigher.size(); higherStepBranchCtr++)
								{
									for (lowerAuxStepBranchCtr=0; lowerAuxStepBranchCtr<ListOfRepositoryWfStepBranchForMatchedStepLower.size(); lowerAuxStepBranchCtr++)
									{
										if (ListOfRepositoryWfStepBranchForMatchedStepHigher.get(higherStepBranchCtr).Name2.equals(ListOfRepositoryWfStepBranchForMatchedStepLower.get(lowerAuxStepBranchCtr).Name2))
										{
											break;
										}
									}
									if (lowerAuxStepBranchCtr == ListOfRepositoryWfStepBranchForMatchedStepLower.size())
									{
										listOfrepWfStepBranchHigherMerged.add(ListOfRepositoryWfStepBranchForMatchedStepHigher.get(higherStepBranchCtr));
									}
								}
								listOfrepWfStepBranchFinalMerged.addAll(listOfrepWfStepBranchCommonMerged);
								listOfrepWfStepBranchFinalMerged.addAll(listOfrepWfStepBranchLowerMerged);
								listOfrepWfStepBranchFinalMerged.addAll(listOfrepWfStepBranchHigherMerged);

								temp.SetListOfRepositoryWfStepRecipient(listOfrepWfStepRecipientFinalMerged);
								temp.SetListOfRepositoryWfStepIOArgument(listOfrepWfStepIOArgumentFinalMerged);
								temp.SetListOfRepositoryWfStepBranch(listOfrepWfStepBranchFinalMerged);
							
								String tempStepTypeLower = listOfrepWfStepLower.get(lowerMatchStepCtr).sType;
								String tempStepTypeHigher = listOfrepWfStepHigher.get(higherMatchStepCtr).sType;

								boolean bypassConflict = false;

								if (tempStepTypeLower.equals("START") && tempStepTypeHigher.equals("START"))
								{
									bypassConflict = true;
								}
								if (tempStepTypeLower.equals("END") && tempStepTypeHigher.equals("END"))
								{
									bypassConflict = true;
								}
								if (tempStepTypeLower.equals("ABORT") && tempStepTypeHigher.equals("ABORT"))
								{
									bypassConflict = true;
								}

								if (!bypassConflict)
								{
									ConflictWFStep conflictWFStep = new ConflictWFStep(frame,listOfRepositoryWfProcessPropMerged, listOfrepWfStepLower.get(lowerMatchStepCtr).sType,listOfrepWfStepHigher.get(higherMatchStepCtr).sType,temp.sType,listOfrepWfStepLower.get(lowerMatchStepCtr).GetListOfRepositoryWfStepBranch(),listOfrepWfStepLower.get(lowerMatchStepCtr).GetListOfRepositoryWfStepIOArgument(),listOfrepWfStepHigher.get(higherMatchStepCtr).GetListOfRepositoryWfStepBranch(),listOfrepWfStepHigher.get(higherMatchStepCtr).GetListOfRepositoryWfStepIOArgument(),temp.GetListOfRepositoryWfStepBranch(),temp.GetListOfRepositoryWfStepIOArgument());

									conflictWFStep.setWfName(ProcessName);
									conflictWFStep.setStepName(listOfrepWfStepLower.get(lowerMatchStepCtr).Name3);

									//setting lower step properties
									conflictWFStep.setLowerAllowRetry(listOfrepWfStepLower.get(lowerMatchStepCtr).AllowRetryFlag);
									conflictWFStep.setLowerType(listOfrepWfStepLower.get(lowerMatchStepCtr).sType);
									conflictWFStep.setLowerBS(listOfrepWfStepLower.get(lowerMatchStepCtr).BusinessServiceName);
									conflictWFStep.setLowerMethod(listOfrepWfStepLower.get(lowerMatchStepCtr).BusinessServiceMethod);
									conflictWFStep.setLowerBC(listOfrepWfStepLower.get(lowerMatchStepCtr).BusinessComponent);
									conflictWFStep.setLowerOperation(listOfrepWfStepLower.get(lowerMatchStepCtr).sOperation);
									conflictWFStep.setLowerSubProcess(listOfrepWfStepLower.get(lowerMatchStepCtr).SubprocessName);
									conflictWFStep.setLowerDesc(listOfrepWfStepLower.get(lowerMatchStepCtr).Description);
									conflictWFStep.setLowerInactive(listOfrepWfStepLower.get(lowerMatchStepCtr).Inactive);
									conflictWFStep.setLowerEvaluateAll(listOfrepWfStepLower.get(lowerMatchStepCtr).EvaluateAll);
									conflictWFStep.setLowerErrorCode(listOfrepWfStepLower.get(lowerMatchStepCtr).ErrorCode);
									conflictWFStep.setLowerErrorMessage(listOfrepWfStepLower.get(lowerMatchStepCtr).ErrorMessage);
									conflictWFStep.setLowerMaxIteration(listOfrepWfStepLower.get(lowerMatchStepCtr).MaximumIterations);
									conflictWFStep.setLowerProcessingMode(listOfrepWfStepLower.get(lowerMatchStepCtr).ProcessingMode);
									conflictWFStep.setLowerUIV(listOfrepWfStepLower.get(lowerMatchStepCtr).UserInteractView);
									conflictWFStep.setLowerComments(listOfrepWfStepLower.get(lowerMatchStepCtr).Comments);

									//setting higher step properties
									conflictWFStep.setHigherAllowRetry(listOfrepWfStepHigher.get(higherMatchStepCtr).AllowRetryFlag);
									conflictWFStep.setHigherType(listOfrepWfStepHigher.get(higherMatchStepCtr).sType);
									conflictWFStep.setHigherBS(listOfrepWfStepHigher.get(higherMatchStepCtr).BusinessServiceName);
									conflictWFStep.setHigherMethod(listOfrepWfStepHigher.get(higherMatchStepCtr).BusinessServiceMethod);
									conflictWFStep.setHigherBC(listOfrepWfStepHigher.get(higherMatchStepCtr).BusinessComponent);
									conflictWFStep.setHigherOperation(listOfrepWfStepHigher.get(higherMatchStepCtr).sOperation);
									conflictWFStep.setHigherSubProcess(listOfrepWfStepHigher.get(higherMatchStepCtr).SubprocessName);
									conflictWFStep.setHigherDesc(listOfrepWfStepHigher.get(higherMatchStepCtr).Description);
									conflictWFStep.setHigherInactive(listOfrepWfStepHigher.get(higherMatchStepCtr).Inactive);
									conflictWFStep.setHigherEvaluateAll(listOfrepWfStepHigher.get(higherMatchStepCtr).EvaluateAll);
									conflictWFStep.setHigherErrorCode(listOfrepWfStepHigher.get(higherMatchStepCtr).ErrorCode);
									conflictWFStep.setHigherErrorMessage(listOfrepWfStepHigher.get(higherMatchStepCtr).ErrorMessage);
									conflictWFStep.setHigherMaxIteration(listOfrepWfStepHigher.get(higherMatchStepCtr).MaximumIterations);
									conflictWFStep.setHigherProcessingMode(listOfrepWfStepHigher.get(higherMatchStepCtr).ProcessingMode);
									conflictWFStep.setHigherUIV(listOfrepWfStepHigher.get(higherMatchStepCtr).UserInteractView);
									conflictWFStep.setHigherComments(listOfrepWfStepHigher.get(higherMatchStepCtr).Comments);

									//setting merged step properties
									conflictWFStep.setNewAllowRetry(temp.AllowRetryFlag);
									conflictWFStep.setNewType(temp.sType);
									conflictWFStep.setNewBS(temp.BusinessServiceName);
									conflictWFStep.setNewMethod(temp.BusinessServiceMethod);
									conflictWFStep.setNewBC(temp.BusinessComponent);
									conflictWFStep.setNewOperation(temp.sOperation);
									conflictWFStep.setNewSubProcess(temp.SubprocessName);
									conflictWFStep.setNewDesc(temp.Description);
									conflictWFStep.setNewInactive(temp.Inactive);
									conflictWFStep.setNewEvaluateAll(temp.EvaluateAll);
									conflictWFStep.setNewErrorCode(temp.ErrorCode);
									conflictWFStep.setNewErrorMessage(temp.ErrorMessage);
									conflictWFStep.setNewMaxIteration(temp.MaximumIterations);
									conflictWFStep.setNewProcessingMode(temp.ProcessingMode);
									conflictWFStep.setNewUIV(temp.UserInteractView);
									conflictWFStep.setNewComments(temp.Comments);
					
									conflictWFStep.setVisible(true);

									//Taking O/p after resolution
									temp.AllowRetryFlag = conflictWFStep.AllowRetryFlag;
									temp.sType = conflictWFStep.sType;
									temp.BusinessServiceName = conflictWFStep.BusinessServiceName;
									temp.BusinessServiceMethod = conflictWFStep.BusinessServiceMethod;
									temp.BusinessComponent = conflictWFStep.BusinessComponent;
									temp.sOperation = conflictWFStep.sOperation;
									temp.SubprocessName = conflictWFStep.SubprocessName;
									temp.Description = conflictWFStep.Description;
									temp.Inactive = conflictWFStep.Inactive;
									temp.EvaluateAll = conflictWFStep.EvaluateAll;
									temp.ErrorCode = conflictWFStep.ErrorCode;
									temp.ErrorMessage = conflictWFStep.ErrorMessage;
									temp.MaximumIterations = conflictWFStep.MaximumIterations;
									temp.ProcessingMode = conflictWFStep.ProcessingMode;
									temp.UserInteractView = conflictWFStep.UserInteractView;
									temp.Comments = conflictWFStep.Comments;

									temp.SetListOfRepositoryWfStepIOArgument(conflictWFStep.GetListOfRepositoryWfStepIOArgument());
									temp.SetListOfRepositoryWfStepBranch(conflictWFStep.GetListOfRepositoryWfStepBranch());
								}
							}
							break;
						case 1:
							temp = cloner.deepClone(listOfrepWfStepLower.get(lowerMatchStepCtr));
							break;
						case 2:
							temp = cloner.deepClone(listOfrepWfStepHigher.get(higherMatchStepCtr));
							break;
						default:
							temp = cloner.deepClone(listOfrepWfStepLower.get(lowerMatchStepCtr));
							break;
					}
					listOfrepWfStepCommonMerged.add(temp);
				}
			}
		}

		//Placing the lower extra Process Props in listOfrepWfStepLowerMerged
		for (lowerStepCtr=0; lowerStepCtr<listOfrepWfStepLower.size(); lowerStepCtr++)
		{
			for (higherAuxStepCtr=0; higherAuxStepCtr<listOfrepWfStepHigher.size(); higherAuxStepCtr++)
			{
				if (listOfrepWfStepLower.get(lowerStepCtr).Name3.equals(listOfrepWfStepHigher.get(higherAuxStepCtr).Name3))
				{
					break;
				}
			}
			if (higherAuxStepCtr == listOfrepWfStepHigher.size())
			{
				listOfrepWfStepLowerMerged.add(listOfrepWfStepLower.get(lowerStepCtr));
			}
		}

		//Placing the higher extra Process Props in listOfrepWfStepHigherMerged
		for (higherStepCtr=0; higherStepCtr<listOfrepWfStepHigher.size(); higherStepCtr++)
		{
			for (lowerAuxStepCtr=0; lowerAuxStepCtr<listOfrepWfStepLower.size(); lowerAuxStepCtr++)
			{
				if (listOfrepWfStepHigher.get(higherStepCtr).Name3.equals(listOfrepWfStepLower.get(lowerAuxStepCtr).Name3))
				{
					break;
				}
			}
			if (lowerAuxStepCtr == listOfrepWfStepLower.size())
			{
				listOfrepWfStepHigherMerged.add(listOfrepWfStepHigher.get(higherStepCtr));
			}
		}

		//listOfrepWfStepFinalMerged = listOfrepWfStepCommonMerged + listOfrepWfStepLowerMerged + listOfrepWfStepHigherMerged
		listOfrepWfStepFinalMerged.addAll(listOfrepWfStepCommonMerged);
		listOfrepWfStepFinalMerged.addAll(listOfrepWfStepLowerMerged);
		listOfrepWfStepFinalMerged.addAll(listOfrepWfStepHigherMerged);

		return listOfrepWfStepFinalMerged;
	}
}