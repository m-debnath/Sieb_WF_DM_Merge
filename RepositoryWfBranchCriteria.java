import java.util.*;
import com.rits.cloning.*;

public class RepositoryWfBranchCriteria implements Cloneable {
	// Total 12 elements
	String AppletFieldName;
	String AppletName;
	String sOperation;
	String BusinessComponent;
	String BusinessComponentField;
	String Comments;
	String CompareTo;
	String Inactive;
	String ItemTypeName;
	String Name2;
	String PropertyName;
	String sSequence;

	// Total 2 attributes
	String operation;
	String searchspec;

	// Total 3 Childs
	ArrayList<RepositoryWfBranchCriteriaValue> ListOfRepositoryWfBranchCriteriaValue;

	public void init() {
		AppletFieldName = new String();
		AppletName = new String();
		sOperation = new String();
		BusinessComponent = new String();
		BusinessComponentField = new String();
		Comments = new String();
		CompareTo = new String();
		Inactive = new String();
		ItemTypeName = new String();
		Name2 = new String();
		PropertyName = new String();
		sSequence = new String();

		// Total 2 attributes
		operation = new String();
		searchspec = new String();

		ListOfRepositoryWfBranchCriteriaValue = new ArrayList<RepositoryWfBranchCriteriaValue>();
	}

	public RepositoryWfBranchCriteria() {
		this.init();
		AppletFieldName = "";
		AppletName = "";
		sOperation = "";
		BusinessComponent = "";
		BusinessComponentField = "";
		Comments = "";
		CompareTo = "";
		Inactive = "";
		ItemTypeName = "";
		Name2 = "";
		PropertyName = "";
		sSequence = "";

		// Total 2 attributes
		operation = "";
		searchspec = "";
	}

	public RepositoryWfBranchCriteria(String AppletFieldName, String AppletName, String sOperation, String BusinessComponent, String BusinessComponentField, String Comments, String CompareTo, String Inactive, String ItemTypeName, String Name2, String PropertyName, String sSequence, ArrayList<RepositoryWfBranchCriteriaValue> ListOfRepositoryWfBranchCriteriaValue) {
		this.init();

		this.AppletFieldName = AppletFieldName;
		this.AppletName = AppletName;
		this.sOperation = sOperation;
		this.BusinessComponent = BusinessComponent;
		this.BusinessComponentField = BusinessComponentField;
		this.Comments = Comments;
		this.CompareTo = CompareTo;
		this.Inactive = Inactive;
		this.ItemTypeName = ItemTypeName;
		this.Name2 = Name2;
		this.PropertyName = PropertyName;
		this.sSequence = sSequence;

		this.operation = "";
		this.searchspec = "";

		if (ListOfRepositoryWfBranchCriteriaValue.size() > 0)
		{
			Cloner cloner = new Cloner();
			this.ListOfRepositoryWfBranchCriteriaValue = cloner.deepClone(ListOfRepositoryWfBranchCriteriaValue);
		}
		else
		{
			this.ListOfRepositoryWfBranchCriteriaValue = new ArrayList<RepositoryWfBranchCriteriaValue>();
		}
	}

	public RepositoryWfBranchCriteria(String AppletFieldName, String AppletName, String sOperation, String BusinessComponent, String BusinessComponentField, String Comments, String CompareTo, String Inactive, String ItemTypeName, String Name2, String PropertyName, String sSequence, String operation, String searchspec, ArrayList<RepositoryWfBranchCriteriaValue> ListOfRepositoryWfBranchCriteriaValue) {
		this.init();
		this.AppletFieldName = AppletFieldName;
		this.AppletName = AppletName;
		this.sOperation = sOperation;
		this.BusinessComponent = BusinessComponent;
		this.BusinessComponentField = BusinessComponentField;
		this.Comments = Comments;
		this.CompareTo = CompareTo;
		this.Inactive = Inactive;
		this.ItemTypeName = ItemTypeName;
		this.Name2 = Name2;
		this.PropertyName = PropertyName;
		this.sSequence = sSequence;

		this.operation = operation;
		this.searchspec = searchspec;

		if (ListOfRepositoryWfBranchCriteriaValue.size() > 0)
		{
			Cloner cloner = new Cloner();
			this.ListOfRepositoryWfBranchCriteriaValue = cloner.deepClone(ListOfRepositoryWfBranchCriteriaValue);
		}
		else
		{
			this.ListOfRepositoryWfBranchCriteriaValue = new ArrayList<RepositoryWfBranchCriteriaValue>();
		}
	}

	public String getName2() {
		return Name2;
	}

	public ArrayList<RepositoryWfBranchCriteriaValue> GetListOfRepositoryWfBranchCriteriaValue() {
		return ListOfRepositoryWfBranchCriteriaValue;
	}

	public void SetListOfRepositoryWfBranchCriteriaValue(ArrayList<RepositoryWfBranchCriteriaValue> ListOfRepositoryWfBranchCriteriaValue) {
		if (ListOfRepositoryWfBranchCriteriaValue.size() > 0)
		{
			Cloner cloner = new Cloner();
			this.ListOfRepositoryWfBranchCriteriaValue = cloner.deepClone(ListOfRepositoryWfBranchCriteriaValue);
		}
		else
		{
			this.ListOfRepositoryWfBranchCriteriaValue = new ArrayList<RepositoryWfBranchCriteriaValue>();
		}
	}

	protected Object clone() throws CloneNotSupportedException {
		Cloner cloner = new Cloner();
		return cloner.deepClone(this);
	}

	public boolean equals(RepositoryWfBranchCriteria repositoryWfBranchCriteria) {
		if (repositoryWfBranchCriteria.AppletName.equals(this.AppletName) && repositoryWfBranchCriteria.sOperation.equals(this.sOperation) && repositoryWfBranchCriteria.BusinessComponent.equals(this.BusinessComponent) && repositoryWfBranchCriteria.BusinessComponentField.equals(this.BusinessComponentField) && repositoryWfBranchCriteria.CompareTo.equals(this.CompareTo) && repositoryWfBranchCriteria.Inactive.equals(this.Inactive) && repositoryWfBranchCriteria.ItemTypeName.equals(this.ItemTypeName) && repositoryWfBranchCriteria.Name2.equals(this.Name2) && repositoryWfBranchCriteria.PropertyName.equals(this.PropertyName) && repositoryWfBranchCriteria.sSequence.equals(this.sSequence))
		{
			if (this.GetListOfRepositoryWfBranchCriteriaValue().size() != repositoryWfBranchCriteria.GetListOfRepositoryWfBranchCriteriaValue().size())
			{
				return false;
			}
			else
			{
				int i;
				for (i=0; i<this.GetListOfRepositoryWfBranchCriteriaValue().size(); i++)
				{
					if (!this.GetListOfRepositoryWfBranchCriteriaValue().get(i).equals(repositoryWfBranchCriteria.GetListOfRepositoryWfBranchCriteriaValue().get(i)))
					{
						break;
					}
				}
				if (i == this.GetListOfRepositoryWfBranchCriteriaValue().size())
				{
					return true;
				}
				else
				{
					return false;
				}
			}
		}
		else
		{
			return false;
		}
	}
}