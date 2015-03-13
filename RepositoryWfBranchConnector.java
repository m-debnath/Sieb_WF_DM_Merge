public class RepositoryWfBranchConnector implements Cloneable {
	// Total 8 elements
	String Comments = "";
	String FromStepName; //2
	String Inactive; //3
	String Layout; //4
	String Name2; //5
	String ForBranchName; //6
	String ParentType; //7
	String ToStepName; //8

	// Total 2 attribute
	String operation;
	String searchspec;

	public void init() {
		Comments = new String();
		FromStepName = new String();
		Inactive = new String();
		Layout = new String();
		Name2 = new String();
		ForBranchName = new String();
		ParentType = new String();
		ToStepName = new String();

		operation = new String();
		searchspec = new String();
	}

	public RepositoryWfBranchConnector() {
		this.init();

		Comments = "";
		FromStepName = "";
		Inactive = "";
		Layout = "";
		Name2 = "";
		ForBranchName = "";
		ParentType = "";
		ToStepName = "";

		operation = "";
		searchspec = "";
	}

	public RepositoryWfBranchConnector(String Comments, String FromStepName, String Inactive, String Layout, String Name2, String ForBranchName, String ParentType, String ToStepName) {
		this.init();

		this.Comments = Comments;
		this.FromStepName = FromStepName;
		this.Inactive = Inactive;
		this.Layout = Layout;
		this.Name2 = Name2;
		this.ForBranchName = ForBranchName;
		this.ParentType = ParentType;
		this.ToStepName = ToStepName;

		this.operation = "";
		this.searchspec = "";
	}

	public RepositoryWfBranchConnector(String Comments, String FromStepName, String Inactive, String Layout, String Name2, String ForBranchName, String ParentType, String ToStepName, String operation, String searchspec) {
		this.init();

		this.Comments = Comments;
		this.FromStepName = FromStepName;
		this.Inactive = Inactive;
		this.Layout = Layout;
		this.Name2 = Name2;
		this.ForBranchName = ForBranchName;
		this.ParentType = ParentType;
		this.ToStepName = ToStepName;

		this.operation = operation;
		this.searchspec = searchspec;
	}

	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public boolean equals(RepositoryWfBranchConnector repositoryWfBranchConnector) {
		if (repositoryWfBranchConnector.FromStepName.equals(this.FromStepName) && repositoryWfBranchConnector.Inactive.equals(this.Inactive) && repositoryWfBranchConnector.Layout.equals(this.Layout) && repositoryWfBranchConnector.Name2.equals(this.Name2) && repositoryWfBranchConnector.ForBranchName.equals(this.ForBranchName) && repositoryWfBranchConnector.ParentType.equals(this.ParentType) && repositoryWfBranchConnector.ToStepName.equals(this.ToStepName))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}