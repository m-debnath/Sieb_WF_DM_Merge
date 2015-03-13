public class RepositoryWfBranchCriteriaValue implements Cloneable {
	// Total 29 elements
	String Comments;
	String HI_CHAR1;
	String HI_CHAR2;
	String HI_CHAR3;
	String HI_CHAR4;
	String HI_DATE1;
	String HI_DATE2;
	String HI_DATE3;
	String HI_DATE4;
	String HI_NUM1;
	String HI_NUM2;
	String HI_NUM3;
	String HI_NUM4;
	String Inactive;
	String LO_CHAR1;
	String LO_CHAR2;
	String LO_CHAR3;
	String LO_CHAR4;
	String LO_CHAR5;
	String LO_DATE1;
	String LO_DATE2;
	String LO_DATE3;
	String LO_DATE4;
	String LO_NUM1;
	String LO_NUM2;
	String LO_NUM3;
	String LO_NUM4;
	String Name2;
	String sSequence;

	// Total 2 attributes
	String operation;
	String searchspec;

	public void init() {
		Comments = new String();
		HI_CHAR1 = new String();
		HI_CHAR2 = new String();
		HI_CHAR3 = new String();
		HI_CHAR4 = new String();
		HI_DATE1 = new String();
		HI_DATE2 = new String();
		HI_DATE3 = new String();
		HI_DATE4 = new String();
		HI_NUM1 = new String();
		HI_NUM2 = new String();
		HI_NUM3 = new String();
		HI_NUM4 = new String();
		Inactive = new String();
		LO_CHAR1 = new String();
		LO_CHAR2 = new String();
		LO_CHAR3 = new String();
		LO_CHAR4 = new String();
		LO_CHAR5 = new String();
		LO_DATE1 = new String();
		LO_DATE2 = new String();
		LO_DATE3 = new String();
		LO_DATE4 = new String();
		LO_NUM1 = new String();
		LO_NUM2 = new String();
		LO_NUM3 = new String();
		LO_NUM4 = new String();
		Name2 = new String();
		sSequence = new String();

		// Total 2 attributes
		operation = new String();
		searchspec = new String();
	}

	public RepositoryWfBranchCriteriaValue() {
		this.init();
		Comments = "";
		HI_CHAR1 = "";
		HI_CHAR2 = "";
		HI_CHAR3 = "";
		HI_CHAR4 = "";
		HI_DATE1 = "";
		HI_DATE2 = "";
		HI_DATE3 = "";
		HI_DATE4 = "";
		HI_NUM1 = "";
		HI_NUM2 = "";
		HI_NUM3 = "";
		HI_NUM4 = "";
		Inactive = "";
		LO_CHAR1 = "";
		LO_CHAR2 = "";
		LO_CHAR3 = "";
		LO_CHAR4 = "";
		LO_CHAR5 = "";
		LO_DATE1 = "";
		LO_DATE2 = "";
		LO_DATE3 = "";
		LO_DATE4 = "";
		LO_NUM1 = "";
		LO_NUM2 = "";
		LO_NUM3 = "";
		LO_NUM4 = "";
		Name2 = "";
		sSequence = "";

		operation = "";
		searchspec = "";
	}
 
	public RepositoryWfBranchCriteriaValue(String Comments, String HI_CHAR1, String HI_CHAR2, String HI_CHAR3, String HI_CHAR4, String HI_DATE1, String HI_DATE2, String HI_DATE3, String HI_DATE4, String HI_NUM1, String HI_NUM2, String HI_NUM3, String HI_NUM4, String Inactive, String LO_CHAR1, String LO_CHAR2, String LO_CHAR3, String LO_CHAR4, String LO_CHAR5, String LO_DATE1, String LO_DATE2, String LO_DATE3, String LO_DATE4, String LO_NUM1, String LO_NUM2, String LO_NUM3, String LO_NUM4, String Name2, String sSequence) {
		this.init();
		this.Comments = Comments;
		this.HI_CHAR1 = HI_CHAR1;
		this.HI_CHAR2 = HI_CHAR2;
		this.HI_CHAR3 = HI_CHAR3;
		this.HI_CHAR4 = HI_CHAR4;
		this.HI_DATE1 = HI_DATE1;
		this.HI_DATE2 = HI_DATE2;
		this.HI_DATE3 = HI_DATE3;
		this.HI_DATE4 = HI_DATE4;
		this.HI_NUM1 = HI_NUM1;
		this.HI_NUM2 = HI_NUM2;
		this.HI_NUM3 = HI_NUM3;
		this.HI_NUM4 = HI_NUM4;
		this.Inactive = Inactive;
		this.LO_CHAR1 = LO_CHAR1;
		this.LO_CHAR2 = LO_CHAR2;
		this.LO_CHAR3 = LO_CHAR3;
		this.LO_CHAR4 = LO_CHAR4;
		this.LO_CHAR5 = LO_CHAR5;
		this.LO_DATE1 = LO_DATE1;
		this.LO_DATE2 = LO_DATE2;
		this.LO_DATE3 = LO_DATE3;
		this.LO_DATE4 = LO_DATE4;
		this.LO_NUM1 = LO_NUM1;
		this.LO_NUM2 = LO_NUM2;
		this.LO_NUM3 = LO_NUM3;
		this.LO_NUM4 = LO_NUM4;
		this.Name2 = Name2;
		this.sSequence = sSequence;

		this.operation = "";
		this.searchspec = "";
	}

	public RepositoryWfBranchCriteriaValue(String Comments, String HI_CHAR1, String HI_CHAR2, String HI_CHAR3, String HI_CHAR4, String HI_DATE1, String HI_DATE2, String HI_DATE3, String HI_DATE4, String HI_NUM1, String HI_NUM2, String HI_NUM3, String HI_NUM4, String Inactive, String LO_CHAR1, String LO_CHAR2, String LO_CHAR3, String LO_CHAR4, String LO_CHAR5, String LO_DATE1, String LO_DATE2, String LO_DATE3, String LO_DATE4, String LO_NUM1, String LO_NUM2, String LO_NUM3, String LO_NUM4, String Name2, String sSequence, String operation, String searchspec) {
		this.init();
		this.Comments = Comments;
		this.HI_CHAR1 = HI_CHAR1;
		this.HI_CHAR2 = HI_CHAR2;
		this.HI_CHAR3 = HI_CHAR3;
		this.HI_CHAR4 = HI_CHAR4;
		this.HI_DATE1 = HI_DATE1;
		this.HI_DATE2 = HI_DATE2;
		this.HI_DATE3 = HI_DATE3;
		this.HI_DATE4 = HI_DATE4;
		this.HI_NUM1 = HI_NUM1;
		this.HI_NUM2 = HI_NUM2;
		this.HI_NUM3 = HI_NUM3;
		this.HI_NUM4 = HI_NUM4;
		this.Inactive = Inactive;
		this.LO_CHAR1 = LO_CHAR1;
		this.LO_CHAR2 = LO_CHAR2;
		this.LO_CHAR3 = LO_CHAR3;
		this.LO_CHAR4 = LO_CHAR4;
		this.LO_CHAR5 = LO_CHAR5;
		this.LO_DATE1 = LO_DATE1;
		this.LO_DATE2 = LO_DATE2;
		this.LO_DATE3 = LO_DATE3;
		this.LO_DATE4 = LO_DATE4;
		this.LO_NUM1 = LO_NUM1;
		this.LO_NUM2 = LO_NUM2;
		this.LO_NUM3 = LO_NUM3;
		this.LO_NUM4 = LO_NUM4;
		this.Name2 = Name2;
		this.sSequence = sSequence;

		this.operation = operation;
		this.searchspec = searchspec;
	}

	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}