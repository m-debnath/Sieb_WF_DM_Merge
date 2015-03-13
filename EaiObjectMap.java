import java.util.*;

public class EaiObjectMap {
	String Comments;
	String DestinationObjectName;
	String sName;
	String SourceObjectName;

	ArrayList<EaiComponentMap> ListOfEaiComponentMap;
	ArrayList<EaiMapArgument> ListOfEaiMapArgument;

	public void init() {
		Comments = new String("");
		DestinationObjectName = new String("");
		sName = new String("");
		SourceObjectName = new String("");

		ListOfEaiComponentMap = new ArrayList<EaiComponentMap>();
		ListOfEaiMapArgument = new ArrayList<EaiMapArgument>();
	}

	public EaiObjectMap() {
		this.init();
	}

	public EaiObjectMap(String Comments, String DestinationObjectName, String sName, String SourceObjectName, ArrayList<EaiComponentMap> ListOfEaiComponentMap, ArrayList<EaiMapArgument> ListOfEaiMapArgument) {
		this.init();

		this.Comments = Comments;
		this.DestinationObjectName = DestinationObjectName;
		this.sName = sName;
		this.SourceObjectName = SourceObjectName;

		if (ListOfEaiComponentMap.size() > 0)
		{
			this.ListOfEaiComponentMap.addAll(ListOfEaiComponentMap);
		}
		
		if (ListOfEaiMapArgument.size() > 0)
		{
			this.ListOfEaiMapArgument.addAll(ListOfEaiMapArgument);
		}
	}

	public ArrayList<EaiComponentMap> GetListOfEaiComponentMap() {
		return ListOfEaiComponentMap;
	}

	public ArrayList<EaiMapArgument> GetListOfEaiMapArgument() {
		return ListOfEaiMapArgument;
	}

	public void SetListOfEaiComponentMap(ArrayList<EaiComponentMap> ListOfEaiComponentMap) {
		this.ListOfEaiComponentMap = new ArrayList<EaiComponentMap>(ListOfEaiComponentMap);
	}

	public void SetListOfEaiMapArgument(ArrayList<EaiMapArgument> ListOfEaiMapArgument) {
		this.ListOfEaiMapArgument = new ArrayList<EaiMapArgument>(ListOfEaiMapArgument);
	}

	public boolean equals(EaiObjectMap eaiObjectMap) {
		return false;
	}
}