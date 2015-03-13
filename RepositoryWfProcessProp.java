public class RepositoryWfProcessProp implements Cloneable {
	// Total 14 properties
	String AccessMode; //1 - RW
	String BusinessComponent; //2
	String Comments; //3
	String CorrelatorFlag; //4 - N
	String DataType; //5 - VARCHAR for String
	String DefaultDate; //6
	String DefaultNumber; //7
	String DefaultString; //8
	String DisplayName; //9
	String InOut; //10 - INOUT
	String Inactive; //11 - N
	String IntegrationObject; //12
	String Name2; //13 - Name which gets displayed in WF
	String VirtualField; //14

	public void init() {
		AccessMode = new String();
		BusinessComponent = new String();
		Comments = new String();
		CorrelatorFlag = new String();
		DataType = new String();
		DefaultDate = new String();
		DefaultNumber = new String();
		DefaultString = new String();
		DisplayName = new String();
		InOut = new String();
		Inactive = new String();
		IntegrationObject = new String();
		Name2 = new String();
		VirtualField = new String();
	}

	public RepositoryWfProcessProp() {
		this.init();

		AccessMode = "";
		BusinessComponent = "";
		Comments = "";
		CorrelatorFlag = "";
		DataType = "";
		DefaultDate = "";
		DefaultNumber = "";
		DefaultString = "";
		DisplayName = "";
		InOut = "";
		Inactive = "";
		IntegrationObject = "";
		Name2 = "";
		VirtualField = "";
	}

	public RepositoryWfProcessProp(String AccessMode, String CorrelatorFlag, String DataType, String InOut, String Name2) {
		this.init();

		this.AccessMode = AccessMode;
		BusinessComponent = "";
		Comments = "";
		this.CorrelatorFlag = CorrelatorFlag;
		this.DataType = DataType;
		DefaultDate = "";
		DefaultNumber = "";
		DefaultString = "";
		DisplayName = "";
		this.InOut = InOut;
		Inactive = "";
		IntegrationObject = "";
		this.Name2 = Name2;
		VirtualField = "";
	}

	public RepositoryWfProcessProp(String AccessMode, String BusinessComponent, String Comments, String CorrelatorFlag, String DataType, String DefaultDate, String DefaultNumber, String DefaultString, String DisplayName, String InOut, String Inactive, String IntegrationObject, String Name2, String VirtualField) {
		this.init();

		this.AccessMode = AccessMode;
		this.BusinessComponent = BusinessComponent;
		this.Comments = Comments;
		this.CorrelatorFlag = CorrelatorFlag;
		this.DataType = DataType;
		this.DefaultDate = DefaultDate;
		this.DefaultNumber = DefaultNumber;
		this.DefaultString = DefaultString;
		this.DisplayName = DisplayName;
		this.InOut = InOut;
		this.Inactive = Inactive;
		this.IntegrationObject = IntegrationObject;
		this.Name2 = Name2;
		this.VirtualField = VirtualField;
	}

	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public boolean equals(RepositoryWfProcessProp repositoryWfProcessProp) {
		if (repositoryWfProcessProp.AccessMode.equals(this.AccessMode) && repositoryWfProcessProp.BusinessComponent.equals(this.BusinessComponent) && repositoryWfProcessProp.CorrelatorFlag.equals(this.CorrelatorFlag) && repositoryWfProcessProp.DataType.equals(this.DataType) && repositoryWfProcessProp.DefaultDate.equals(this.DefaultDate) && repositoryWfProcessProp.DefaultNumber.equals(this.DefaultNumber) && repositoryWfProcessProp.DefaultString.equals(this.DefaultString) && repositoryWfProcessProp.DisplayName.equals(this.DisplayName) && repositoryWfProcessProp.InOut.equals(this.InOut) && repositoryWfProcessProp.Inactive.equals(this.Inactive) && repositoryWfProcessProp.IntegrationObject.equals(this.IntegrationObject) && repositoryWfProcessProp.Name2.equals(this.Name2) && repositoryWfProcessProp.VirtualField.equals(this.VirtualField))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}