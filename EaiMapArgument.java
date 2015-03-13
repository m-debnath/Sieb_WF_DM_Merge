public class EaiMapArgument implements Cloneable {
	public String Comments;
	public String DataType;
	public String DisplayName;
	public String sName;

	public void init() {
		Comments = new String("");
		DataType = new String("");
		DisplayName = new String("");
		sName = new String("");
	}

	public EaiMapArgument() {
		this.init();
	}

	public EaiMapArgument(String Comments, String DataType, String DisplayName, String sName) {
		this.init();
		this.Comments = Comments;
		this.DataType = DataType;
		this.DisplayName = DisplayName;
		this.sName = sName;
	}

	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public boolean equals(EaiMapArgument eaiMapArgument) {
		/*System.out.println("this.Comments: " + this.Comments);
		System.out.println("eaiMapArgument.Comments: " + eaiMapArgument.Comments);
		System.out.println("this.DataType: " + this.DataType);
		System.out.println("eaiMapArgument.DataType: " + eaiMapArgument.DataType);
		System.out.println("this.DisplayName: " + this.DisplayName);
		System.out.println("eaiMapArgument.DisplayName: " + eaiMapArgument.DisplayName);
		System.out.println("this.sName: " + this.sName);
		System.out.println("eaiMapArgument.sName: " + eaiMapArgument.sName);*/
		if (eaiMapArgument.DataType.equals(this.DataType) && eaiMapArgument.DisplayName.equals(this.DisplayName) && eaiMapArgument.sName.equals(this.sName))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}