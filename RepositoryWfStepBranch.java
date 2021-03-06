import java.util.*;
import com.rits.cloning.*;

public class RepositoryWfStepBranch implements Cloneable {
	// Total 17 elements
	String Comments;
	String Count;
	String EvaluateSequence;
	String sEvent;
	String EventCancelFlag;
	String sEventObject;
	String EventObjectType;
	String EventVisibility;
	String sExpression;
	String Inactive;
	String Name2;
	String Subevent;
	String TimeLimit;
	String sType;
	String UserEventName;
	String UserEventStorage;
	String UserEventTimeout;

	// Total 2 attribute
	String operation;
	String searchspec;

	ArrayList<RepositoryWfBranchCriteria> ListOfRepositoryWfBranchCriteria;

	public boolean equals(RepositoryWfStepBranch repositoryWfStepBranch) {
		if (repositoryWfStepBranch.Count.equals(this.Count) && repositoryWfStepBranch.EvaluateSequence.equals(this.EvaluateSequence) && repositoryWfStepBranch.sEvent.equals(this.sEvent) && repositoryWfStepBranch.EventCancelFlag.equals(this.EventCancelFlag) && repositoryWfStepBranch.sEventObject.equals(this.sEventObject) && repositoryWfStepBranch.EventObjectType.equals(this.EventObjectType) && repositoryWfStepBranch.EventVisibility.equals(this.EventVisibility) && repositoryWfStepBranch.sExpression.equals(this.sExpression) && repositoryWfStepBranch.Subevent.equals(this.Subevent) && repositoryWfStepBranch.TimeLimit.equals(this.TimeLimit) && repositoryWfStepBranch.sType.equals(this.sType) && repositoryWfStepBranch.UserEventName.equals(this.UserEventName) && repositoryWfStepBranch.UserEventStorage.equals(this.UserEventStorage) && repositoryWfStepBranch.UserEventTimeout.equals(this.UserEventTimeout))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public RepositoryWfStepBranch() {
		Comments = "";
		Count = "";
		EvaluateSequence = "";
		sEvent = "";
		EventCancelFlag = "";
		sEventObject = "";
		EventObjectType = "";
		EventVisibility = "";
		sExpression = "";
		Inactive = "";
		Name2 = "";
		Subevent = "";
		TimeLimit = "";
		sType = "";
		UserEventName = "";
		UserEventStorage = "";
		UserEventTimeout = "";

		operation = "";
		searchspec = "";

		ListOfRepositoryWfBranchCriteria = new ArrayList<RepositoryWfBranchCriteria>();
	}

	public RepositoryWfStepBranch(String Comments, String Count, String EvaluateSequence, String sEvent, String EventCancelFlag, String sEventObject, String EventObjectType, String EventVisibility, String sExpression, String Inactive, String Name2, String Subevent, String TimeLimit, String sType, String UserEventName, String UserEventStorage, String UserEventTimeout, ArrayList<RepositoryWfBranchCriteria> ListOfRepositoryWfBranchCriteria) {
		this.Comments = Comments;
		this.Count = Count;
		this.EvaluateSequence = EvaluateSequence;
		this.sEvent = sEvent;
		this.EventCancelFlag = EventCancelFlag;
		this.sEventObject = sEventObject;
		this.EventObjectType = EventObjectType;
		this.EventVisibility = EventVisibility;
		this.sExpression = sExpression;
		this.Inactive = Inactive;
		this.Name2 = Name2;
		this.Subevent = Subevent;
		this.TimeLimit = TimeLimit;
		this.sType = sType;
		this.UserEventName = UserEventName;
		this.UserEventStorage = UserEventStorage;
		this.UserEventTimeout = UserEventTimeout;

		this.operation = "";
		this.searchspec = "";
		
		this.ListOfRepositoryWfBranchCriteria = new ArrayList<RepositoryWfBranchCriteria>();

		if (ListOfRepositoryWfBranchCriteria.size() > 0)
		{
			Cloner cloner = new Cloner();
			this.ListOfRepositoryWfBranchCriteria = cloner.deepClone(ListOfRepositoryWfBranchCriteria);
		}
	}

	public RepositoryWfStepBranch(String Comments, String Count, String EvaluateSequence, String sEvent, String EventCancelFlag, String sEventObject, String EventObjectType, String EventVisibility, String sExpression, String Inactive, String Name2, String Subevent, String TimeLimit, String sType, String UserEventName, String UserEventStorage, String UserEventTimeout, String operation, String searchspec, ArrayList<RepositoryWfBranchCriteria> ListOfRepositoryWfBranchCriteria) {
		this.Comments = Comments;
		this.Count = Count;
		this.EvaluateSequence = EvaluateSequence;
		this.sEvent = sEvent;
		this.EventCancelFlag = EventCancelFlag;
		this.sEventObject = sEventObject;
		this.EventObjectType = EventObjectType;
		this.EventVisibility = EventVisibility;
		this.sExpression = sExpression;
		this.Inactive = Inactive;
		this.Name2 = Name2;
		this.Subevent = Subevent;
		this.TimeLimit = TimeLimit;
		this.sType = sType;
		this.UserEventName = UserEventName;
		this.UserEventStorage = UserEventStorage;
		this.UserEventTimeout = UserEventTimeout;

		this.operation = operation;
		this.searchspec = searchspec;

		this.ListOfRepositoryWfBranchCriteria = new ArrayList<RepositoryWfBranchCriteria>();

		if (ListOfRepositoryWfBranchCriteria.size() > 0)
		{
			Cloner cloner = new Cloner();
			this.ListOfRepositoryWfBranchCriteria = cloner.deepClone(ListOfRepositoryWfBranchCriteria);
		}
	}

	public ArrayList<RepositoryWfBranchCriteria> GetListOfRepositoryWfBranchCriteria() {
		return ListOfRepositoryWfBranchCriteria;
	}

	public void SetListOfRepositoryWfBranchCriteria(ArrayList<RepositoryWfBranchCriteria> ListOfRepositoryWfBranchCriteria) {
		Cloner cloner = new Cloner();
		this.ListOfRepositoryWfBranchCriteria = cloner.deepClone(ListOfRepositoryWfBranchCriteria);
	}

	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public void SetExpression() {
		String newExpression = new String("");
		if (ListOfRepositoryWfBranchCriteria.size()==0)
		{
			return;
		}
		for (int i=0; i<ListOfRepositoryWfBranchCriteria.size(); i++)
		{
			if (i>0)
			{
				newExpression = newExpression + " AND ";
			}
			if (ListOfRepositoryWfBranchCriteria.get(i).CompareTo.equals("APPLET"))
			{
				if (ListOfRepositoryWfBranchCriteria.get(i).sOperation.equals("IS_NULL") || ListOfRepositoryWfBranchCriteria.get(i).sOperation.equals("IS_NOT_NULL"))
				{
					newExpression = newExpression + "(" + ListOfRepositoryWfBranchCriteria.get(i).AppletName + ".." + ListOfRepositoryWfBranchCriteria.get(i).AppletFieldName + " " + GetLowerCaseBranchCriteriaOperation(ListOfRepositoryWfBranchCriteria.get(i).sOperation) + ")";
				}
				if (ListOfRepositoryWfBranchCriteria.get(i).sOperation.equals("EQ_ALL") || ListOfRepositoryWfBranchCriteria.get(i).sOperation.equals("EQ_ALL_NC") || ListOfRepositoryWfBranchCriteria.get(i).sOperation.equals("GREATER_THAN") || ListOfRepositoryWfBranchCriteria.get(i).sOperation.equals("LESS_THAN") || ListOfRepositoryWfBranchCriteria.get(i).sOperation.equals("NE_ALL") || ListOfRepositoryWfBranchCriteria.get(i).sOperation.equals("NE_ALL_NC") || ListOfRepositoryWfBranchCriteria.get(i).sOperation.equals("EQ_ANY") || ListOfRepositoryWfBranchCriteria.get(i).sOperation.equals("EQ_ANY_NC") || ListOfRepositoryWfBranchCriteria.get(i).sOperation.equals("EQ_THIS") || ListOfRepositoryWfBranchCriteria.get(i).sOperation.equals("EQ_THIS_NC"))
				{
					newExpression = newExpression + "(" + ListOfRepositoryWfBranchCriteria.get(i).AppletName + ".." + ListOfRepositoryWfBranchCriteria.get(i).AppletFieldName + " " + GetLowerCaseBranchCriteriaOperation(ListOfRepositoryWfBranchCriteria.get(i).sOperation) + "(";
					for (int j=0; j<ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().size(); j++)
					{
						if (j>0)
						{
							newExpression = newExpression + " AND ";
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_CHAR1 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_CHAR1.equals("")))
						{
							newExpression = newExpression + "'" + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_CHAR1 + "'";
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_DATE1 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_DATE1.equals("")))
						{
							newExpression = newExpression + "'" + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_DATE1 + "'";
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_NUM1 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_NUM1.equals("")))
						{
							newExpression = newExpression + "'" + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_NUM1 + "'";
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_CHAR2 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_CHAR2.equals("")))
						{
							newExpression = newExpression + " AND ";
							newExpression = newExpression + "'" + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_CHAR2 + "'";
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_CHAR3 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_CHAR3.equals("")))
						{
							newExpression = newExpression + " AND ";
							newExpression = newExpression + "'" + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_CHAR3 + "'";
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_CHAR4 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_CHAR4.equals("")))
						{
							newExpression = newExpression + " AND ";
							newExpression = newExpression + "'" + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_CHAR4 + "'";
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_DATE2 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_DATE2.equals("")))
						{
							newExpression = newExpression + " AND ";
							newExpression = newExpression + "'" + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_DATE2 + "'";
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_DATE3 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_DATE3.equals("")))
						{
							newExpression = newExpression + " AND ";
							newExpression = newExpression + "'" + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_DATE3 + "'";
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_DATE4 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_DATE4.equals("")))
						{
							newExpression = newExpression + " AND ";
							newExpression = newExpression + "'" + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_DATE4 + "'";
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_NUM2 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_NUM2.equals("")))
						{
							newExpression = newExpression + " AND ";
							newExpression = newExpression + "'" + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_NUM2 + "'";
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_NUM3 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_NUM3.equals("")))
						{
							newExpression = newExpression + " AND ";
							newExpression = newExpression + "'" + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_NUM3 + "'";
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_NUM4 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_NUM4.equals("")))
						{
							newExpression = newExpression + " AND ";
							newExpression = newExpression + "'" + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_NUM4 + "'";
						}
					}
					newExpression = newExpression + "))";
				}
				if (ListOfRepositoryWfBranchCriteria.get(i).sOperation.equals("BETWEEN") || ListOfRepositoryWfBranchCriteria.get(i).sOperation.equals("NOT_BETWEEN"))
				{
					newExpression = newExpression + "(" + ListOfRepositoryWfBranchCriteria.get(i).AppletName + ".." + ListOfRepositoryWfBranchCriteria.get(i).AppletFieldName + " " + GetLowerCaseBranchCriteriaOperation(ListOfRepositoryWfBranchCriteria.get(i).sOperation) + "(";
					for (int j=0; j<ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().size(); j++)
					{
						if (j>0)
						{
							newExpression = newExpression + ", ";
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_CHAR1 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_CHAR1.equals("")))
						{
							newExpression = newExpression + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_CHAR1;
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_DATE1 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_DATE1.equals("")))
						{
							newExpression = newExpression + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_DATE1;
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_NUM1 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_NUM1.equals("")))
						{
							newExpression = newExpression + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_NUM1;
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_CHAR2 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_CHAR2.equals("")))
						{
							newExpression = newExpression + ", ";
							newExpression = newExpression + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_CHAR2;
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_CHAR3 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_CHAR3.equals("")))
						{
							newExpression = newExpression + ", ";
							newExpression = newExpression + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_CHAR3;
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_CHAR4 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_CHAR4.equals("")))
						{
							newExpression = newExpression + ", ";
							newExpression = newExpression + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_CHAR4;
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_DATE2 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_DATE2.equals("")))
						{
							newExpression = newExpression + ", ";
							newExpression = newExpression + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_DATE2;
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_DATE3 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_DATE3.equals("")))
						{
							newExpression = newExpression + ", ";
							newExpression = newExpression + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_DATE3;
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_DATE4 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_DATE4.equals("")))
						{
							newExpression = newExpression + ", ";
							newExpression = newExpression + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_DATE4;
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_NUM2 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_NUM2.equals("")))
						{
							newExpression = newExpression + ", ";
							newExpression = newExpression + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_NUM2;
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_NUM3 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_NUM3.equals("")))
						{
							newExpression = newExpression + ", ";
							newExpression = newExpression + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_NUM3;
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_NUM4 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_NUM4.equals("")))
						{
							newExpression = newExpression + ", ";
							newExpression = newExpression + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_NUM4;
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_CHAR1 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_CHAR1.equals("")))
						{
							newExpression = newExpression + ", ";
							newExpression = newExpression + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_CHAR1;
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_CHAR2 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_CHAR2.equals("")))
						{
							newExpression = newExpression + ", ";
							newExpression = newExpression + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_CHAR2;
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_CHAR3 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_CHAR3.equals("")))
						{
							newExpression = newExpression + ", ";
							newExpression = newExpression + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_CHAR3;
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_CHAR4 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_CHAR4.equals("")))
						{
							newExpression = newExpression + ", ";
							newExpression = newExpression + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_CHAR4;
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_DATE1 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_DATE1.equals("")))
						{
							newExpression = newExpression + ", ";
							newExpression = newExpression + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_DATE1;
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_DATE2 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_DATE2.equals("")))
						{
							newExpression = newExpression + ", ";
							newExpression = newExpression + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_DATE2;
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_DATE3 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_DATE3.equals("")))
						{
							newExpression = newExpression + ", ";
							newExpression = newExpression + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_DATE3;
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_DATE4 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_DATE4.equals("")))
						{
							newExpression = newExpression + ", ";
							newExpression = newExpression + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_DATE4;
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_NUM1 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_NUM1.equals("")))
						{
							newExpression = newExpression + ", ";
							newExpression = newExpression + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_NUM1;
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_NUM2 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_NUM2.equals("")))
						{
							newExpression = newExpression + ", ";
							newExpression = newExpression + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_NUM2;
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_NUM3 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_NUM3.equals("")))
						{
							newExpression = newExpression + ", ";
							newExpression = newExpression + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_NUM3;
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_NUM4 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_NUM4.equals("")))
						{
							newExpression = newExpression + ", ";
							newExpression = newExpression + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_NUM4;
						}
					}
					newExpression = newExpression + "))";
				}
			}
			if (ListOfRepositoryWfBranchCriteria.get(i).CompareTo.equals("BUSCOMP"))
			{
				if (ListOfRepositoryWfBranchCriteria.get(i).sOperation.equals("IS_NULL") || ListOfRepositoryWfBranchCriteria.get(i).sOperation.equals("IS_NOT_NULL"))
				{
					newExpression = newExpression + "(" + ListOfRepositoryWfBranchCriteria.get(i).BusinessComponent + ".." + ListOfRepositoryWfBranchCriteria.get(i).BusinessComponentField + " " + GetLowerCaseBranchCriteriaOperation(ListOfRepositoryWfBranchCriteria.get(i).sOperation) + ")";
				}
				if (ListOfRepositoryWfBranchCriteria.get(i).sOperation.equals("EQ_ALL") || ListOfRepositoryWfBranchCriteria.get(i).sOperation.equals("EQ_ALL_NC") || ListOfRepositoryWfBranchCriteria.get(i).sOperation.equals("GREATER_THAN") || ListOfRepositoryWfBranchCriteria.get(i).sOperation.equals("LESS_THAN") || ListOfRepositoryWfBranchCriteria.get(i).sOperation.equals("NE_ALL") || ListOfRepositoryWfBranchCriteria.get(i).sOperation.equals("NE_ALL_NC") || ListOfRepositoryWfBranchCriteria.get(i).sOperation.equals("EQ_ANY") || ListOfRepositoryWfBranchCriteria.get(i).sOperation.equals("EQ_ANY_NC") || ListOfRepositoryWfBranchCriteria.get(i).sOperation.equals("EQ_THIS") || ListOfRepositoryWfBranchCriteria.get(i).sOperation.equals("EQ_THIS_NC"))
				{
					newExpression = newExpression + "(" + ListOfRepositoryWfBranchCriteria.get(i).BusinessComponent + ".." + ListOfRepositoryWfBranchCriteria.get(i).BusinessComponentField + " " + GetLowerCaseBranchCriteriaOperation(ListOfRepositoryWfBranchCriteria.get(i).sOperation) + "(";
					for (int j=0; j<ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().size(); j++)
					{
						if (j>0)
						{
							newExpression = newExpression + " AND ";
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_CHAR1 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_CHAR1.equals("")))
						{
							newExpression = newExpression + "'" + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_CHAR1 + "'";
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_DATE1 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_DATE1.equals("")))
						{
							newExpression = newExpression + "'" + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_DATE1 + "'";
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_NUM1 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_NUM1.equals("")))
						{
							newExpression = newExpression + "'" + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_NUM1 + "'";
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_CHAR2 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_CHAR2.equals("")))
						{
							newExpression = newExpression + " AND ";
							newExpression = newExpression + "'" + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_CHAR2 + "'";
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_CHAR3 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_CHAR3.equals("")))
						{
							newExpression = newExpression + " AND ";
							newExpression = newExpression + "'" + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_CHAR3 + "'";
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_CHAR4 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_CHAR4.equals("")))
						{
							newExpression = newExpression + " AND ";
							newExpression = newExpression + "'" + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_CHAR4 + "'";
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_DATE2 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_DATE2.equals("")))
						{
							newExpression = newExpression + " AND ";
							newExpression = newExpression + "'" + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_DATE2 + "'";
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_DATE3 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_DATE3.equals("")))
						{
							newExpression = newExpression + " AND ";
							newExpression = newExpression + "'" + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_DATE3 + "'";
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_DATE4 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_DATE4.equals("")))
						{
							newExpression = newExpression + " AND ";
							newExpression = newExpression + "'" + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_DATE4 + "'";
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_NUM2 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_NUM2.equals("")))
						{
							newExpression = newExpression + " AND ";
							newExpression = newExpression + "'" + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_NUM2 + "'";
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_NUM3 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_NUM3.equals("")))
						{
							newExpression = newExpression + " AND ";
							newExpression = newExpression + "'" + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_NUM3 + "'";
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_NUM4 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_NUM4.equals("")))
						{
							newExpression = newExpression + " AND ";
							newExpression = newExpression + "'" + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_NUM4 + "'";
						}
					}
					newExpression = newExpression + "))";
				}
				if (ListOfRepositoryWfBranchCriteria.get(i).sOperation.equals("BETWEEN") || ListOfRepositoryWfBranchCriteria.get(i).sOperation.equals("NOT_BETWEEN"))
				{
					newExpression = newExpression + "(" + ListOfRepositoryWfBranchCriteria.get(i).BusinessComponent + ".." + ListOfRepositoryWfBranchCriteria.get(i).BusinessComponentField + " " + GetLowerCaseBranchCriteriaOperation(ListOfRepositoryWfBranchCriteria.get(i).sOperation) + "(";
					for (int j=0; j<ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().size(); j++)
					{
						if (j>0)
						{
							newExpression = newExpression + ", ";
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_CHAR1 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_CHAR1.equals("")))
						{
							newExpression = newExpression + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_CHAR1;
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_DATE1 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_DATE1.equals("")))
						{
							newExpression = newExpression + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_DATE1;
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_NUM1 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_NUM1.equals("")))
						{
							newExpression = newExpression + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_NUM1;
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_CHAR2 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_CHAR2.equals("")))
						{
							newExpression = newExpression + ", ";
							newExpression = newExpression + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_CHAR2;
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_CHAR3 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_CHAR3.equals("")))
						{
							newExpression = newExpression + ", ";
							newExpression = newExpression + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_CHAR3;
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_CHAR4 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_CHAR4.equals("")))
						{
							newExpression = newExpression + ", ";
							newExpression = newExpression + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_CHAR4;
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_DATE2 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_DATE2.equals("")))
						{
							newExpression = newExpression + ", ";
							newExpression = newExpression + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_DATE2;
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_DATE3 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_DATE3.equals("")))
						{
							newExpression = newExpression + ", ";
							newExpression = newExpression + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_DATE3;
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_DATE4 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_DATE4.equals("")))
						{
							newExpression = newExpression + ", ";
							newExpression = newExpression + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_DATE4;
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_NUM2 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_NUM2.equals("")))
						{
							newExpression = newExpression + ", ";
							newExpression = newExpression + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_NUM2;
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_NUM3 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_NUM3.equals("")))
						{
							newExpression = newExpression + ", ";
							newExpression = newExpression + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_NUM3;
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_NUM4 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_NUM4.equals("")))
						{
							newExpression = newExpression + ", ";
							newExpression = newExpression + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_NUM4;
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_CHAR1 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_CHAR1.equals("")))
						{
							newExpression = newExpression + ", ";
							newExpression = newExpression + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_CHAR1;
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_CHAR2 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_CHAR2.equals("")))
						{
							newExpression = newExpression + ", ";
							newExpression = newExpression + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_CHAR2;
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_CHAR3 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_CHAR3.equals("")))
						{
							newExpression = newExpression + ", ";
							newExpression = newExpression + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_CHAR3;
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_CHAR4 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_CHAR4.equals("")))
						{
							newExpression = newExpression + ", ";
							newExpression = newExpression + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_CHAR4;
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_DATE1 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_DATE1.equals("")))
						{
							newExpression = newExpression + ", ";
							newExpression = newExpression + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_DATE1;
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_DATE2 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_DATE2.equals("")))
						{
							newExpression = newExpression + ", ";
							newExpression = newExpression + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_DATE2;
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_DATE3 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_DATE3.equals("")))
						{
							newExpression = newExpression + ", ";
							newExpression = newExpression + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_DATE3;
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_DATE4 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_DATE4.equals("")))
						{
							newExpression = newExpression + ", ";
							newExpression = newExpression + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_DATE4;
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_NUM1 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_NUM1.equals("")))
						{
							newExpression = newExpression + ", ";
							newExpression = newExpression + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_NUM1;
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_NUM2 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_NUM2.equals("")))
						{
							newExpression = newExpression + ", ";
							newExpression = newExpression + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_NUM2;
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_NUM3 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_NUM3.equals("")))
						{
							newExpression = newExpression + ", ";
							newExpression = newExpression + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_NUM3;
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_NUM4 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_NUM4.equals("")))
						{
							newExpression = newExpression + ", ";
							newExpression = newExpression + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_NUM4;
						}
					}
					newExpression = newExpression + "))";
				}
			}
			if (ListOfRepositoryWfBranchCriteria.get(i).CompareTo.equals("PROPERTY"))
			{
				if (ListOfRepositoryWfBranchCriteria.get(i).sOperation.equals("IS_NULL") || ListOfRepositoryWfBranchCriteria.get(i).sOperation.equals("IS_NOT_NULL"))
				{
					newExpression = newExpression + "(" + ListOfRepositoryWfBranchCriteria.get(i).PropertyName + " " + GetLowerCaseBranchCriteriaOperation(ListOfRepositoryWfBranchCriteria.get(i).sOperation) + ")";
				}
				if (ListOfRepositoryWfBranchCriteria.get(i).sOperation.equals("EQ_ALL") || ListOfRepositoryWfBranchCriteria.get(i).sOperation.equals("EQ_ALL_NC") || ListOfRepositoryWfBranchCriteria.get(i).sOperation.equals("GREATER_THAN") || ListOfRepositoryWfBranchCriteria.get(i).sOperation.equals("LESS_THAN") || ListOfRepositoryWfBranchCriteria.get(i).sOperation.equals("NE_ALL") || ListOfRepositoryWfBranchCriteria.get(i).sOperation.equals("NE_ALL_NC") || ListOfRepositoryWfBranchCriteria.get(i).sOperation.equals("EQ_ANY") || ListOfRepositoryWfBranchCriteria.get(i).sOperation.equals("EQ_ANY_NC") || ListOfRepositoryWfBranchCriteria.get(i).sOperation.equals("EQ_THIS") || ListOfRepositoryWfBranchCriteria.get(i).sOperation.equals("EQ_THIS_NC"))
				{
					newExpression = newExpression + "(" + ListOfRepositoryWfBranchCriteria.get(i).PropertyName + " " + GetLowerCaseBranchCriteriaOperation(ListOfRepositoryWfBranchCriteria.get(i).sOperation) + "(";
					for (int j=0; j<ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().size(); j++)
					{
						if (j>0)
						{
							newExpression = newExpression + " AND ";
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_CHAR1 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_CHAR1.equals("")))
						{
							newExpression = newExpression + "'" + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_CHAR1 + "'";
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_DATE1 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_DATE1.equals("")))
						{
							newExpression = newExpression + "'" + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_DATE1 + "'";
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_NUM1 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_NUM1.equals("")))
						{
							newExpression = newExpression + "'" + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_NUM1 + "'";
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_CHAR2 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_CHAR2.equals("")))
						{
							newExpression = newExpression + " AND ";
							newExpression = newExpression + "'" + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_CHAR2 + "'";
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_CHAR3 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_CHAR3.equals("")))
						{
							newExpression = newExpression + " AND ";
							newExpression = newExpression + "'" + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_CHAR3 + "'";
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_CHAR4 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_CHAR4.equals("")))
						{
							newExpression = newExpression + " AND ";
							newExpression = newExpression + "'" + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_CHAR4 + "'";
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_DATE2 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_DATE2.equals("")))
						{
							newExpression = newExpression + " AND ";
							newExpression = newExpression + "'" + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_DATE2 + "'";
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_DATE3 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_DATE3.equals("")))
						{
							newExpression = newExpression + " AND ";
							newExpression = newExpression + "'" + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_DATE3 + "'";
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_DATE4 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_DATE4.equals("")))
						{
							newExpression = newExpression + " AND ";
							newExpression = newExpression + "'" + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_DATE4 + "'";
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_NUM2 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_NUM2.equals("")))
						{
							newExpression = newExpression + " AND ";
							newExpression = newExpression + "'" + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_NUM2 + "'";
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_NUM3 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_NUM3.equals("")))
						{
							newExpression = newExpression + " AND ";
							newExpression = newExpression + "'" + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_NUM3 + "'";
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_NUM4 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_NUM4.equals("")))
						{
							newExpression = newExpression + " AND ";
							newExpression = newExpression + "'" + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_NUM4 + "'";
						}
					}
					newExpression = newExpression + "))";
				}
				if (ListOfRepositoryWfBranchCriteria.get(i).sOperation.equals("BETWEEN") || ListOfRepositoryWfBranchCriteria.get(i).sOperation.equals("NOT_BETWEEN"))
				{
					newExpression = newExpression + "(" + ListOfRepositoryWfBranchCriteria.get(i).PropertyName + " " + GetLowerCaseBranchCriteriaOperation(ListOfRepositoryWfBranchCriteria.get(i).sOperation) + "(";
					for (int j=0; j<ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().size(); j++)
					{
						if (j>0)
						{
							newExpression = newExpression + ", ";
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_CHAR1 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_CHAR1.equals("")))
						{
							newExpression = newExpression + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_CHAR1;
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_DATE1 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_DATE1.equals("")))
						{
							newExpression = newExpression + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_DATE1;
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_NUM1 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_NUM1.equals("")))
						{
							newExpression = newExpression + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_NUM1;
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_CHAR2 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_CHAR2.equals("")))
						{
							newExpression = newExpression + ", ";
							newExpression = newExpression + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_CHAR2;
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_CHAR3 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_CHAR3.equals("")))
						{
							newExpression = newExpression + ", ";
							newExpression = newExpression + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_CHAR3;
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_CHAR4 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_CHAR4.equals("")))
						{
							newExpression = newExpression + ", ";
							newExpression = newExpression + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_CHAR4;
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_DATE2 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_DATE2.equals("")))
						{
							newExpression = newExpression + ", ";
							newExpression = newExpression + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_DATE2;
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_DATE3 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_DATE3.equals("")))
						{
							newExpression = newExpression + ", ";
							newExpression = newExpression + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_DATE3;
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_DATE4 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_DATE4.equals("")))
						{
							newExpression = newExpression + ", ";
							newExpression = newExpression + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_DATE4;
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_NUM2 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_NUM2.equals("")))
						{
							newExpression = newExpression + ", ";
							newExpression = newExpression + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_NUM2;
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_NUM3 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_NUM3.equals("")))
						{
							newExpression = newExpression + ", ";
							newExpression = newExpression + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_NUM3;
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_NUM4 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_NUM4.equals("")))
						{
							newExpression = newExpression + ", ";
							newExpression = newExpression + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_NUM4;
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_CHAR1 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_CHAR1.equals("")))
						{
							newExpression = newExpression + ", ";
							newExpression = newExpression + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_CHAR1;
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_CHAR2 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_CHAR2.equals("")))
						{
							newExpression = newExpression + ", ";
							newExpression = newExpression + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_CHAR2;
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_CHAR3 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_CHAR3.equals("")))
						{
							newExpression = newExpression + ", ";
							newExpression = newExpression + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_CHAR3;
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_CHAR4 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_CHAR4.equals("")))
						{
							newExpression = newExpression + ", ";
							newExpression = newExpression + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_CHAR4;
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_DATE1 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_DATE1.equals("")))
						{
							newExpression = newExpression + ", ";
							newExpression = newExpression + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_DATE1;
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_DATE2 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_DATE2.equals("")))
						{
							newExpression = newExpression + ", ";
							newExpression = newExpression + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_DATE2;
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_DATE3 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_DATE3.equals("")))
						{
							newExpression = newExpression + ", ";
							newExpression = newExpression + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_DATE3;
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_DATE4 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_DATE4.equals("")))
						{
							newExpression = newExpression + ", ";
							newExpression = newExpression + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_DATE4;
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_NUM1 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_NUM1.equals("")))
						{
							newExpression = newExpression + ", ";
							newExpression = newExpression + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_NUM1;
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_NUM2 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_NUM2.equals("")))
						{
							newExpression = newExpression + ", ";
							newExpression = newExpression + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_NUM2;
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_NUM3 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_NUM3.equals("")))
						{
							newExpression = newExpression + ", ";
							newExpression = newExpression + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_NUM3;
						}
						if (ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_NUM4 != null && !(ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_NUM4.equals("")))
						{
							newExpression = newExpression + ", ";
							newExpression = newExpression + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).HI_NUM4;
						}
					}
					newExpression = newExpression + "))";
				}
			}
			if (ListOfRepositoryWfBranchCriteria.get(i).CompareTo.equals("EXPRESSION"))
			{
				if (ListOfRepositoryWfBranchCriteria.get(i).sOperation.equals("IS_NULL") || ListOfRepositoryWfBranchCriteria.get(i).sOperation.equals("IS_NOT_NULL"))
				{
					newExpression = newExpression + "(" + ListOfRepositoryWfBranchCriteria.get(i).BusinessComponent + " " + GetLowerCaseBranchCriteriaOperation(ListOfRepositoryWfBranchCriteria.get(i).sOperation) + ")";
				}
				else
				{
					newExpression = newExpression + "(" + ListOfRepositoryWfBranchCriteria.get(i).BusinessComponent + " " + GetLowerCaseBranchCriteriaOperation(ListOfRepositoryWfBranchCriteria.get(i).sOperation) + "(";
					for (int j=0; j<ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().size(); j++)
					{
						if (j>0)
						{
							newExpression = newExpression + " AND ";
						}
						newExpression = newExpression + "'" + ListOfRepositoryWfBranchCriteria.get(i).GetListOfRepositoryWfBranchCriteriaValue().get(j).LO_CHAR5 + "'";
					}
					newExpression = newExpression + "))";
				}
			}
		}
		sExpression = newExpression;
	}

	private String GetLowerCaseBranchCriteriaOperation(String sString) {
		if (sString.equals("EQ_ALL"))
		{
			return "All Must Match";
		}
		if (sString.equals("EQ_ALL_NC"))
		{
			return "All Must Match (Ignore Case)";
		}
		if (sString.equals("BETWEEN"))
		{
			return "Between";
		}
		if (sString.equals("GREATER_THAN"))
		{
			return "Greater Than";
		}
		if (sString.equals("IS_NOT_NULL"))
		{
			return "Is Not Null";
		}
		if (sString.equals("IS_NULL"))
		{
			return "Is Null";
		}
		if (sString.equals("LESS_THAN"))
		{
			return "Less Than";
		}
		if (sString.equals("NE_ALL"))
		{
			return "None Can Match";
		}
		if (sString.equals("NE_ALL_NC"))
		{
			return "None Can Match (Ignore Case)";
		}
		if (sString.equals("NOT_BETWEEN"))
		{
			return "Not Between";
		}
		if (sString.equals("EQ_ANY"))
		{
			return "One Must Match";
		}
		if (sString.equals("EQ_ANY_NC"))
		{
			return "One Must Match (Ignore Case)";
		}
		if (sString.equals("EQ_THIS"))
		{
			return "This Must Match";
		}
		if (sString.equals("EQ_THIS_NC"))
		{
			return "This Must Match (Ignore Case)";
		}
		return "";
	}
}