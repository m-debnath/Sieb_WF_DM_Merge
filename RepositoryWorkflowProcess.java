import java.util.*;

public class RepositoryWorkflowProcess implements Cloneable {
	String BusinessObject;
	String CacheLocale;
	String Comments;
	String Description;
	String EffectiveEndDate;
	String EffectiveStartDate;
	String ErrorProcessName;
	String sGroup;
	String Inactive;
	String Module;
	String sName;
	String PersistentFrequency;
	String PersistentLevel;
	String ProcessName;
	String ProjectName;
	String ReplicationLevel;
	String sRunnable;
	String Status;
	String Version;
	String WorkflowMode;

	ArrayList<RepositoryWfStep> ListOfRepositoryWfStep;
	ArrayList<RepositoryWfProcessProp> ListOfRepositoryWfProcessProp;
	ArrayList<RepositoryWfBranchConnector> ListOfRepositoryWfBranchConnector;

	public void init() {
		BusinessObject = new String();
		CacheLocale = new String();
		Comments = new String();
		Description = new String();
		EffectiveEndDate = new String();
		EffectiveStartDate = new String();
		ErrorProcessName = new String();
		sGroup = new String();
		Inactive = new String();
		Module = new String();
		sName = new String();
		PersistentFrequency = new String();
		PersistentLevel = new String();
		ProcessName = new String();
		ProjectName = new String();
		ReplicationLevel = new String();
		sRunnable = new String();
		Status = new String();
		Version = new String();
		WorkflowMode = new String();

		ListOfRepositoryWfStep = new ArrayList<RepositoryWfStep>();
		ListOfRepositoryWfProcessProp = new ArrayList<RepositoryWfProcessProp>();
		ListOfRepositoryWfBranchConnector = new ArrayList<RepositoryWfBranchConnector>();
	}

	public RepositoryWorkflowProcess() {
		this. init();

		BusinessObject = "";
		CacheLocale = "";
		Comments = "";
		Description = "";
		EffectiveEndDate = "";
		EffectiveStartDate = "";
		ErrorProcessName = "";
		sGroup = "";
		Inactive = "";
		Module = "";
		sName = "";
		PersistentFrequency = "";
		PersistentLevel = "";
		ProcessName = "";
		ProjectName = "";
		ReplicationLevel = "";
		sRunnable = "";
		Status = "";
		Version = "";
		WorkflowMode = "";
	}

	public RepositoryWorkflowProcess(String BusinessObject, String CacheLocale, String Comments, String Description, String EffectiveEndDate, String EffectiveStartDate, String ErrorProcessName, String sGroup, String Inactive, String Module, String sName, String PersistentFrequency, String PersistentLevel, String ProcessName, String ProjectName, String ReplicationLevel, String sRunnable, String Status, String Version, String WorkflowMode, ArrayList<RepositoryWfStep> ListOfRepositoryWfStep, ArrayList<RepositoryWfProcessProp> ListOfRepositoryWfProcessProp, ArrayList<RepositoryWfBranchConnector> ListOfRepositoryWfBranchConnector) {
		this. init();

		this.BusinessObject = BusinessObject;
		this.CacheLocale = CacheLocale;
		this.Comments = Comments;
		this.Description = Description;
		this.EffectiveEndDate = EffectiveEndDate;
		this.EffectiveStartDate = EffectiveStartDate;
		this.ErrorProcessName = ErrorProcessName;
		this.sGroup = sGroup;
		this.Inactive = Inactive;
		this.Module = Module;
		this.sName = sName;
		this.PersistentFrequency = PersistentFrequency;
		this.PersistentLevel = PersistentLevel;
		this.ProcessName = ProcessName;
		this.ProjectName = ProjectName;
		this.ReplicationLevel = ReplicationLevel;
		this.sRunnable = sRunnable;
		this.Status = Status;
		this.Version = Version;
		this.WorkflowMode = WorkflowMode;

		if (ListOfRepositoryWfStep.size() > 0)
		{
			this.ListOfRepositoryWfStep.addAll(ListOfRepositoryWfStep);
		}
		if (ListOfRepositoryWfProcessProp.size() > 0)
		{
			this.ListOfRepositoryWfProcessProp.addAll(ListOfRepositoryWfProcessProp);
		}
		if (ListOfRepositoryWfBranchConnector.size() > 0)
		{
			this.ListOfRepositoryWfBranchConnector.addAll(ListOfRepositoryWfBranchConnector);
		}
	}

	public ArrayList<RepositoryWfStep> GetListOfRepositoryWfStep() {
		return ListOfRepositoryWfStep;
	}

	public ArrayList<RepositoryWfProcessProp> GetListOfRepositoryWfProcessProp() {
		return ListOfRepositoryWfProcessProp;
	}

	public ArrayList<RepositoryWfBranchConnector> GetListOfRepositoryWfBranchConnector() {
		return ListOfRepositoryWfBranchConnector;
	}

	public void SetListOfRepositoryWfStep(ArrayList<RepositoryWfStep> ListOfRepositoryWfStep) {
		this.ListOfRepositoryWfStep = new ArrayList<RepositoryWfStep>(ListOfRepositoryWfStep);
	}

	public void SetListOfRepositoryWfProcessProp(ArrayList<RepositoryWfProcessProp> ListOfRepositoryWfProcessProp) {
		this.ListOfRepositoryWfProcessProp = new ArrayList<RepositoryWfProcessProp>(ListOfRepositoryWfProcessProp);
	}

	public void SetListOfRepositoryWfBranchConnector(ArrayList<RepositoryWfBranchConnector> ListOfRepositoryWfBranchConnector) {
		this.ListOfRepositoryWfBranchConnector = new ArrayList<RepositoryWfBranchConnector>(ListOfRepositoryWfBranchConnector);
	}

	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}