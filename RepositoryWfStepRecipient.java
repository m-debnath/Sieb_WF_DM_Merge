public class RepositoryWfStepRecipient implements Cloneable {
	// Total 10 elements
	String BusinessComponentField;
	String BusinessComponentName;
	String Comments;
	String sExpression;
	String Inactive;
	String Name2;
	String ProcessPropertyName;
	String RecipientName;
	String RecipientTypeCode;
	String ValueTypeCode;

	// Total 2 attribute
	String operation;
	String searchspec;

	public void init() {
		BusinessComponentField = new String();
		BusinessComponentName = new String();
		Comments = new String();
		sExpression = new String();
		Inactive = new String();
		Name2 = new String();
		ProcessPropertyName = new String();
		RecipientName = new String();
		RecipientTypeCode = new String();
		ValueTypeCode = new String();

		operation = new String();
		searchspec = new String();
	}

	public RepositoryWfStepRecipient() {
		this.init();

		BusinessComponentField = "";
		BusinessComponentName = "";
		Comments = "";
		sExpression = "";
		Inactive = "";
		Name2 = "";
		ProcessPropertyName = "";
		RecipientName = "";
		RecipientTypeCode = "";
		ValueTypeCode = "";

		operation = "";
		searchspec = "";
	}

	public RepositoryWfStepRecipient(String BusinessComponentField, String BusinessComponentName, String Comments, String sExpression, String Inactive, String Name2, String ProcessPropertyName, String RecipientName, String RecipientTypeCode, String ValueTypeCode) {
		this.init();

		this.BusinessComponentField = BusinessComponentField;
		this.BusinessComponentName = BusinessComponentName;
		this.Comments = Comments;
		this.sExpression = sExpression;
		this.Inactive = Inactive;
		this.Name2 = Name2;
		this.ProcessPropertyName = ProcessPropertyName;
		this.RecipientName = RecipientName;
		this.RecipientTypeCode = RecipientTypeCode;
		this.ValueTypeCode = ValueTypeCode;

		this.operation = "";
		this.searchspec = "";
	}

	public RepositoryWfStepRecipient(String BusinessComponentField, String BusinessComponentName, String Comments, String sExpression, String Inactive, String Name2, String ProcessPropertyName, String RecipientName, String RecipientTypeCode, String ValueTypeCode, String operation, String searchspec) {
		this.init();

		this.BusinessComponentField = BusinessComponentField;
		this.BusinessComponentName = BusinessComponentName;
		this.Comments = Comments;
		this.sExpression = sExpression;
		this.Inactive = Inactive;
		this.Name2 = Name2;
		this.ProcessPropertyName = ProcessPropertyName;
		this.RecipientName = RecipientName;
		this.RecipientTypeCode = RecipientTypeCode;
		this.ValueTypeCode = ValueTypeCode;

		this.operation = operation;
		this.searchspec = searchspec;
	}

	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public boolean equals(RepositoryWfStepRecipient repositoryWfStepRecipient) {
		if (repositoryWfStepRecipient.BusinessComponentField.equals(this.BusinessComponentField) && repositoryWfStepRecipient.BusinessComponentName.equals(this.BusinessComponentName) && repositoryWfStepRecipient.sExpression.equals(this.sExpression) && repositoryWfStepRecipient.Inactive.equals(this.Inactive) && repositoryWfStepRecipient.Name2.equals(this.Name2) && repositoryWfStepRecipient.ProcessPropertyName.equals(this.ProcessPropertyName) && repositoryWfStepRecipient.RecipientName.equals(this.RecipientName) && repositoryWfStepRecipient.RecipientTypeCode.equals(this.RecipientTypeCode) && repositoryWfStepRecipient.ValueTypeCode.equals(this.ValueTypeCode))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}