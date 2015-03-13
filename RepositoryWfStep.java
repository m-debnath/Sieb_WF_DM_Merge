import java.util.*;
import com.rits.cloning.*;

public class RepositoryWfStep implements Cloneable {
	// Total 18 elements
	String AllowRetryFlag;
	String sOperation;
	String BusinessComponent;
	String BusinessServiceMethod;
	String BusinessServiceName;
	String Comments;
	String Description;
	String ErrorCode;
	String ErrorMessage;
	String EvaluateAll;
	String Inactive;
	String Layout;
	String MaximumIterations;
	String Name3;
	String ProcessingMode;
	String SubprocessName;
	String sType;
	String UserInteractView;

	// Total 2 attributes
	String operation;
	String searchspec;

	// Total 3 Childs
	ArrayList<RepositoryWfStepBranch> ListOfRepositoryWfStepBranch;
	ArrayList<RepositoryWfStepIOArgument> ListOfRepositoryWfStepIOArgument;
	ArrayList<RepositoryWfStepRecipient> ListOfRepositoryWfStepRecipient;

	Cloner cloner = new Cloner();

	public boolean equals(RepositoryWfStep repositoryWfStep) {
		if (repositoryWfStep.AllowRetryFlag.equals(this.AllowRetryFlag) && repositoryWfStep.sOperation.equals(this.sOperation) && repositoryWfStep.BusinessComponent.equals(this.BusinessComponent) && repositoryWfStep.BusinessServiceMethod.equals(this.BusinessServiceMethod) && repositoryWfStep.BusinessServiceName.equals(this.BusinessServiceName) && repositoryWfStep.Description.equals(this.Description) && repositoryWfStep.ErrorCode.equals(this.ErrorCode) && repositoryWfStep.ErrorMessage.equals(this.ErrorMessage) && repositoryWfStep.EvaluateAll.equals(this.EvaluateAll) && repositoryWfStep.Inactive.equals(this.Inactive) && repositoryWfStep.MaximumIterations.equals(this.MaximumIterations) && repositoryWfStep.ProcessingMode.equals(this.ProcessingMode) && repositoryWfStep.SubprocessName.equals(this.SubprocessName) && repositoryWfStep.sType.equals(this.sType) && repositoryWfStep.UserInteractView.equals(this.UserInteractView))
		{
			if (this.GetListOfRepositoryWfStepBranch().size() != repositoryWfStep.GetListOfRepositoryWfStepBranch().size() || this.GetListOfRepositoryWfStepIOArgument().size() != repositoryWfStep.GetListOfRepositoryWfStepIOArgument().size() || this.GetListOfRepositoryWfStepRecipient().size() != repositoryWfStep.GetListOfRepositoryWfStepRecipient().size())
			{
				return false;
			}
			else
			{
				int i,j,k;
				for (i=0; i<this.GetListOfRepositoryWfStepBranch().size(); i++)
				{
					if (!this.GetListOfRepositoryWfStepBranch().get(i).equals(repositoryWfStep.GetListOfRepositoryWfStepBranch().get(i)))
					{
						break;
					}
				}
				for (j=0; j<this.GetListOfRepositoryWfStepIOArgument().size(); j++)
				{
					if (!this.GetListOfRepositoryWfStepIOArgument().get(j).equals(repositoryWfStep.GetListOfRepositoryWfStepIOArgument().get(j)))
					{
						break;
					}
				}
				for (k=0; k<this.GetListOfRepositoryWfStepRecipient().size(); k++)
				{
					if (!this.GetListOfRepositoryWfStepRecipient().get(k).equals(repositoryWfStep.GetListOfRepositoryWfStepRecipient().get(k)))
					{
						break;
					}
				}
				if (i == this.GetListOfRepositoryWfStepBranch().size() && j == this.GetListOfRepositoryWfStepIOArgument().size() && k == this.GetListOfRepositoryWfStepRecipient().size())
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

	public void init() {
		AllowRetryFlag = new String();
		sOperation = new String();
		BusinessComponent = new String();
		BusinessServiceMethod = new String();
		BusinessServiceName = new String();
		Comments = new String();
		Description = new String();
		ErrorCode = new String();
		ErrorMessage = new String();
		EvaluateAll = new String();
		Inactive = new String();
		Layout = new String();
		MaximumIterations = new String();
		Name3 = new String();
		ProcessingMode = new String();
		SubprocessName = new String();
		sType = new String();
		UserInteractView = new String();

		operation = new String();
		searchspec = new String();

		ListOfRepositoryWfStepBranch = new ArrayList<RepositoryWfStepBranch>();
		ListOfRepositoryWfStepIOArgument = new ArrayList<RepositoryWfStepIOArgument>();
		ListOfRepositoryWfStepRecipient = new ArrayList<RepositoryWfStepRecipient>();
	}

	public RepositoryWfStep() {
		this.init();

		AllowRetryFlag = "";
		sOperation = "";
		BusinessComponent = "";
		BusinessServiceMethod = "";
		BusinessServiceName = "";
		Comments = "";
		Description = "";
		ErrorCode = "";
		ErrorMessage = "";
		EvaluateAll = "";
		Inactive = "";
		Layout = "";
		MaximumIterations = "";
		Name3 = "";
		ProcessingMode = "";
		SubprocessName = "";
		sType = "";
		UserInteractView = "";

		operation = "";
		searchspec = "";
	}

	//Constructoer without sOperation 
	public RepositoryWfStep(String AllowRetryFlag, String BusinessComponent, String BusinessServiceMethod, String BusinessServiceName, String Comments, String Description, String ErrorCode, String ErrorMessage, String EvaluateAll, String Inactive, String Layout, String MaximumIterations, String Name3, String ProcessingMode, String SubprocessName, String sType, String UserInteractView, ArrayList<RepositoryWfStepBranch> ListOfRepositoryWfStepBranch, ArrayList<RepositoryWfStepIOArgument> ListOfRepositoryWfStepIOArgument, ArrayList<RepositoryWfStepRecipient> ListOfRepositoryWfStepRecipient) {
		this.init();

		this.AllowRetryFlag = AllowRetryFlag;
		this.sOperation = "";
		this.BusinessComponent = BusinessComponent;
		this.BusinessServiceMethod = BusinessServiceMethod;
		this.BusinessServiceName = BusinessServiceName;
		this.Comments = Comments;
		this.Description = Description;
		this.ErrorCode = ErrorCode;
		this.ErrorMessage = ErrorMessage;
		this.EvaluateAll = EvaluateAll;
		this.Inactive = Inactive;
		this.Layout = Layout;
		this.MaximumIterations = MaximumIterations;
		this.Name3 = Name3;
		this.ProcessingMode = ProcessingMode;
		this.SubprocessName = SubprocessName;
		this.sType = sType;
		this.UserInteractView = UserInteractView;

		this.operation = "";
		this.searchspec = "";

		if (ListOfRepositoryWfStepBranch.size() > 0)
		{
			this.ListOfRepositoryWfStepBranch = cloner.deepClone(ListOfRepositoryWfStepBranch);
		}

		if (ListOfRepositoryWfStepIOArgument.size() > 0)
		{
			this.ListOfRepositoryWfStepIOArgument = cloner.deepClone(ListOfRepositoryWfStepIOArgument);
		}

		if (ListOfRepositoryWfStepRecipient.size() > 0)
		{
			this.ListOfRepositoryWfStepRecipient = cloner.deepClone(ListOfRepositoryWfStepRecipient);
		}
	}

	public RepositoryWfStep(String AllowRetryFlag, String sOperation, String BusinessComponent, String BusinessServiceMethod, String BusinessServiceName, String Comments, String Description, String ErrorCode, String ErrorMessage, String EvaluateAll, String Inactive, String Layout, String MaximumIterations, String Name3, String ProcessingMode, String SubprocessName, String sType, String UserInteractView, ArrayList<RepositoryWfStepBranch> ListOfRepositoryWfStepBranch, ArrayList<RepositoryWfStepIOArgument> ListOfRepositoryWfStepIOArgument, ArrayList<RepositoryWfStepRecipient> ListOfRepositoryWfStepRecipient) {
		this.init();

		this.AllowRetryFlag = AllowRetryFlag;
		this.sOperation = sOperation;
		this.BusinessComponent = BusinessComponent;
		this.BusinessServiceMethod = BusinessServiceMethod;
		this.BusinessServiceName = BusinessServiceName;
		this.Comments = Comments;
		this.Description = Description;
		this.ErrorCode = ErrorCode;
		this.ErrorMessage = ErrorMessage;
		this.EvaluateAll = EvaluateAll;
		this.Inactive = Inactive;
		this.Layout = Layout;
		this.MaximumIterations = MaximumIterations;
		this.Name3 = Name3;
		this.ProcessingMode = ProcessingMode;
		this.SubprocessName = SubprocessName;
		this.sType = sType;
		this.UserInteractView = UserInteractView;

		this.operation = "";
		this.searchspec = "";

		if (ListOfRepositoryWfStepBranch.size() > 0)
		{
			this.ListOfRepositoryWfStepBranch = cloner.deepClone(ListOfRepositoryWfStepBranch);
		}

		if (ListOfRepositoryWfStepIOArgument.size() > 0)
		{
			this.ListOfRepositoryWfStepIOArgument = cloner.deepClone(ListOfRepositoryWfStepIOArgument);
		}

		if (ListOfRepositoryWfStepRecipient.size() > 0)
		{
			this.ListOfRepositoryWfStepRecipient = cloner.deepClone(ListOfRepositoryWfStepRecipient);
		}
	}

	public RepositoryWfStep(String AllowRetryFlag, String BusinessComponent, String sOperation, String BusinessServiceMethod, String BusinessServiceName, String Comments, String Description, String ErrorCode, String ErrorMessage, String EvaluateAll, String Inactive, String Layout, String MaximumIterations, String Name3, String ProcessingMode, String SubprocessName, String sType, String UserInteractView, String operation, String searchspec, ArrayList<RepositoryWfStepBranch> ListOfRepositoryWfStepBranch, ArrayList<RepositoryWfStepIOArgument> ListOfRepositoryWfStepIOArgument, ArrayList<RepositoryWfStepRecipient> ListOfRepositoryWfStepRecipient) {
		this.init();

		this.AllowRetryFlag = AllowRetryFlag;
		this.BusinessComponent = BusinessComponent;
		this.sOperation = sOperation;
		this.BusinessServiceMethod = BusinessServiceMethod;
		this.BusinessServiceName = BusinessServiceName;
		this.Comments = Comments;
		this.Description = Description;
		this.ErrorCode = ErrorCode;
		this.ErrorMessage = ErrorMessage;
		this.EvaluateAll = EvaluateAll;
		this.Inactive = Inactive;
		this.Layout = Layout;
		this.MaximumIterations = MaximumIterations;
		this.Name3 = Name3;
		this.ProcessingMode = ProcessingMode;
		this.SubprocessName = SubprocessName;
		this.sType = sType;
		this.UserInteractView = UserInteractView;

		this.operation = operation;
		this.searchspec = searchspec;

		if (ListOfRepositoryWfStepBranch.size() > 0)
		{
			this.ListOfRepositoryWfStepBranch = cloner.deepClone(ListOfRepositoryWfStepBranch);
		}

		if (ListOfRepositoryWfStepIOArgument.size() > 0)
		{
			this.ListOfRepositoryWfStepIOArgument = cloner.deepClone(ListOfRepositoryWfStepIOArgument);
		}

		if (ListOfRepositoryWfStepRecipient.size() > 0)
		{
			this.ListOfRepositoryWfStepRecipient = cloner.deepClone(ListOfRepositoryWfStepRecipient);
		}
	}

	public ArrayList<RepositoryWfStepBranch> GetListOfRepositoryWfStepBranch() {
		return ListOfRepositoryWfStepBranch;
	}

	public ArrayList<RepositoryWfStepIOArgument> GetListOfRepositoryWfStepIOArgument() {
		return ListOfRepositoryWfStepIOArgument;
	}

	public ArrayList<RepositoryWfStepRecipient> GetListOfRepositoryWfStepRecipient() {
		return ListOfRepositoryWfStepRecipient;
	}

	public void SetListOfRepositoryWfStepBranch(ArrayList<RepositoryWfStepBranch> ListOfRepositoryWfStepBranchArg) {
		if (ListOfRepositoryWfStepBranch.size() > 0)
		{
			this.ListOfRepositoryWfStepBranch = cloner.deepClone(ListOfRepositoryWfStepBranchArg);
		}
	}

	public void SetListOfRepositoryWfStepIOArgument(ArrayList<RepositoryWfStepIOArgument> ListOfRepositoryWfStepIOArgumentArg) {
		if (ListOfRepositoryWfStepIOArgument.size() > 0)
		{
			this.ListOfRepositoryWfStepIOArgument = cloner.deepClone(ListOfRepositoryWfStepIOArgumentArg);
		}
		else
		{
			this.ListOfRepositoryWfStepIOArgument = new ArrayList<RepositoryWfStepIOArgument>();
		}
	}

	public void SetListOfRepositoryWfStepRecipient(ArrayList<RepositoryWfStepRecipient> ListOfRepositoryWfStepRecipientArg) {
		if (ListOfRepositoryWfStepRecipient.size() > 0)
		{
			this.ListOfRepositoryWfStepRecipient = cloner.deepClone(ListOfRepositoryWfStepRecipientArg);
		}
	}

	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}