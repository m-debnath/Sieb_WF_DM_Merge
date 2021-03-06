public class RepositoryWfStepIOArgument implements Cloneable {
	// Total 12 elements
	String BusinessComponent;
	String BusinessComponentField;
	String Comments;
	String Inactive;
	String InputFlag;
	String ItemTypeName;
	String Name2;
	String OutputArg;
	String PropertyName;
	String sSequence;
	String sType;
	String ValueSearchSpecification;

	// Total 2 attribute
	String operation;
	String searchspec;

	public void init() {
		BusinessComponent = new String();
		BusinessComponentField = new String();
		Comments = new String();
		Inactive = new String();
		InputFlag = new String();
		ItemTypeName = new String();
		Name2 = new String();
		OutputArg = new String();
		PropertyName = new String();
		sSequence = new String();
		sType = new String();
		ValueSearchSpecification = new String();

		operation = new String();
		searchspec = new String();
	}

	public RepositoryWfStepIOArgument() {
		this.init();

		BusinessComponent = "";
		BusinessComponentField = "";
		Comments = "";
		Inactive = "";
		InputFlag = "";
		ItemTypeName = "";
		Name2 = "";
		OutputArg = "";
		PropertyName = "";
		sSequence = "";
		sType = "";
		ValueSearchSpecification = "";

		operation = "";
		searchspec = "";
	}

	public RepositoryWfStepIOArgument(String BusinessComponent, String BusinessComponentField, String Comments, String Inactive, String InputFlag, String ItemTypeName, String Name2, String OutputArg, String PropertyName, String sSequence, String sType, String ValueSearchSpecification) {
		this.init();

		this.BusinessComponent = BusinessComponent;
		this.BusinessComponentField = BusinessComponentField;
		this.Comments = Comments;
		this.Inactive = Inactive;
		this.InputFlag = InputFlag;
		this.ItemTypeName = ItemTypeName;
		this.Name2 = Name2;
		this.OutputArg = OutputArg;
		this.PropertyName = PropertyName;
		this.sSequence = sSequence;
		this.sType = sType;
		this.ValueSearchSpecification = ValueSearchSpecification;

		this.operation = "";
		this.searchspec = "";
	}

	public RepositoryWfStepIOArgument(String BusinessComponent, String BusinessComponentField, String Comments, String Inactive, String InputFlag, String ItemTypeName, String Name2, String OutputArg, String PropertyName, String sSequence, String sType, String ValueSearchSpecification, String operation, String searchspec) {
		this.init();

		this.BusinessComponent = BusinessComponent;
		this.BusinessComponentField = BusinessComponentField;
		this.Comments = Comments;
		this.Inactive = Inactive;
		this.InputFlag = InputFlag;
		this.ItemTypeName = ItemTypeName;
		this.Name2 = Name2;
		this.OutputArg = OutputArg;
		this.PropertyName = PropertyName;
		this.sSequence = sSequence;
		this.sType = sType;
		this.ValueSearchSpecification = ValueSearchSpecification;

		this.operation = operation;
		this.searchspec = searchspec;
	}

	public String toString() {
		return "BusinessComponent: " +BusinessComponent + "\n" + "BusinessComponentField: " +BusinessComponentField + "\n" + "Comments: " +Comments + "\n" + "Inactive: " +Inactive + "\n" + "InputFlag: " +InputFlag + "\n" + "ItemTypeName: " +ItemTypeName + "\n" + "Name2: " +Name2 + "\n" + "OutputArg: " +OutputArg + "\n" + "PropertyName: " +PropertyName + "\n" + "sSequence: " +sSequence + "\n" + "sType: " +sType + "\n" + "ValueSearchSpecification: " +ValueSearchSpecification;
	}

	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public boolean equals(RepositoryWfStepIOArgument repositoryWfStepIOArgument) {
		if (repositoryWfStepIOArgument.BusinessComponent.equals(this.BusinessComponent) && repositoryWfStepIOArgument.BusinessComponentField.equals(this.BusinessComponentField) && repositoryWfStepIOArgument.Inactive.equals(this.Inactive) && repositoryWfStepIOArgument.InputFlag.equals(this.InputFlag) && repositoryWfStepIOArgument.ItemTypeName.equals(this.ItemTypeName) && repositoryWfStepIOArgument.Name2.equals(this.Name2) && repositoryWfStepIOArgument.OutputArg.equals(this.OutputArg) && repositoryWfStepIOArgument.PropertyName.equals(this.PropertyName) && repositoryWfStepIOArgument.sSequence.equals(this.sSequence) && repositoryWfStepIOArgument.sType.equals(this.sType) && repositoryWfStepIOArgument.ValueSearchSpecification.equals(this.ValueSearchSpecification))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}