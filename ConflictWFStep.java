import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JTabbedPane;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JTable;
import javax.swing.ImageIcon;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import com.rits.cloning.*;


public class ConflictWFStep extends JDialog implements ActionListener {

	ArrayList<RepositoryWfStepBranch> ListOfRepositoryWfStepBranch;
	ArrayList<RepositoryWfStepIOArgument> ListOfRepositoryWfStepIOArgument;
	RepositoryWfStepBranch repositoryWfStepBranch;
	RepositoryWfStepIOArgument repositoryWfStepIOArgument;
	ArrayList<RepositoryWfProcessProp> listOfRepositoryWfProcessPropMerged;

	public String AllowRetryFlag;
	public String sOperation;
	public String BusinessComponent;
	public String BusinessServiceMethod;
	public String BusinessServiceName;
	public String Comments;
	public String Description;
	public String ErrorCode;
	public String ErrorMessage;
	public String EvaluateAll;
	public String Inactive;
	public String Layout;
	public String MaximumIterations;
	public String ProcessingMode;
	public String SubprocessName;
	public String sType;
	public String UserInteractView;

	ArrayList<String> ListOfInpArgName;
	ArrayList<String> ListOfFieldName;
	ArrayList<String> ListOfFieldSequence;
	ArrayList<String> ListOfPropertyName;

	int lowerInput,lowerOutput,lowerSrchSpec;
	int higherInput, higherOutput, higherSrchSpec;
	int newInput, newOutput, newSrchSpec;
	int lowerField, higherField, newField;

	private final JPanel contentPanel = new MyPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTable table_3;
	private JTable table_4;
	private JTable table_5;
	private JTable table_6;
	private JTable table_7;
	private JTable table_8;
	private JTable table_9;
	private JTable table_10;
	private JTable table_11;
	private JTable table_12;
	private JTable table_13;
	private JTable table_14;
	private JButton button, button_1, button_2, button_3, button_4, button_5;
	private JButton okButton;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTabbedPane tabbedPane, tabbedPane_1, tabbedPane_2;
	private JCheckBox chckbxUseTheLower, chckbxUseTheHigher, chckbxUseTheNew, checkBox, checkBox_1, checkBox_2, checkBox_3, checkBox_4, checkBox_5, checkBox_6, checkBox_7, checkBox_8;
	private JScrollPane scrollPane;
	private JComboBox comboBox, comboBox1;

	ArrayList<RepositoryWfStepBranch> ListOfWfStepBranchLower, ListOfWfStepBranchHigher, ListOfWfStepBranchNew, ListOfWfStepBranchFinal;
	ArrayList<RepositoryWfProcessProp> listOfRepositoryWfProcessPropLocal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ConflictWFStep dialog = new ConflictWFStep();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ConflictWFStep() {
		super();
	}

	public ConflictWFStep(Frame frame, ArrayList<RepositoryWfProcessProp> listOfRepositoryWfProcessPropMerged, String lowerType, String higherType, String newType, ArrayList<RepositoryWfStepBranch> ListOfRepositoryWfStepBranchLower, ArrayList<RepositoryWfStepIOArgument> ListOfRepositoryWfStepIOArgumentLower, ArrayList<RepositoryWfStepBranch> ListOfRepositoryWfStepBranchHigher, ArrayList<RepositoryWfStepIOArgument> ListOfRepositoryWfStepIOArgumentHigher, ArrayList<RepositoryWfStepBranch> ListOfRepositoryWfStepBranchNew, ArrayList<RepositoryWfStepIOArgument> ListOfRepositoryWfStepIOArgumentNew) {
		super(frame,"Conflicting WF Step",true);

		Cloner cloner = new Cloner();
		this.listOfRepositoryWfProcessPropMerged = cloner.deepClone(listOfRepositoryWfProcessPropMerged);
		this.listOfRepositoryWfProcessPropLocal = cloner.deepClone(listOfRepositoryWfProcessPropMerged);
		this.ListOfWfStepBranchLower = cloner.deepClone(ListOfRepositoryWfStepBranchLower);
		this.ListOfWfStepBranchHigher = cloner.deepClone(ListOfRepositoryWfStepBranchHigher);
		this.ListOfWfStepBranchNew = cloner.deepClone(ListOfRepositoryWfStepBranchNew);

		//setTitle("Conflicting WF Step");
		setBounds(100, 100, 740, 580);
		setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		scrollPane = new JScrollPane(contentPanel);
		getContentPane().add(scrollPane, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel label = new JLabel("WF Name:");
			label.setFont(new Font("Tahoma", Font.BOLD, 12));
			label.setBounds(10, 13, 64, 14);
			contentPanel.add(label);
		}
		{
			textField = new JTextField();
			textField.setFont(new Font("Tahoma", Font.PLAIN, 10));
			textField.setEditable(false);
			textField.setColumns(10);
			textField.setBounds(79, 11, 801, 20);
			contentPanel.add(textField);
		}
		{
			JLabel lblStepName = new JLabel("Step Name:");
			lblStepName.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblStepName.setBounds(10, 38, 79, 14);
			contentPanel.add(lblStepName);
		}
		{
			textField_1 = new JTextField();
			textField_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
			textField_1.setEditable(false);
			textField_1.setColumns(10);
			textField_1.setBounds(89, 38, 791, 20);
			contentPanel.add(textField_1);
		}
		
		JLabel lblStepAttributesFrom = new JLabel("Step Properties: From Lower Version");
		lblStepAttributesFrom.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblStepAttributesFrom.setBounds(10, 69, 341, 15);
		contentPanel.add(lblStepAttributesFrom);
		
		checkBox = new JCheckBox("");
		checkBox.setEnabled(false);
		checkBox.setBounds(39, 111, 21, 23);
		contentPanel.add(checkBox);
		
		JLabel lblAllowRetryFlag = new JLabel("Allow Retry Flag");
		lblAllowRetryFlag.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblAllowRetryFlag.setBounds(10, 91, 79, 14);
		contentPanel.add(lblAllowRetryFlag);
		
		JLabel lblType = new JLabel("Type");
		lblType.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblType.setBounds(89, 91, 71, 14);
		contentPanel.add(lblType);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(89, 114, 100, 20);
		contentPanel.add(textField_2);
		
		JLabel lblBusinessService = new JLabel("Business Service");
		lblBusinessService.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblBusinessService.setBounds(199, 91, 100, 14);
		contentPanel.add(lblBusinessService);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(199, 114, 100, 20);
		contentPanel.add(textField_3);
		
		JLabel lblMethod = new JLabel("Method");
		lblMethod.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblMethod.setBounds(309, 91, 100, 14);
		contentPanel.add(lblMethod);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(309, 114, 100, 20);
		contentPanel.add(textField_4);
		
		JLabel label = new JLabel("Business Component");
		label.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label.setBounds(419, 91, 100, 14);
		contentPanel.add(label);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(419, 114, 100, 20);
		contentPanel.add(textField_5);
		
		JLabel lblOperation = new JLabel("Operation");
		lblOperation.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblOperation.setBounds(529, 91, 100, 14);
		contentPanel.add(lblOperation);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBounds(529, 114, 100, 20);
		contentPanel.add(textField_6);
		
		JLabel lblSubProcessName = new JLabel("Sub Process Name");
		lblSubProcessName.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblSubProcessName.setBounds(639, 91, 100, 14);
		contentPanel.add(lblSubProcessName);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBounds(639, 114, 100, 20);
		contentPanel.add(textField_7);
		
		JLabel lblComments = new JLabel("Description");
		lblComments.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblComments.setBounds(749, 91, 100, 14);
		contentPanel.add(lblComments);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBounds(749, 114, 131, 20);
		contentPanel.add(textField_8);
		
		JLabel lblInactive = new JLabel("Inactive");
		lblInactive.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblInactive.setBounds(33, 141, 36, 14);
		contentPanel.add(lblInactive);
		
		checkBox_1 = new JCheckBox("");
		checkBox_1.setEnabled(false);
		checkBox_1.setBounds(41, 161, 21, 23);
		contentPanel.add(checkBox_1);
		
		JLabel lblComments_1 = new JLabel("Comments");
		lblComments_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblComments_1.setBounds(749, 141, 100, 14);
		contentPanel.add(lblComments_1);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_9.setEditable(false);
		textField_9.setColumns(10);
		textField_9.setBounds(749, 164, 131, 20);
		contentPanel.add(textField_9);
		
		JLabel lblEvaluateAll = new JLabel("Evaluate All");
		lblEvaluateAll.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblEvaluateAll.setBounds(110, 141, 59, 14);
		contentPanel.add(lblEvaluateAll);
		
		checkBox_2 = new JCheckBox("");
		checkBox_2.setEnabled(false);
		checkBox_2.setBounds(129, 161, 21, 23);
		contentPanel.add(checkBox_2);
		
		JLabel lblErrorCode = new JLabel("Error Code");
		lblErrorCode.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblErrorCode.setBounds(199, 141, 100, 14);
		contentPanel.add(lblErrorCode);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_10.setEditable(false);
		textField_10.setColumns(10);
		textField_10.setBounds(199, 164, 100, 20);
		contentPanel.add(textField_10);
		
		JLabel lblErrorMessage = new JLabel("Error Message");
		lblErrorMessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblErrorMessage.setBounds(309, 141, 100, 14);
		contentPanel.add(lblErrorMessage);
		
		textField_11 = new JTextField();
		textField_11.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_11.setEditable(false);
		textField_11.setColumns(10);
		textField_11.setBounds(309, 164, 100, 20);
		contentPanel.add(textField_11);
		
		JLabel lblMaximumIterations = new JLabel("Maximum Iterations");
		lblMaximumIterations.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblMaximumIterations.setBounds(419, 141, 100, 14);
		contentPanel.add(lblMaximumIterations);
		
		textField_12 = new JTextField();
		textField_12.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_12.setEditable(false);
		textField_12.setColumns(10);
		textField_12.setBounds(419, 164, 100, 20);
		contentPanel.add(textField_12);
		
		JLabel lblProcessingMode = new JLabel("Processing Mode");
		lblProcessingMode.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblProcessingMode.setBounds(529, 141, 100, 14);
		contentPanel.add(lblProcessingMode);
		
		textField_13 = new JTextField();
		textField_13.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_13.setEditable(false);
		textField_13.setColumns(10);
		textField_13.setBounds(529, 164, 100, 20);
		contentPanel.add(textField_13);
		
		JLabel lblUserInteractView = new JLabel("User Interact View");
		lblUserInteractView.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblUserInteractView.setBounds(639, 141, 100, 14);
		contentPanel.add(lblUserInteractView);
		
		textField_14 = new JTextField();
		textField_14.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_14.setEditable(false);
		textField_14.setColumns(10);
		textField_14.setBounds(639, 164, 100, 20);
		contentPanel.add(textField_14);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 191, 870, 100);
		tabbedPane.setFont(new Font("Tahoma", Font.PLAIN, 10));
		contentPanel.add(tabbedPane);
		
		for (int i=0; i<ListOfRepositoryWfStepIOArgumentLower.size(); i++)
		{
			if (ListOfRepositoryWfStepIOArgumentLower.get(i).InputFlag.equals("I"))
			{
				if (lowerType.equals("SIEBEL_OPER"))
				{
					lowerField++;
				}
				else
				{
					lowerInput++;
				}
			}
			if (ListOfRepositoryWfStepIOArgumentLower.get(i).InputFlag.equals("O"))
			{
				lowerOutput++;
			}
			if (ListOfRepositoryWfStepIOArgumentLower.get(i).InputFlag.equals("S"))
			{
				lowerSrchSpec++;
			}
		}
		int [] lowerInp = new int[lowerInput];
		int [] lowerOp = new int[lowerOutput];
		int [] lowerSS = new int[lowerSrchSpec];
		int [] lowerFld = new int[lowerField];

		for (int i=0, j=0; i<ListOfRepositoryWfStepIOArgumentLower.size(); i++)
		{
			if (ListOfRepositoryWfStepIOArgumentLower.get(i).InputFlag.equals("I"))
			{
				if (lowerType.equals("SIEBEL_OPER"))
				{
					lowerFld[j] = i;
					j++;
				}
			}
		}

		for (int i=0, j=0; i<ListOfRepositoryWfStepIOArgumentLower.size(); i++)
		{
			if (ListOfRepositoryWfStepIOArgumentLower.get(i).InputFlag.equals("I"))
			{
				if (!lowerType.equals("SIEBEL_OPER"))
				{
					lowerInp[j] = i;
					j++;
				}
			}
		}

		for (int i=0, j=0; i<ListOfRepositoryWfStepIOArgumentLower.size(); i++)
		{
			if (ListOfRepositoryWfStepIOArgumentLower.get(i).InputFlag.equals("O"))
			{
				lowerOp[j] = i;
				j++;
			}
		}

		for (int i=0, j=0; i<ListOfRepositoryWfStepIOArgumentLower.size(); i++)
		{
			if (ListOfRepositoryWfStepIOArgumentLower.get(i).InputFlag.equals("S"))
			{
				lowerSS[j] = i;
				j++;
			}
		}

		table = new JTable(lowerInput,9);
		table.setFont(new Font("Tahoma", Font.PLAIN, 10));
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		for (int i=0, j=0; i<lowerInput; i++, j++)
		{
			table.setValueAt(ListOfRepositoryWfStepIOArgumentLower.get(lowerInp[j]).Name2,i,0);
			table.setValueAt(GetLowerCaseIOType(ListOfRepositoryWfStepIOArgumentLower.get(lowerInp[j]).sType),i,1);
			table.setValueAt(ListOfRepositoryWfStepIOArgumentLower.get(lowerInp[j]).ValueSearchSpecification,i,2);
			table.setValueAt(ListOfRepositoryWfStepIOArgumentLower.get(lowerInp[j]).BusinessComponent,i,3);
			table.setValueAt(ListOfRepositoryWfStepIOArgumentLower.get(lowerInp[j]).BusinessComponentField,i,4);
			table.setValueAt(ListOfRepositoryWfStepIOArgumentLower.get(lowerInp[j]).PropertyName,i,5);
			table.setValueAt(ListOfRepositoryWfStepIOArgumentLower.get(lowerInp[j]).Comments,i,6);
			table.setValueAt(ListOfRepositoryWfStepIOArgumentLower.get(lowerInp[j]).sSequence,i,7);
			table.setValueAt(ListOfRepositoryWfStepIOArgumentLower.get(lowerInp[j]).Inactive,i,8);
		}
		table.getColumnModel().getColumn(0).setHeaderValue("Input Argument");
		table.getColumnModel().getColumn(1).setHeaderValue("Type");
		table.getColumnModel().getColumn(2).setHeaderValue("Value / Expression");
		table.getColumnModel().getColumn(3).setHeaderValue("BC");
		table.getColumnModel().getColumn(4).setHeaderValue("BC Field");
		table.getColumnModel().getColumn(5).setHeaderValue("Property Name");
		table.getColumnModel().getColumn(6).setHeaderValue("Comments");
		table.getColumnModel().getColumn(7).setHeaderValue("Sequence");
		table.getColumnModel().getColumn(8).setHeaderValue("Inactive");
		table.getTableHeader().setFont(new java.awt.Font("Tahoma",Font.PLAIN, 10));
		table.getTableHeader().resizeAndRepaint();

		JScrollPane inpPane = new JScrollPane(table);

		table_1 = new JTable(lowerSrchSpec,8);
		table_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		table_1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		for (int i=0, j=0; i<lowerSrchSpec; i++, j++)
		{
			table_1.setValueAt(ListOfRepositoryWfStepIOArgumentLower.get(lowerSS[j]).BusinessComponent,i,0);
			table_1.setValueAt(ListOfRepositoryWfStepIOArgumentLower.get(lowerSS[j]).OutputArg,i,1);
			table_1.setValueAt(ListOfRepositoryWfStepIOArgumentLower.get(lowerSS[j]).BusinessComponentField,i,2);
			table_1.setValueAt(GetLowerCaseIOType(ListOfRepositoryWfStepIOArgumentLower.get(lowerSS[j]).sType),i,3);
			table_1.setValueAt(ListOfRepositoryWfStepIOArgumentLower.get(lowerSS[j]).ValueSearchSpecification,i,4);
			table_1.setValueAt(ListOfRepositoryWfStepIOArgumentLower.get(lowerSS[j]).Comments,i,5);
			table_1.setValueAt(ListOfRepositoryWfStepIOArgumentLower.get(lowerSS[j]).sSequence,i,6);
			table_1.setValueAt(ListOfRepositoryWfStepIOArgumentLower.get(lowerSS[j]).Inactive,i,7);
		}
		table_1.getColumnModel().getColumn(0).setHeaderValue("Expression BC");
		table_1.getColumnModel().getColumn(1).setHeaderValue("Filter BC");
		table_1.getColumnModel().getColumn(2).setHeaderValue("BC Field");
		table_1.getColumnModel().getColumn(3).setHeaderValue("Type");
		table_1.getColumnModel().getColumn(4).setHeaderValue("Value / Expression");
		table_1.getColumnModel().getColumn(5).setHeaderValue("Comments");
		table_1.getColumnModel().getColumn(6).setHeaderValue("Sequence");
		table_1.getColumnModel().getColumn(7).setHeaderValue("Inactive");
		table_1.getTableHeader().setFont(new java.awt.Font("Tahoma",Font.PLAIN, 10));
		table_1.getTableHeader().resizeAndRepaint();

		JScrollPane ssPane = new JScrollPane(table_1);

		table_12 = new JTable(lowerField,9);
		table_12.setFont(new Font("Tahoma", Font.PLAIN, 10));
		table_12.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		for (int i=0, j=0; i<lowerField; i++, j++)
		{
			table_12.setValueAt(ListOfRepositoryWfStepIOArgumentLower.get(lowerFld[j]).Name2,i,0);
			table_12.setValueAt(ListOfRepositoryWfStepIOArgumentLower.get(lowerFld[j]).sSequence,i,1);
			table_12.setValueAt(GetLowerCaseIOType(ListOfRepositoryWfStepIOArgumentLower.get(lowerFld[j]).sType),i,2);
			table_12.setValueAt(ListOfRepositoryWfStepIOArgumentLower.get(lowerFld[j]).ValueSearchSpecification,i,3);
			table_12.setValueAt(ListOfRepositoryWfStepIOArgumentLower.get(lowerFld[j]).PropertyName,i,4);
			table_12.setValueAt(ListOfRepositoryWfStepIOArgumentLower.get(lowerFld[j]).BusinessComponent,i,5);
			table_12.setValueAt(ListOfRepositoryWfStepIOArgumentLower.get(lowerFld[j]).BusinessComponentField,i,6);
			table_12.setValueAt(ListOfRepositoryWfStepIOArgumentLower.get(lowerFld[j]).Comments,i,7);
			table_12.setValueAt(ListOfRepositoryWfStepIOArgumentLower.get(lowerFld[j]).Inactive,i,8);
		}
		table_12.getColumnModel().getColumn(0).setHeaderValue("Field Name");
		table_12.getColumnModel().getColumn(1).setHeaderValue("Sequence");
		table_12.getColumnModel().getColumn(2).setHeaderValue("Type");
		table_12.getColumnModel().getColumn(3).setHeaderValue("Value / Expression");
		table_12.getColumnModel().getColumn(4).setHeaderValue("Property Name");
		table_12.getColumnModel().getColumn(5).setHeaderValue("Business Componenet");
		table_12.getColumnModel().getColumn(6).setHeaderValue("BC Field");
		table_12.getColumnModel().getColumn(7).setHeaderValue("Comments");
		table_12.getColumnModel().getColumn(8).setHeaderValue("Inactive");
		table_12.getTableHeader().setFont(new java.awt.Font("Tahoma",Font.PLAIN, 10));
		table_12.getTableHeader().resizeAndRepaint();

		JScrollPane fldPane = new JScrollPane(table_12);

		table_2 = new JTable(lowerOutput,9);
		table_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		table_2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		for (int i=0, j=0; i<lowerOutput; i++, j++)
		{
			table_2.setValueAt(ListOfRepositoryWfStepIOArgumentLower.get(lowerOp[j]).PropertyName,i,0);
			table_2.setValueAt(GetLowerCaseIOType(ListOfRepositoryWfStepIOArgumentLower.get(lowerOp[j]).sType),i,1);
			table_2.setValueAt(ListOfRepositoryWfStepIOArgumentLower.get(lowerOp[j]).ValueSearchSpecification,i,2);
			table_2.setValueAt(ListOfRepositoryWfStepIOArgumentLower.get(lowerOp[j]).OutputArg,i,3);
			table_2.setValueAt(ListOfRepositoryWfStepIOArgumentLower.get(lowerOp[j]).BusinessComponent,i,4);
			table_2.setValueAt(ListOfRepositoryWfStepIOArgumentLower.get(lowerOp[j]).BusinessComponentField,i,5);
			table_2.setValueAt(ListOfRepositoryWfStepIOArgumentLower.get(lowerOp[j]).Comments,i,6);
			table_2.setValueAt(ListOfRepositoryWfStepIOArgumentLower.get(lowerOp[j]).sSequence,i,7);
			table_2.setValueAt(ListOfRepositoryWfStepIOArgumentLower.get(lowerOp[j]).Inactive,i,8);
		}
		table_2.getColumnModel().getColumn(0).setHeaderValue("Property Name");
		table_2.getColumnModel().getColumn(1).setHeaderValue("Type");
		table_2.getColumnModel().getColumn(2).setHeaderValue("Value / Expression");
		table_2.getColumnModel().getColumn(3).setHeaderValue("Output Argument");
		table_2.getColumnModel().getColumn(4).setHeaderValue("Business Component");
		table_2.getColumnModel().getColumn(5).setHeaderValue("BC Field");
		table_2.getColumnModel().getColumn(6).setHeaderValue("Comments");
		table_2.getColumnModel().getColumn(7).setHeaderValue("Sequence");
		table_2.getColumnModel().getColumn(8).setHeaderValue("Inactive");
		table_2.getTableHeader().setFont(new java.awt.Font("Tahoma",Font.PLAIN, 10));
		table_2.getTableHeader().resizeAndRepaint();

		JScrollPane opPane = new JScrollPane(table_2);
		
		table_3 = new JTable(ListOfRepositoryWfStepBranchLower.size(),14); //for branches
		table_3.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		table_3.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		for (int i=0; i<ListOfRepositoryWfStepBranchLower.size(); i++)
		{
			table_3.setValueAt(ListOfRepositoryWfStepBranchLower.get(i).Name2,i,0);
			table_3.setValueAt(GetLowerCaseBranchType(ListOfRepositoryWfStepBranchLower.get(i).sType),i,1);
			table_3.setValueAt(ListOfRepositoryWfStepBranchLower.get(i).EventObjectType,i,2);
			table_3.setValueAt(ListOfRepositoryWfStepBranchLower.get(i).sEventObject,i,3);
			table_3.setValueAt(ListOfRepositoryWfStepBranchLower.get(i).sEvent,i,4);
			table_3.setValueAt(ListOfRepositoryWfStepBranchLower.get(i).Subevent,i,5);
			table_3.setValueAt(ListOfRepositoryWfStepBranchLower.get(i).EventCancelFlag,i,6);
			table_3.setValueAt(ListOfRepositoryWfStepBranchLower.get(i).sExpression,i,7);
			table_3.setValueAt(ListOfRepositoryWfStepBranchLower.get(i).EventVisibility,i,8);
			table_3.setValueAt(ListOfRepositoryWfStepBranchLower.get(i).Inactive,i,9);
			table_3.setValueAt(ListOfRepositoryWfStepBranchLower.get(i).UserEventName,i,10);
			table_3.setValueAt(ListOfRepositoryWfStepBranchLower.get(i).UserEventStorage,i,11);
			table_3.setValueAt(ListOfRepositoryWfStepBranchLower.get(i).UserEventTimeout,i,12);
			table_3.setValueAt(ListOfRepositoryWfStepBranchLower.get(i).Comments,i,13);
		}
		table_3.getColumnModel().getColumn(0).setHeaderValue("Name");
		table_3.getColumnModel().getColumn(1).setHeaderValue("Type");
		table_3.getColumnModel().getColumn(2).setHeaderValue("Event Object Type");
		table_3.getColumnModel().getColumn(3).setHeaderValue("Event Object");
		table_3.getColumnModel().getColumn(4).setHeaderValue("Event");
		table_3.getColumnModel().getColumn(5).setHeaderValue("Subevent");
		table_3.getColumnModel().getColumn(6).setHeaderValue("Event Cancel Flag");
		table_3.getColumnModel().getColumn(7).setHeaderValue("Expression");
		table_3.getColumnModel().getColumn(8).setHeaderValue("Event Visibility");
		table_3.getColumnModel().getColumn(9).setHeaderValue("Inactive");
		table_3.getColumnModel().getColumn(10).setHeaderValue("User Event Name");
		table_3.getColumnModel().getColumn(11).setHeaderValue("User Event Storage");
		table_3.getColumnModel().getColumn(12).setHeaderValue("User Event Timeout (Days)");
		table_3.getColumnModel().getColumn(13).setHeaderValue("Comments");

		table_3.getColumnModel().getColumn(0).setPreferredWidth(100);
		table_3.getColumnModel().getColumn(1).setPreferredWidth(100);
		table_3.getColumnModel().getColumn(2).setPreferredWidth(100);
		table_3.getColumnModel().getColumn(3).setPreferredWidth(100);
		table_3.getColumnModel().getColumn(4).setPreferredWidth(100);
		table_3.getColumnModel().getColumn(5).setPreferredWidth(100);
		table_3.getColumnModel().getColumn(6).setPreferredWidth(100);
		table_3.getColumnModel().getColumn(7).setPreferredWidth(300);
		table_3.getColumnModel().getColumn(8).setPreferredWidth(100);
		table_3.getColumnModel().getColumn(9).setPreferredWidth(100);
		table_3.getColumnModel().getColumn(10).setPreferredWidth(100);
		table_3.getColumnModel().getColumn(11).setPreferredWidth(100);
		table_3.getColumnModel().getColumn(12).setPreferredWidth(125);
		table_3.getColumnModel().getColumn(13).setPreferredWidth(100);

		table_3.getTableHeader().setFont(new java.awt.Font("Tahoma",Font.PLAIN, 10));
		table_3.getTableHeader().resizeAndRepaint();

		table_3.setDefaultRenderer(Object.class, new MyTableCellRenderer());

		JScrollPane brnchPane = new JScrollPane(table_3);

		tabbedPane.addTab("Input Arguments", null, inpPane, null);
		tabbedPane.setEnabledAt(0, true);
		tabbedPane.addTab("Search Specification", null, ssPane, null);
		tabbedPane.setEnabledAt(1, true);
		tabbedPane.addTab("Fields", null, fldPane, null);
		tabbedPane.setEnabledAt(2, true);
		tabbedPane.addTab("Output Arguments", null, opPane, null);
		tabbedPane.setEnabledAt(3, true);
		tabbedPane.addTab("Branches", null, brnchPane, null);
		tabbedPane.setEnabledAt(4, true);
		
		JLabel lblStepPropertiesFrom = new JLabel("Step Properties: From Higher Version");
		lblStepPropertiesFrom.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblStepPropertiesFrom.setBounds(10, 302, 341, 15);
		contentPanel.add(lblStepPropertiesFrom);
		
		JLabel label_2 = new JLabel("Allow Retry Flag");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_2.setBounds(10, 324, 79, 14);
		contentPanel.add(label_2);
		
		checkBox_3 = new JCheckBox("");
		checkBox_3.setEnabled(false);
		checkBox_3.setBounds(39, 344, 21, 23);
		contentPanel.add(checkBox_3);
		
		JLabel label_3 = new JLabel("Inactive");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_3.setBounds(33, 374, 36, 14);
		contentPanel.add(label_3);
		
		checkBox_4 = new JCheckBox("");
		checkBox_4.setEnabled(false);
		checkBox_4.setBounds(41, 394, 21, 23);
		contentPanel.add(checkBox_4);
		
		textField_15 = new JTextField();
		textField_15.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_15.setEditable(false);
		textField_15.setColumns(10);
		textField_15.setBounds(89, 347, 100, 20);
		contentPanel.add(textField_15);
		
		JLabel label_4 = new JLabel("Type");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_4.setBounds(89, 324, 71, 14);
		contentPanel.add(label_4);
		
		JLabel label_5 = new JLabel("Evaluate All");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_5.setBounds(110, 374, 59, 14);
		contentPanel.add(label_5);
		
		checkBox_5 = new JCheckBox("");
		checkBox_5.setEnabled(false);
		checkBox_5.setBounds(129, 394, 21, 23);
		contentPanel.add(checkBox_5);
		
		JLabel label_6 = new JLabel("Business Service");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_6.setBounds(199, 324, 100, 14);
		contentPanel.add(label_6);
		
		JLabel label_7 = new JLabel("Error Code");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_7.setBounds(199, 374, 100, 14);
		contentPanel.add(label_7);
		
		textField_16 = new JTextField();
		textField_16.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_16.setEditable(false);
		textField_16.setColumns(10);
		textField_16.setBounds(199, 397, 100, 20);
		contentPanel.add(textField_16);
		
		JLabel label_8 = new JLabel("Method");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_8.setBounds(309, 324, 100, 14);
		contentPanel.add(label_8);
		
		JLabel label_9 = new JLabel("Error Message");
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_9.setBounds(309, 374, 100, 14);
		contentPanel.add(label_9);
		
		textField_17 = new JTextField();
		textField_17.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_17.setEditable(false);
		textField_17.setColumns(10);
		textField_17.setBounds(309, 397, 100, 20);
		contentPanel.add(textField_17);
		
		JLabel label_10 = new JLabel("Business Component");
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_10.setBounds(419, 324, 100, 14);
		contentPanel.add(label_10);
		
		JLabel label_11 = new JLabel("Maximum Iterations");
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_11.setBounds(419, 374, 100, 14);
		contentPanel.add(label_11);
		
		textField_18 = new JTextField();
		textField_18.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_18.setEditable(false);
		textField_18.setColumns(10);
		textField_18.setBounds(419, 397, 100, 20);
		contentPanel.add(textField_18);
		
		JLabel label_12 = new JLabel("Operation");
		label_12.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_12.setBounds(529, 324, 100, 14);
		contentPanel.add(label_12);
		
		textField_19 = new JTextField();
		textField_19.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_19.setEditable(false);
		textField_19.setColumns(10);
		textField_19.setBounds(529, 347, 100, 20);
		contentPanel.add(textField_19);
		
		JLabel label_13 = new JLabel("Processing Mode");
		label_13.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_13.setBounds(529, 374, 100, 14);
		contentPanel.add(label_13);
		
		textField_20 = new JTextField();
		textField_20.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_20.setEditable(false);
		textField_20.setColumns(10);
		textField_20.setBounds(529, 397, 100, 20);
		contentPanel.add(textField_20);
		
		JLabel label_14 = new JLabel("Sub Process Name");
		label_14.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_14.setBounds(639, 324, 100, 14);
		contentPanel.add(label_14);
		
		JLabel label_15 = new JLabel("User Interact View");
		label_15.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_15.setBounds(639, 374, 100, 14);
		contentPanel.add(label_15);
		
		textField_21 = new JTextField();
		textField_21.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_21.setEditable(false);
		textField_21.setColumns(10);
		textField_21.setBounds(639, 397, 100, 20);
		contentPanel.add(textField_21);
		
		JLabel label_16 = new JLabel("Description");
		label_16.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_16.setBounds(749, 324, 100, 14);
		contentPanel.add(label_16);
		
		textField_22 = new JTextField();
		textField_22.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_22.setEditable(false);
		textField_22.setColumns(10);
		textField_22.setBounds(749, 347, 131, 20);
		contentPanel.add(textField_22);
		
		JLabel label_17 = new JLabel("Comments");
		label_17.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_17.setBounds(749, 374, 100, 14);
		contentPanel.add(label_17);
		
		textField_23 = new JTextField();
		textField_23.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_23.setEditable(false);
		textField_23.setColumns(10);
		textField_23.setBounds(749, 397, 131, 20);
		contentPanel.add(textField_23);
		
		tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(10, 426, 870, 100);
		tabbedPane_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		contentPanel.add(tabbedPane_1);

		for (int i=0; i<ListOfRepositoryWfStepIOArgumentHigher.size(); i++)
		{
			if (ListOfRepositoryWfStepIOArgumentHigher.get(i).InputFlag.equals("I"))
			{
				if (lowerType.equals("SIEBEL_OPER"))
				{
					higherField++;
				}
				else
				{
					higherInput++;
				}
			}
			if (ListOfRepositoryWfStepIOArgumentHigher.get(i).InputFlag.equals("O"))
			{
				higherOutput++;
			}
			if (ListOfRepositoryWfStepIOArgumentHigher.get(i).InputFlag.equals("S"))
			{
				higherSrchSpec++;
			}
		}
		int [] higherInp = new int[higherInput];
		int [] higherOp = new int[higherOutput];
		int [] higherSS = new int[higherSrchSpec];
		int [] higherFld = new int[higherField];

		for (int i=0, j=0; i<ListOfRepositoryWfStepIOArgumentHigher.size(); i++)
		{
			if (ListOfRepositoryWfStepIOArgumentHigher.get(i).InputFlag.equals("I"))
			{
				if (higherType.equals("SIEBEL_OPER"))
				{
					higherFld[j] = i;
					j++;
				}
			}
		}

		for (int i=0, j=0; i<ListOfRepositoryWfStepIOArgumentHigher.size(); i++)
		{
			if (ListOfRepositoryWfStepIOArgumentHigher.get(i).InputFlag.equals("I"))
			{
				if (!higherType.equals("SIEBEL_OPER"))
				{
					higherInp[j] = i;
					j++;
				}
			}
		}

		for (int i=0, j=0; i<ListOfRepositoryWfStepIOArgumentHigher.size(); i++)
		{
			if (ListOfRepositoryWfStepIOArgumentHigher.get(i).InputFlag.equals("O"))
			{
				higherOp[j] = i;
				j++;
			}
		}

		for (int i=0, j=0; i<ListOfRepositoryWfStepIOArgumentHigher.size(); i++)
		{
			if (ListOfRepositoryWfStepIOArgumentHigher.get(i).InputFlag.equals("S"))
			{
				higherSS[j] = i;
				j++;
			}
		}

		

		table_4 = new JTable(higherInput,9);
		table_4.setFont(new Font("Tahoma", Font.PLAIN, 10));
		table_4.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		for (int i=0, j=0; i<higherInput; i++, j++)
		{
			table_4.setValueAt(ListOfRepositoryWfStepIOArgumentHigher.get(higherInp[j]).Name2,i,0);
			table_4.setValueAt(GetLowerCaseIOType(ListOfRepositoryWfStepIOArgumentHigher.get(higherInp[j]).sType),i,1);
			table_4.setValueAt(ListOfRepositoryWfStepIOArgumentHigher.get(higherInp[j]).ValueSearchSpecification,i,2);
			table_4.setValueAt(ListOfRepositoryWfStepIOArgumentHigher.get(higherInp[j]).BusinessComponent,i,3);
			table_4.setValueAt(ListOfRepositoryWfStepIOArgumentHigher.get(higherInp[j]).BusinessComponentField,i,4);
			table_4.setValueAt(ListOfRepositoryWfStepIOArgumentHigher.get(higherInp[j]).PropertyName,i,5);
			table_4.setValueAt(ListOfRepositoryWfStepIOArgumentHigher.get(higherInp[j]).Comments,i,6);
			table_4.setValueAt(ListOfRepositoryWfStepIOArgumentHigher.get(higherInp[j]).sSequence,i,7);
			table_4.setValueAt(ListOfRepositoryWfStepIOArgumentHigher.get(higherInp[j]).Inactive,i,8);
		}
		table_4.getColumnModel().getColumn(0).setHeaderValue("Input Argument");
		table_4.getColumnModel().getColumn(1).setHeaderValue("Type");
		table_4.getColumnModel().getColumn(2).setHeaderValue("Value / Expression");
		table_4.getColumnModel().getColumn(3).setHeaderValue("BC");
		table_4.getColumnModel().getColumn(4).setHeaderValue("BC Field");
		table_4.getColumnModel().getColumn(5).setHeaderValue("Property Name");
		table_4.getColumnModel().getColumn(6).setHeaderValue("Comments");
		table_4.getColumnModel().getColumn(7).setHeaderValue("Sequence");
		table_4.getColumnModel().getColumn(8).setHeaderValue("Inactive");
		table_4.getTableHeader().setFont(new java.awt.Font("Tahoma",Font.PLAIN, 10));
		table_4.getTableHeader().resizeAndRepaint();

		JScrollPane inpPane1 = new JScrollPane(table_4);

		table_5 = new JTable(higherSrchSpec,8);
		table_5.setFont(new Font("Tahoma", Font.PLAIN, 10));
		table_5.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		for (int i=0, j=0; i<higherSrchSpec; i++, j++)
		{
			table_5.setValueAt(ListOfRepositoryWfStepIOArgumentHigher.get(higherSS[j]).BusinessComponent,i,0);
			table_5.setValueAt(ListOfRepositoryWfStepIOArgumentHigher.get(higherSS[j]).OutputArg,i,1);
			table_5.setValueAt(ListOfRepositoryWfStepIOArgumentHigher.get(higherSS[j]).BusinessComponentField,i,2);
			table_5.setValueAt(GetLowerCaseIOType(ListOfRepositoryWfStepIOArgumentHigher.get(higherSS[j]).sType),i,3);
			table_5.setValueAt(ListOfRepositoryWfStepIOArgumentHigher.get(higherSS[j]).ValueSearchSpecification,i,4);
			table_5.setValueAt(ListOfRepositoryWfStepIOArgumentHigher.get(higherSS[j]).Comments,i,5);
			table_5.setValueAt(ListOfRepositoryWfStepIOArgumentHigher.get(higherSS[j]).sSequence,i,6);
			table_5.setValueAt(ListOfRepositoryWfStepIOArgumentHigher.get(higherSS[j]).Inactive,i,7);
		}
		table_5.getColumnModel().getColumn(0).setHeaderValue("Expression BC");
		table_5.getColumnModel().getColumn(1).setHeaderValue("Filter BC");
		table_5.getColumnModel().getColumn(2).setHeaderValue("BC Field");
		table_5.getColumnModel().getColumn(3).setHeaderValue("Type");
		table_5.getColumnModel().getColumn(4).setHeaderValue("Value / Expression");
		table_5.getColumnModel().getColumn(5).setHeaderValue("Comments");
		table_5.getColumnModel().getColumn(6).setHeaderValue("Sequence");
		table_5.getColumnModel().getColumn(7).setHeaderValue("Inactive");
		table_5.getTableHeader().setFont(new java.awt.Font("Tahoma",Font.PLAIN, 10));
		table_5.getTableHeader().resizeAndRepaint();

		JScrollPane ssPane1 = new JScrollPane(table_5);

		table_13 = new JTable(higherField,9);
		table_13.setFont(new Font("Tahoma", Font.PLAIN, 10));
		table_13.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		for (int i=0, j=0; i<higherField; i++, j++)
		{
			table_13.setValueAt(ListOfRepositoryWfStepIOArgumentHigher.get(higherFld[j]).Name2,i,0);
			table_13.setValueAt(ListOfRepositoryWfStepIOArgumentHigher.get(higherFld[j]).sSequence,i,1);
			table_13.setValueAt(GetLowerCaseIOType(ListOfRepositoryWfStepIOArgumentHigher.get(higherFld[j]).sType),i,2);
			table_13.setValueAt(ListOfRepositoryWfStepIOArgumentHigher.get(higherFld[j]).ValueSearchSpecification,i,3);
			table_13.setValueAt(ListOfRepositoryWfStepIOArgumentHigher.get(higherFld[j]).PropertyName,i,4);
			table_13.setValueAt(ListOfRepositoryWfStepIOArgumentHigher.get(higherFld[j]).BusinessComponent,i,5);
			table_13.setValueAt(ListOfRepositoryWfStepIOArgumentHigher.get(higherFld[j]).BusinessComponentField,i,6);
			table_13.setValueAt(ListOfRepositoryWfStepIOArgumentHigher.get(higherFld[j]).Comments,i,7);
			table_13.setValueAt(ListOfRepositoryWfStepIOArgumentHigher.get(higherFld[j]).Inactive,i,8);
		}
		table_13.getColumnModel().getColumn(0).setHeaderValue("Field Name");
		table_13.getColumnModel().getColumn(1).setHeaderValue("Sequence");
		table_13.getColumnModel().getColumn(2).setHeaderValue("Type");
		table_13.getColumnModel().getColumn(3).setHeaderValue("Value / Expression");
		table_13.getColumnModel().getColumn(4).setHeaderValue("Property Name");
		table_13.getColumnModel().getColumn(5).setHeaderValue("Business Componenet");
		table_13.getColumnModel().getColumn(6).setHeaderValue("BC Field");
		table_13.getColumnModel().getColumn(7).setHeaderValue("Comments");
		table_13.getColumnModel().getColumn(8).setHeaderValue("Inactive");
		table_13.getTableHeader().setFont(new java.awt.Font("Tahoma",Font.PLAIN, 10));
		table_13.getTableHeader().resizeAndRepaint();

		JScrollPane fldPane1 = new JScrollPane(table_13);

		table_6 = new JTable(higherOutput,9);
		table_6.setFont(new Font("Tahoma", Font.PLAIN, 10));
		table_6.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		for (int i=0, j=0; i<higherOutput; i++, j++)
		{
			table_6.setValueAt(ListOfRepositoryWfStepIOArgumentHigher.get(higherOp[j]).PropertyName,i,0);
			table_6.setValueAt(GetLowerCaseIOType(ListOfRepositoryWfStepIOArgumentHigher.get(higherOp[j]).sType),i,1);
			table_6.setValueAt(ListOfRepositoryWfStepIOArgumentHigher.get(higherOp[j]).ValueSearchSpecification,i,2);
			table_6.setValueAt(ListOfRepositoryWfStepIOArgumentHigher.get(higherOp[j]).OutputArg,i,3);
			table_6.setValueAt(ListOfRepositoryWfStepIOArgumentHigher.get(higherOp[j]).BusinessComponent,i,4);
			table_6.setValueAt(ListOfRepositoryWfStepIOArgumentHigher.get(higherOp[j]).BusinessComponentField,i,5);
			table_6.setValueAt(ListOfRepositoryWfStepIOArgumentHigher.get(higherOp[j]).Comments,i,6);
			table_6.setValueAt(ListOfRepositoryWfStepIOArgumentHigher.get(higherOp[j]).sSequence,i,7);
			table_6.setValueAt(ListOfRepositoryWfStepIOArgumentHigher.get(higherOp[j]).Inactive,i,8);
		}
		table_6.getColumnModel().getColumn(0).setHeaderValue("Property Name");
		table_6.getColumnModel().getColumn(1).setHeaderValue("Type");
		table_6.getColumnModel().getColumn(2).setHeaderValue("Value / Expression");
		table_6.getColumnModel().getColumn(3).setHeaderValue("Output Argument");
		table_6.getColumnModel().getColumn(4).setHeaderValue("Business Component");
		table_6.getColumnModel().getColumn(5).setHeaderValue("BC Field");
		table_6.getColumnModel().getColumn(6).setHeaderValue("Comments");
		table_6.getColumnModel().getColumn(7).setHeaderValue("Sequence");
		table_6.getColumnModel().getColumn(8).setHeaderValue("Inactive");
		table_6.getTableHeader().setFont(new java.awt.Font("Tahoma",Font.PLAIN, 10));
		table_6.getTableHeader().resizeAndRepaint();

		JScrollPane opPane1 = new JScrollPane(table_6);

		table_7 = new JTable(ListOfRepositoryWfStepBranchHigher.size(),14); //for branches
		table_7.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table_7.setFont(new Font("Tahoma", Font.PLAIN, 10));
		table_7.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		for (int i=0; i<ListOfRepositoryWfStepBranchHigher.size(); i++)
		{
			table_7.setValueAt(ListOfRepositoryWfStepBranchHigher.get(i).Name2,i,0);
			table_7.setValueAt(GetLowerCaseBranchType(ListOfRepositoryWfStepBranchHigher.get(i).sType),i,1);
			table_7.setValueAt(ListOfRepositoryWfStepBranchHigher.get(i).EventObjectType,i,2);
			table_7.setValueAt(ListOfRepositoryWfStepBranchHigher.get(i).sEventObject,i,3);
			table_7.setValueAt(ListOfRepositoryWfStepBranchHigher.get(i).sEvent,i,4);
			table_7.setValueAt(ListOfRepositoryWfStepBranchHigher.get(i).Subevent,i,5);
			table_7.setValueAt(ListOfRepositoryWfStepBranchHigher.get(i).EventCancelFlag,i,6);
			table_7.setValueAt(ListOfRepositoryWfStepBranchHigher.get(i).sExpression,i,7);
			table_7.setValueAt(ListOfRepositoryWfStepBranchHigher.get(i).EventVisibility,i,8);
			table_7.setValueAt(ListOfRepositoryWfStepBranchHigher.get(i).Inactive,i,9);
			table_7.setValueAt(ListOfRepositoryWfStepBranchHigher.get(i).UserEventName,i,10);
			table_7.setValueAt(ListOfRepositoryWfStepBranchHigher.get(i).UserEventStorage,i,11);
			table_7.setValueAt(ListOfRepositoryWfStepBranchHigher.get(i).UserEventTimeout,i,12);
			table_7.setValueAt(ListOfRepositoryWfStepBranchHigher.get(i).Comments,i,13);
		}
		table_7.getColumnModel().getColumn(0).setHeaderValue("Name");
		table_7.getColumnModel().getColumn(1).setHeaderValue("Type");
		table_7.getColumnModel().getColumn(2).setHeaderValue("Event Object Type");
		table_7.getColumnModel().getColumn(3).setHeaderValue("Event Object");
		table_7.getColumnModel().getColumn(4).setHeaderValue("Event");
		table_7.getColumnModel().getColumn(5).setHeaderValue("Subevent");
		table_7.getColumnModel().getColumn(6).setHeaderValue("Event Cancel Flag");
		table_7.getColumnModel().getColumn(7).setHeaderValue("Expression");
		table_7.getColumnModel().getColumn(8).setHeaderValue("Event Visibility");
		table_7.getColumnModel().getColumn(9).setHeaderValue("Inactive");
		table_7.getColumnModel().getColumn(10).setHeaderValue("User Event Name");
		table_7.getColumnModel().getColumn(11).setHeaderValue("User Event Storage");
		table_7.getColumnModel().getColumn(12).setHeaderValue("User Event Timeout (Days)");
		table_7.getColumnModel().getColumn(13).setHeaderValue("Comments");

		table_7.getColumnModel().getColumn(0).setPreferredWidth(100);
		table_7.getColumnModel().getColumn(1).setPreferredWidth(100);
		table_7.getColumnModel().getColumn(2).setPreferredWidth(100);
		table_7.getColumnModel().getColumn(3).setPreferredWidth(100);
		table_7.getColumnModel().getColumn(4).setPreferredWidth(100);
		table_7.getColumnModel().getColumn(5).setPreferredWidth(100);
		table_7.getColumnModel().getColumn(6).setPreferredWidth(100);
		table_7.getColumnModel().getColumn(7).setPreferredWidth(300);
		table_7.getColumnModel().getColumn(8).setPreferredWidth(100);
		table_7.getColumnModel().getColumn(9).setPreferredWidth(100);
		table_7.getColumnModel().getColumn(10).setPreferredWidth(100);
		table_7.getColumnModel().getColumn(11).setPreferredWidth(100);
		table_7.getColumnModel().getColumn(12).setPreferredWidth(125);
		table_7.getColumnModel().getColumn(13).setPreferredWidth(100);

		table_7.getTableHeader().setFont(new java.awt.Font("Tahoma",Font.PLAIN, 10));
		table_7.getTableHeader().resizeAndRepaint();

		table_7.setDefaultRenderer(Object.class, new MyTableCellRenderer());

		JScrollPane brnchPane1 = new JScrollPane(table_7);

		tabbedPane_1.addTab("Input Arguments", null, inpPane1, null);
		tabbedPane_1.setEnabledAt(0, true);
		tabbedPane_1.addTab("Search Specification", null, ssPane1, null);
		tabbedPane_1.setEnabledAt(1, true);
		tabbedPane_1.addTab("Fields", null, fldPane1, null);
		tabbedPane_1.setEnabledAt(2, true);
		tabbedPane_1.addTab("Output Arguments", null, opPane1, null);
		tabbedPane_1.setEnabledAt(3, true);
		tabbedPane_1.addTab("Branches", null, brnchPane1, null);
		tabbedPane_1.setEnabledAt(4, true);
		
		JLabel lblStepPropertiesCreate = new JLabel("Step Properties: Create New");
		lblStepPropertiesCreate.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblStepPropertiesCreate.setBounds(10, 537, 341, 15);
		contentPanel.add(lblStepPropertiesCreate);
		
		JLabel label_19 = new JLabel("Allow Retry Flag");
		label_19.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_19.setBounds(10, 559, 79, 14);
		contentPanel.add(label_19);
		
		checkBox_6 = new JCheckBox("");
		checkBox_6.setEnabled(true);
		checkBox_6.setBounds(39, 579, 21, 23);
		contentPanel.add(checkBox_6);
		
		JLabel label_20 = new JLabel("Inactive");
		label_20.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_20.setBounds(33, 609, 36, 14);
		contentPanel.add(label_20);
		
		checkBox_7 = new JCheckBox("");
		checkBox_7.setEnabled(true);
		checkBox_7.setBounds(41, 629, 21, 23);
		contentPanel.add(checkBox_7);
		
		comboBox = new JComboBox(new String[] {"", "Start", "Business Service", "Decision Point", "Sub Process", "Siebel Operation", "User Interact", "Wait", "Stop", "End"});
		//textField_24 = new JTextField();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 10));
		//textField_24.setEditable(true);
		//textField_24.setColumns(10);
		comboBox.setBounds(89, 582, 100, 20);
		contentPanel.add(comboBox);
		
		JLabel label_21 = new JLabel("Type");
		label_21.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_21.setBounds(89, 559, 71, 14);
		contentPanel.add(label_21);
		
		JLabel label_22 = new JLabel("Evaluate All");
		label_22.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_22.setBounds(110, 609, 59, 14);
		contentPanel.add(label_22);
		
		checkBox_8 = new JCheckBox("");
		checkBox_8.setEnabled(true);
		checkBox_8.setBounds(129, 629, 21, 23);
		contentPanel.add(checkBox_8);
		
		JLabel label_23 = new JLabel("Business Service");
		label_23.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_23.setBounds(199, 559, 100, 14);
		contentPanel.add(label_23);
		
		JLabel label_24 = new JLabel("Error Code");
		label_24.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_24.setBounds(199, 609, 100, 14);
		contentPanel.add(label_24);
		
		textField_25 = new JTextField();
		textField_25.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_25.setEditable(true);
		textField_25.setColumns(10);
		textField_25.setBounds(199, 632, 100, 20);
		contentPanel.add(textField_25);
		
		JLabel label_25 = new JLabel("Method");
		label_25.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_25.setBounds(309, 559, 100, 14);
		contentPanel.add(label_25);
		
		JLabel label_26 = new JLabel("Error Message");
		label_26.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_26.setBounds(309, 609, 100, 14);
		contentPanel.add(label_26);
		
		textField_26 = new JTextField();
		textField_26.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_26.setEditable(true);
		textField_26.setColumns(10);
		textField_26.setBounds(309, 632, 100, 20);
		contentPanel.add(textField_26);
		
		JLabel label_27 = new JLabel("Business Component");
		label_27.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_27.setBounds(419, 559, 100, 14);
		contentPanel.add(label_27);
		
		JLabel label_28 = new JLabel("Maximum Iterations");
		label_28.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_28.setBounds(419, 609, 100, 14);
		contentPanel.add(label_28);
		
		textField_27 = new JTextField();
		textField_27.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_27.setEditable(true);
		textField_27.setColumns(10);
		textField_27.setBounds(419, 632, 100, 20);
		contentPanel.add(textField_27);
		
		JLabel label_29 = new JLabel("Operation");
		label_29.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_29.setBounds(529, 559, 100, 14);
		contentPanel.add(label_29);
		
		comboBox1 = new JComboBox(new String [] {"", "Insert", "Query", "Update"});
		comboBox1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		comboBox1.setBounds(529, 582, 100, 20);
		contentPanel.add(comboBox1);
		
		JLabel label_30 = new JLabel("Processing Mode");
		label_30.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_30.setBounds(529, 609, 100, 14);
		contentPanel.add(label_30);
		
		textField_29 = new JTextField();
		textField_29.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_29.setEditable(true);
		textField_29.setColumns(10);
		textField_29.setBounds(529, 632, 100, 20);
		contentPanel.add(textField_29);
		
		JLabel label_31 = new JLabel("Sub Process Name");
		label_31.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_31.setBounds(639, 559, 100, 14);
		contentPanel.add(label_31);
		
		JLabel label_32 = new JLabel("User Interact View");
		label_32.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_32.setBounds(639, 609, 100, 14);
		contentPanel.add(label_32);
		
		textField_30 = new JTextField();
		textField_30.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_30.setEditable(true);
		textField_30.setColumns(10);
		textField_30.setBounds(639, 632, 100, 20);
		contentPanel.add(textField_30);
		
		JLabel label_33 = new JLabel("Description");
		label_33.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_33.setBounds(749, 559, 100, 14);
		contentPanel.add(label_33);
		
		textField_31 = new JTextField();
		textField_31.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_31.setEditable(true);
		textField_31.setColumns(10);
		textField_31.setBounds(749, 582, 131, 20);
		contentPanel.add(textField_31);
		
		JLabel label_34 = new JLabel("Comments");
		label_34.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_34.setBounds(749, 609, 100, 14);
		contentPanel.add(label_34);
		
		textField_32 = new JTextField();
		textField_32.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_32.setEditable(true);
		textField_32.setColumns(10);
		textField_32.setBounds(749, 632, 131, 20);
		contentPanel.add(textField_32);
		
		tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_2.setBounds(10, 661, 870, 100);
		tabbedPane_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		contentPanel.add(tabbedPane_2);
		
		for (int i=0; i<ListOfRepositoryWfStepIOArgumentNew.size(); i++)
		{
			if (ListOfRepositoryWfStepIOArgumentNew.get(i).InputFlag.equals("I"))
			{
				if (lowerType.equals("SIEBEL_OPER"))
				{
					newField++;
				}
				else
				{
					newInput++;
				}
			}
			if (ListOfRepositoryWfStepIOArgumentNew.get(i).InputFlag.equals("O"))
			{
				newOutput++;
			}
			if (ListOfRepositoryWfStepIOArgumentNew.get(i).InputFlag.equals("S"))
			{
				newSrchSpec++;
			}
		}
		int [] newInp = new int[newInput];
		int [] newOp = new int[newOutput];
		int [] newSS = new int[newSrchSpec];
		int [] newFld = new int[newField];

		for (int i=0, j=0; i<ListOfRepositoryWfStepIOArgumentNew.size(); i++)
		{
			if (ListOfRepositoryWfStepIOArgumentNew.get(i).InputFlag.equals("I"))
			{
				if (newType.equals("SIEBEL_OPER"))
				{
					newFld[j] = i;
					j++;
				}
			}
		}

		for (int i=0, j=0; i<ListOfRepositoryWfStepIOArgumentNew.size(); i++)
		{
			if (ListOfRepositoryWfStepIOArgumentNew.get(i).InputFlag.equals("I"))
			{
				if (!newType.equals("SIEBEL_OPER"))
				{
					newInp[j] = i;
					j++;
				}
			}
		}

		for (int i=0, j=0; i<ListOfRepositoryWfStepIOArgumentNew.size(); i++)
		{
			if (ListOfRepositoryWfStepIOArgumentNew.get(i).InputFlag.equals("O"))
			{
				newOp[j] = i;
				j++;
			}
		}

		for (int i=0, j=0; i<ListOfRepositoryWfStepIOArgumentNew.size(); i++)
		{
			if (ListOfRepositoryWfStepIOArgumentNew.get(i).InputFlag.equals("S"))
			{
				newSS[j] = i;
				j++;
			}
		}

		

		table_8 = new JTable(newInput,9);
		table_8.setFont(new Font("Tahoma", Font.PLAIN, 10));
		table_8.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		for (int i=0, j=0; i<newInput; i++, j++)
		{
			table_8.setValueAt(ListOfRepositoryWfStepIOArgumentNew.get(newInp[j]).Name2,i,0);
			table_8.setValueAt(GetLowerCaseIOType(ListOfRepositoryWfStepIOArgumentNew.get(newInp[j]).sType),i,1);
			table_8.setValueAt(ListOfRepositoryWfStepIOArgumentNew.get(newInp[j]).ValueSearchSpecification,i,2);
			table_8.setValueAt(ListOfRepositoryWfStepIOArgumentNew.get(newInp[j]).BusinessComponent,i,3);
			table_8.setValueAt(ListOfRepositoryWfStepIOArgumentNew.get(newInp[j]).BusinessComponentField,i,4);
			table_8.setValueAt(ListOfRepositoryWfStepIOArgumentNew.get(newInp[j]).PropertyName,i,5);
			table_8.setValueAt(ListOfRepositoryWfStepIOArgumentNew.get(newInp[j]).Comments,i,6);
			table_8.setValueAt(ListOfRepositoryWfStepIOArgumentNew.get(newInp[j]).sSequence,i,7);
			table_8.setValueAt(ListOfRepositoryWfStepIOArgumentNew.get(newInp[j]).Inactive,i,8);
		}
		table_8.getColumnModel().getColumn(0).setHeaderValue("Input Argument");
		table_8.getColumnModel().getColumn(1).setHeaderValue("Type");
		table_8.getColumnModel().getColumn(2).setHeaderValue("Value / Expression");
		table_8.getColumnModel().getColumn(3).setHeaderValue("BC");
		table_8.getColumnModel().getColumn(4).setHeaderValue("BC Field");
		table_8.getColumnModel().getColumn(5).setHeaderValue("Property Name");
		table_8.getColumnModel().getColumn(6).setHeaderValue("Comments");
		table_8.getColumnModel().getColumn(7).setHeaderValue("Sequence");
		table_8.getColumnModel().getColumn(8).setHeaderValue("Inactive");
		table_8.getTableHeader().setFont(new java.awt.Font("Tahoma",Font.PLAIN, 10));
		table_8.getTableHeader().resizeAndRepaint();

		JScrollPane inpPane2 = new JScrollPane(table_8);

		table_9 = new JTable(newSrchSpec,8);
		table_9.setFont(new Font("Tahoma", Font.PLAIN, 10));
		table_9.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		for (int i=0, j=0; i<newSrchSpec; i++, j++)
		{
			table_9.setValueAt(ListOfRepositoryWfStepIOArgumentNew.get(newSS[j]).BusinessComponent,i,0);
			table_9.setValueAt(ListOfRepositoryWfStepIOArgumentNew.get(newSS[j]).OutputArg,i,1);
			table_9.setValueAt(ListOfRepositoryWfStepIOArgumentNew.get(newSS[j]).BusinessComponentField,i,2);
			table_9.setValueAt(GetLowerCaseIOType(ListOfRepositoryWfStepIOArgumentNew.get(newSS[j]).sType),i,3);
			table_9.setValueAt(ListOfRepositoryWfStepIOArgumentNew.get(newSS[j]).ValueSearchSpecification,i,4);
			table_9.setValueAt(ListOfRepositoryWfStepIOArgumentNew.get(newSS[j]).Comments,i,5);
			table_9.setValueAt(ListOfRepositoryWfStepIOArgumentNew.get(newSS[j]).sSequence,i,6);
			table_9.setValueAt(ListOfRepositoryWfStepIOArgumentNew.get(newSS[j]).Inactive,i,7);
		}
		table_9.getColumnModel().getColumn(0).setHeaderValue("Expression BC");
		table_9.getColumnModel().getColumn(1).setHeaderValue("Filter BC");
		table_9.getColumnModel().getColumn(2).setHeaderValue("BC Field");
		table_9.getColumnModel().getColumn(3).setHeaderValue("Type");
		table_9.getColumnModel().getColumn(4).setHeaderValue("Value / Expression");
		table_9.getColumnModel().getColumn(5).setHeaderValue("Comments");
		table_9.getColumnModel().getColumn(6).setHeaderValue("Sequence");
		table_9.getColumnModel().getColumn(7).setHeaderValue("Inactive");
		table_9.getTableHeader().setFont(new java.awt.Font("Tahoma",Font.PLAIN, 10));
		table_9.getTableHeader().resizeAndRepaint();

		JScrollPane ssPane2 = new JScrollPane(table_9);

		table_14 = new JTable(newField,9);
		table_14.setFont(new Font("Tahoma", Font.PLAIN, 10));
		table_14.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		for (int i=0, j=0; i<newField; i++, j++)
		{
			table_14.setValueAt(ListOfRepositoryWfStepIOArgumentNew.get(newFld[j]).Name2,i,0);
			table_14.setValueAt(ListOfRepositoryWfStepIOArgumentNew.get(newFld[j]).sSequence,i,1);
			table_14.setValueAt(GetLowerCaseIOType(ListOfRepositoryWfStepIOArgumentNew.get(newFld[j]).sType),i,2);
			table_14.setValueAt(ListOfRepositoryWfStepIOArgumentNew.get(newFld[j]).ValueSearchSpecification,i,3);
			table_14.setValueAt(ListOfRepositoryWfStepIOArgumentNew.get(newFld[j]).PropertyName,i,4);
			table_14.setValueAt(ListOfRepositoryWfStepIOArgumentNew.get(newFld[j]).BusinessComponent,i,5);
			table_14.setValueAt(ListOfRepositoryWfStepIOArgumentNew.get(newFld[j]).BusinessComponentField,i,6);
			table_14.setValueAt(ListOfRepositoryWfStepIOArgumentNew.get(newFld[j]).Comments,i,7);
			table_14.setValueAt(ListOfRepositoryWfStepIOArgumentNew.get(newFld[j]).Inactive,i,8);
		}
		table_14.getColumnModel().getColumn(0).setHeaderValue("Field Name");
		table_14.getColumnModel().getColumn(1).setHeaderValue("Sequence");
		table_14.getColumnModel().getColumn(2).setHeaderValue("Type");
		table_14.getColumnModel().getColumn(3).setHeaderValue("Value / Expression");
		table_14.getColumnModel().getColumn(4).setHeaderValue("Property Name");
		table_14.getColumnModel().getColumn(5).setHeaderValue("Business Componenet");
		table_14.getColumnModel().getColumn(6).setHeaderValue("BC Field");
		table_14.getColumnModel().getColumn(7).setHeaderValue("Comments");
		table_14.getColumnModel().getColumn(8).setHeaderValue("Inactive");
		table_14.getTableHeader().setFont(new java.awt.Font("Tahoma",Font.PLAIN, 10));
		table_14.getTableHeader().resizeAndRepaint();

		JScrollPane fldPane2 = new JScrollPane(table_14);

		table_10 = new JTable(newOutput,9);
		table_10.setFont(new Font("Tahoma", Font.PLAIN, 10));
		table_10.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		for (int i=0, j=0; i<newOutput; i++, j++)
		{
			table_10.setValueAt(ListOfRepositoryWfStepIOArgumentNew.get(newOp[j]).PropertyName,i,0);
			table_10.setValueAt(GetLowerCaseIOType(ListOfRepositoryWfStepIOArgumentNew.get(newOp[j]).sType),i,1);
			table_10.setValueAt(ListOfRepositoryWfStepIOArgumentNew.get(newOp[j]).ValueSearchSpecification,i,2);
			table_10.setValueAt(ListOfRepositoryWfStepIOArgumentNew.get(newOp[j]).OutputArg,i,3);
			table_10.setValueAt(ListOfRepositoryWfStepIOArgumentNew.get(newOp[j]).BusinessComponent,i,4);
			table_10.setValueAt(ListOfRepositoryWfStepIOArgumentNew.get(newOp[j]).BusinessComponentField,i,5);
			table_10.setValueAt(ListOfRepositoryWfStepIOArgumentNew.get(newOp[j]).Comments,i,6);
			table_10.setValueAt(ListOfRepositoryWfStepIOArgumentNew.get(newOp[j]).sSequence,i,7);
			table_10.setValueAt(ListOfRepositoryWfStepIOArgumentNew.get(newOp[j]).Inactive,i,8);
		}
		table_10.getColumnModel().getColumn(0).setHeaderValue("Property Name");
		table_10.getColumnModel().getColumn(1).setHeaderValue("Type");
		table_10.getColumnModel().getColumn(2).setHeaderValue("Value / Expression");
		table_10.getColumnModel().getColumn(3).setHeaderValue("Output Argument");
		table_10.getColumnModel().getColumn(4).setHeaderValue("Business Component");
		table_10.getColumnModel().getColumn(5).setHeaderValue("BC Field");
		table_10.getColumnModel().getColumn(6).setHeaderValue("Comments");
		table_10.getColumnModel().getColumn(7).setHeaderValue("Sequence");
		table_10.getColumnModel().getColumn(8).setHeaderValue("Inactive");
		table_10.getTableHeader().setFont(new java.awt.Font("Tahoma",Font.PLAIN, 10));
		table_10.getTableHeader().resizeAndRepaint();

		JScrollPane opPane2 = new JScrollPane(table_10);

		table_11 = new JTable(ListOfRepositoryWfStepBranchNew.size(),14); //for branches
		table_11.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table_11.setFont(new Font("Tahoma", Font.PLAIN, 10));
		table_11.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		for (int i=0; i<ListOfRepositoryWfStepBranchNew.size(); i++)
		{
			table_11.setValueAt(ListOfRepositoryWfStepBranchNew.get(i).Name2,i,0);
			table_11.setValueAt(GetLowerCaseBranchType(ListOfRepositoryWfStepBranchNew.get(i).sType),i,1);
			table_11.setValueAt(ListOfRepositoryWfStepBranchNew.get(i).EventObjectType,i,2);
			table_11.setValueAt(ListOfRepositoryWfStepBranchNew.get(i).sEventObject,i,3);
			table_11.setValueAt(ListOfRepositoryWfStepBranchNew.get(i).sEvent,i,4);
			table_11.setValueAt(ListOfRepositoryWfStepBranchNew.get(i).Subevent,i,5);
			table_11.setValueAt(ListOfRepositoryWfStepBranchNew.get(i).EventCancelFlag,i,6);
			table_11.setValueAt(ListOfRepositoryWfStepBranchNew.get(i).sExpression,i,7);
			table_11.setValueAt(ListOfRepositoryWfStepBranchNew.get(i).EventVisibility,i,8);
			table_11.setValueAt(ListOfRepositoryWfStepBranchNew.get(i).Inactive,i,9);
			table_11.setValueAt(ListOfRepositoryWfStepBranchNew.get(i).UserEventName,i,10);
			table_11.setValueAt(ListOfRepositoryWfStepBranchNew.get(i).UserEventStorage,i,11);
			table_11.setValueAt(ListOfRepositoryWfStepBranchNew.get(i).UserEventTimeout,i,12);
			table_11.setValueAt(ListOfRepositoryWfStepBranchNew.get(i).Comments,i,13);
		}
		table_11.getColumnModel().getColumn(0).setHeaderValue("Name");
		table_11.getColumnModel().getColumn(1).setHeaderValue("Type");
		table_11.getColumnModel().getColumn(2).setHeaderValue("Event Object Type");
		table_11.getColumnModel().getColumn(3).setHeaderValue("Event Object");
		table_11.getColumnModel().getColumn(4).setHeaderValue("Event");
		table_11.getColumnModel().getColumn(5).setHeaderValue("Subevent");
		table_11.getColumnModel().getColumn(6).setHeaderValue("Event Cancel Flag");
		table_11.getColumnModel().getColumn(7).setHeaderValue("Expression");
		table_11.getColumnModel().getColumn(8).setHeaderValue("Event Visibility");
		table_11.getColumnModel().getColumn(9).setHeaderValue("Inactive");
		table_11.getColumnModel().getColumn(10).setHeaderValue("User Event Name");
		table_11.getColumnModel().getColumn(11).setHeaderValue("User Event Storage");
		table_11.getColumnModel().getColumn(12).setHeaderValue("User Event Timeout (Days)");
		table_11.getColumnModel().getColumn(13).setHeaderValue("Comments");

		table_11.getColumnModel().getColumn(0).setPreferredWidth(100);
		table_11.getColumnModel().getColumn(1).setPreferredWidth(100);
		table_11.getColumnModel().getColumn(2).setPreferredWidth(100);
		table_11.getColumnModel().getColumn(3).setPreferredWidth(100);
		table_11.getColumnModel().getColumn(4).setPreferredWidth(100);
		table_11.getColumnModel().getColumn(5).setPreferredWidth(100);
		table_11.getColumnModel().getColumn(6).setPreferredWidth(100);
		table_11.getColumnModel().getColumn(7).setPreferredWidth(300);
		table_11.getColumnModel().getColumn(8).setPreferredWidth(100);
		table_11.getColumnModel().getColumn(9).setPreferredWidth(100);
		table_11.getColumnModel().getColumn(10).setPreferredWidth(100);
		table_11.getColumnModel().getColumn(11).setPreferredWidth(100);
		table_11.getColumnModel().getColumn(12).setPreferredWidth(125);
		table_11.getColumnModel().getColumn(13).setPreferredWidth(100);

		table_11.getTableHeader().setFont(new java.awt.Font("Tahoma",Font.PLAIN, 10));
		table_11.getTableHeader().resizeAndRepaint();

		table_11.setDefaultRenderer(Object.class, new MyTableCellRenderer());

		JScrollPane brnchPane2 = new JScrollPane(table_11);

		tabbedPane_2.addTab("Input Arguments", null, inpPane2, null);
		tabbedPane_2.setEnabledAt(0, true);
		tabbedPane_2.addTab("Search Specification", null, ssPane2, null);
		tabbedPane_2.setEnabledAt(1, true);
		tabbedPane_2.addTab("Fields", null, fldPane2, null);
		tabbedPane_2.setEnabledAt(2, true);
		tabbedPane_2.addTab("Output Arguments", null, opPane2, null);
		tabbedPane_2.setEnabledAt(3, true);
		tabbedPane_2.addTab("Branches", null, brnchPane2, null);
		tabbedPane_2.setEnabledAt(4, true);
		
		button = new JButton("");
		button.setIcon(new ImageIcon(getClass().getResource("add-icon.png")));
		button.setBounds(857, 302, 23, 23);
		contentPanel.add(button);
		button.setActionCommand("Lower Add");
		button.setToolTipText("Add");
		button.addActionListener(this);
		
		button_1 = new JButton("");
		button_1.setIcon(new ImageIcon(getClass().getResource("del-icon.png")));
		button_1.setBounds(824, 302, 23, 23);
		contentPanel.add(button_1);
		button_1.setActionCommand("Lower Del");
		button_1.setToolTipText("Delete");
		button_1.addActionListener(this);
		
		button_2 = new JButton("");
		button_2.setIcon(new ImageIcon(getClass().getResource("add-icon.png")));
		button_2.setBounds(857, 537, 23, 23);
		contentPanel.add(button_2);
		button_2.setActionCommand("Higher Add");
		button_2.setToolTipText("Add");
		button_2.addActionListener(this);
		
		button_3 = new JButton("");
		button_3.setIcon(new ImageIcon(getClass().getResource("del-icon.png")));
		button_3.setBounds(824, 537, 23, 23);
		contentPanel.add(button_3);
		button_3.setActionCommand("Higher Del");
		button_3.setToolTipText("Delete");
		button_3.addActionListener(this);
		
		button_4 = new JButton("");
		button_4.setIcon(new ImageIcon(getClass().getResource("add-icon.png")));
		button_4.setBounds(857, 772, 23, 23);
		contentPanel.add(button_4);
		button_4.setActionCommand("New Add");
		button_4.setToolTipText("Add");
		button_4.addActionListener(this);
		
		button_5 = new JButton("");
		button_5.setIcon(new ImageIcon(getClass().getResource("del-icon.png")));
		button_5.setBounds(824, 772, 23, 23);
		button_5.setToolTipText("Delete");
		contentPanel.add(button_5);
		button_5.setActionCommand("New Del");
		button_5.addActionListener(this);
		
		tabbedPane_2.setEnabledAt(3, true);
		
		textField_33 = new JTextField();
		textField_33.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_33.setEditable(false);
		textField_33.setColumns(10);
		textField_33.setBounds(199, 347, 100, 20);
		contentPanel.add(textField_33);
		
		textField_34 = new JTextField();
		textField_34.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_34.setEditable(false);
		textField_34.setColumns(10);
		textField_34.setBounds(309, 347, 100, 20);
		contentPanel.add(textField_34);
		
		textField_35 = new JTextField();
		textField_35.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_35.setEditable(false);
		textField_35.setColumns(10);
		textField_35.setBounds(419, 347, 100, 20);
		contentPanel.add(textField_35);
		
		textField_36 = new JTextField();
		textField_36.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_36.setEditable(false);
		textField_36.setColumns(10);
		textField_36.setBounds(639, 347, 100, 20);
		contentPanel.add(textField_36);
		
		textField_37 = new JTextField();
		textField_37.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_37.setEditable(true);
		textField_37.setColumns(10);
		textField_37.setBounds(199, 582, 100, 20);
		contentPanel.add(textField_37);
		
		textField_38 = new JTextField();
		textField_38.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_38.setEditable(true);
		textField_38.setColumns(10);
		textField_38.setBounds(309, 582, 100, 20);
		contentPanel.add(textField_38);
		
		textField_39 = new JTextField();
		textField_39.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_39.setEditable(true);
		textField_39.setColumns(10);
		textField_39.setBounds(419, 582, 100, 20);
		contentPanel.add(textField_39);
		
		textField_40 = new JTextField();
		textField_40.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_40.setEditable(true);
		textField_40.setColumns(10);
		textField_40.setBounds(639, 582, 100, 20);
		contentPanel.add(textField_40);
		
		JLabel label_1 = new JLabel("Resolve the conflict below");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_1.setBounds(10, 768, 277, 15);
		contentPanel.add(label_1);
		
		chckbxUseTheLower = new JCheckBox("Use the lower version step");
		chckbxUseTheLower.setFont(new Font("Tahoma", Font.PLAIN, 10));
		chckbxUseTheLower.setBounds(10, 790, 310, 23);
		chckbxUseTheLower.addActionListener(this);
		contentPanel.add(chckbxUseTheLower);
		
		chckbxUseTheHigher = new JCheckBox("Use the higher version step");
		chckbxUseTheHigher.setFont(new Font("Tahoma", Font.PLAIN, 10));
		chckbxUseTheHigher.setBounds(10, 812, 310, 23);
		chckbxUseTheHigher.addActionListener(this);
		contentPanel.add(chckbxUseTheHigher);
		
		chckbxUseTheNew = new JCheckBox("Use the new step");
		chckbxUseTheNew.setFont(new Font("Tahoma", Font.PLAIN, 10));
		chckbxUseTheNew.setBounds(354, 790, 310, 23);
		chckbxUseTheNew.addActionListener(this);
		contentPanel.add(chckbxUseTheNew);
		
		JButton btnEditBranch = new JButton("Edit Branch");
		btnEditBranch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selectedPane = tabbedPane.getSelectedIndex();
				if (selectedPane != 4)
				{					
					String DisplayErrorMessage = "You can only edit branches!";
					JLabel lblmessage = new JLabel(DisplayErrorMessage);
					lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
					//System.out.println("NAme: " + getParent().getInvoker().getTopLevelAncestor());
					JOptionPane.showMessageDialog(ConflictWFStep.this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
					return;
				}
				if (table_3.getSelectedRow() == -1)
				{					
					String DisplayErrorMessage = "Please select a branch to edit!";
					JLabel lblmessage = new JLabel(DisplayErrorMessage);
					lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
					//System.out.println("NAme: " + getParent().getInvoker().getTopLevelAncestor());
					JOptionPane.showMessageDialog(ConflictWFStep.this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
					return;
				}
				String branchType = (String) table_3.getValueAt(table_3.getSelectedRow(),1);
				if (!branchType.equals("Condition"))
				{					
					String DisplayErrorMessage = "You can only edit conditional branches!";
					JLabel lblmessage = new JLabel(DisplayErrorMessage);
					lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
					//System.out.println("NAme: " + getParent().getInvoker().getTopLevelAncestor());
					JOptionPane.showMessageDialog(ConflictWFStep.this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
					return;
				}
				
				EditBranchCriteria editBranchCriteria = new EditBranchCriteria(ConflictWFStep.this, listOfRepositoryWfProcessPropLocal);
				editBranchCriteria.setWfBranchCriteria(ListOfWfStepBranchLower.get(table_3.getSelectedRow()).GetListOfRepositoryWfBranchCriteria());
				editBranchCriteria.setVisible(true);
				if (!editBranchCriteria.isDiscard)
				{
					ListOfWfStepBranchLower.get(table_3.getSelectedRow()).SetListOfRepositoryWfBranchCriteria(editBranchCriteria.LocalListOfRepositoryWfBranchCriteria);
					ListOfWfStepBranchLower.get(table_3.getSelectedRow()).SetExpression();
					if (table_3.getCellEditor() != null) {
						table_3.getCellEditor().cancelCellEditing();
					}
					DefaultTableModel model = (DefaultTableModel) table_3.getModel();
					model.setValueAt(ListOfWfStepBranchLower.get(table_3.getSelectedRow()).sExpression,table_3.getSelectedRow(),7);
				}
			}
		});
		btnEditBranch.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnEditBranch.setBounds(725, 302, 89, 23);
		contentPanel.add(btnEditBranch);
		
		JButton button_10 = new JButton("Edit Branch");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selectedPane = tabbedPane_1.getSelectedIndex();
				if (selectedPane != 4)
				{					
					String DisplayErrorMessage = "You can only edit branches!";
					JLabel lblmessage = new JLabel(DisplayErrorMessage);
					lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
					//System.out.println("NAme: " + getParent().getInvoker().getTopLevelAncestor());
					JOptionPane.showMessageDialog(ConflictWFStep.this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
					return;
				}
				if (table_7.getSelectedRow() == -1)
				{					
					String DisplayErrorMessage = "Please select a branch to edit!";
					JLabel lblmessage = new JLabel(DisplayErrorMessage);
					lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
					//System.out.println("NAme: " + getParent().getInvoker().getTopLevelAncestor());
					JOptionPane.showMessageDialog(ConflictWFStep.this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
					return;
				}
				String branchType = (String) table_7.getValueAt(table_7.getSelectedRow(),1);
				if (!branchType.equals("Condition"))
				{					
					String DisplayErrorMessage = "You can only edit conditional branches!";
					JLabel lblmessage = new JLabel(DisplayErrorMessage);
					lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
					//System.out.println("NAme: " + getParent().getInvoker().getTopLevelAncestor());
					JOptionPane.showMessageDialog(ConflictWFStep.this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
					return;
				}
				
				EditBranchCriteria editBranchCriteria = new EditBranchCriteria(ConflictWFStep.this, listOfRepositoryWfProcessPropLocal);
				editBranchCriteria.setWfBranchCriteria(ListOfWfStepBranchHigher.get(table_7.getSelectedRow()).GetListOfRepositoryWfBranchCriteria());
				editBranchCriteria.setVisible(true);
				if (!editBranchCriteria.isDiscard)
				{
					ListOfWfStepBranchHigher.get(table_7.getSelectedRow()).SetListOfRepositoryWfBranchCriteria(editBranchCriteria.LocalListOfRepositoryWfBranchCriteria);
					ListOfWfStepBranchHigher.get(table_7.getSelectedRow()).SetExpression();
					if (table_7.getCellEditor() != null) {
						table_7.getCellEditor().cancelCellEditing();
					}
					DefaultTableModel model = (DefaultTableModel) table_7.getModel();
					model.setValueAt(ListOfWfStepBranchHigher.get(table_7.getSelectedRow()).sExpression,table_7.getSelectedRow(),7);
				}
			}
		});
		button_10.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_10.setBounds(725, 537, 89, 23);
		contentPanel.add(button_10);
		
		JButton button_11 = new JButton("Edit Branch");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selectedPane = tabbedPane_2.getSelectedIndex();
				if (selectedPane != 4)
				{					
					String DisplayErrorMessage = "You can only edit branches!";
					JLabel lblmessage = new JLabel(DisplayErrorMessage);
					lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
					//System.out.println("NAme: " + getParent().getInvoker().getTopLevelAncestor());
					JOptionPane.showMessageDialog(ConflictWFStep.this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
					return;
				}
				if (table_11.getSelectedRow() == -1)
				{					
					String DisplayErrorMessage = "Please select a branch to edit!";
					JLabel lblmessage = new JLabel(DisplayErrorMessage);
					lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
					//System.out.println("NAme: " + getParent().getInvoker().getTopLevelAncestor());
					JOptionPane.showMessageDialog(ConflictWFStep.this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
					return;
				}
				String branchType = (String) table_11.getValueAt(table_11.getSelectedRow(),1);
				if (!branchType.equals("Condition"))
				{					
					String DisplayErrorMessage = "You can only edit conditional branches!";
					JLabel lblmessage = new JLabel(DisplayErrorMessage);
					lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
					//System.out.println("NAme: " + getParent().getInvoker().getTopLevelAncestor());
					JOptionPane.showMessageDialog(ConflictWFStep.this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
					return;
				}
				
				EditBranchCriteria editBranchCriteria = new EditBranchCriteria(ConflictWFStep.this, listOfRepositoryWfProcessPropLocal);
				editBranchCriteria.setWfBranchCriteria(ListOfWfStepBranchNew.get(table_11.getSelectedRow()).GetListOfRepositoryWfBranchCriteria());
				editBranchCriteria.setVisible(true);
				if (!editBranchCriteria.isDiscard)
				{
					ListOfWfStepBranchNew.get(table_11.getSelectedRow()).SetListOfRepositoryWfBranchCriteria(editBranchCriteria.LocalListOfRepositoryWfBranchCriteria);
					ListOfWfStepBranchNew.get(table_11.getSelectedRow()).SetExpression();
					if (table_11.getCellEditor() != null) {
						table_11.getCellEditor().cancelCellEditing();
					}
					DefaultTableModel model = (DefaultTableModel) table_11.getModel();
					model.setValueAt(ListOfWfStepBranchNew.get(table_11.getSelectedRow()).sExpression,table_11.getSelectedRow(),7);
				}
			}
		});
		button_11.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_11.setBounds(725, 772, 89, 23);
		contentPanel.add(button_11);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				okButton.addActionListener(this);
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
	}

	private String GetLowerCaseType(String sString) {
		if (sString.equals("START"))
		{
			return "Start";
		}
		if (sString.equals("TASK"))
		{
			return "Business Service";
		}
		if (sString.equals("DECISION_POINT"))
		{
			return "Decision Point";
		}
		if (sString.equals("SUB_PROCESS"))
		{
			return "Sub Process";
		}
		if (sString.equals("SIEBEL_OPER"))
		{
			return "Siebel Operation";
		}
		if (sString.equals("USER_INTERACT"))
		{
			return "User Interact";
		}
		if (sString.equals("WAIT"))
		{
			return "Wait";
		}
		if (sString.equals("ABORT"))
		{
			return "Stop";
		}
		if (sString.equals("END"))
		{
			return "End";
		}
		return "";
	}

	private String GetHigherCaseType(String sString) {
		if (sString.equals("Start"))
		{
			return "START";
		}
		if (sString.equals("Business Service"))
		{
			return "TASK";
		}
		if (sString.equals("Decision Point"))
		{
			return "DECISION_POINT";
		}
		if (sString.equals("Sub Process"))
		{
			return "SUB_PROCESS";
		}
		if (sString.equals("Siebel Operation"))
		{
			return "SIEBEL_OPER";
		}
		if (sString.equals("User Interact"))
		{
			return "USER_INTERACT";
		}
		if (sString.equals("Wait"))
		{
			return "WAIT";
		}
		if (sString.equals("Stop"))
		{
			return "ABORT";
		}
		if (sString.equals("End"))
		{
			return "END";
		}
		return "";
	}
	public void actionPerformed (ActionEvent e) {
		String cmd = e.getActionCommand();
		String DisplayErrorMessage = new String("");
		String DisplayMessage = new String("");
		if (cmd.equals("Use the lower version step"))
		{
			if (chckbxUseTheLower.isSelected() == true)
			{
				chckbxUseTheHigher.setSelected(false);
				chckbxUseTheNew.setSelected(false);
			}
		}
		if (cmd.equals("Use the higher version step"))
		{
			if (chckbxUseTheHigher.isSelected() == true)
			{
				chckbxUseTheLower.setSelected(false);
				chckbxUseTheNew.setSelected(false);
			}
		}
		if (cmd.equals("Use the new step"))
		{
			if (chckbxUseTheNew.isSelected() == true)
			{
				chckbxUseTheLower.setSelected(false);
				chckbxUseTheHigher.setSelected(false);
			}
		}
		if (cmd.equals("Lower Del"))
		{
			int selectedPane = tabbedPane.getSelectedIndex();
			JOptionPane warningPane = new JOptionPane();
			JLabel lblmessage = new JLabel("");
			DefaultTableModel model = new DefaultTableModel();
			int choice;
			switch(selectedPane)
			{
				case 0:
					//System.out.println("IA");
					if (table.getSelectedRow() == -1)
					{
						DisplayErrorMessage = "Please select a row first then press delete.";
						lblmessage = new JLabel(DisplayErrorMessage);
						lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
						JOptionPane.showMessageDialog(this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
						return;
					}
					warningPane = new JOptionPane();
					DisplayMessage = "Are you sure you want to delete the selected input argument?";
					lblmessage = new JLabel(DisplayMessage);
					lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
					choice = warningPane.showConfirmDialog(this,lblmessage,"Confirm",JOptionPane.YES_NO_OPTION); // 0 for Yes, 1 for No
					if (choice == 1)
					{
						return;
					}
					model = (DefaultTableModel)table.getModel();
					model.removeRow(table.getSelectedRow());
					break;
				case 1:
					//System.out.println("SS");
					if (table_1.getSelectedRow() == -1)
					{
						DisplayErrorMessage = "Please select a row first then press delete.";
						lblmessage = new JLabel(DisplayErrorMessage);
						lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
						JOptionPane.showMessageDialog(this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
						return;
					}
					warningPane = new JOptionPane();
					DisplayMessage = "Are you sure you want to delete the selected search specification?";
					lblmessage = new JLabel(DisplayMessage);
					lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
					choice = warningPane.showConfirmDialog(this,lblmessage,"Confirm",JOptionPane.YES_NO_OPTION); // 0 for Yes, 1 for No
					if (choice == 1)
					{
						return;
					}
					model = (DefaultTableModel)table_1.getModel();
					model.removeRow(table_1.getSelectedRow());
					break;
				case 2:
					//System.out.println("F");
					if (table_12.getSelectedRow() == -1)
					{
						DisplayErrorMessage = "Please select a row first then press delete.";
						lblmessage = new JLabel(DisplayErrorMessage);
						lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
						JOptionPane.showMessageDialog(this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
						return;
					}
					warningPane = new JOptionPane();
					DisplayMessage = "Are you sure you want to delete the selected field?";
					lblmessage = new JLabel(DisplayMessage);
					lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
					choice = warningPane.showConfirmDialog(this,lblmessage,"Confirm",JOptionPane.YES_NO_OPTION); // 0 for Yes, 1 for No
					if (choice == 1)
					{
						return;
					}
					model = (DefaultTableModel)table_12.getModel();
					model.removeRow(table_12.getSelectedRow());
					break;
				case 3:
					//System.out.println("Oa");
					if (table_2.getSelectedRow() == -1)
					{
						DisplayErrorMessage = "Please select a row first then press delete.";
						lblmessage = new JLabel(DisplayErrorMessage);
						lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
						JOptionPane.showMessageDialog(this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
						return;
					}
					warningPane = new JOptionPane();
					DisplayMessage = "Are you sure you want to delete the selected output argument?";
					lblmessage = new JLabel(DisplayMessage);
					lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
					choice = warningPane.showConfirmDialog(this,lblmessage,"Confirm",JOptionPane.YES_NO_OPTION); // 0 for Yes, 1 for No
					if (choice == 1)
					{
						return;
					}
					model = (DefaultTableModel)table_2.getModel();
					model.removeRow(table_2.getSelectedRow());
					break;
				case 4:
					DisplayErrorMessage = "Sorry! Branch deletion is not supported currently. Please continue in Siebel Tools.";
					lblmessage = new JLabel(DisplayErrorMessage);
					lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
					JOptionPane.showMessageDialog(this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
					return;
					//break;
				default:
					//System.out.println("D");
					break;
			}
		}
		if (cmd.equals("Higher Del"))
		{
			int selectedPane = tabbedPane_1.getSelectedIndex();
			JOptionPane warningPane = new JOptionPane();
			JLabel lblmessage = new JLabel("");
			DefaultTableModel model = new DefaultTableModel();
			int choice;
			switch(selectedPane)
			{
				case 0:
					//System.out.println("IA");
					if (table_4.getSelectedRow() == -1)
					{
						DisplayErrorMessage = "Please select a row first then press delete.";
						lblmessage = new JLabel(DisplayErrorMessage);
						lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
						JOptionPane.showMessageDialog(this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
						return;
					}
					warningPane = new JOptionPane();
					DisplayMessage = "Are you sure you want to delete the selected input argument?";
					lblmessage = new JLabel(DisplayMessage);
					lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
					choice = warningPane.showConfirmDialog(this,lblmessage,"Confirm",JOptionPane.YES_NO_OPTION); // 0 for Yes, 1 for No
					if (choice == 1)
					{
						return;
					}
					model = (DefaultTableModel)table_4.getModel();
					model.removeRow(table_4.getSelectedRow());
					break;
				case 1:
					//System.out.println("SS");
					if (table_5.getSelectedRow() == -1)
					{
						DisplayErrorMessage = "Please select a row first then press delete.";
						lblmessage = new JLabel(DisplayErrorMessage);
						lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
						JOptionPane.showMessageDialog(this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
						return;
					}
					warningPane = new JOptionPane();
					DisplayMessage = "Are you sure you want to delete the selected search specification?";
					lblmessage = new JLabel(DisplayMessage);
					lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
					choice = warningPane.showConfirmDialog(this,lblmessage,"Confirm",JOptionPane.YES_NO_OPTION); // 0 for Yes, 1 for No
					if (choice == 1)
					{
						return;
					}
					model = (DefaultTableModel)table_5.getModel();
					model.removeRow(table_5.getSelectedRow());
					break;
				case 2:
					//System.out.println("F");
					if (table_13.getSelectedRow() == -1)
					{
						DisplayErrorMessage = "Please select a row first then press delete.";
						lblmessage = new JLabel(DisplayErrorMessage);
						lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
						JOptionPane.showMessageDialog(this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
						return;
					}
					warningPane = new JOptionPane();
					DisplayMessage = "Are you sure you want to delete the selected field?";
					lblmessage = new JLabel(DisplayMessage);
					lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
					choice = warningPane.showConfirmDialog(this,lblmessage,"Confirm",JOptionPane.YES_NO_OPTION); // 0 for Yes, 1 for No
					if (choice == 1)
					{
						return;
					}
					model = (DefaultTableModel)table_13.getModel();
					model.removeRow(table_13.getSelectedRow());
					break;
				case 3:
					//System.out.println("Oa");
					if (table_6.getSelectedRow() == -1)
					{
						DisplayErrorMessage = "Please select a row first then press delete.";
						lblmessage = new JLabel(DisplayErrorMessage);
						lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
						JOptionPane.showMessageDialog(this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
						return;
					}
					warningPane = new JOptionPane();
					DisplayMessage = "Are you sure you want to delete the selected output argument?";
					lblmessage = new JLabel(DisplayMessage);
					lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
					choice = warningPane.showConfirmDialog(this,lblmessage,"Confirm",JOptionPane.YES_NO_OPTION); // 0 for Yes, 1 for No
					if (choice == 1)
					{
						return;
					}
					model = (DefaultTableModel)table_6.getModel();
					model.removeRow(table_6.getSelectedRow());
					break;
				case 4:
					DisplayErrorMessage = "Sorry! Branch deletion is not supported currently. Please continue in Siebel Tools.";
					lblmessage = new JLabel(DisplayErrorMessage);
					lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
					JOptionPane.showMessageDialog(this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
					return;
					//break;
				default:
					//System.out.println("D");
					break;
			}
		}
		if (cmd.equals("New Del"))
		{
			int selectedPane = tabbedPane_2.getSelectedIndex();
			JOptionPane warningPane = new JOptionPane();
			JLabel lblmessage = new JLabel("");
			DefaultTableModel model = new DefaultTableModel();
			int choice;
			switch(selectedPane)
			{
				case 0:
					//System.out.println("IA");
					if (table_8.getSelectedRow() == -1)
					{
						DisplayErrorMessage = "Please select a row first then press delete.";
						lblmessage = new JLabel(DisplayErrorMessage);
						lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
						JOptionPane.showMessageDialog(this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
						return;
					}
					warningPane = new JOptionPane();
					DisplayMessage = "Are you sure you want to delete the selected inout argument?";
					lblmessage = new JLabel(DisplayMessage);
					lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
					choice = warningPane.showConfirmDialog(this,lblmessage,"Confirm",JOptionPane.YES_NO_OPTION); // 0 for Yes, 1 for No
					if (choice == 1)
					{
						return;
					}
					model = (DefaultTableModel)table_8.getModel();
					model.removeRow(table_8.getSelectedRow());
					break;
				case 1:
					//System.out.println("SS");
					if (table_9.getSelectedRow() == -1)
					{
						DisplayErrorMessage = "Please select a row first then press delete.";
						lblmessage = new JLabel(DisplayErrorMessage);
						lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
						JOptionPane.showMessageDialog(this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
						return;
					}
					warningPane = new JOptionPane();
					DisplayMessage = "Are you sure you want to delete the selected search specification?";
					lblmessage = new JLabel(DisplayMessage);
					lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
					choice = warningPane.showConfirmDialog(this,lblmessage,"Confirm",JOptionPane.YES_NO_OPTION); // 0 for Yes, 1 for No
					if (choice == 1)
					{
						return;
					}
					model = (DefaultTableModel)table_9.getModel();
					model.removeRow(table_9.getSelectedRow());
					break;
				case 2:
					//System.out.println("F");
					if (table_14.getSelectedRow() == -1)
					{
						DisplayErrorMessage = "Please select a row first then press delete.";
						lblmessage = new JLabel(DisplayErrorMessage);
						lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
						JOptionPane.showMessageDialog(this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
						return;
					}
					warningPane = new JOptionPane();
					DisplayMessage = "Are you sure you want to delete the selected field?";
					lblmessage = new JLabel(DisplayMessage);
					lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
					choice = warningPane.showConfirmDialog(this,lblmessage,"Confirm",JOptionPane.YES_NO_OPTION); // 0 for Yes, 1 for No
					if (choice == 1)
					{
						return;
					}
					model = (DefaultTableModel)table_14.getModel();
					model.removeRow(table_14.getSelectedRow());
					break;
				case 3:
					//System.out.println("Oa");
					if (table_10.getSelectedRow() == -1)
					{
						DisplayErrorMessage = "Please select a row first then press delete.";
						lblmessage = new JLabel(DisplayErrorMessage);
						lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
						JOptionPane.showMessageDialog(this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
						return;
					}
					warningPane = new JOptionPane();
					DisplayMessage = "Are you sure you want to delete the selected output argument?";
					lblmessage = new JLabel(DisplayMessage);
					lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
					choice = warningPane.showConfirmDialog(this,lblmessage,"Confirm",JOptionPane.YES_NO_OPTION); // 0 for Yes, 1 for No
					if (choice == 1)
					{
						return;
					}
					model = (DefaultTableModel)table_10.getModel();
					model.removeRow(table_10.getSelectedRow());
					break;
				case 4:
					DisplayErrorMessage = "Sorry! Branch deletion is not supported currently. Please continue in Siebel Tools.";
					lblmessage = new JLabel(DisplayErrorMessage);
					lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
					JOptionPane.showMessageDialog(this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
					return;
					//break;
				default:
					//System.out.println("D");
					break;
			}
		}
		if (cmd.equals("Lower Add"))
		{
			int selectedPane = tabbedPane.getSelectedIndex();
			String tempStepType = new String("");
			switch (selectedPane)
			{
				case 0:
					tempStepType = textField_2.getText().trim();
					if (tempStepType.equals("Decision Point") || tempStepType.equals("Siebel Operation") || tempStepType.equals("User Interact"))
					{
						DisplayErrorMessage = "This type of step does not take any Input Arguments!";
						JLabel lblmessage = new JLabel(DisplayErrorMessage);
						lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
						JOptionPane.showMessageDialog(this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
						break;
					}
					ListOfInpArgName = new ArrayList<String>();
					ListOfFieldSequence = new ArrayList<String>();
					for (int i=0; i<table.getRowCount(); i++)
					{
						ListOfInpArgName.add((String) table.getValueAt(i, 0));
						ListOfFieldSequence.add((String) table.getValueAt(i, 7));
					}
					AddNewInputArgLower addNewInputArgLower = new AddNewInputArgLower(this,listOfRepositoryWfProcessPropMerged, ListOfInpArgName, ListOfFieldSequence);
					addNewInputArgLower.setVisible(true);
					if (!addNewInputArgLower.isDiscard)
					{
						String [] inp = new String[] {addNewInputArgLower.InputArgument, addNewInputArgLower.sArgType, addNewInputArgLower.ValueSearchSpecification, addNewInputArgLower.BusinessComponent, addNewInputArgLower.BusinessComponentField, addNewInputArgLower.PrpopertyName, addNewInputArgLower.Comments, addNewInputArgLower.sSequence, addNewInputArgLower.Inactive};
						DefaultTableModel model = (DefaultTableModel)table.getModel();
						model.addRow(inp);
					}
					break;
				case 1:
					tempStepType = textField_2.getText().trim();
					if (tempStepType.equals("Siebel Operation"))
					{
						ListOfFieldSequence = new ArrayList<String>();
						for (int i=0; i<table_1.getRowCount(); i++)
						{
							ListOfFieldSequence.add((String) table_1.getValueAt(i, 6));
						}
						AddNewSrchSpecLower addNewSrchSpecLower = new AddNewSrchSpecLower(this, textField_5.getText().trim(), ListOfFieldSequence);
						addNewSrchSpecLower.setVisible(true);
						if (!addNewSrchSpecLower.isDiscard)
						{
							String [] inp = new String[] {addNewSrchSpecLower.ExpressionBusinessComponent, addNewSrchSpecLower.FilterBusinessComponent, addNewSrchSpecLower.BCField, addNewSrchSpecLower.sSrchType, addNewSrchSpecLower.ValueSearchSpecification, addNewSrchSpecLower.Comments, addNewSrchSpecLower.sSequence, addNewSrchSpecLower.Inactive};
							DefaultTableModel model = (DefaultTableModel)table_1.getModel();
							model.addRow(inp);
						}
						break;
					}
					else
					{
						DisplayErrorMessage = "This type of step does not take any Search Specifications!";
						JLabel lblmessage = new JLabel(DisplayErrorMessage);
						lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
						JOptionPane.showMessageDialog(this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
						break;
					}
				case 2:
					tempStepType = textField_2.getText().trim();
					if (tempStepType.equals("Siebel Operation"))
					{
						ListOfFieldName = new ArrayList<String>();
						ListOfFieldSequence = new ArrayList<String>();
						for (int i=0; i<table_12.getRowCount(); i++)
						{
							ListOfFieldName.add((String) table_12.getValueAt(i, 0));
							ListOfFieldSequence.add((String) table_12.getValueAt(i, 1));
						}
						AddNewFieldLower addNewFieldLower = new AddNewFieldLower(this, listOfRepositoryWfProcessPropMerged, ListOfFieldName, ListOfFieldSequence);
						addNewFieldLower.setVisible(true);
						if (!addNewFieldLower.isDiscard)
						{
							String [] inp = new String[] {addNewFieldLower.FieldName, addNewFieldLower.sSequence, addNewFieldLower.sFieldType, addNewFieldLower.ValueSearchSpecification, addNewFieldLower.PropertyName, addNewFieldLower.BusinessComponent, addNewFieldLower.BusinessComponentField, addNewFieldLower.Comments, addNewFieldLower.Inactive};
							DefaultTableModel model = (DefaultTableModel)table_12.getModel();
							model.addRow(inp);
						}
						break;
					}
					else
					{
						DisplayErrorMessage = "This type of step does not take any Field Inputs!";
						JLabel lblmessage = new JLabel(DisplayErrorMessage);
						lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
						JOptionPane.showMessageDialog(this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
						break;
					}
				case 3:
					tempStepType = textField_2.getText().trim();
					if (tempStepType.equals("Decision Point") || tempStepType.equals("User Interact"))
					{
						DisplayErrorMessage = "This type of step does not take any Output Arguments!";
						JLabel lblmessage = new JLabel(DisplayErrorMessage);
						lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
						JOptionPane.showMessageDialog(this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
						break;
					}
					ListOfPropertyName = new ArrayList<String>();
					ListOfFieldSequence = new ArrayList<String>();
					for (int i=0; i<table_2.getRowCount(); i++)
					{
						ListOfPropertyName.add((String) table_2.getValueAt(i, 0));
						ListOfFieldSequence.add((String) table_2.getValueAt(i, 7));
					}
					AddOpArgLower addOpArgLower = new AddOpArgLower(this, listOfRepositoryWfProcessPropMerged, ListOfPropertyName, ListOfFieldSequence);
					addOpArgLower.setVisible(true);
					if (!addOpArgLower.isDiscard)
					{
						String [] inp = new String[] {addOpArgLower.PropertyName, addOpArgLower.sFieldType, addOpArgLower.ValueSearchSpecification, addOpArgLower.OpArg, addOpArgLower.BusinessComponent, addOpArgLower.BusinessComponentField, addOpArgLower.Comments, addOpArgLower.sSequence, addOpArgLower.Inactive};
						DefaultTableModel model = (DefaultTableModel)table_2.getModel();
						model.addRow(inp);
					}
					break;
				case 4:
					DisplayErrorMessage = "Sorry! Branch addition is not supported currently. Please continue in Siebel Tools.";
					JLabel lblmessage = new JLabel(DisplayErrorMessage);
					lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
					JOptionPane.showMessageDialog(this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
					return;
					//break;
				default:
					break;
			}
		}
		if (cmd.equals("Higher Add"))
		{
			int selectedPane = tabbedPane_1.getSelectedIndex();
			String tempStepType = new String("");
			switch (selectedPane)
			{
				case 0:
					tempStepType = textField_15.getText().trim();
					if (tempStepType.equals("Decision Point") || tempStepType.equals("Siebel Operation") || tempStepType.equals("User Interact"))
					{
						DisplayErrorMessage = "This type of step does not take any Input Arguments!";
						JLabel lblmessage = new JLabel(DisplayErrorMessage);
						lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
						JOptionPane.showMessageDialog(this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
						break;
					}
					ListOfInpArgName = new ArrayList<String>();
					ListOfFieldSequence = new ArrayList<String>();
					for (int i=0; i<table_4.getRowCount(); i++)
					{
						ListOfInpArgName.add((String) table_4.getValueAt(i, 0));
						ListOfFieldSequence.add((String) table_4.getValueAt(i, 7));
					}
					AddNewInputArgHigher addNewInputArgHigher = new AddNewInputArgHigher(this,listOfRepositoryWfProcessPropMerged, ListOfInpArgName, ListOfFieldSequence);
					addNewInputArgHigher.setVisible(true);
					if (!addNewInputArgHigher.isDiscard)
					{
						String [] inp = new String[] {addNewInputArgHigher.InputArgument, addNewInputArgHigher.sArgType, addNewInputArgHigher.ValueSearchSpecification, addNewInputArgHigher.BusinessComponent, addNewInputArgHigher.BusinessComponentField, addNewInputArgHigher.PrpopertyName, addNewInputArgHigher.Comments, addNewInputArgHigher.sSequence, addNewInputArgHigher.Inactive};
						DefaultTableModel model = (DefaultTableModel)table_4.getModel();
						model.addRow(inp);
					}
					break;
				case 1:
					tempStepType = textField_15.getText().trim();
					if (tempStepType.equals("Siebel Operation"))
					{
						ListOfFieldSequence = new ArrayList<String>();
						for (int i=0; i<table_5.getRowCount(); i++)
						{
							ListOfFieldSequence.add((String) table_5.getValueAt(i, 6));
						}
						AddNewSrchSpecHigher addNewSrchSpecHigher = new AddNewSrchSpecHigher(this, textField_35.getText().trim(), ListOfFieldSequence);
						addNewSrchSpecHigher.setVisible(true);
						if (!addNewSrchSpecHigher.isDiscard)
						{
							String [] inp = new String[] {addNewSrchSpecHigher.ExpressionBusinessComponent, addNewSrchSpecHigher.FilterBusinessComponent, addNewSrchSpecHigher.BCField, addNewSrchSpecHigher.sSrchType, addNewSrchSpecHigher.ValueSearchSpecification, addNewSrchSpecHigher.Comments, addNewSrchSpecHigher.sSequence, addNewSrchSpecHigher.Inactive};
							DefaultTableModel model = (DefaultTableModel)table_5.getModel();
							model.addRow(inp);
						}
						break;
					}
					else
					{
						DisplayErrorMessage = "This type of step does not take any Search Specifications!";
						JLabel lblmessage = new JLabel(DisplayErrorMessage);
						lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
						JOptionPane.showMessageDialog(this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
						break;
					}
				case 2:
					tempStepType = textField_15.getText().trim();
					if (tempStepType.equals("Siebel Operation"))
					{
						ListOfFieldName = new ArrayList<String>();
						ListOfFieldSequence = new ArrayList<String>();
						for (int i=0; i<table_13.getRowCount(); i++)
						{
							ListOfFieldName.add((String) table_13.getValueAt(i, 0));
							ListOfFieldSequence.add((String) table_13.getValueAt(i, 1));
						}
						AddNewFieldHigher addNewFieldHigher = new AddNewFieldHigher(this, listOfRepositoryWfProcessPropMerged, ListOfFieldName, ListOfFieldSequence);
						addNewFieldHigher.setVisible(true);
						if (!addNewFieldHigher.isDiscard)
						{
							String [] inp = new String[] {addNewFieldHigher.FieldName, addNewFieldHigher.sSequence, addNewFieldHigher.sFieldType, addNewFieldHigher.ValueSearchSpecification, addNewFieldHigher.PropertyName, addNewFieldHigher.BusinessComponent, addNewFieldHigher.BusinessComponentField, addNewFieldHigher.Comments, addNewFieldHigher.Inactive};
							DefaultTableModel model = (DefaultTableModel)table_13.getModel();
							model.addRow(inp);
						}
						break;
					}
					else
					{
						DisplayErrorMessage = "This type of step does not take any Field Inputs!";
						JLabel lblmessage = new JLabel(DisplayErrorMessage);
						lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
						JOptionPane.showMessageDialog(this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
						break;
					}
				case 3:
					tempStepType = textField_15.getText().trim();
					if (tempStepType.equals("Decision Point") || tempStepType.equals("User Interact"))
					{
						DisplayErrorMessage = "This type of step does not take any Output Arguments!";
						JLabel lblmessage = new JLabel(DisplayErrorMessage);
						lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
						JOptionPane.showMessageDialog(this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
						break;
					}
					ListOfPropertyName = new ArrayList<String>();
					ListOfFieldSequence = new ArrayList<String>();
					for (int i=0; i<table_6.getRowCount(); i++)
					{
						ListOfPropertyName.add((String) table_6.getValueAt(i, 0));
						ListOfFieldSequence.add((String) table_6.getValueAt(i, 7));
					}
					AddOpArgHigher addOpArgHigher = new AddOpArgHigher(this, listOfRepositoryWfProcessPropMerged, ListOfPropertyName, ListOfFieldSequence);
					addOpArgHigher.setVisible(true);
					if (!addOpArgHigher.isDiscard)
					{
						String [] inp = new String[] {addOpArgHigher.PropertyName, addOpArgHigher.sFieldType, addOpArgHigher.ValueSearchSpecification, addOpArgHigher.OpArg, addOpArgHigher.BusinessComponent, addOpArgHigher.BusinessComponentField, addOpArgHigher.Comments, addOpArgHigher.sSequence, addOpArgHigher.Inactive};
						DefaultTableModel model = (DefaultTableModel)table_6.getModel();
						model.addRow(inp);
					}
					break;
				case 4:
					DisplayErrorMessage = "Sorry! Branch addition is not supported currently. Please continue in Siebel Tools.";
					JLabel lblmessage = new JLabel(DisplayErrorMessage);
					lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
					JOptionPane.showMessageDialog(this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
					return;
					//break;
				default:
					break;
			}
		}
		if (cmd.equals("New Add"))
		{
			int selectedPane = tabbedPane_2.getSelectedIndex();
			String tempStepType = new String("");
			switch (selectedPane)
			{
				case 0:
					tempStepType = (String) comboBox.getSelectedItem();
					if (tempStepType.equals("Decision Point") || tempStepType.equals("Siebel Operation") || tempStepType.equals("User Interact"))
					{
						DisplayErrorMessage = "This type of step does not take any Input Arguments!";
						JLabel lblmessage = new JLabel(DisplayErrorMessage);
						lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
						JOptionPane.showMessageDialog(this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
						break;
					}
					ListOfInpArgName = new ArrayList<String>();
					ListOfFieldSequence = new ArrayList<String>();
					for (int i=0; i<table_8.getRowCount(); i++)
					{
						ListOfInpArgName.add((String) table_8.getValueAt(i, 0));
						ListOfFieldSequence.add((String) table_8.getValueAt(i, 7));
					}
					AddNewInputArgNew addNewInputArgNew = new AddNewInputArgNew(this,listOfRepositoryWfProcessPropMerged, ListOfInpArgName, ListOfFieldSequence);
					addNewInputArgNew.setVisible(true);
					if (!addNewInputArgNew.isDiscard)
					{
						String [] inp = new String[] {addNewInputArgNew.InputArgument, addNewInputArgNew.sArgType, addNewInputArgNew.ValueSearchSpecification, addNewInputArgNew.BusinessComponent, addNewInputArgNew.BusinessComponentField, addNewInputArgNew.PrpopertyName, addNewInputArgNew.Comments, addNewInputArgNew.sSequence, addNewInputArgNew.Inactive};
						DefaultTableModel model = (DefaultTableModel)table_8.getModel();
						model.addRow(inp);
					}
					break;
				case 1:
					tempStepType = (String) comboBox.getSelectedItem();
					if (tempStepType.equals("Siebel Operation"))
					{
						ListOfFieldSequence = new ArrayList<String>();
						for (int i=0; i<table_9.getRowCount(); i++)
						{
							ListOfFieldSequence.add((String) table_9.getValueAt(i, 6));
						}
						AddNewSrchSpecNew addNewSrchSpecNew = new AddNewSrchSpecNew(this, textField_39.getText().trim(), ListOfFieldSequence);
						addNewSrchSpecNew.setVisible(true);
						if (!addNewSrchSpecNew.isDiscard)
						{
							String [] inp = new String[] {addNewSrchSpecNew.ExpressionBusinessComponent, addNewSrchSpecNew.FilterBusinessComponent, addNewSrchSpecNew.BCField, addNewSrchSpecNew.sSrchType, addNewSrchSpecNew.ValueSearchSpecification, addNewSrchSpecNew.Comments, addNewSrchSpecNew.sSequence, addNewSrchSpecNew.Inactive};
							DefaultTableModel model = (DefaultTableModel)table_9.getModel();
							model.addRow(inp);
						}
						break;
					}
					else
					{
						DisplayErrorMessage = "This type of step does not take any Search Specifications!";
						JLabel lblmessage = new JLabel(DisplayErrorMessage);
						lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
						JOptionPane.showMessageDialog(this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
						break;
					}
				case 2:
					tempStepType = (String) comboBox.getSelectedItem();
					if (tempStepType.equals("Siebel Operation"))
					{
						ListOfFieldName = new ArrayList<String>();
						ListOfFieldSequence = new ArrayList<String>();
						for (int i=0; i<table_14.getRowCount(); i++)
						{
							ListOfFieldName.add((String) table_14.getValueAt(i, 0));
							ListOfFieldSequence.add((String) table_14.getValueAt(i, 1));
						}
						AddNewFieldNew addNewFieldNew = new AddNewFieldNew(this, listOfRepositoryWfProcessPropMerged, ListOfFieldName, ListOfFieldSequence);
						addNewFieldNew.setVisible(true);
						if (!addNewFieldNew.isDiscard)
						{
							String [] inp = new String[] {addNewFieldNew.FieldName, addNewFieldNew.sSequence, addNewFieldNew.sFieldType, addNewFieldNew.ValueSearchSpecification, addNewFieldNew.PropertyName, addNewFieldNew.BusinessComponent, addNewFieldNew.BusinessComponentField, addNewFieldNew.Comments, addNewFieldNew.Inactive};
							DefaultTableModel model = (DefaultTableModel)table_14.getModel();
							model.addRow(inp);
						}
						break;
					}
					else
					{
						DisplayErrorMessage = "This type of step does not take any Field Inputs!";
						JLabel lblmessage = new JLabel(DisplayErrorMessage);
						lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
						JOptionPane.showMessageDialog(this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
						break;
					}
				case 3:
					tempStepType = (String) comboBox.getSelectedItem();
					if (tempStepType.equals("Decision Point") || tempStepType.equals("User Interact"))
					{
						DisplayErrorMessage = "This type of step does not take any Output Arguments!";
						JLabel lblmessage = new JLabel(DisplayErrorMessage);
						lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
						JOptionPane.showMessageDialog(this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
						break;
					}
					ListOfPropertyName = new ArrayList<String>();
					ListOfFieldSequence = new ArrayList<String>();
					for (int i=0; i<table_10.getRowCount(); i++)
					{
						ListOfPropertyName.add((String) table_10.getValueAt(i, 0));
						ListOfFieldSequence.add((String) table_10.getValueAt(i, 7));
					}
					AddOpArgNew addOpArgNew = new AddOpArgNew(this, listOfRepositoryWfProcessPropMerged, ListOfPropertyName, ListOfFieldSequence);
					addOpArgNew.setVisible(true);
					if (!addOpArgNew.isDiscard)
					{
						String [] inp = new String[] {addOpArgNew.PropertyName, addOpArgNew.sFieldType, addOpArgNew.ValueSearchSpecification, addOpArgNew.OpArg, addOpArgNew.BusinessComponent, addOpArgNew.BusinessComponentField, addOpArgNew.Comments, addOpArgNew.sSequence, addOpArgNew.Inactive};
						DefaultTableModel model = (DefaultTableModel)table_10.getModel();
						model.addRow(inp);
					}
					break;
				case 4:
					DisplayErrorMessage = "Sorry! Branch addition is not supported currently. Please continue in Siebel Tools.";
					JLabel lblmessage = new JLabel(DisplayErrorMessage);
					lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
					JOptionPane.showMessageDialog(this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
					return;
					//break;
				default:
					break;
			}
		}
		if (cmd.equals("OK"))
		{
			if (chckbxUseTheLower.isSelected() == false && chckbxUseTheHigher.isSelected() == false && chckbxUseTheNew.isSelected() == false)
			{
				DisplayErrorMessage = "Invalid or missing data submitted: Resolution option";
				JLabel lblmessage = new JLabel(DisplayErrorMessage);
				lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
				JOptionPane.showMessageDialog(this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
				return;
			}
			
			if (chckbxUseTheLower.isSelected() == true) {
				if (checkBox.isSelected() == true)
				{
					AllowRetryFlag = new String("Y");
				}
				else
				{
					AllowRetryFlag = new String("N");
				}
				sOperation = new String(GetHigherCaseOperation(textField_6.getText().trim()));
				BusinessComponent = new String(textField_5.getText().trim());
				BusinessServiceMethod = new String(textField_4.getText().trim());
				BusinessServiceName = new String(textField_3.getText().trim());
				Comments = new String(textField_9.getText().trim());
				Description = new String(textField_8.getText().trim());
				ErrorCode = new String(textField_10.getText().trim());
				ErrorMessage = new String(textField_11.getText().trim());
				if (checkBox_2.isSelected() == true)
				{
					EvaluateAll = new String("Y");
				}
				else
				{
					EvaluateAll = new String("N");
				}
				if (checkBox_1.isSelected() == true)
				{
					Inactive = new String("Y");
				}
				else
				{
					Inactive = new String("N");
				}
				MaximumIterations = new String(textField_12.getText().trim());
				ProcessingMode = new String(textField_13.getText().trim());
				SubprocessName = new String(textField_7.getText().trim());
				sType = new String(GetHigherCaseType(textField_2.getText().trim()));
				UserInteractView = new String(textField_14.getText().trim());

				ListOfRepositoryWfStepIOArgument = new ArrayList<RepositoryWfStepIOArgument>();

				if (sType.equals("SIEBEL_OPER"))
				{
					for (int i=0; i<table_1.getRowCount(); i++)
					{
						repositoryWfStepIOArgument = new RepositoryWfStepIOArgument((String)table_1.getValueAt(i,0), (String)table_1.getValueAt(i,2), (String)table_1.getValueAt(i,5), (String)table_1.getValueAt(i,7), "S", "", GetIOName("S", textField_1.getText().trim(), (String)table_1.getValueAt(i,6)), (String)table_1.getValueAt(i,1), "", (String)table_1.getValueAt(i,6), GetHigherCaseIOType((String)table_1.getValueAt(i,3)), (String)table_1.getValueAt(i,4));
						//System.out.println(repositoryWfStepIOArgument);
						ListOfRepositoryWfStepIOArgument.add(repositoryWfStepIOArgument);
					}
					for (int i=0; i<table_12.getRowCount(); i++)
					{
						repositoryWfStepIOArgument = new RepositoryWfStepIOArgument((String)table_12.getValueAt(i,5), (String)table_12.getValueAt(i,6), (String)table_12.getValueAt(i,7), (String)table_12.getValueAt(i,8), "I", "", (String)table_12.getValueAt(i,0), "", (String)table_12.getValueAt(i,4), (String)table_12.getValueAt(i,1), GetHigherCaseIOType((String)table_12.getValueAt(i,2)), (String)table_12.getValueAt(i,3));
						ListOfRepositoryWfStepIOArgument.add(repositoryWfStepIOArgument);
					}
				}
				else
				{
					for (int i=0; i<table.getRowCount(); i++)
					{
						repositoryWfStepIOArgument = new RepositoryWfStepIOArgument((String)table.getValueAt(i,3), (String)table.getValueAt(i,4), (String)table.getValueAt(i,6), (String)table.getValueAt(i,8), "I", "", (String)table.getValueAt(i,0), "", (String)table.getValueAt(i,5), (String)table.getValueAt(i,7), GetHigherCaseIOType((String)table.getValueAt(i,1)), (String)table.getValueAt(i,2));
						ListOfRepositoryWfStepIOArgument.add(repositoryWfStepIOArgument);
					}
				}
				
				for (int i=0; i<table_2.getRowCount(); i++)
				{
					repositoryWfStepIOArgument = new RepositoryWfStepIOArgument((String)table_2.getValueAt(i,4), (String)table_2.getValueAt(i,5), (String)table_2.getValueAt(i,6), (String)table_2.getValueAt(i,8), "O", "", GetIOName("O", textField_1.getText().trim(), (String)table_2.getValueAt(i,7)), (String)table_2.getValueAt(i,3), (String)table_2.getValueAt(i,0), (String)table_2.getValueAt(i,7), GetHigherCaseIOType((String)table_2.getValueAt(i,1)), (String)table_2.getValueAt(i,2));
					ListOfRepositoryWfStepIOArgument.add(repositoryWfStepIOArgument);
				}
				Cloner cloner = new Cloner();
				ListOfWfStepBranchFinal = cloner.deepClone(ListOfWfStepBranchLower);

			}
			
			if (chckbxUseTheHigher.isSelected() == true) {
				if (checkBox_3.isSelected() == true)
				{
					AllowRetryFlag = new String("Y");
				}
				else
				{
					AllowRetryFlag = new String("N");
				}
				sOperation = new String(GetHigherCaseOperation(textField_19.getText().trim()));
				BusinessComponent = new String(textField_35.getText().trim());
				BusinessServiceMethod = new String(textField_34.getText().trim());
				BusinessServiceName = new String(textField_33.getText().trim());
				Comments = new String(textField_23.getText().trim());
				Description = new String(textField_22.getText().trim());
				ErrorCode = new String(textField_16.getText().trim());
				ErrorMessage = new String(textField_17.getText().trim());
				if (checkBox_5.isSelected() == true)
				{
					EvaluateAll = new String("Y");
				}
				else
				{
					EvaluateAll = new String("N");
				}
				if (checkBox_4.isSelected() == true)
				{
					Inactive = new String("Y");
				}
				else
				{
					Inactive = new String("N");
				}
				MaximumIterations = new String(textField_18.getText().trim());
				ProcessingMode = new String(textField_20.getText().trim());
				SubprocessName = new String(textField_36.getText().trim());
				sType = new String(GetHigherCaseType(textField_15.getText().trim()));
				UserInteractView = new String(textField_21.getText().trim());

				ListOfRepositoryWfStepIOArgument = new ArrayList<RepositoryWfStepIOArgument>();

				if (sType.equals("SIEBEL_OPER"))
				{
					for (int i=0; i<table_5.getRowCount(); i++)
					{
						repositoryWfStepIOArgument = new RepositoryWfStepIOArgument((String)table_5.getValueAt(i,0), (String)table_5.getValueAt(i,2), (String)table_5.getValueAt(i,5), (String)table_5.getValueAt(i,7), "S", "", GetIOName("S", textField_1.getText().trim(), (String)table_5.getValueAt(i,6)), (String)table_5.getValueAt(i,1), "", (String)table_5.getValueAt(i,6), GetHigherCaseIOType((String)table_5.getValueAt(i,3)), (String)table_5.getValueAt(i,4));
						//System.out.println(repositoryWfStepIOArgument);
						ListOfRepositoryWfStepIOArgument.add(repositoryWfStepIOArgument);
					}
					for (int i=0; i<table_13.getRowCount(); i++)
					{
						repositoryWfStepIOArgument = new RepositoryWfStepIOArgument((String)table_13.getValueAt(i,5), (String)table_13.getValueAt(i,6), (String)table_13.getValueAt(i,7), (String)table_13.getValueAt(i,8), "I", "", (String)table_13.getValueAt(i,0), "", (String)table_13.getValueAt(i,4), (String)table_13.getValueAt(i,1), GetHigherCaseIOType((String)table_13.getValueAt(i,2)), (String)table_13.getValueAt(i,3));
						ListOfRepositoryWfStepIOArgument.add(repositoryWfStepIOArgument);
					}
				}
				else
				{
					for (int i=0; i<table_4.getRowCount(); i++)
					{
						repositoryWfStepIOArgument = new RepositoryWfStepIOArgument((String)table_4.getValueAt(i,3), (String)table_4.getValueAt(i,4), (String)table_4.getValueAt(i,6), (String)table_4.getValueAt(i,8), "I", "", (String)table_4.getValueAt(i,0), "", (String)table_4.getValueAt(i,5), (String)table_4.getValueAt(i,7), GetHigherCaseIOType((String)table_4.getValueAt(i,1)), (String)table_4.getValueAt(i,2));
						ListOfRepositoryWfStepIOArgument.add(repositoryWfStepIOArgument);
					}
				}
				
				for (int i=0; i<table_6.getRowCount(); i++)
				{
					repositoryWfStepIOArgument = new RepositoryWfStepIOArgument((String)table_6.getValueAt(i,4), (String)table_6.getValueAt(i,5), (String)table_6.getValueAt(i,6), (String)table_6.getValueAt(i,8), "O", "", GetIOName("O", textField_1.getText().trim(), (String)table_6.getValueAt(i,7)), (String)table_6.getValueAt(i,3), (String)table_6.getValueAt(i,0), (String)table_6.getValueAt(i,7), GetHigherCaseIOType((String)table_6.getValueAt(i,1)), (String)table_6.getValueAt(i,2));
					ListOfRepositoryWfStepIOArgument.add(repositoryWfStepIOArgument);
				}
				Cloner cloner = new Cloner();
				ListOfWfStepBranchFinal = cloner.deepClone(ListOfWfStepBranchHigher);

			}
			
			if (chckbxUseTheNew.isSelected() == true) {
				//First here will be validations

				//End Validation

				if (checkBox_6.isSelected() == true)
				{
					AllowRetryFlag = new String("Y");
				}
				else
				{
					AllowRetryFlag = new String("N");
				}
				sOperation = new String(GetHigherCaseOperation((String) comboBox1.getSelectedItem()));
				BusinessComponent = new String(textField_39.getText().trim());
				BusinessServiceMethod = new String(textField_38.getText().trim());
				BusinessServiceName = new String(textField_37.getText().trim());
				Comments = new String(textField_32.getText().trim());
				Description = new String(textField_31.getText().trim());
				ErrorCode = new String(textField_25.getText().trim());
				ErrorMessage = new String(textField_26.getText().trim());
				if (checkBox_8.isSelected() == true)
				{
					EvaluateAll = new String("Y");
				}
				else
				{
					EvaluateAll = new String("N");
				}
				if (checkBox_7.isSelected() == true)
				{
					Inactive = new String("Y");
				}
				else
				{
					Inactive = new String("N");
				}
				MaximumIterations = new String(textField_27.getText().trim());
				ProcessingMode = new String(textField_29.getText().trim());
				SubprocessName = new String(textField_40.getText().trim());
				sType = new String(GetHigherCaseType((String) comboBox.getSelectedItem()));
				UserInteractView = new String(textField_30.getText().trim());

				ListOfRepositoryWfStepIOArgument = new ArrayList<RepositoryWfStepIOArgument>();

				if (sType.equals("SIEBEL_OPER"))
				{
					for (int i=0; i<table_9.getRowCount(); i++)
					{
						repositoryWfStepIOArgument = new RepositoryWfStepIOArgument((String)table_9.getValueAt(i,0), (String)table_9.getValueAt(i,2), (String)table_9.getValueAt(i,5), (String)table_9.getValueAt(i,7), "S", "", GetIOName("S", textField_1.getText().trim(), (String)table_9.getValueAt(i,6)), (String)table_9.getValueAt(i,1), "", (String)table_9.getValueAt(i,6), GetHigherCaseIOType((String)table_9.getValueAt(i,3)), (String)table_9.getValueAt(i,4));
						ListOfRepositoryWfStepIOArgument.add(repositoryWfStepIOArgument);
					}
					for (int i=0; i<table_14.getRowCount(); i++)
					{
						repositoryWfStepIOArgument = new RepositoryWfStepIOArgument((String)table_14.getValueAt(i,5), (String)table_14.getValueAt(i,6), (String)table_14.getValueAt(i,7), (String)table_14.getValueAt(i,8), "I", "", (String)table_14.getValueAt(i,0), "", (String)table_14.getValueAt(i,4), (String)table_14.getValueAt(i,1), GetHigherCaseIOType((String)table_14.getValueAt(i,2)), (String)table_14.getValueAt(i,3));
						ListOfRepositoryWfStepIOArgument.add(repositoryWfStepIOArgument);
					}
				}
				else
				{
					for (int i=0; i<table_8.getRowCount(); i++)
					{
						repositoryWfStepIOArgument = new RepositoryWfStepIOArgument((String)table_8.getValueAt(i,3), (String)table_8.getValueAt(i,4), (String)table_8.getValueAt(i,6), (String)table_8.getValueAt(i,8), "I", "", (String)table_8.getValueAt(i,0), "", (String)table_8.getValueAt(i,5), (String)table_8.getValueAt(i,7), GetHigherCaseIOType((String)table_8.getValueAt(i,1)), (String)table_8.getValueAt(i,2));
						ListOfRepositoryWfStepIOArgument.add(repositoryWfStepIOArgument);
					}
				}
				
				for (int i=0; i<table_10.getRowCount(); i++)
				{
					repositoryWfStepIOArgument = new RepositoryWfStepIOArgument((String)table_10.getValueAt(i,4), (String)table_10.getValueAt(i,5), (String)table_10.getValueAt(i,6), (String)table_10.getValueAt(i,8), "O", "", GetIOName("O", textField_1.getText().trim(), (String)table_10.getValueAt(i,7)), (String)table_10.getValueAt(i,3), (String)table_10.getValueAt(i,0), (String)table_10.getValueAt(i,7), GetHigherCaseIOType((String)table_10.getValueAt(i,1)), (String)table_10.getValueAt(i,2));
					ListOfRepositoryWfStepIOArgument.add(repositoryWfStepIOArgument);
				}
				Cloner cloner = new Cloner();
				ListOfWfStepBranchFinal = cloner.deepClone(ListOfWfStepBranchNew);
			}

			this.setVisible(false);
		}
	}

	public ArrayList<RepositoryWfStepBranch> GetListOfRepositoryWfStepBranch() {
		return ListOfWfStepBranchFinal;
	}

	public ArrayList<RepositoryWfStepIOArgument> GetListOfRepositoryWfStepIOArgument() {
		return ListOfRepositoryWfStepIOArgument;
	}

	public void setWfName(String sString) {
		textField.setText(sString);
	}

	public void setStepName(String sString) {
		textField_1.setText(sString);
	}

	public void setLowerAllowRetry(String sString) {
		if (sString.equals("Y"))
		{
			checkBox.setSelected(true);
		}
		else
		{
			checkBox.setSelected(false);
		}
	}

	public void setLowerType(String sString) {
		textField_2.setText(GetLowerCaseType(sString));
	}

	public void setLowerBS(String sString) {
		textField_3.setText(sString);
	}

	public void setLowerMethod(String sString) {
		textField_4.setText(sString);
	}

	public void setLowerBC(String sString) {
		textField_5.setText(sString);
	}

	public void setLowerOperation(String sString) {
		textField_6.setText(GetLowerCaseOperation(sString));
	}

	public void setLowerSubProcess(String sString) {
		textField_7.setText(sString);
	}

	public void setLowerDesc(String sString) {
		textField_8.setText(sString);
	}

	public void setLowerInactive(String sString) {
		if (sString.equals("Y"))
		{
			checkBox_1.setSelected(true);
		}
		else
		{
			checkBox_1.setSelected(false);
		}
	}

	public void setLowerEvaluateAll(String sString) {
		if (sString.equals("Y"))
		{
			checkBox_2.setSelected(true);
		}
		else
		{
			checkBox_2.setSelected(false);
		}
	}

	public void setLowerErrorCode(String sString) {
		textField_10.setText(sString);
	}

	public void setLowerErrorMessage(String sString) {
		textField_11.setText(sString);
	}

	public void setLowerMaxIteration(String sString) {
		textField_12.setText(sString);
	}

	public void setLowerProcessingMode(String sString) {
		textField_13.setText(sString);
	}

	public void setLowerUIV(String sString) {
		textField_14.setText(sString);
	}

	public void setLowerComments(String sString) {
		textField_9.setText(sString);
	}
	//Finished setting lower properties

	public void setHigherAllowRetry(String sString) {
		if (sString.equals("Y"))
		{
			checkBox_3.setSelected(true);
		}
		else
		{
			checkBox_3.setSelected(false);
		}
	}

	public void setHigherType(String sString) {
		textField_15.setText(GetLowerCaseType(sString));
	}

	public void setHigherBS(String sString) {
		textField_33.setText(sString);
	}

	public void setHigherMethod(String sString) {
		textField_34.setText(sString);
	}

	public void setHigherBC(String sString) {
		textField_35.setText(sString);
	}

	public void setHigherOperation(String sString) {
		textField_19.setText(GetLowerCaseOperation(sString));
	}

	public void setHigherSubProcess(String sString) {
		textField_36.setText(sString);
	}

	public void setHigherDesc(String sString) {
		textField_22.setText(sString);
	}

	public void setHigherInactive(String sString) {
		if (sString.equals("Y"))
		{
			checkBox_4.setSelected(true);
		}
		else
		{
			checkBox_4.setSelected(false);
		}
	}

	public void setHigherEvaluateAll(String sString) {
		if (sString.equals("Y"))
		{
			checkBox_5.setSelected(true);
		}
		else
		{
			checkBox_5.setSelected(false);
		}
	}

	public void setHigherErrorCode(String sString) {
		textField_16.setText(sString);
	}

	public void setHigherErrorMessage(String sString) {
		textField_17.setText(sString);
	}

	public void setHigherMaxIteration(String sString) {
		textField_18.setText(sString);
	}

	public void setHigherProcessingMode(String sString) {
		textField_20.setText(sString);
	}

	public void setHigherUIV(String sString) {
		textField_21.setText(sString);
	}

	public void setHigherComments(String sString) {
		textField_23.setText(sString);
	}
	//finished setting higher properties
	public void setNewAllowRetry(String sString) {
		if (sString.equals("Y"))
		{
			checkBox_6.setSelected(true);
		}
		else
		{
			checkBox_6.setSelected(false);
		}
	}

	public void setNewType(String sString) {
		//textField_24.setText(GetLowerCaseType(sString));
		comboBox.setSelectedItem(GetLowerCaseType(sString));
	}

	public void setNewBS(String sString) {
		textField_37.setText(sString);
	}

	public void setNewMethod(String sString) {
		textField_38.setText(sString);
	}

	public void setNewBC(String sString) {
		textField_39.setText(sString);
	}

	public void setNewOperation(String sString) {
		comboBox1.setSelectedItem(GetLowerCaseOperation(sString));
	}

	public void setNewSubProcess(String sString) {
		textField_40.setText(sString);
	}

	public void setNewDesc(String sString) {
		textField_31.setText(sString);
	}

	public void setNewInactive(String sString) {
		if (sString.equals("Y"))
		{
			checkBox_7.setSelected(true);
		}
		else
		{
			checkBox_7.setSelected(false);
		}
	}

	public void setNewEvaluateAll(String sString) {
		if (sString.equals("Y"))
		{
			checkBox_8.setSelected(true);
		}
		else
		{
			checkBox_8.setSelected(false);
		}
	}

	public void setNewErrorCode(String sString) {
		textField_25.setText(sString);
	}

	public void setNewErrorMessage(String sString) {
		textField_26.setText(sString);
	}

	public void setNewMaxIteration(String sString) {
		textField_27.setText(sString);
	}

	public void setNewProcessingMode(String sString) {
		textField_29.setText(sString);
	}

	public void setNewUIV(String sString) {
		textField_30.setText(sString);
	}

	public void setNewComments(String sString) {
		textField_32.setText(sString);
	}

	private String GetLowerCaseBranchType(String sString) {
		if (sString.equals("DEFAULT"))
		{
			return "Default";
		}
		if (sString.equals("DECISION"))
		{
			return "Condition";
		}
		if (sString.equals("ERROR_EXC"))
		{
			return "Error Exception";
		}
		if (sString.equals("CONNECTOR"))
		{
			return "Connector";
		}
		return "";
	}

	private String GetHigherCaseBranchType(String sString) {
		if (sString.equals("Default"))
		{
			return "DEFAULT";
		}
		if (sString.equals("Condition"))
		{
			return "DECISION";
		}
		if (sString.equals("ERROR_EXC"))
		{
			return "Error Exception";
		}
		if (sString.equals("Connector"))
		{
			return "CONNECTOR";
		}
		return "";
	}

	private String GetLowerCaseOperation(String sString) {
		if (sString.equals("INSERT"))
		{
			return "Insert";
		}
		if (sString.equals("UPDATE"))
		{
			return "Update";
		}
		if (sString.equals("QUERY"))
		{
			return "Query";
		}
		return "";
	}

	private String GetHigherCaseOperation(String sString) {
		if (sString.equals("Insert"))
		{
			return "INSERT";
		}
		if (sString.equals("Update"))
		{
			return "UPDATE";
		}
		if (sString.equals("Query"))
		{
			return "QUERY";
		}
		return "";
	}

	private String GetLowerCaseIOType(String sString) {
		if (sString.equals("LITERAL"))
		{
			return "Literal";
		}
		if (sString.equals("PROPERTY"))
		{
			return "Process Property";
		}
		if (sString.equals("BUSCOMP"))
		{
			return "Business Component";
		}
		if (sString.equals("EXPRESSION"))
		{
			return "Expression";
		}
		if (sString.equals("ARGUMENT"))
		{
			return "Output Argument";
		}
		return "";
	}

	private String GetHigherCaseIOType(String sString) {
		if (sString.equals("Literal"))
		{
			return "LITERAL";
		}
		if (sString.equals("Process Property"))
		{
			return "PROPERTY";
		}
		if (sString.equals("Business Component"))
		{
			return "BUSCOMP";
		}
		if (sString.equals("Expression"))
		{
			return "EXPRESSION";
		}
		if (sString.equals("Output Argument"))
		{
			return "ARGUMENT";
		}
		return "";
	}

	private String GetIOName(String type, String step, String sSequence) {
		// return type + ":" + step + " 0" + sSequence + "0"; For Siebel 8
		return type + ":" + step + sSequence;
	}
}
