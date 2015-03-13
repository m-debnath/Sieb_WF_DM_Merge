import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.JOptionPane;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Dialog;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import com.rits.cloning.*;


public class EditBranchCriteria extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable table;
	private JTable table_1;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table_2;
	private JComboBox comboBox, comboBox_1,	comboBox_2,	comboBox_3;
	private JButton btnNew;

	public ArrayList<RepositoryWfBranchCriteria> LocalListOfRepositoryWfBranchCriteria;
	public boolean isDiscard;
	ArrayList<RepositoryWfProcessProp> listOfWfProcessProp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			EditBranchCriteria dialog = new EditBranchCriteria();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public EditBranchCriteria() {
		super();
	}
	public EditBranchCriteria(Dialog dialog, ArrayList<RepositoryWfProcessProp> listOfRepositoryWfProcessProp) {
		super(dialog, "Compose Condition Criteria", true);
		isDiscard = false;
		Cloner cloner = new Cloner();
		listOfWfProcessProp = cloner.deepClone(listOfRepositoryWfProcessProp);

		setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		setResizable(false);
		//setTitle("Compose Condition Criteria");
		setBounds(100, 100, 740, 580);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblConditions = new JLabel("Conditions");
		lblConditions.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblConditions.setBounds(10, 11, 94, 14);
		contentPanel.add(lblConditions);
		
		//JPanel panel = new JPanel();
		JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		splitPane.setBounds(10, 36, 710, 120);
		contentPanel.add(splitPane);
		//panel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		//panel.add(scrollPane, BorderLayout.WEST);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				JTable invoker = (JTable)arg0.getSource();
				if (invoker.getSelectedRow() != -1)
				{
					EditBranchCriteria.this.SetValueTable(invoker.getSelectedRow());
					EditBranchCriteria.this.SetValueTableEdit(invoker.getSelectedRow());
					EditBranchCriteria.this.SetRestOfFields(invoker.getSelectedRow());
				}
			}
		});
		table.setShowGrid(false);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Compare To", "Operation", "Object", "Field"
			}
		) {
			Class[] columnTypes = new Class[] {
				Object.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(120);
		table.getColumnModel().getColumn(1).setResizable(false);
		table.getColumnModel().getColumn(1).setPreferredWidth(200);
		table.getColumnModel().getColumn(2).setResizable(false);
		table.getColumnModel().getColumn(2).setPreferredWidth(150);
		table.getColumnModel().getColumn(3).setResizable(false);
		table.getColumnModel().getColumn(3).setPreferredWidth(300);
		table.setShowVerticalLines(false);
		table.setShowHorizontalLines(false);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setFont(new Font("Tahoma", Font.PLAIN, 10));
		scrollPane.setViewportView(table);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		//panel.add(scrollPane_1, BorderLayout.EAST);
		
		table_1 = new JTable();
		table_1.setShowGrid(false);
		table_1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		table_1.setShowHorizontalLines(false);
		table_1.setShowVerticalLines(false);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Value"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table_1.getColumnModel().getColumn(0).setResizable(false);
		table_1.getColumnModel().getColumn(0).setPreferredWidth(120);
		scrollPane_1.setViewportView(table_1);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (table.getRowCount() == 0)
						{
							String DisplayErrorMessage = "Can not set a conditional branch without any criteria!";
							JLabel lblmessage = new JLabel(DisplayErrorMessage);
							lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
							JOptionPane.showMessageDialog(EditBranchCriteria.this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
							return;
						}
						EditBranchCriteria.this.setVisible(false);
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						isDiscard = true;
						setVisible(false);
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		
	    splitPane.setLeftComponent(scrollPane);
	    splitPane.setRightComponent(scrollPane_1);
	    splitPane.setDividerLocation(600);
	    splitPane.setDividerSize(1);
	    
	    JPanel panel = new JPanel();
	    panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Compose a Condition", TitledBorder.LEADING, TitledBorder.TOP, new Font("Tahoma", Font.PLAIN, 10), new Color(0, 0, 0)));
	    panel.setBounds(10, 167, 710, 337);
	    contentPanel.add(panel);
	    panel.setLayout(null);
	    
	    JLabel lblCompareTo = new JLabel("Compare to");
	    lblCompareTo.setFont(new Font("Tahoma", Font.PLAIN, 10));
	    lblCompareTo.setBounds(10, 23, 116, 14);
	    panel.add(lblCompareTo);
	    
	    comboBox = new JComboBox();
	    comboBox.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		String compareTo = (String) comboBox.getSelectedItem();
	    		if (compareTo.equals("Process Property")) {
	    			comboBox_2.setEnabled(true);
	    			textField.setEditable(false);
	    			textField_1.setEditable(false);
	    			textField_2.setEditable(false);
	    			comboBox_3.setEnabled(false);
	    		}
	    		if (compareTo.equals("Applet")) {
	    			comboBox_2.setEnabled(false);
	    			textField.setEditable(true);
	    			textField_1.setEditable(true);
	    			textField_2.setEditable(true);
	    			comboBox_3.setEnabled(true);
	    		}
	    		if (compareTo.equals("Business Component")) {
	    			comboBox_2.setEnabled(false);
	    			textField.setEditable(false);
	    			textField_1.setEditable(true);
	    			textField_2.setEditable(true);
	    			comboBox_3.setEnabled(true);
	    		}
	    		if (compareTo.equals("Expression")) {
	    			comboBox_2.setEnabled(false);
	    			textField.setEditable(false);
	    			textField_1.setEditable(true);
	    			textField_2.setEditable(false);
	    			comboBox_3.setEnabled(false);
	    		}
	    	}
	    });
	    comboBox.setFont(new Font("Tahoma", Font.PLAIN, 10));
	    comboBox.setModel(new DefaultComboBoxModel(new String[] {"Applet", "Business Component", "Expression", "Process Property"}));
	    comboBox.setBounds(10, 48, 330, 20);
	    panel.add(comboBox);
	    
	    JLabel label = new JLabel("Operation");
	    label.setFont(new Font("Tahoma", Font.PLAIN, 10));
	    label.setBounds(370, 23, 116, 14);
	    panel.add(label);
	    
	    comboBox_1 = new JComboBox();
	    comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"All Must Match", "All Must Match (Ignore Case)", "Between", "Greater Than", "Is Not Null", "Is Null", "Less Than", "None Can Match", "None Can Match (Ignore Case)", "Not Between", "One Must Match", "One Must Match (Ignore Case)", "This Must Match", "This Must Match (Ignore Case)"}));
	    comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
	    comboBox_1.setBounds(370, 48, 330, 20);
	    panel.add(comboBox_1);
	    
	    JLabel lblProcessProperty = new JLabel("Process Property");
	    lblProcessProperty.setFont(new Font("Tahoma", Font.PLAIN, 10));
	    lblProcessProperty.setBounds(10, 79, 116, 14);
	    panel.add(lblProcessProperty);

		String [] procProp = new String[listOfRepositoryWfProcessProp.size()+1];
		procProp[0] = new String("");
		for (int i=0; i<listOfRepositoryWfProcessProp.size(); i++)
		{
			procProp[i+1] = listOfRepositoryWfProcessProp.get(i).Name2;
		}
	    
	    comboBox_2 = new JComboBox();
	    comboBox_2.setModel(new DefaultComboBoxModel(procProp));
	    comboBox_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
	    comboBox_2.setEnabled(false);
	    comboBox_2.setBounds(10, 104, 330, 20);
	    panel.add(comboBox_2);
	    
	    JLabel lblAppletName = new JLabel("Applet Name");
	    lblAppletName.setFont(new Font("Tahoma", Font.PLAIN, 10));
	    lblAppletName.setBounds(10, 135, 116, 14);
	    panel.add(lblAppletName);
	    
	    textField = new JTextField();
	    textField.setFont(new Font("Tahoma", Font.PLAIN, 10));
	    textField.setBounds(10, 157, 330, 20);
	    panel.add(textField);
	    textField.setColumns(10);
	    
	    JLabel lblBusinessComponentName = new JLabel("Business Component Name");
	    lblBusinessComponentName.setFont(new Font("Tahoma", Font.PLAIN, 10));
	    lblBusinessComponentName.setBounds(10, 188, 198, 14);
	    panel.add(lblBusinessComponentName);
	    
	    textField_1 = new JTextField();
	    textField_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
	    textField_1.setColumns(10);
	    textField_1.setBounds(10, 210, 330, 20);
	    panel.add(textField_1);
	    
	    JLabel lblField = new JLabel("Field");
	    lblField.setFont(new Font("Tahoma", Font.PLAIN, 10));
	    lblField.setBounds(370, 188, 198, 14);
	    panel.add(lblField);
	    
	    textField_2 = new JTextField();
	    textField_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
	    textField_2.setColumns(10);
	    textField_2.setBounds(370, 210, 330, 20);
	    panel.add(textField_2);
	    
	    JLabel lblFieldDataType = new JLabel("Field Data Type");
	    lblFieldDataType.setFont(new Font("Tahoma", Font.PLAIN, 10));
	    lblFieldDataType.setBounds(370, 135, 116, 14);
	    panel.add(lblFieldDataType);
	    
	    comboBox_3 = new JComboBox();
	    comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"DTYPE_BOOL", "DTYPE_CURRENCY", "DTYPE_DATE", "DTYPE_DATETIME", "DTYPE_ID", "DTYPE_INTEGER", "DTYPE_NOTE", "DTYPE_NUMBER", "DTYPE_PHONE", "DTYPE_TEXT", "DTYPE_TIME", "DTYPE_UTCDATETIME"}));
	    comboBox_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
	    comboBox_3.setBounds(370, 157, 330, 20);
	    panel.add(comboBox_3);
	    
	    JLabel lblValues = new JLabel("Values");
	    lblValues.setFont(new Font("Tahoma", Font.PLAIN, 10));
	    lblValues.setBounds(10, 241, 94, 14);
	    panel.add(lblValues);
	    
	    JScrollPane scrollPane_2 = new JScrollPane();
	    scrollPane_2.setBounds(10, 260, 255, 66);
	    panel.add(scrollPane_2);
	    
	    table_2 = new JTable();
	    table_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
	    table_2.setShowGrid(false);
	    table_2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	    table_2.setShowVerticalLines(false);
	    table_2.setShowHorizontalLines(false);
	    table_2.setModel(new DefaultTableModel(
	    	new Object[][] {
	    	},
	    	new String[] {
	    		""
	    	}
	    ) {
	    	Class[] columnTypes = new Class[] {
	    		String.class
	    	};
	    	public Class getColumnClass(int columnIndex) {
	    		return columnTypes[columnIndex];
	    	}
	    	boolean[] columnEditables = new boolean[] {
	    		false
	    	};
	    	public boolean isCellEditable(int row, int column) {
	    		return columnEditables[column];
	    	}
	    });
	    table_2.getColumnModel().getColumn(0).setResizable(false);
	    scrollPane_2.setViewportView(table_2);
	    
	    JButton btnDelete = new JButton("Delete");
	    btnDelete.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent arg0) {
	    		if (table_2.getSelectedRow() == -1) {
					String DisplayErrorMessage = "Please select a value to delete!";
					JLabel lblmessage = new JLabel(DisplayErrorMessage);
					lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
					//System.out.println("NAme: " + getParent().getInvoker().getTopLevelAncestor());
					JOptionPane.showMessageDialog(EditBranchCriteria.this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
					return;
	    		}
	    		DefaultTableModel model = (DefaultTableModel)table_2.getModel();
				model.removeRow(table_2.getSelectedRow());
	    	}
	    });
	    btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 10));
	    btnDelete.setBounds(275, 308, 65, 18);
	    panel.add(btnDelete);
	    
	    btnNew = new JButton("New");
	    btnNew.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		String compareTo = (String) comboBox.getSelectedItem();
	    		String operation = (String) comboBox_1.getSelectedItem();
	    		String applet = textField.getText().trim();
	    		String bc = textField_1.getText().trim();
	    		String field = textField_2.getText().trim();
	    		boolean invalidNew = false;
	    		if (compareTo.equals("Applet")) {
	    			if (operation.equals("Is Not Null") || operation.equals("Is Null")) {
	    				invalidNew = true;
	    			}
	    			else {
	    				if (applet == null || applet.equals("") || bc == null || bc.equals("") || field == null || field.equals("")) {
	    					invalidNew = true;
	    				}
	    			}
	    		}
	    		else if (compareTo.equals("Process Property")) {
					String PP = (String) comboBox_2.getSelectedItem();
	    			if (operation.equals("Is Not Null") || operation.equals("Is Null") || PP == null || PP.equals("")) {
	    				invalidNew = true;
	    			}
	    		}
	    		else if (compareTo.equals("Business Component")) {
	    			if (operation.equals("Is Not Null") || operation.equals("Is Null")) {
	    				invalidNew = true;
	    			}
	    			else {
	    				if (bc == null || bc.equals("") || field == null || field.equals("")) {
	    					invalidNew = true;
	    				}
	    			}
	    		}
	    		else {
	    			if (operation.equals("Is Not Null") || operation.equals("Is Null")) {
	    				invalidNew = true;
	    			}
	    			else {
	    				if (bc == null || bc.equals("")) {
	    					invalidNew = true;
	    				}
	    			}
	    		}
	    		
	    		if (invalidNew) {
					String DisplayErrorMessage = "Can not enter new value! Please select appropriate composition first.";
					JLabel lblmessage = new JLabel(DisplayErrorMessage);
					lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
					//System.out.println("NAme: " + getParent().getInvoker().getTopLevelAncestor());
					JOptionPane.showMessageDialog(EditBranchCriteria.this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
					return;
	    		}
	    		EnterNewValue enterNewValue = new EnterNewValue(EditBranchCriteria.this);
	    		enterNewValue.setVisible(true);
	    		if (!enterNewValue.isDiscard) {
	    			String val = enterNewValue.val;
		    		String [] inp = new String [] {val};
					String dataType = new String("");
					if (compareTo.equals("Process Property"))
					{
		    			String PP = (String) comboBox_2.getSelectedItem();
						for (int i=0; i<listOfWfProcessProp.size(); i++)
						{
							if (PP.equals(listOfWfProcessProp.get(i).Name2))
							{
								dataType = listOfWfProcessProp.get(i).DataType;
								break;
							}
						}
					}
					else if (compareTo.equals("Applet") || compareTo.equals("Business Component"))
					{
		    			dataType = (String) comboBox_3.getSelectedItem();
					}
					
		    		boolean validFormat = true;
		    		if (dataType.equals("DTYPE_BOOL")) {
		    			if (val.equals("true") || val.equals("false")) {
		    				validFormat = true;
		    			}
		    			else {
		    				validFormat = false;
		    			}
		    		}
		    		if (dataType.equals("DTYPE_CURRENCY") || dataType.equals("DTYPE_INTEGER") || dataType.equals("DTYPE_NUMBER") || dataType.equals("NUMBER") || dataType.equals("PROPSET_CHILD")) {
		    			if (!isValidNumber(val)) {
		    				validFormat = false;
		    			}
		    		}
		    		if (dataType.equals("DTYPE_DATE") || dataType.equals("DTYPE_DATETIME") || dataType.equals("DTYPE_TIME")|| dataType.equals("DTYPE_UTCDATETIME") || dataType.equals("DATE")) {
		    			if (!isValidDate(val)) {
		    				validFormat = false;
		    			}
		    		}
		    		if (validFormat == true) {
		    			DefaultTableModel model = (DefaultTableModel)table_2.getModel();
						model.addRow(inp);
		    		}
		    		else {
		    			String DisplayErrorMessage = "Not a valid value for the designated Process Property / Field! Pleas re enter.";
						JLabel lblmessage = new JLabel(DisplayErrorMessage);
						lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
						//System.out.println("NAme: " + getParent().getInvoker().getTopLevelAncestor());
						JOptionPane.showMessageDialog(EditBranchCriteria.this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
						return;
		    		}
	    		}
	    	}
	    });
	    btnNew.setFont(new Font("Tahoma", Font.PLAIN, 10));
	    btnNew.setBounds(275, 288, 65, 18);
	    panel.add(btnNew);
	    
	    JButton btnAdd = new JButton("Add");
	    btnAdd.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
				RepositoryWfBranchCriteria RepEfBrnchCtr = new RepositoryWfBranchCriteria();
				int maxSequence = -1;
				for (int i=0; i<LocalListOfRepositoryWfBranchCriteria.size(); i++)
				{
					try
					{
						int seq = Integer.parseInt(LocalListOfRepositoryWfBranchCriteria.get(i).sSequence);
						if (seq > maxSequence)
						{
							maxSequence = seq;
						}						
					}
					catch (Exception ex)
					{
						ex.printStackTrace();
					}
				}

				maxSequence++;
				String newName = LocalListOfRepositoryWfBranchCriteria.get(0).Name2.substring(0,LocalListOfRepositoryWfBranchCriteria.get(0).Name2.length()-1);
				newName = newName + new Integer(maxSequence).toString();
				RepEfBrnchCtr.Name2 = newName;
				RepEfBrnchCtr.sSequence = new Integer(maxSequence).toString();

				String compareTo = (String) comboBox.getSelectedItem();
				String sOperation = (String) comboBox_1.getSelectedItem();
				String PropertyName = (String) comboBox_2.getSelectedItem();
				String AppletName = textField.getText().trim();
				String AppletFieldName = textField_2.getText().trim();
				String BusinessComponent = textField_1.getText().trim();
				String BusinessComponentField = textField_2.getText().trim();
				String dataType = new String("");
				if (compareTo.equals("Process Property"))
				{
					int selected = table.getSelectedRow();
					for (int i=0; i<listOfWfProcessProp.size(); i++)
					{
						if (PropertyName.equals(listOfWfProcessProp.get(i).Name2))
						{
							dataType = listOfWfProcessProp.get(i).DataType;
							break;
						}
					}
					if (PropertyName == null || PropertyName.equals(""))
					{
						String DisplayErrorMessage = "Invalid or missing data submitted: Process Property";
						JLabel lblmessage = new JLabel(DisplayErrorMessage);
						lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
						JOptionPane.showMessageDialog(EditBranchCriteria.this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
						return;
					}

					ArrayList<RepositoryWfBranchCriteriaValue> ListOfWfBranchCriteriaValue = new ArrayList<RepositoryWfBranchCriteriaValue>();
					if (sOperation.equals("Is Null") || sOperation.equals("Is Not Null"))
					{
						RepEfBrnchCtr.CompareTo = GetHigherCaseCompareTo(compareTo);
						RepEfBrnchCtr.sOperation = GetHigherCaseBranchCriteriaOperation(sOperation);
						RepEfBrnchCtr.PropertyName = PropertyName;
						RepEfBrnchCtr.AppletName = new String("");
						RepEfBrnchCtr.AppletFieldName = new String("");
						RepEfBrnchCtr.BusinessComponent = new String("");
						RepEfBrnchCtr.BusinessComponentField = new String("");
						RepEfBrnchCtr.SetListOfRepositoryWfBranchCriteriaValue(ListOfWfBranchCriteriaValue);
						LocalListOfRepositoryWfBranchCriteria.add(RepEfBrnchCtr);
						setWfBranchCriteria(LocalListOfRepositoryWfBranchCriteria);
						SetValueTable(LocalListOfRepositoryWfBranchCriteria.size()-1);
						SetValueTableEdit(LocalListOfRepositoryWfBranchCriteria.size()-1);
					}
					else if (sOperation.equals("Between") || sOperation.equals("Not Between"))
					{
						if (table_2.getRowCount() != 2)
						{
							String DisplayErrorMessage = "Only two values are allowed for selected operation!";
							JLabel lblmessage = new JLabel(DisplayErrorMessage);
							lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
							JOptionPane.showMessageDialog(EditBranchCriteria.this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
							return;
						}
						if (dataType.equals("NUMBER") || dataType.equals("PROPSET_CHILD"))
						{
							Integer [] number = new Integer [2];
							for (int i=0; i<table_2.getRowCount(); i++)
							{
								if (!isValidNumber((String) table_2.getValueAt(i,0)))
								{
									String DisplayErrorMessage = "Can not add. Given values are not valid numbers!";
									JLabel lblmessage = new JLabel(DisplayErrorMessage);
									lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
									JOptionPane.showMessageDialog(EditBranchCriteria.this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
									return;
								}
								try
								{
									number[i] = Integer.parseInt((String) table_2.getValueAt(i,0));
								}
								catch (Exception ex)
								{
									ex.printStackTrace();
								}
							}
							RepEfBrnchCtr.CompareTo = GetHigherCaseCompareTo(compareTo);
							RepEfBrnchCtr.sOperation = GetHigherCaseBranchCriteriaOperation(sOperation);
							RepEfBrnchCtr.PropertyName = PropertyName;
							RepEfBrnchCtr.AppletName = new String("");
							RepEfBrnchCtr.AppletFieldName = new String("");
							RepEfBrnchCtr.BusinessComponent = new String("");
							RepEfBrnchCtr.BusinessComponentField = new String("");
							RepositoryWfBranchCriteriaValue RpWfBrnchCrtrVL = new RepositoryWfBranchCriteriaValue();
							RpWfBrnchCrtrVL.LO_NUM1 = new Integer(Math.min(number[0], number[1])).toString();
							RpWfBrnchCrtrVL.HI_NUM1 = new Integer(Math.max(number[0], number[1])).toString();
							RpWfBrnchCrtrVL.sSequence = "1";
							RpWfBrnchCrtrVL.Name2 = RepEfBrnchCtr.Name2 + RpWfBrnchCrtrVL.sSequence;
							ListOfWfBranchCriteriaValue.add(RpWfBrnchCrtrVL);
							RepEfBrnchCtr.SetListOfRepositoryWfBranchCriteriaValue(ListOfWfBranchCriteriaValue);
							LocalListOfRepositoryWfBranchCriteria.add(RepEfBrnchCtr);
							setWfBranchCriteria(LocalListOfRepositoryWfBranchCriteria);
							SetValueTable(LocalListOfRepositoryWfBranchCriteria.size()-1);
							SetValueTableEdit(LocalListOfRepositoryWfBranchCriteria.size()-1);
						}
						else if (dataType.equals("DATE"))
						{
							java.util.Date [] date = new java.util.Date [2];
							java.text.ParsePosition pos = new java.text.ParsePosition(0);
							java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
							format.setLenient(false);
							for (int i=0; i<table_2.getRowCount(); i++)
							{
								if (!isValidDate((String) table_2.getValueAt(i,0)))
								{
									String DisplayErrorMessage = "Can not add. Given values are not valid dates!";
									JLabel lblmessage = new JLabel(DisplayErrorMessage);
									lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
									JOptionPane.showMessageDialog(EditBranchCriteria.this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
									return;
								}
								try
								{
									date[i] = format.parse((String) table_2.getValueAt(i,0));
								}
								catch (Exception ex)
								{
									ex.printStackTrace();
								}
							}
							RepEfBrnchCtr.CompareTo = GetHigherCaseCompareTo(compareTo);
							RepEfBrnchCtr.sOperation = GetHigherCaseBranchCriteriaOperation(sOperation);
							RepEfBrnchCtr.PropertyName = PropertyName;
							RepEfBrnchCtr.AppletName = new String("");
							RepEfBrnchCtr.AppletFieldName = new String("");
							RepEfBrnchCtr.BusinessComponent = new String("");
							RepEfBrnchCtr.BusinessComponentField = new String("");
							RepositoryWfBranchCriteriaValue RpWfBrnchCrtrVL = new RepositoryWfBranchCriteriaValue();
							RpWfBrnchCrtrVL.LO_DATE1 = format.format(minDate(date[0], date[1]));
							RpWfBrnchCrtrVL.HI_DATE1 = format.format(maxDate(date[0], date[1]));
							RpWfBrnchCrtrVL.sSequence = "1";
							RpWfBrnchCrtrVL.Name2 = RepEfBrnchCtr.Name2 + RpWfBrnchCrtrVL.sSequence;
							ListOfWfBranchCriteriaValue.add(RpWfBrnchCrtrVL);
							RepEfBrnchCtr.SetListOfRepositoryWfBranchCriteriaValue(ListOfWfBranchCriteriaValue);
							LocalListOfRepositoryWfBranchCriteria.add(RepEfBrnchCtr);
							setWfBranchCriteria(LocalListOfRepositoryWfBranchCriteria);
							SetValueTable(LocalListOfRepositoryWfBranchCriteria.size()-1);
							SetValueTableEdit(LocalListOfRepositoryWfBranchCriteria.size()-1);
						}
						else
						{
							String [] string = new String [2];
							for (int i=0; i<table_2.getRowCount(); i++)
							{
								string[i] = (String) table_2.getValueAt(i,0);
							}
							RepEfBrnchCtr.CompareTo = GetHigherCaseCompareTo(compareTo);
							RepEfBrnchCtr.sOperation = GetHigherCaseBranchCriteriaOperation(sOperation);
							RepEfBrnchCtr.PropertyName = PropertyName;
							RepEfBrnchCtr.AppletName = new String("");
							RepEfBrnchCtr.AppletFieldName = new String("");
							RepEfBrnchCtr.BusinessComponent = new String("");
							RepEfBrnchCtr.BusinessComponentField = new String("");
							RepositoryWfBranchCriteriaValue RpWfBrnchCrtrVL = new RepositoryWfBranchCriteriaValue();
							RpWfBrnchCrtrVL.LO_CHAR1 = minString(string[0], string[1]);
							RpWfBrnchCrtrVL.HI_CHAR1 = maxString(string[0], string[1]);
							RpWfBrnchCrtrVL.sSequence = "1";
							RpWfBrnchCrtrVL.Name2 = RepEfBrnchCtr.Name2 + RpWfBrnchCrtrVL.sSequence;
							ListOfWfBranchCriteriaValue.add(RpWfBrnchCrtrVL);
							RepEfBrnchCtr.SetListOfRepositoryWfBranchCriteriaValue(ListOfWfBranchCriteriaValue);
							LocalListOfRepositoryWfBranchCriteria.add(RepEfBrnchCtr);
							setWfBranchCriteria(LocalListOfRepositoryWfBranchCriteria);
							SetValueTable(LocalListOfRepositoryWfBranchCriteria.size()-1);
							SetValueTableEdit(LocalListOfRepositoryWfBranchCriteria.size()-1);
						}
					}
					else // other than nulls and betweens
					{
						if (table_2.getRowCount() == 0)
						{
							String DisplayErrorMessage = "You must enter some values for the selected operation!";
							JLabel lblmessage = new JLabel(DisplayErrorMessage);
							lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
							JOptionPane.showMessageDialog(EditBranchCriteria.this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
							return;
						}
						if (dataType.equals("NUMBER") || dataType.equals("PROPSET_CHILD"))
						{
							Integer [] number = new Integer [table_2.getRowCount()];
							for (int i=0; i<table_2.getRowCount(); i++)
							{
								if (!isValidNumber((String) table_2.getValueAt(i,0)))
								{
									String DisplayErrorMessage = "Can not add. Given values are not valid numbers!";
									JLabel lblmessage = new JLabel(DisplayErrorMessage);
									lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
									JOptionPane.showMessageDialog(EditBranchCriteria.this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
									return;
								}
								try
								{
									number[i] = Integer.parseInt((String) table_2.getValueAt(i,0));
								}
								catch (Exception ex)
								{
									ex.printStackTrace();
								}
								RepositoryWfBranchCriteriaValue RpWfBrnchCrtrVL = new RepositoryWfBranchCriteriaValue();
								RpWfBrnchCrtrVL.LO_NUM1 = new Integer(number[i]).toString();
								RpWfBrnchCrtrVL.sSequence = new Integer(i+1).toString();
								RpWfBrnchCrtrVL.Name2 = RepEfBrnchCtr.Name2 + RpWfBrnchCrtrVL.sSequence;
								ListOfWfBranchCriteriaValue.add(RpWfBrnchCrtrVL);
							}
							RepEfBrnchCtr.CompareTo = GetHigherCaseCompareTo(compareTo);
							RepEfBrnchCtr.sOperation = GetHigherCaseBranchCriteriaOperation(sOperation);
							RepEfBrnchCtr.PropertyName = PropertyName;
							RepEfBrnchCtr.AppletName = new String("");
							RepEfBrnchCtr.AppletFieldName = new String("");
							RepEfBrnchCtr.BusinessComponent = new String("");
							RepEfBrnchCtr.BusinessComponentField = new String("");
							RepEfBrnchCtr.SetListOfRepositoryWfBranchCriteriaValue(ListOfWfBranchCriteriaValue);
							LocalListOfRepositoryWfBranchCriteria.add(RepEfBrnchCtr);
							setWfBranchCriteria(LocalListOfRepositoryWfBranchCriteria);
							SetValueTable(LocalListOfRepositoryWfBranchCriteria.size()-1);
							SetValueTableEdit(LocalListOfRepositoryWfBranchCriteria.size()-1);
						}
						else if (dataType.equals("DATE"))
						{
							java.util.Date [] date = new java.util.Date [table_2.getRowCount()];
							java.text.ParsePosition pos = new java.text.ParsePosition(0);
							java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
							format.setLenient(false);
							for (int i=0; i<table_2.getRowCount(); i++)
							{
								if (!isValidDate((String) table_2.getValueAt(i,0)))
								{
									String DisplayErrorMessage = "Can not add. Given values are not valid dates!";
									JLabel lblmessage = new JLabel(DisplayErrorMessage);
									lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
									JOptionPane.showMessageDialog(EditBranchCriteria.this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
									return;
								}
								try
								{
									date[i] = format.parse((String) table_2.getValueAt(i,0));
								}
								catch (Exception ex)
								{
									ex.printStackTrace();
								}
								RepositoryWfBranchCriteriaValue RpWfBrnchCrtrVL = new RepositoryWfBranchCriteriaValue();
								RpWfBrnchCrtrVL.LO_DATE1 = format.format(date[i]);
								RpWfBrnchCrtrVL.sSequence = new Integer(i+1).toString();
								RpWfBrnchCrtrVL.Name2 = RepEfBrnchCtr.Name2 + RpWfBrnchCrtrVL.sSequence;
								ListOfWfBranchCriteriaValue.add(RpWfBrnchCrtrVL);
							}
							RepEfBrnchCtr.CompareTo = GetHigherCaseCompareTo(compareTo);
							RepEfBrnchCtr.sOperation = GetHigherCaseBranchCriteriaOperation(sOperation);
							RepEfBrnchCtr.PropertyName = PropertyName;
							RepEfBrnchCtr.AppletName = new String("");
							RepEfBrnchCtr.AppletFieldName = new String("");
							RepEfBrnchCtr.BusinessComponent = new String("");
							RepEfBrnchCtr.BusinessComponentField = new String("");
							RepEfBrnchCtr.SetListOfRepositoryWfBranchCriteriaValue(ListOfWfBranchCriteriaValue);
							LocalListOfRepositoryWfBranchCriteria.add(RepEfBrnchCtr);
							setWfBranchCriteria(LocalListOfRepositoryWfBranchCriteria);
							SetValueTable(LocalListOfRepositoryWfBranchCriteria.size()-1);
							SetValueTableEdit(LocalListOfRepositoryWfBranchCriteria.size()-1);
						}
						else
						{
							String [] string = new String [table_2.getRowCount()];
							for (int i=0; i<table_2.getRowCount(); i++)
							{
								string[i] = (String) table_2.getValueAt(i,0);
								RepositoryWfBranchCriteriaValue RpWfBrnchCrtrVL = new RepositoryWfBranchCriteriaValue();
								RpWfBrnchCrtrVL.LO_CHAR1 = string[i];
								RpWfBrnchCrtrVL.sSequence = new Integer(i+1).toString();
								RpWfBrnchCrtrVL.Name2 = RepEfBrnchCtr.Name2 + RpWfBrnchCrtrVL.sSequence;
								ListOfWfBranchCriteriaValue.add(RpWfBrnchCrtrVL);
							}
							RepEfBrnchCtr.CompareTo = GetHigherCaseCompareTo(compareTo);
							RepEfBrnchCtr.sOperation = GetHigherCaseBranchCriteriaOperation(sOperation);
							RepEfBrnchCtr.PropertyName = PropertyName;
							RepEfBrnchCtr.AppletName = new String("");
							RepEfBrnchCtr.AppletFieldName = new String("");
							RepEfBrnchCtr.BusinessComponent = new String("");
							RepEfBrnchCtr.BusinessComponentField = new String("");
							RepEfBrnchCtr.SetListOfRepositoryWfBranchCriteriaValue(ListOfWfBranchCriteriaValue);
							LocalListOfRepositoryWfBranchCriteria.add(RepEfBrnchCtr);
							setWfBranchCriteria(LocalListOfRepositoryWfBranchCriteria);
							SetValueTable(LocalListOfRepositoryWfBranchCriteria.size()-1);
							SetValueTableEdit(LocalListOfRepositoryWfBranchCriteria.size()-1);
						}
					}
				}
				else if (compareTo.equals("Applet"))
				{
					dataType = (String) comboBox_3.getSelectedItem();
					int selected = table.getSelectedRow();
					if (AppletName == null || AppletName.equals(""))
					{
						String DisplayErrorMessage = "Invalid or missing data submitted: Applet";
						JLabel lblmessage = new JLabel(DisplayErrorMessage);
						lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
						JOptionPane.showMessageDialog(EditBranchCriteria.this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
						return;
					}
					if (AppletFieldName == null || AppletFieldName.equals(""))
					{
						String DisplayErrorMessage = "Invalid or missing data submitted: Field";
						JLabel lblmessage = new JLabel(DisplayErrorMessage);
						lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
						JOptionPane.showMessageDialog(EditBranchCriteria.this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
						return;
					}
					if (BusinessComponent == null || BusinessComponent.equals(""))
					{
						String DisplayErrorMessage = "Invalid or missing data submitted: Business Component";
						JLabel lblmessage = new JLabel(DisplayErrorMessage);
						lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
						JOptionPane.showMessageDialog(EditBranchCriteria.this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
						return;
					}

					ArrayList<RepositoryWfBranchCriteriaValue> ListOfWfBranchCriteriaValue = new ArrayList<RepositoryWfBranchCriteriaValue>();
					if (sOperation.equals("Is Null") || sOperation.equals("Is Not Null"))
					{
						RepEfBrnchCtr.CompareTo = GetHigherCaseCompareTo(compareTo);
						RepEfBrnchCtr.sOperation = GetHigherCaseBranchCriteriaOperation(sOperation);
						RepEfBrnchCtr.AppletName = AppletName;
						RepEfBrnchCtr.AppletFieldName = AppletFieldName;
						RepEfBrnchCtr.BusinessComponent = BusinessComponent;
						RepEfBrnchCtr.BusinessComponentField = BusinessComponentField;
						RepEfBrnchCtr.PropertyName = new String("");
						RepEfBrnchCtr.SetListOfRepositoryWfBranchCriteriaValue(ListOfWfBranchCriteriaValue);
						LocalListOfRepositoryWfBranchCriteria.add(RepEfBrnchCtr);
						setWfBranchCriteria(LocalListOfRepositoryWfBranchCriteria);
						SetValueTable(LocalListOfRepositoryWfBranchCriteria.size()-1);
						SetValueTableEdit(LocalListOfRepositoryWfBranchCriteria.size()-1);
					}
					else if (sOperation.equals("Between") || sOperation.equals("Not Between"))
					{
						if (table_2.getRowCount() != 2)
						{
							String DisplayErrorMessage = "Only two values are allowed for selected operation!";
							JLabel lblmessage = new JLabel(DisplayErrorMessage);
							lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
							JOptionPane.showMessageDialog(EditBranchCriteria.this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
							return;
						}
						if (dataType.equals("DTYPE_CURRENCY") || dataType.equals("DTYPE_INTEGER") || dataType.equals("DTYPE_NUMBER"))
						{
							Integer [] number = new Integer [2];
							for (int i=0; i<table_2.getRowCount(); i++)
							{
								if (!isValidNumber((String) table_2.getValueAt(i,0)))
								{
									String DisplayErrorMessage = "Can not add. Given values are not valid numbers!";
									JLabel lblmessage = new JLabel(DisplayErrorMessage);
									lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
									JOptionPane.showMessageDialog(EditBranchCriteria.this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
									return;
								}
								try
								{
									number[i] = Integer.parseInt((String) table_2.getValueAt(i,0));
								}
								catch (Exception ex)
								{
									ex.printStackTrace();
								}
							}
							RepositoryWfBranchCriteriaValue RpWfBrnchCrtrVL = new RepositoryWfBranchCriteriaValue();
							RpWfBrnchCrtrVL.LO_NUM1 = new Integer(Math.min(number[0], number[1])).toString();
							RpWfBrnchCrtrVL.HI_NUM1 = new Integer(Math.max(number[0], number[1])).toString();
							RpWfBrnchCrtrVL.sSequence = "1";
							RpWfBrnchCrtrVL.Name2 = RepEfBrnchCtr.Name2 + RpWfBrnchCrtrVL.sSequence;
							ListOfWfBranchCriteriaValue.add(RpWfBrnchCrtrVL);
							RepEfBrnchCtr.CompareTo = GetHigherCaseCompareTo(compareTo);
							RepEfBrnchCtr.sOperation = GetHigherCaseBranchCriteriaOperation(sOperation);
							RepEfBrnchCtr.AppletName = AppletName;
							RepEfBrnchCtr.AppletFieldName = AppletFieldName;
							RepEfBrnchCtr.BusinessComponent = BusinessComponent;
							RepEfBrnchCtr.BusinessComponentField = BusinessComponentField;
							RepEfBrnchCtr.PropertyName = new String("");
							RepEfBrnchCtr.SetListOfRepositoryWfBranchCriteriaValue(ListOfWfBranchCriteriaValue);
							LocalListOfRepositoryWfBranchCriteria.add(RepEfBrnchCtr);
							setWfBranchCriteria(LocalListOfRepositoryWfBranchCriteria);
							SetValueTable(LocalListOfRepositoryWfBranchCriteria.size()-1);
							SetValueTableEdit(LocalListOfRepositoryWfBranchCriteria.size()-1);
						}
						else if (dataType.equals("DTYPE_DATE") || dataType.equals("DTYPE_DATETIME") || dataType.equals("DTYPE_TIME") || dataType.equals("DTYPE_UTCDATETIME"))
						{
							java.util.Date [] date = new java.util.Date [2];
							java.text.ParsePosition pos = new java.text.ParsePosition(0);
							java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
							format.setLenient(false);
							for (int i=0; i<table_2.getRowCount(); i++)
							{
								if (!isValidDate((String) table_2.getValueAt(i,0)))
								{
									String DisplayErrorMessage = "Can not add. Given values are not valid dates!";
									JLabel lblmessage = new JLabel(DisplayErrorMessage);
									lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
									JOptionPane.showMessageDialog(EditBranchCriteria.this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
									return;
								}
								try
								{
									date[i] = format.parse((String) table_2.getValueAt(i,0));
								}
								catch (Exception ex)
								{
									ex.printStackTrace();
								}
							}
							RepositoryWfBranchCriteriaValue RpWfBrnchCrtrVL = new RepositoryWfBranchCriteriaValue();
							RpWfBrnchCrtrVL.LO_DATE1 = format.format(minDate(date[0], date[1]));
							RpWfBrnchCrtrVL.HI_DATE1 = format.format(maxDate(date[0], date[1]));
							RpWfBrnchCrtrVL.sSequence = "1";
							RpWfBrnchCrtrVL.Name2 = RepEfBrnchCtr.Name2 + RpWfBrnchCrtrVL.sSequence;
							ListOfWfBranchCriteriaValue.add(RpWfBrnchCrtrVL);
							RepEfBrnchCtr.CompareTo = GetHigherCaseCompareTo(compareTo);
							RepEfBrnchCtr.sOperation = GetHigherCaseBranchCriteriaOperation(sOperation);
							RepEfBrnchCtr.AppletName = AppletName;
							RepEfBrnchCtr.AppletFieldName = AppletFieldName;
							RepEfBrnchCtr.BusinessComponent = BusinessComponent;
							RepEfBrnchCtr.BusinessComponentField = BusinessComponentField;
							RepEfBrnchCtr.PropertyName = new String("");
							RepEfBrnchCtr.SetListOfRepositoryWfBranchCriteriaValue(ListOfWfBranchCriteriaValue);
							LocalListOfRepositoryWfBranchCriteria.add(RepEfBrnchCtr);
							setWfBranchCriteria(LocalListOfRepositoryWfBranchCriteria);
							SetValueTable(LocalListOfRepositoryWfBranchCriteria.size()-1);
							SetValueTableEdit(LocalListOfRepositoryWfBranchCriteria.size()-1);
						}
						else
						{
							String [] string = new String [2];
							for (int i=0; i<table_2.getRowCount(); i++)
							{
								string[i] = (String) table_2.getValueAt(i,0);
							}
							RepositoryWfBranchCriteriaValue RpWfBrnchCrtrVL = new RepositoryWfBranchCriteriaValue();
							RpWfBrnchCrtrVL.LO_CHAR1 = minString(string[0], string[1]);
							RpWfBrnchCrtrVL.HI_CHAR1 = maxString(string[0], string[1]);
							RpWfBrnchCrtrVL.sSequence = "1";
							RpWfBrnchCrtrVL.Name2 = RepEfBrnchCtr.Name2 + RpWfBrnchCrtrVL.sSequence;
							ListOfWfBranchCriteriaValue.add(RpWfBrnchCrtrVL);
							RepEfBrnchCtr.CompareTo = GetHigherCaseCompareTo(compareTo);
							RepEfBrnchCtr.sOperation = GetHigherCaseBranchCriteriaOperation(sOperation);
							RepEfBrnchCtr.AppletName = AppletName;
							RepEfBrnchCtr.AppletFieldName = AppletFieldName;
							RepEfBrnchCtr.BusinessComponent = BusinessComponent;
							RepEfBrnchCtr.BusinessComponentField = BusinessComponentField;
							RepEfBrnchCtr.PropertyName = new String("");
							RepEfBrnchCtr.SetListOfRepositoryWfBranchCriteriaValue(ListOfWfBranchCriteriaValue);
							LocalListOfRepositoryWfBranchCriteria.add(RepEfBrnchCtr);
							setWfBranchCriteria(LocalListOfRepositoryWfBranchCriteria);
							SetValueTable(LocalListOfRepositoryWfBranchCriteria.size()-1);
							SetValueTableEdit(LocalListOfRepositoryWfBranchCriteria.size()-1);
						}
					}
					else // other than nulls and betweens
					{
						if (table_2.getRowCount() == 0)
						{
							String DisplayErrorMessage = "You must enter some values for the selected operation!";
							JLabel lblmessage = new JLabel(DisplayErrorMessage);
							lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
							JOptionPane.showMessageDialog(EditBranchCriteria.this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
							return;
						}
						if (dataType.equals("DTYPE_CURRENCY") || dataType.equals("DTYPE_INTEGER") || dataType.equals("DTYPE_NUMBER"))
						{
							Integer [] number = new Integer [table_2.getRowCount()];
							for (int i=0; i<table_2.getRowCount(); i++)
							{
								if (!isValidNumber((String) table_2.getValueAt(i,0)))
								{
									String DisplayErrorMessage = "Can not add. Given values are not valid numbers!";
									JLabel lblmessage = new JLabel(DisplayErrorMessage);
									lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
									JOptionPane.showMessageDialog(EditBranchCriteria.this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
									return;
								}
								try
								{
									number[i] = Integer.parseInt((String) table_2.getValueAt(i,0));
								}
								catch (Exception ex)
								{
									ex.printStackTrace();
								}
								RepositoryWfBranchCriteriaValue RpWfBrnchCrtrVL = new RepositoryWfBranchCriteriaValue();
								RpWfBrnchCrtrVL.LO_NUM1 = new Integer(number[i]).toString();
								RpWfBrnchCrtrVL.sSequence = new Integer(i+1).toString();
								RpWfBrnchCrtrVL.Name2 = RepEfBrnchCtr.Name2 + RpWfBrnchCrtrVL.sSequence;
								ListOfWfBranchCriteriaValue.add(RpWfBrnchCrtrVL);
							}
							RepEfBrnchCtr.CompareTo = GetHigherCaseCompareTo(compareTo);
							RepEfBrnchCtr.sOperation = GetHigherCaseBranchCriteriaOperation(sOperation);
							RepEfBrnchCtr.AppletName = AppletName;
							RepEfBrnchCtr.AppletFieldName = AppletFieldName;
							RepEfBrnchCtr.BusinessComponent = BusinessComponent;
							RepEfBrnchCtr.BusinessComponentField = BusinessComponentField;
							RepEfBrnchCtr.PropertyName = new String("");
							RepEfBrnchCtr.SetListOfRepositoryWfBranchCriteriaValue(ListOfWfBranchCriteriaValue);
							LocalListOfRepositoryWfBranchCriteria.add(RepEfBrnchCtr);
							setWfBranchCriteria(LocalListOfRepositoryWfBranchCriteria);
							SetValueTable(LocalListOfRepositoryWfBranchCriteria.size()-1);
							SetValueTableEdit(LocalListOfRepositoryWfBranchCriteria.size()-1);
						}
						else if (dataType.equals("DTYPE_DATE") || dataType.equals("DTYPE_DATETIME") || dataType.equals("DTYPE_TIME") || dataType.equals("DTYPE_UTCDATETIME"))
						{
							java.util.Date [] date = new java.util.Date [table_2.getRowCount()];
							java.text.ParsePosition pos = new java.text.ParsePosition(0);
							java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
							format.setLenient(false);
							for (int i=0; i<table_2.getRowCount(); i++)
							{
								if (!isValidDate((String) table_2.getValueAt(i,0)))
								{
									String DisplayErrorMessage = "Can not add. Given values are not valid dates!";
									JLabel lblmessage = new JLabel(DisplayErrorMessage);
									lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
									JOptionPane.showMessageDialog(EditBranchCriteria.this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
									return;
								}
								try
								{
									date[i] = format.parse((String) table_2.getValueAt(i,0));
								}
								catch (Exception ex)
								{
									ex.printStackTrace();
								}
								RepositoryWfBranchCriteriaValue RpWfBrnchCrtrVL = new RepositoryWfBranchCriteriaValue();
								RpWfBrnchCrtrVL.LO_DATE1 = format.format(date[i]);
								RpWfBrnchCrtrVL.sSequence = new Integer(i+1).toString();
								RpWfBrnchCrtrVL.Name2 = RepEfBrnchCtr.Name2 + RpWfBrnchCrtrVL.sSequence;
								ListOfWfBranchCriteriaValue.add(RpWfBrnchCrtrVL);
							}
							RepEfBrnchCtr.CompareTo = GetHigherCaseCompareTo(compareTo);
							RepEfBrnchCtr.sOperation = GetHigherCaseBranchCriteriaOperation(sOperation);
							RepEfBrnchCtr.AppletName = AppletName;
							RepEfBrnchCtr.AppletFieldName = AppletFieldName;
							RepEfBrnchCtr.BusinessComponent = BusinessComponent;
							RepEfBrnchCtr.BusinessComponentField = BusinessComponentField;
							RepEfBrnchCtr.PropertyName = new String("");
							RepEfBrnchCtr.SetListOfRepositoryWfBranchCriteriaValue(ListOfWfBranchCriteriaValue);
							LocalListOfRepositoryWfBranchCriteria.add(RepEfBrnchCtr);
							setWfBranchCriteria(LocalListOfRepositoryWfBranchCriteria);
							SetValueTable(LocalListOfRepositoryWfBranchCriteria.size()-1);
							SetValueTableEdit(LocalListOfRepositoryWfBranchCriteria.size()-1);
						}
						else
						{
							String [] string = new String [table_2.getRowCount()];
							for (int i=0; i<table_2.getRowCount(); i++)
							{
								string[i] = (String) table_2.getValueAt(i,0);
								RepositoryWfBranchCriteriaValue RpWfBrnchCrtrVL = new RepositoryWfBranchCriteriaValue();
								RpWfBrnchCrtrVL.LO_CHAR1 = string[i];
								RpWfBrnchCrtrVL.sSequence = new Integer(i+1).toString();
								RpWfBrnchCrtrVL.Name2 = RepEfBrnchCtr.Name2 + RpWfBrnchCrtrVL.sSequence;
								ListOfWfBranchCriteriaValue.add(RpWfBrnchCrtrVL);
							}
							RepEfBrnchCtr.CompareTo = GetHigherCaseCompareTo(compareTo);
							RepEfBrnchCtr.sOperation = GetHigherCaseBranchCriteriaOperation(sOperation);
							RepEfBrnchCtr.AppletName = AppletName;
							RepEfBrnchCtr.AppletFieldName = AppletFieldName;
							RepEfBrnchCtr.BusinessComponent = BusinessComponent;
							RepEfBrnchCtr.BusinessComponentField = BusinessComponentField;
							RepEfBrnchCtr.PropertyName = new String("");
							RepEfBrnchCtr.SetListOfRepositoryWfBranchCriteriaValue(ListOfWfBranchCriteriaValue);
							LocalListOfRepositoryWfBranchCriteria.add(RepEfBrnchCtr);
							setWfBranchCriteria(LocalListOfRepositoryWfBranchCriteria);
							SetValueTable(LocalListOfRepositoryWfBranchCriteria.size()-1);
							SetValueTableEdit(LocalListOfRepositoryWfBranchCriteria.size()-1);
						}
					}
				}
				else if (compareTo.equals("Business Component"))
				{
					dataType = (String) comboBox_3.getSelectedItem();
					int selected = table.getSelectedRow();
					if (BusinessComponent == null || BusinessComponent.equals(""))
					{
						String DisplayErrorMessage = "Invalid or missing data submitted: Business Component";
						JLabel lblmessage = new JLabel(DisplayErrorMessage);
						lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
						JOptionPane.showMessageDialog(EditBranchCriteria.this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
						return;
					}
					if (BusinessComponentField == null || BusinessComponentField.equals(""))
					{
						String DisplayErrorMessage = "Invalid or missing data submitted: Field";
						JLabel lblmessage = new JLabel(DisplayErrorMessage);
						lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
						JOptionPane.showMessageDialog(EditBranchCriteria.this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
						return;
					}

					ArrayList<RepositoryWfBranchCriteriaValue> ListOfWfBranchCriteriaValue = new ArrayList<RepositoryWfBranchCriteriaValue>();
					if (sOperation.equals("Is Null") || sOperation.equals("Is Not Null"))
					{
						RepEfBrnchCtr.CompareTo = GetHigherCaseCompareTo(compareTo);
						RepEfBrnchCtr.sOperation = GetHigherCaseBranchCriteriaOperation(sOperation);
						RepEfBrnchCtr.BusinessComponent = BusinessComponent;
						RepEfBrnchCtr.BusinessComponentField = BusinessComponentField;
						RepEfBrnchCtr.PropertyName = new String("");
						RepEfBrnchCtr.AppletName = new String("");
						RepEfBrnchCtr.AppletFieldName = new String("");
						RepEfBrnchCtr.SetListOfRepositoryWfBranchCriteriaValue(ListOfWfBranchCriteriaValue);
						LocalListOfRepositoryWfBranchCriteria.add(RepEfBrnchCtr);
						setWfBranchCriteria(LocalListOfRepositoryWfBranchCriteria);
						SetValueTable(LocalListOfRepositoryWfBranchCriteria.size()-1);
						SetValueTableEdit(LocalListOfRepositoryWfBranchCriteria.size()-1);
					}
					else if (sOperation.equals("Between") || sOperation.equals("Not Between"))
					{
						if (table_2.getRowCount() != 2)
						{
							String DisplayErrorMessage = "Only two values are allowed for selected operation!";
							JLabel lblmessage = new JLabel(DisplayErrorMessage);
							lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
							JOptionPane.showMessageDialog(EditBranchCriteria.this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
							return;
						}
						if (dataType.equals("DTYPE_CURRENCY") || dataType.equals("DTYPE_INTEGER") || dataType.equals("DTYPE_NUMBER"))
						{
							Integer [] number = new Integer [2];
							for (int i=0; i<table_2.getRowCount(); i++)
							{
								if (!isValidNumber((String) table_2.getValueAt(i,0)))
								{
									String DisplayErrorMessage = "Can not add. Given values are not valid numbers!";
									JLabel lblmessage = new JLabel(DisplayErrorMessage);
									lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
									JOptionPane.showMessageDialog(EditBranchCriteria.this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
									return;
								}
								try
								{
									number[i] = Integer.parseInt((String) table_2.getValueAt(i,0));
								}
								catch (Exception ex)
								{
									ex.printStackTrace();
								}
							}
							RepositoryWfBranchCriteriaValue RpWfBrnchCrtrVL = new RepositoryWfBranchCriteriaValue();
							RpWfBrnchCrtrVL.LO_NUM1 = new Integer(Math.min(number[0], number[1])).toString();
							RpWfBrnchCrtrVL.HI_NUM1 = new Integer(Math.max(number[0], number[1])).toString();
							RpWfBrnchCrtrVL.sSequence = "1";
							RpWfBrnchCrtrVL.Name2 = RepEfBrnchCtr.Name2 + RpWfBrnchCrtrVL.sSequence;
							ListOfWfBranchCriteriaValue.add(RpWfBrnchCrtrVL);
							RepEfBrnchCtr.CompareTo = GetHigherCaseCompareTo(compareTo);
							RepEfBrnchCtr.sOperation = GetHigherCaseBranchCriteriaOperation(sOperation);
							RepEfBrnchCtr.BusinessComponent = BusinessComponent;
							RepEfBrnchCtr.BusinessComponentField = BusinessComponentField;
							RepEfBrnchCtr.PropertyName = new String("");
							RepEfBrnchCtr.AppletName = new String("");
							RepEfBrnchCtr.AppletFieldName = new String("");
							RepEfBrnchCtr.SetListOfRepositoryWfBranchCriteriaValue(ListOfWfBranchCriteriaValue);
							LocalListOfRepositoryWfBranchCriteria.add(RepEfBrnchCtr);
							setWfBranchCriteria(LocalListOfRepositoryWfBranchCriteria);
							SetValueTable(LocalListOfRepositoryWfBranchCriteria.size()-1);
							SetValueTableEdit(LocalListOfRepositoryWfBranchCriteria.size()-1);
						}
						else if (dataType.equals("DTYPE_DATE") || dataType.equals("DTYPE_DATETIME") || dataType.equals("DTYPE_TIME") || dataType.equals("DTYPE_UTCDATETIME"))
						{
							java.util.Date [] date = new java.util.Date [2];
							java.text.ParsePosition pos = new java.text.ParsePosition(0);
							java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
							format.setLenient(false);
							for (int i=0; i<table_2.getRowCount(); i++)
							{
								if (!isValidDate((String) table_2.getValueAt(i,0)))
								{
									String DisplayErrorMessage = "Can not add. Given values are not valid dates!";
									JLabel lblmessage = new JLabel(DisplayErrorMessage);
									lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
									JOptionPane.showMessageDialog(EditBranchCriteria.this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
									return;
								}
								try
								{
									date[i] = format.parse((String) table_2.getValueAt(i,0));
								}
								catch (Exception ex)
								{
									ex.printStackTrace();
								}
							}
							RepositoryWfBranchCriteriaValue RpWfBrnchCrtrVL = new RepositoryWfBranchCriteriaValue();
							RpWfBrnchCrtrVL.LO_DATE1 = format.format(minDate(date[0], date[1]));
							RpWfBrnchCrtrVL.HI_DATE1 = format.format(maxDate(date[0], date[1]));
							RpWfBrnchCrtrVL.sSequence = "1";
							RpWfBrnchCrtrVL.Name2 = RepEfBrnchCtr.Name2 + RpWfBrnchCrtrVL.sSequence;
							ListOfWfBranchCriteriaValue.add(RpWfBrnchCrtrVL);
							RepEfBrnchCtr.CompareTo = GetHigherCaseCompareTo(compareTo);
							RepEfBrnchCtr.sOperation = GetHigherCaseBranchCriteriaOperation(sOperation);
							RepEfBrnchCtr.BusinessComponent = BusinessComponent;
							RepEfBrnchCtr.BusinessComponentField = BusinessComponentField;
							RepEfBrnchCtr.PropertyName = new String("");
							RepEfBrnchCtr.AppletName = new String("");
							RepEfBrnchCtr.AppletFieldName = new String("");
							RepEfBrnchCtr.SetListOfRepositoryWfBranchCriteriaValue(ListOfWfBranchCriteriaValue);
							LocalListOfRepositoryWfBranchCriteria.add(RepEfBrnchCtr);
							setWfBranchCriteria(LocalListOfRepositoryWfBranchCriteria);
							SetValueTable(LocalListOfRepositoryWfBranchCriteria.size()-1);
							SetValueTableEdit(LocalListOfRepositoryWfBranchCriteria.size()-1);
						}
						else
						{
							String [] string = new String [2];
							for (int i=0; i<table_2.getRowCount(); i++)
							{
								string[i] = (String) table_2.getValueAt(i,0);
							}
							RepositoryWfBranchCriteriaValue RpWfBrnchCrtrVL = new RepositoryWfBranchCriteriaValue();
							RpWfBrnchCrtrVL.LO_CHAR1 = minString(string[0], string[1]);
							RpWfBrnchCrtrVL.HI_CHAR1 = maxString(string[0], string[1]);
							RpWfBrnchCrtrVL.sSequence = "1";
							RpWfBrnchCrtrVL.Name2 = RepEfBrnchCtr.Name2 + RpWfBrnchCrtrVL.sSequence;
							ListOfWfBranchCriteriaValue.add(RpWfBrnchCrtrVL);
							RepEfBrnchCtr.CompareTo = GetHigherCaseCompareTo(compareTo);
							RepEfBrnchCtr.sOperation = GetHigherCaseBranchCriteriaOperation(sOperation);
							RepEfBrnchCtr.BusinessComponent = BusinessComponent;
							RepEfBrnchCtr.BusinessComponentField = BusinessComponentField;
							RepEfBrnchCtr.PropertyName = new String("");
							RepEfBrnchCtr.AppletName = new String("");
							RepEfBrnchCtr.AppletFieldName = new String("");
							RepEfBrnchCtr.SetListOfRepositoryWfBranchCriteriaValue(ListOfWfBranchCriteriaValue);
							LocalListOfRepositoryWfBranchCriteria.add(RepEfBrnchCtr);
							setWfBranchCriteria(LocalListOfRepositoryWfBranchCriteria);
							SetValueTable(LocalListOfRepositoryWfBranchCriteria.size()-1);
							SetValueTableEdit(LocalListOfRepositoryWfBranchCriteria.size()-1);
						}
					}
					else // other than nulls and betweens
					{
						if (table_2.getRowCount() == 0)
						{
							String DisplayErrorMessage = "You must enter some values for the selected operation!";
							JLabel lblmessage = new JLabel(DisplayErrorMessage);
							lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
							JOptionPane.showMessageDialog(EditBranchCriteria.this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
							return;
						}
						if (dataType.equals("DTYPE_CURRENCY") || dataType.equals("DTYPE_INTEGER") || dataType.equals("DTYPE_NUMBER"))
						{
							Integer [] number = new Integer [table_2.getRowCount()];
							for (int i=0; i<table_2.getRowCount(); i++)
							{
								if (!isValidNumber((String) table_2.getValueAt(i,0)))
								{
									String DisplayErrorMessage = "Can not add. Given values are not valid numbers!";
									JLabel lblmessage = new JLabel(DisplayErrorMessage);
									lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
									JOptionPane.showMessageDialog(EditBranchCriteria.this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
									return;
								}
								try
								{
									number[i] = Integer.parseInt((String) table_2.getValueAt(i,0));
								}
								catch (Exception ex)
								{
									ex.printStackTrace();
								}
								RepositoryWfBranchCriteriaValue RpWfBrnchCrtrVL = new RepositoryWfBranchCriteriaValue();
								RpWfBrnchCrtrVL.LO_NUM1 = new Integer(number[i]).toString();
								RpWfBrnchCrtrVL.sSequence = new Integer(i+1).toString();
								RpWfBrnchCrtrVL.Name2 = RepEfBrnchCtr.Name2 + RpWfBrnchCrtrVL.sSequence;
								ListOfWfBranchCriteriaValue.add(RpWfBrnchCrtrVL);
							}
							RepEfBrnchCtr.CompareTo = GetHigherCaseCompareTo(compareTo);
							RepEfBrnchCtr.sOperation = GetHigherCaseBranchCriteriaOperation(sOperation);
							RepEfBrnchCtr.BusinessComponent = BusinessComponent;
							RepEfBrnchCtr.BusinessComponentField = BusinessComponentField;
							RepEfBrnchCtr.PropertyName = new String("");
							RepEfBrnchCtr.AppletName = new String("");
							RepEfBrnchCtr.AppletFieldName = new String("");
							RepEfBrnchCtr.SetListOfRepositoryWfBranchCriteriaValue(ListOfWfBranchCriteriaValue);
							LocalListOfRepositoryWfBranchCriteria.add(RepEfBrnchCtr);
							setWfBranchCriteria(LocalListOfRepositoryWfBranchCriteria);
							SetValueTable(LocalListOfRepositoryWfBranchCriteria.size()-1);
							SetValueTableEdit(LocalListOfRepositoryWfBranchCriteria.size()-1);
						}
						else if (dataType.equals("DTYPE_DATE") || dataType.equals("DTYPE_DATETIME") || dataType.equals("DTYPE_TIME") || dataType.equals("DTYPE_UTCDATETIME"))
						{
							java.util.Date [] date = new java.util.Date [table_2.getRowCount()];
							java.text.ParsePosition pos = new java.text.ParsePosition(0);
							java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
							format.setLenient(false);
							for (int i=0; i<table_2.getRowCount(); i++)
							{
								if (!isValidDate((String) table_2.getValueAt(i,0)))
								{
									String DisplayErrorMessage = "Can not add. Given values are not valid dates!";
									JLabel lblmessage = new JLabel(DisplayErrorMessage);
									lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
									JOptionPane.showMessageDialog(EditBranchCriteria.this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
									return;
								}
								try
								{
									date[i] = format.parse((String) table_2.getValueAt(i,0));
								}
								catch (Exception ex)
								{
									ex.printStackTrace();
								}
								RepositoryWfBranchCriteriaValue RpWfBrnchCrtrVL = new RepositoryWfBranchCriteriaValue();
								RpWfBrnchCrtrVL.LO_DATE1 = format.format(date[i]);
								RpWfBrnchCrtrVL.sSequence = new Integer(i+1).toString();
								RpWfBrnchCrtrVL.Name2 = RepEfBrnchCtr.Name2 + RpWfBrnchCrtrVL.sSequence;
								ListOfWfBranchCriteriaValue.add(RpWfBrnchCrtrVL);
							}
							RepEfBrnchCtr.CompareTo = GetHigherCaseCompareTo(compareTo);
							RepEfBrnchCtr.sOperation = GetHigherCaseBranchCriteriaOperation(sOperation);
							RepEfBrnchCtr.BusinessComponent = BusinessComponent;
							RepEfBrnchCtr.BusinessComponentField = BusinessComponentField;
							RepEfBrnchCtr.PropertyName = new String("");
							RepEfBrnchCtr.AppletName = new String("");
							RepEfBrnchCtr.AppletFieldName = new String("");
							RepEfBrnchCtr.SetListOfRepositoryWfBranchCriteriaValue(ListOfWfBranchCriteriaValue);
							LocalListOfRepositoryWfBranchCriteria.add(RepEfBrnchCtr);
							setWfBranchCriteria(LocalListOfRepositoryWfBranchCriteria);
							SetValueTable(LocalListOfRepositoryWfBranchCriteria.size()-1);
							SetValueTableEdit(LocalListOfRepositoryWfBranchCriteria.size()-1);
						}
						else
						{
							String [] string = new String [table_2.getRowCount()];
							for (int i=0; i<table_2.getRowCount(); i++)
							{
								string[i] = (String) table_2.getValueAt(i,0);
								RepositoryWfBranchCriteriaValue RpWfBrnchCrtrVL = new RepositoryWfBranchCriteriaValue();
								RpWfBrnchCrtrVL.LO_CHAR1 = string[i];
								RpWfBrnchCrtrVL.sSequence = new Integer(i+1).toString();
								RpWfBrnchCrtrVL.Name2 = RepEfBrnchCtr.Name2 + RpWfBrnchCrtrVL.sSequence;
								ListOfWfBranchCriteriaValue.add(RpWfBrnchCrtrVL);
							}
							RepEfBrnchCtr.CompareTo = GetHigherCaseCompareTo(compareTo);
							RepEfBrnchCtr.sOperation = GetHigherCaseBranchCriteriaOperation(sOperation);
							RepEfBrnchCtr.BusinessComponent = BusinessComponent;
							RepEfBrnchCtr.BusinessComponentField = BusinessComponentField;
							RepEfBrnchCtr.PropertyName = new String("");
							RepEfBrnchCtr.AppletName = new String("");
							RepEfBrnchCtr.AppletFieldName = new String("");
							RepEfBrnchCtr.SetListOfRepositoryWfBranchCriteriaValue(ListOfWfBranchCriteriaValue);
							LocalListOfRepositoryWfBranchCriteria.add(RepEfBrnchCtr);
							setWfBranchCriteria(LocalListOfRepositoryWfBranchCriteria);
							SetValueTable(LocalListOfRepositoryWfBranchCriteria.size()-1);
							SetValueTableEdit(LocalListOfRepositoryWfBranchCriteria.size()-1);
						}
					}
				}
				else // Expression
				{
					if (sOperation.equals("Between") || sOperation.equals("Not Between"))
					{
						String DisplayErrorMessage = "Operation can not be \'Between\' or \'Not Between\' when Compare To is \'Expression\'. Please re-try.";
						JLabel lblmessage = new JLabel(DisplayErrorMessage);
						lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
						JOptionPane.showMessageDialog(EditBranchCriteria.this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
						return;
					}
					int selected = table.getSelectedRow();
					if (BusinessComponent == null || BusinessComponent.equals(""))
					{
						String DisplayErrorMessage = "Invalid or missing data submitted: Business Component";
						JLabel lblmessage = new JLabel(DisplayErrorMessage);
						lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
						JOptionPane.showMessageDialog(EditBranchCriteria.this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
						return;
					}
					if (table_2.getRowCount() == 0)
					{
						String DisplayErrorMessage = "You must enter some values for the selected operation!";
						JLabel lblmessage = new JLabel(DisplayErrorMessage);
						lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
						JOptionPane.showMessageDialog(EditBranchCriteria.this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
						return;
					}

					ArrayList<RepositoryWfBranchCriteriaValue> ListOfWfBranchCriteriaValue = new ArrayList<RepositoryWfBranchCriteriaValue>();
					String [] string = new String [table_2.getRowCount()];
					for (int i=0; i<table_2.getRowCount(); i++)
					{
						string[i] = (String) table_2.getValueAt(i,0);
						RepositoryWfBranchCriteriaValue RpWfBrnchCrtrVL = new RepositoryWfBranchCriteriaValue();
						RpWfBrnchCrtrVL.LO_CHAR5 = string[i];
						RpWfBrnchCrtrVL.sSequence = new Integer(i+1).toString();
						RpWfBrnchCrtrVL.Name2 = RepEfBrnchCtr.Name2 + RpWfBrnchCrtrVL.sSequence;
						ListOfWfBranchCriteriaValue.add(RpWfBrnchCrtrVL);
					}
					RepEfBrnchCtr.CompareTo = GetHigherCaseCompareTo(compareTo);
					RepEfBrnchCtr.sOperation = GetHigherCaseBranchCriteriaOperation(sOperation);
					RepEfBrnchCtr.BusinessComponent = BusinessComponent;
					RepEfBrnchCtr.BusinessComponentField = new String("");
					RepEfBrnchCtr.PropertyName = new String("");
					RepEfBrnchCtr.AppletName = new String("");
					RepEfBrnchCtr.AppletFieldName = new String("");
					RepEfBrnchCtr.SetListOfRepositoryWfBranchCriteriaValue(ListOfWfBranchCriteriaValue);
					LocalListOfRepositoryWfBranchCriteria.add(RepEfBrnchCtr);
					setWfBranchCriteria(LocalListOfRepositoryWfBranchCriteria);
					SetValueTable(LocalListOfRepositoryWfBranchCriteria.size()-1);
					SetValueTableEdit(LocalListOfRepositoryWfBranchCriteria.size()-1);
				}
	    	}
	    });
	    btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 10));
	    btnAdd.setBounds(413, 268, 89, 23);
	    panel.add(btnAdd);
	    
	    JButton btnUpdate = new JButton("Update");
	    btnUpdate.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		if (table.getSelectedRow() == -1) {
					String DisplayErrorMessage = "Please select a criteria to update!";
					JLabel lblmessage = new JLabel(DisplayErrorMessage);
					lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
					JOptionPane.showMessageDialog(EditBranchCriteria.this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
					return;
	    		}
				String compareTo = (String) comboBox.getSelectedItem();
				String sOperation = (String) comboBox_1.getSelectedItem();
				String PropertyName = (String) comboBox_2.getSelectedItem();
				String AppletName = textField.getText().trim();
				String AppletFieldName = textField_2.getText().trim();
				String BusinessComponent = textField_1.getText().trim();
				String BusinessComponentField = textField_2.getText().trim();
				String dataType = new String("");
				if (compareTo.equals("Process Property"))
				{
					int selected = table.getSelectedRow();
					for (int i=0; i<listOfWfProcessProp.size(); i++)
					{
						if (PropertyName.equals(listOfWfProcessProp.get(i).Name2))
						{
							dataType = listOfWfProcessProp.get(i).DataType;
							break;
						}
					}
					if (PropertyName == null || PropertyName.equals(""))
					{
						String DisplayErrorMessage = "Invalid or missing data submitted: Process Property";
						JLabel lblmessage = new JLabel(DisplayErrorMessage);
						lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
						JOptionPane.showMessageDialog(EditBranchCriteria.this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
						return;
					}

					ArrayList<RepositoryWfBranchCriteriaValue> ListOfWfBranchCriteriaValue = new ArrayList<RepositoryWfBranchCriteriaValue>();
					if (sOperation.equals("Is Null") || sOperation.equals("Is Not Null"))
					{
						LocalListOfRepositoryWfBranchCriteria.get(selected).CompareTo = GetHigherCaseCompareTo(compareTo);
						LocalListOfRepositoryWfBranchCriteria.get(selected).sOperation = GetHigherCaseBranchCriteriaOperation(sOperation);
						LocalListOfRepositoryWfBranchCriteria.get(selected).PropertyName = PropertyName;
						LocalListOfRepositoryWfBranchCriteria.get(selected).AppletName = new String("");
						LocalListOfRepositoryWfBranchCriteria.get(selected).AppletFieldName = new String("");
						LocalListOfRepositoryWfBranchCriteria.get(selected).BusinessComponent = new String("");
						LocalListOfRepositoryWfBranchCriteria.get(selected).BusinessComponentField = new String("");
						LocalListOfRepositoryWfBranchCriteria.get(selected).SetListOfRepositoryWfBranchCriteriaValue(ListOfWfBranchCriteriaValue);
						setWfBranchCriteria(LocalListOfRepositoryWfBranchCriteria);
						SetValueTable(selected);
						SetValueTableEdit(selected);
					}
					else if (sOperation.equals("Between") || sOperation.equals("Not Between"))
					{
						if (table_2.getRowCount() != 2)
						{
							String DisplayErrorMessage = "Only two values are allowed for selected operation!";
							JLabel lblmessage = new JLabel(DisplayErrorMessage);
							lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
							JOptionPane.showMessageDialog(EditBranchCriteria.this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
							return;
						}
						if (dataType.equals("NUMBER") || dataType.equals("PROPSET_CHILD"))
						{
							Integer [] number = new Integer [2];
							for (int i=0; i<table_2.getRowCount(); i++)
							{
								if (!isValidNumber((String) table_2.getValueAt(i,0)))
								{
									String DisplayErrorMessage = "Can not update. Given values are not valid numbers!";
									JLabel lblmessage = new JLabel(DisplayErrorMessage);
									lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
									JOptionPane.showMessageDialog(EditBranchCriteria.this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
									return;
								}
								try
								{
									number[i] = Integer.parseInt((String) table_2.getValueAt(i,0));
								}
								catch (Exception ex)
								{
									ex.printStackTrace();
								}
							}
							RepositoryWfBranchCriteriaValue RpWfBrnchCrtrVL = new RepositoryWfBranchCriteriaValue();
							RpWfBrnchCrtrVL.LO_NUM1 = new Integer(Math.min(number[0], number[1])).toString();
							RpWfBrnchCrtrVL.HI_NUM1 = new Integer(Math.max(number[0], number[1])).toString();
							RpWfBrnchCrtrVL.Inactive = "N";
							RpWfBrnchCrtrVL.sSequence = "1";
							RpWfBrnchCrtrVL.Name2 = LocalListOfRepositoryWfBranchCriteria.get(selected).Name2 + RpWfBrnchCrtrVL.sSequence;
							ListOfWfBranchCriteriaValue.add(RpWfBrnchCrtrVL);
							LocalListOfRepositoryWfBranchCriteria.get(selected).CompareTo = GetHigherCaseCompareTo(compareTo);
							LocalListOfRepositoryWfBranchCriteria.get(selected).sOperation = GetHigherCaseBranchCriteriaOperation(sOperation);
							LocalListOfRepositoryWfBranchCriteria.get(selected).PropertyName = PropertyName;
							LocalListOfRepositoryWfBranchCriteria.get(selected).AppletName = new String("");
							LocalListOfRepositoryWfBranchCriteria.get(selected).AppletFieldName = new String("");
							LocalListOfRepositoryWfBranchCriteria.get(selected).BusinessComponent = new String("");
							LocalListOfRepositoryWfBranchCriteria.get(selected).BusinessComponentField = new String("");
							LocalListOfRepositoryWfBranchCriteria.get(selected).SetListOfRepositoryWfBranchCriteriaValue(ListOfWfBranchCriteriaValue);
							setWfBranchCriteria(LocalListOfRepositoryWfBranchCriteria);
							SetValueTable(selected);
							SetValueTableEdit(selected);
						}
						else if (dataType.equals("DATE"))
						{
							java.util.Date [] date = new java.util.Date [2];
							java.text.ParsePosition pos = new java.text.ParsePosition(0);
							java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
							format.setLenient(false);
							for (int i=0; i<table_2.getRowCount(); i++)
							{
								if (!isValidDate((String) table_2.getValueAt(i,0)))
								{
									String DisplayErrorMessage = "Can not update. Given values are not valid dates!";
									JLabel lblmessage = new JLabel(DisplayErrorMessage);
									lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
									JOptionPane.showMessageDialog(EditBranchCriteria.this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
									return;
								}
								try
								{
									date[i] = format.parse((String) table_2.getValueAt(i,0));
								}
								catch (Exception ex)
								{
									ex.printStackTrace();
								}
							}
							RepositoryWfBranchCriteriaValue RpWfBrnchCrtrVL = new RepositoryWfBranchCriteriaValue();
							RpWfBrnchCrtrVL.LO_DATE1 = format.format(minDate(date[0], date[1]));
							RpWfBrnchCrtrVL.HI_DATE1 = format.format(maxDate(date[0], date[1]));
							RpWfBrnchCrtrVL.Inactive = "N";
							RpWfBrnchCrtrVL.sSequence = "1";
							RpWfBrnchCrtrVL.Name2 = LocalListOfRepositoryWfBranchCriteria.get(selected).Name2 + RpWfBrnchCrtrVL.sSequence;
							ListOfWfBranchCriteriaValue.add(RpWfBrnchCrtrVL);
							LocalListOfRepositoryWfBranchCriteria.get(selected).CompareTo = GetHigherCaseCompareTo(compareTo);
							LocalListOfRepositoryWfBranchCriteria.get(selected).sOperation = GetHigherCaseBranchCriteriaOperation(sOperation);
							LocalListOfRepositoryWfBranchCriteria.get(selected).PropertyName = PropertyName;
							LocalListOfRepositoryWfBranchCriteria.get(selected).AppletName = new String("");
							LocalListOfRepositoryWfBranchCriteria.get(selected).AppletFieldName = new String("");
							LocalListOfRepositoryWfBranchCriteria.get(selected).BusinessComponent = new String("");
							LocalListOfRepositoryWfBranchCriteria.get(selected).BusinessComponentField = new String("");
							LocalListOfRepositoryWfBranchCriteria.get(selected).SetListOfRepositoryWfBranchCriteriaValue(ListOfWfBranchCriteriaValue);
							setWfBranchCriteria(LocalListOfRepositoryWfBranchCriteria);
							SetValueTable(selected);
							SetValueTableEdit(selected);
						}
						else
						{
							String [] string = new String [2];
							for (int i=0; i<table_2.getRowCount(); i++)
							{
								string[i] = (String) table_2.getValueAt(i,0);
							}
							RepositoryWfBranchCriteriaValue RpWfBrnchCrtrVL = new RepositoryWfBranchCriteriaValue();
							RpWfBrnchCrtrVL.LO_CHAR1 = minString(string[0], string[1]);
							RpWfBrnchCrtrVL.HI_CHAR1 = maxString(string[0], string[1]);
							RpWfBrnchCrtrVL.Inactive = "N";
							RpWfBrnchCrtrVL.sSequence = "1";
							RpWfBrnchCrtrVL.Name2 = LocalListOfRepositoryWfBranchCriteria.get(selected).Name2 + RpWfBrnchCrtrVL.sSequence;
							ListOfWfBranchCriteriaValue.add(RpWfBrnchCrtrVL);
							LocalListOfRepositoryWfBranchCriteria.get(selected).CompareTo = GetHigherCaseCompareTo(compareTo);
							LocalListOfRepositoryWfBranchCriteria.get(selected).sOperation = GetHigherCaseBranchCriteriaOperation(sOperation);
							LocalListOfRepositoryWfBranchCriteria.get(selected).PropertyName = PropertyName;
							LocalListOfRepositoryWfBranchCriteria.get(selected).AppletName = new String("");
							LocalListOfRepositoryWfBranchCriteria.get(selected).AppletFieldName = new String("");
							LocalListOfRepositoryWfBranchCriteria.get(selected).BusinessComponent = new String("");
							LocalListOfRepositoryWfBranchCriteria.get(selected).BusinessComponentField = new String("");
							LocalListOfRepositoryWfBranchCriteria.get(selected).SetListOfRepositoryWfBranchCriteriaValue(ListOfWfBranchCriteriaValue);
							setWfBranchCriteria(LocalListOfRepositoryWfBranchCriteria);
							SetValueTable(selected);
							SetValueTableEdit(selected);
						}
					}
					else // other than nulls and betweens
					{
						if (table_2.getRowCount() == 0)
						{
							String DisplayErrorMessage = "You must enter some values for the selected operation!";
							JLabel lblmessage = new JLabel(DisplayErrorMessage);
							lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
							JOptionPane.showMessageDialog(EditBranchCriteria.this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
							return;
						}
						if (dataType.equals("NUMBER") || dataType.equals("PROPSET_CHILD"))
						{
							Integer [] number = new Integer [table_2.getRowCount()];
							for (int i=0; i<table_2.getRowCount(); i++)
							{
								if (!isValidNumber((String) table_2.getValueAt(i,0)))
								{
									String DisplayErrorMessage = "Can not update. Given values are not valid numbers!";
									JLabel lblmessage = new JLabel(DisplayErrorMessage);
									lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
									JOptionPane.showMessageDialog(EditBranchCriteria.this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
									return;
								}
								try
								{
									number[i] = Integer.parseInt((String) table_2.getValueAt(i,0));
								}
								catch (Exception ex)
								{
									ex.printStackTrace();
								}
								RepositoryWfBranchCriteriaValue RpWfBrnchCrtrVL = new RepositoryWfBranchCriteriaValue();
								RpWfBrnchCrtrVL.LO_NUM1 = new Integer(number[i]).toString();
								RpWfBrnchCrtrVL.Inactive = "N";
								RpWfBrnchCrtrVL.sSequence = new Integer(i+1).toString();
								RpWfBrnchCrtrVL.Name2 = LocalListOfRepositoryWfBranchCriteria.get(selected).Name2 + RpWfBrnchCrtrVL.sSequence;
								ListOfWfBranchCriteriaValue.add(RpWfBrnchCrtrVL);
							}
							LocalListOfRepositoryWfBranchCriteria.get(selected).CompareTo = GetHigherCaseCompareTo(compareTo);
							LocalListOfRepositoryWfBranchCriteria.get(selected).sOperation = GetHigherCaseBranchCriteriaOperation(sOperation);
							LocalListOfRepositoryWfBranchCriteria.get(selected).PropertyName = PropertyName;
							LocalListOfRepositoryWfBranchCriteria.get(selected).AppletName = new String("");
							LocalListOfRepositoryWfBranchCriteria.get(selected).AppletFieldName = new String("");
							LocalListOfRepositoryWfBranchCriteria.get(selected).BusinessComponent = new String("");
							LocalListOfRepositoryWfBranchCriteria.get(selected).BusinessComponentField = new String("");
							LocalListOfRepositoryWfBranchCriteria.get(selected).SetListOfRepositoryWfBranchCriteriaValue(ListOfWfBranchCriteriaValue);
							setWfBranchCriteria(LocalListOfRepositoryWfBranchCriteria);
							SetValueTable(selected);
							SetValueTableEdit(selected);
						}
						else if (dataType.equals("DATE"))
						{
							java.util.Date [] date = new java.util.Date [table_2.getRowCount()];
							java.text.ParsePosition pos = new java.text.ParsePosition(0);
							java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
							format.setLenient(false);
							for (int i=0; i<table_2.getRowCount(); i++)
							{
								if (!isValidDate((String) table_2.getValueAt(i,0)))
								{
									String DisplayErrorMessage = "Can not update. Given values are not valid dates!";
									JLabel lblmessage = new JLabel(DisplayErrorMessage);
									lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
									JOptionPane.showMessageDialog(EditBranchCriteria.this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
									return;
								}
								try
								{
									date[i] = format.parse((String) table_2.getValueAt(i,0));
								}
								catch (Exception ex)
								{
									ex.printStackTrace();
								}
								RepositoryWfBranchCriteriaValue RpWfBrnchCrtrVL = new RepositoryWfBranchCriteriaValue();
								RpWfBrnchCrtrVL.LO_DATE1 = format.format(date[i]);
								RpWfBrnchCrtrVL.Inactive = "N";
								RpWfBrnchCrtrVL.sSequence = new Integer(i+1).toString();
								RpWfBrnchCrtrVL.Name2 = LocalListOfRepositoryWfBranchCriteria.get(selected).Name2 + RpWfBrnchCrtrVL.sSequence;
								ListOfWfBranchCriteriaValue.add(RpWfBrnchCrtrVL);
							}
							LocalListOfRepositoryWfBranchCriteria.get(selected).CompareTo = GetHigherCaseCompareTo(compareTo);
							LocalListOfRepositoryWfBranchCriteria.get(selected).sOperation = GetHigherCaseBranchCriteriaOperation(sOperation);
							LocalListOfRepositoryWfBranchCriteria.get(selected).PropertyName = PropertyName;
							LocalListOfRepositoryWfBranchCriteria.get(selected).AppletName = new String("");
							LocalListOfRepositoryWfBranchCriteria.get(selected).AppletFieldName = new String("");
							LocalListOfRepositoryWfBranchCriteria.get(selected).BusinessComponent = new String("");
							LocalListOfRepositoryWfBranchCriteria.get(selected).BusinessComponentField = new String("");
							LocalListOfRepositoryWfBranchCriteria.get(selected).SetListOfRepositoryWfBranchCriteriaValue(ListOfWfBranchCriteriaValue);
							setWfBranchCriteria(LocalListOfRepositoryWfBranchCriteria);
							SetValueTable(selected);
							SetValueTableEdit(selected);
						}
						else
						{
							String [] string = new String [table_2.getRowCount()];
							for (int i=0; i<table_2.getRowCount(); i++)
							{
								string[i] = (String) table_2.getValueAt(i,0);
								RepositoryWfBranchCriteriaValue RpWfBrnchCrtrVL = new RepositoryWfBranchCriteriaValue();
								RpWfBrnchCrtrVL.LO_CHAR1 = string[i];
								RpWfBrnchCrtrVL.Inactive = "N";
								RpWfBrnchCrtrVL.sSequence = new Integer(i+1).toString();
								RpWfBrnchCrtrVL.Name2 = LocalListOfRepositoryWfBranchCriteria.get(selected).Name2 + RpWfBrnchCrtrVL.sSequence;
								ListOfWfBranchCriteriaValue.add(RpWfBrnchCrtrVL);
							}
							LocalListOfRepositoryWfBranchCriteria.get(selected).CompareTo = GetHigherCaseCompareTo(compareTo);
							LocalListOfRepositoryWfBranchCriteria.get(selected).sOperation = GetHigherCaseBranchCriteriaOperation(sOperation);
							LocalListOfRepositoryWfBranchCriteria.get(selected).PropertyName = PropertyName;
							LocalListOfRepositoryWfBranchCriteria.get(selected).AppletName = new String("");
							LocalListOfRepositoryWfBranchCriteria.get(selected).AppletFieldName = new String("");
							LocalListOfRepositoryWfBranchCriteria.get(selected).BusinessComponent = new String("");
							LocalListOfRepositoryWfBranchCriteria.get(selected).BusinessComponentField = new String("");
							LocalListOfRepositoryWfBranchCriteria.get(selected).SetListOfRepositoryWfBranchCriteriaValue(ListOfWfBranchCriteriaValue);
							setWfBranchCriteria(LocalListOfRepositoryWfBranchCriteria);
							SetValueTable(selected);
							SetValueTableEdit(selected);
						}
					}
				}
				else if (compareTo.equals("Applet"))
				{
					dataType = (String) comboBox_3.getSelectedItem();
					int selected = table.getSelectedRow();
					if (AppletName == null || AppletName.equals(""))
					{
						String DisplayErrorMessage = "Invalid or missing data submitted: Applet";
						JLabel lblmessage = new JLabel(DisplayErrorMessage);
						lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
						JOptionPane.showMessageDialog(EditBranchCriteria.this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
						return;
					}
					if (AppletFieldName == null || AppletFieldName.equals(""))
					{
						String DisplayErrorMessage = "Invalid or missing data submitted: Field";
						JLabel lblmessage = new JLabel(DisplayErrorMessage);
						lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
						JOptionPane.showMessageDialog(EditBranchCriteria.this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
						return;
					}
					if (BusinessComponent == null || BusinessComponent.equals(""))
					{
						String DisplayErrorMessage = "Invalid or missing data submitted: Business Component";
						JLabel lblmessage = new JLabel(DisplayErrorMessage);
						lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
						JOptionPane.showMessageDialog(EditBranchCriteria.this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
						return;
					}

					ArrayList<RepositoryWfBranchCriteriaValue> ListOfWfBranchCriteriaValue = new ArrayList<RepositoryWfBranchCriteriaValue>();
					if (sOperation.equals("Is Null") || sOperation.equals("Is Not Null"))
					{
						LocalListOfRepositoryWfBranchCriteria.get(selected).CompareTo = GetHigherCaseCompareTo(compareTo);
						LocalListOfRepositoryWfBranchCriteria.get(selected).sOperation = GetHigherCaseBranchCriteriaOperation(sOperation);
						LocalListOfRepositoryWfBranchCriteria.get(selected).AppletName = AppletName;
						LocalListOfRepositoryWfBranchCriteria.get(selected).AppletFieldName = AppletFieldName;
						LocalListOfRepositoryWfBranchCriteria.get(selected).BusinessComponent = BusinessComponent;
						LocalListOfRepositoryWfBranchCriteria.get(selected).BusinessComponentField = BusinessComponentField;
						LocalListOfRepositoryWfBranchCriteria.get(selected).PropertyName = new String("");
						LocalListOfRepositoryWfBranchCriteria.get(selected).SetListOfRepositoryWfBranchCriteriaValue(ListOfWfBranchCriteriaValue);
						setWfBranchCriteria(LocalListOfRepositoryWfBranchCriteria);
						SetValueTable(selected);
						SetValueTableEdit(selected);
					}
					else if (sOperation.equals("Between") || sOperation.equals("Not Between"))
					{
						if (table_2.getRowCount() != 2)
						{
							String DisplayErrorMessage = "Only two values are allowed for selected operation!";
							JLabel lblmessage = new JLabel(DisplayErrorMessage);
							lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
							JOptionPane.showMessageDialog(EditBranchCriteria.this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
							return;
						}
						if (dataType.equals("DTYPE_CURRENCY") || dataType.equals("DTYPE_INTEGER") || dataType.equals("DTYPE_NUMBER"))
						{
							Integer [] number = new Integer [2];
							for (int i=0; i<table_2.getRowCount(); i++)
							{
								if (!isValidNumber((String) table_2.getValueAt(i,0)))
								{
									String DisplayErrorMessage = "Can not update. Given values are not valid numbers!";
									JLabel lblmessage = new JLabel(DisplayErrorMessage);
									lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
									JOptionPane.showMessageDialog(EditBranchCriteria.this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
									return;
								}
								try
								{
									number[i] = Integer.parseInt((String) table_2.getValueAt(i,0));
								}
								catch (Exception ex)
								{
									ex.printStackTrace();
								}
							}
							RepositoryWfBranchCriteriaValue RpWfBrnchCrtrVL = new RepositoryWfBranchCriteriaValue();
							RpWfBrnchCrtrVL.LO_NUM1 = new Integer(Math.min(number[0], number[1])).toString();
							RpWfBrnchCrtrVL.HI_NUM1 = new Integer(Math.max(number[0], number[1])).toString();
							RpWfBrnchCrtrVL.Inactive = "N";
							RpWfBrnchCrtrVL.sSequence = "1";
							RpWfBrnchCrtrVL.Name2 = LocalListOfRepositoryWfBranchCriteria.get(selected).Name2 + RpWfBrnchCrtrVL.sSequence;
							ListOfWfBranchCriteriaValue.add(RpWfBrnchCrtrVL);
							LocalListOfRepositoryWfBranchCriteria.get(selected).CompareTo = GetHigherCaseCompareTo(compareTo);
							LocalListOfRepositoryWfBranchCriteria.get(selected).sOperation = GetHigherCaseBranchCriteriaOperation(sOperation);
							LocalListOfRepositoryWfBranchCriteria.get(selected).AppletName = AppletName;
							LocalListOfRepositoryWfBranchCriteria.get(selected).AppletFieldName = AppletFieldName;
							LocalListOfRepositoryWfBranchCriteria.get(selected).BusinessComponent = BusinessComponent;
							LocalListOfRepositoryWfBranchCriteria.get(selected).BusinessComponentField = BusinessComponentField;
							LocalListOfRepositoryWfBranchCriteria.get(selected).PropertyName = new String("");
							LocalListOfRepositoryWfBranchCriteria.get(selected).SetListOfRepositoryWfBranchCriteriaValue(ListOfWfBranchCriteriaValue);
							setWfBranchCriteria(LocalListOfRepositoryWfBranchCriteria);
							SetValueTable(selected);
							SetValueTableEdit(selected);
						}
						else if (dataType.equals("DTYPE_DATE") || dataType.equals("DTYPE_DATETIME") || dataType.equals("DTYPE_TIME") || dataType.equals("DTYPE_UTCDATETIME"))
						{
							java.util.Date [] date = new java.util.Date [2];
							java.text.ParsePosition pos = new java.text.ParsePosition(0);
							java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
							format.setLenient(false);
							for (int i=0; i<table_2.getRowCount(); i++)
							{
								if (!isValidDate((String) table_2.getValueAt(i,0)))
								{
									String DisplayErrorMessage = "Can not update. Given values are not valid dates!";
									JLabel lblmessage = new JLabel(DisplayErrorMessage);
									lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
									JOptionPane.showMessageDialog(EditBranchCriteria.this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
									return;
								}
								try
								{
									date[i] = format.parse((String) table_2.getValueAt(i,0));
								}
								catch (Exception ex)
								{
									ex.printStackTrace();
								}
							}
							RepositoryWfBranchCriteriaValue RpWfBrnchCrtrVL = new RepositoryWfBranchCriteriaValue();
							RpWfBrnchCrtrVL.LO_DATE1 = format.format(minDate(date[0], date[1]));
							RpWfBrnchCrtrVL.HI_DATE1 = format.format(maxDate(date[0], date[1]));
							RpWfBrnchCrtrVL.Inactive = "N";
							RpWfBrnchCrtrVL.sSequence = "1";
							RpWfBrnchCrtrVL.Name2 = LocalListOfRepositoryWfBranchCriteria.get(selected).Name2 + RpWfBrnchCrtrVL.sSequence;
							ListOfWfBranchCriteriaValue.add(RpWfBrnchCrtrVL);
							LocalListOfRepositoryWfBranchCriteria.get(selected).CompareTo = GetHigherCaseCompareTo(compareTo);
							LocalListOfRepositoryWfBranchCriteria.get(selected).sOperation = GetHigherCaseBranchCriteriaOperation(sOperation);
							LocalListOfRepositoryWfBranchCriteria.get(selected).AppletName = AppletName;
							LocalListOfRepositoryWfBranchCriteria.get(selected).AppletFieldName = AppletFieldName;
							LocalListOfRepositoryWfBranchCriteria.get(selected).BusinessComponent = BusinessComponent;
							LocalListOfRepositoryWfBranchCriteria.get(selected).BusinessComponentField = BusinessComponentField;
							LocalListOfRepositoryWfBranchCriteria.get(selected).PropertyName = new String("");
							LocalListOfRepositoryWfBranchCriteria.get(selected).SetListOfRepositoryWfBranchCriteriaValue(ListOfWfBranchCriteriaValue);
							setWfBranchCriteria(LocalListOfRepositoryWfBranchCriteria);
							SetValueTable(selected);
							SetValueTableEdit(selected);
						}
						else
						{
							String [] string = new String [2];
							for (int i=0; i<table_2.getRowCount(); i++)
							{
								string[i] = (String) table_2.getValueAt(i,0);
							}
							RepositoryWfBranchCriteriaValue RpWfBrnchCrtrVL = new RepositoryWfBranchCriteriaValue();
							RpWfBrnchCrtrVL.LO_CHAR1 = minString(string[0], string[1]);
							RpWfBrnchCrtrVL.HI_CHAR1 = maxString(string[0], string[1]);
							RpWfBrnchCrtrVL.Inactive = "N";
							RpWfBrnchCrtrVL.sSequence = "1";
							RpWfBrnchCrtrVL.Name2 = LocalListOfRepositoryWfBranchCriteria.get(selected).Name2 + RpWfBrnchCrtrVL.sSequence;
							ListOfWfBranchCriteriaValue.add(RpWfBrnchCrtrVL);
							LocalListOfRepositoryWfBranchCriteria.get(selected).CompareTo = GetHigherCaseCompareTo(compareTo);
							LocalListOfRepositoryWfBranchCriteria.get(selected).sOperation = GetHigherCaseBranchCriteriaOperation(sOperation);
							LocalListOfRepositoryWfBranchCriteria.get(selected).AppletName = AppletName;
							LocalListOfRepositoryWfBranchCriteria.get(selected).AppletFieldName = AppletFieldName;
							LocalListOfRepositoryWfBranchCriteria.get(selected).BusinessComponent = BusinessComponent;
							LocalListOfRepositoryWfBranchCriteria.get(selected).BusinessComponentField = BusinessComponentField;
							LocalListOfRepositoryWfBranchCriteria.get(selected).PropertyName = new String("");
							LocalListOfRepositoryWfBranchCriteria.get(selected).SetListOfRepositoryWfBranchCriteriaValue(ListOfWfBranchCriteriaValue);
							setWfBranchCriteria(LocalListOfRepositoryWfBranchCriteria);
							SetValueTable(selected);
							SetValueTableEdit(selected);
						}
					}
					else // other than nulls and betweens
					{
						if (table_2.getRowCount() == 0)
						{
							String DisplayErrorMessage = "You must enter some values for the selected operation!";
							JLabel lblmessage = new JLabel(DisplayErrorMessage);
							lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
							JOptionPane.showMessageDialog(EditBranchCriteria.this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
							return;
						}
						if (dataType.equals("DTYPE_CURRENCY") || dataType.equals("DTYPE_INTEGER") || dataType.equals("DTYPE_NUMBER"))
						{
							Integer [] number = new Integer [table_2.getRowCount()];
							for (int i=0; i<table_2.getRowCount(); i++)
							{
								if (!isValidNumber((String) table_2.getValueAt(i,0)))
								{
									String DisplayErrorMessage = "Can not update. Given values are not valid numbers!";
									JLabel lblmessage = new JLabel(DisplayErrorMessage);
									lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
									JOptionPane.showMessageDialog(EditBranchCriteria.this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
									return;
								}
								try
								{
									number[i] = Integer.parseInt((String) table_2.getValueAt(i,0));
								}
								catch (Exception ex)
								{
									ex.printStackTrace();
								}
								RepositoryWfBranchCriteriaValue RpWfBrnchCrtrVL = new RepositoryWfBranchCriteriaValue();
								RpWfBrnchCrtrVL.LO_NUM1 = new Integer(number[i]).toString();
								RpWfBrnchCrtrVL.Inactive = "N";
								RpWfBrnchCrtrVL.sSequence = new Integer(i+1).toString();
								RpWfBrnchCrtrVL.Name2 = LocalListOfRepositoryWfBranchCriteria.get(selected).Name2 + RpWfBrnchCrtrVL.sSequence;
								ListOfWfBranchCriteriaValue.add(RpWfBrnchCrtrVL);
							}
							LocalListOfRepositoryWfBranchCriteria.get(selected).CompareTo = GetHigherCaseCompareTo(compareTo);
							LocalListOfRepositoryWfBranchCriteria.get(selected).sOperation = GetHigherCaseBranchCriteriaOperation(sOperation);
							LocalListOfRepositoryWfBranchCriteria.get(selected).AppletName = AppletName;
							LocalListOfRepositoryWfBranchCriteria.get(selected).AppletFieldName = AppletFieldName;
							LocalListOfRepositoryWfBranchCriteria.get(selected).BusinessComponent = BusinessComponent;
							LocalListOfRepositoryWfBranchCriteria.get(selected).BusinessComponentField = BusinessComponentField;
							LocalListOfRepositoryWfBranchCriteria.get(selected).PropertyName = new String("");
							LocalListOfRepositoryWfBranchCriteria.get(selected).SetListOfRepositoryWfBranchCriteriaValue(ListOfWfBranchCriteriaValue);
							setWfBranchCriteria(LocalListOfRepositoryWfBranchCriteria);
							SetValueTable(selected);
							SetValueTableEdit(selected);
						}
						else if (dataType.equals("DTYPE_DATE") || dataType.equals("DTYPE_DATETIME") || dataType.equals("DTYPE_TIME") || dataType.equals("DTYPE_UTCDATETIME"))
						{
							java.util.Date [] date = new java.util.Date [table_2.getRowCount()];
							java.text.ParsePosition pos = new java.text.ParsePosition(0);
							java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
							format.setLenient(false);
							for (int i=0; i<table_2.getRowCount(); i++)
							{
								if (!isValidDate((String) table_2.getValueAt(i,0)))
								{
									String DisplayErrorMessage = "Can not update. Given values are not valid dates!";
									JLabel lblmessage = new JLabel(DisplayErrorMessage);
									lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
									JOptionPane.showMessageDialog(EditBranchCriteria.this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
									return;
								}
								try
								{
									date[i] = format.parse((String) table_2.getValueAt(i,0));
								}
								catch (Exception ex)
								{
									ex.printStackTrace();
								}
								RepositoryWfBranchCriteriaValue RpWfBrnchCrtrVL = new RepositoryWfBranchCriteriaValue();
								RpWfBrnchCrtrVL.LO_DATE1 = format.format(date[i]);
								RpWfBrnchCrtrVL.Inactive = "N";
								RpWfBrnchCrtrVL.sSequence = new Integer(i+1).toString();
								RpWfBrnchCrtrVL.Name2 = LocalListOfRepositoryWfBranchCriteria.get(selected).Name2 + RpWfBrnchCrtrVL.sSequence;
								ListOfWfBranchCriteriaValue.add(RpWfBrnchCrtrVL);
							}
							LocalListOfRepositoryWfBranchCriteria.get(selected).CompareTo = GetHigherCaseCompareTo(compareTo);
							LocalListOfRepositoryWfBranchCriteria.get(selected).sOperation = GetHigherCaseBranchCriteriaOperation(sOperation);
							LocalListOfRepositoryWfBranchCriteria.get(selected).AppletName = AppletName;
							LocalListOfRepositoryWfBranchCriteria.get(selected).AppletFieldName = AppletFieldName;
							LocalListOfRepositoryWfBranchCriteria.get(selected).BusinessComponent = BusinessComponent;
							LocalListOfRepositoryWfBranchCriteria.get(selected).BusinessComponentField = BusinessComponentField;
							LocalListOfRepositoryWfBranchCriteria.get(selected).PropertyName = new String("");
							LocalListOfRepositoryWfBranchCriteria.get(selected).SetListOfRepositoryWfBranchCriteriaValue(ListOfWfBranchCriteriaValue);
							setWfBranchCriteria(LocalListOfRepositoryWfBranchCriteria);
							SetValueTable(selected);
							SetValueTableEdit(selected);
						}
						else
						{
							String [] string = new String [table_2.getRowCount()];
							for (int i=0; i<table_2.getRowCount(); i++)
							{
								string[i] = (String) table_2.getValueAt(i,0);
								RepositoryWfBranchCriteriaValue RpWfBrnchCrtrVL = new RepositoryWfBranchCriteriaValue();
								RpWfBrnchCrtrVL.LO_CHAR1 = string[i];
								RpWfBrnchCrtrVL.Inactive = "N";
								RpWfBrnchCrtrVL.sSequence = new Integer(i+1).toString();
								RpWfBrnchCrtrVL.Name2 = LocalListOfRepositoryWfBranchCriteria.get(selected).Name2 + RpWfBrnchCrtrVL.sSequence;
								ListOfWfBranchCriteriaValue.add(RpWfBrnchCrtrVL);
							}
							LocalListOfRepositoryWfBranchCriteria.get(selected).CompareTo = GetHigherCaseCompareTo(compareTo);
							LocalListOfRepositoryWfBranchCriteria.get(selected).sOperation = GetHigherCaseBranchCriteriaOperation(sOperation);
							LocalListOfRepositoryWfBranchCriteria.get(selected).AppletName = AppletName;
							LocalListOfRepositoryWfBranchCriteria.get(selected).AppletFieldName = AppletFieldName;
							LocalListOfRepositoryWfBranchCriteria.get(selected).BusinessComponent = BusinessComponent;
							LocalListOfRepositoryWfBranchCriteria.get(selected).BusinessComponentField = BusinessComponentField;
							LocalListOfRepositoryWfBranchCriteria.get(selected).PropertyName = new String("");
							LocalListOfRepositoryWfBranchCriteria.get(selected).SetListOfRepositoryWfBranchCriteriaValue(ListOfWfBranchCriteriaValue);
							setWfBranchCriteria(LocalListOfRepositoryWfBranchCriteria);
							SetValueTable(selected);
							SetValueTableEdit(selected);
						}
					}
				}
				else if (compareTo.equals("Business Component"))
				{
					dataType = (String) comboBox_3.getSelectedItem();
					int selected = table.getSelectedRow();
					if (BusinessComponent == null || BusinessComponent.equals(""))
					{
						String DisplayErrorMessage = "Invalid or missing data submitted: Business Component";
						JLabel lblmessage = new JLabel(DisplayErrorMessage);
						lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
						JOptionPane.showMessageDialog(EditBranchCriteria.this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
						return;
					}
					if (BusinessComponentField == null || BusinessComponentField.equals(""))
					{
						String DisplayErrorMessage = "Invalid or missing data submitted: Field";
						JLabel lblmessage = new JLabel(DisplayErrorMessage);
						lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
						JOptionPane.showMessageDialog(EditBranchCriteria.this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
						return;
					}

					ArrayList<RepositoryWfBranchCriteriaValue> ListOfWfBranchCriteriaValue = new ArrayList<RepositoryWfBranchCriteriaValue>();
					if (sOperation.equals("Is Null") || sOperation.equals("Is Not Null"))
					{
						LocalListOfRepositoryWfBranchCriteria.get(selected).CompareTo = GetHigherCaseCompareTo(compareTo);
						LocalListOfRepositoryWfBranchCriteria.get(selected).sOperation = GetHigherCaseBranchCriteriaOperation(sOperation);
						LocalListOfRepositoryWfBranchCriteria.get(selected).BusinessComponent = BusinessComponent;
						LocalListOfRepositoryWfBranchCriteria.get(selected).BusinessComponentField = BusinessComponentField;
						LocalListOfRepositoryWfBranchCriteria.get(selected).PropertyName = new String("");
						LocalListOfRepositoryWfBranchCriteria.get(selected).AppletName = new String("");
						LocalListOfRepositoryWfBranchCriteria.get(selected).AppletFieldName = new String("");
						LocalListOfRepositoryWfBranchCriteria.get(selected).SetListOfRepositoryWfBranchCriteriaValue(ListOfWfBranchCriteriaValue);
						setWfBranchCriteria(LocalListOfRepositoryWfBranchCriteria);
						SetValueTable(selected);
						SetValueTableEdit(selected);
					}
					else if (sOperation.equals("Between") || sOperation.equals("Not Between"))
					{
						if (table_2.getRowCount() != 2)
						{
							String DisplayErrorMessage = "Only two values are allowed for selected operation!";
							JLabel lblmessage = new JLabel(DisplayErrorMessage);
							lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
							JOptionPane.showMessageDialog(EditBranchCriteria.this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
							return;
						}
						if (dataType.equals("DTYPE_CURRENCY") || dataType.equals("DTYPE_INTEGER") || dataType.equals("DTYPE_NUMBER"))
						{
							Integer [] number = new Integer [2];
							for (int i=0; i<table_2.getRowCount(); i++)
							{
								if (!isValidNumber((String) table_2.getValueAt(i,0)))
								{
									String DisplayErrorMessage = "Can not update. Given values are not valid numbers!";
									JLabel lblmessage = new JLabel(DisplayErrorMessage);
									lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
									JOptionPane.showMessageDialog(EditBranchCriteria.this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
									return;
								}
								try
								{
									number[i] = Integer.parseInt((String) table_2.getValueAt(i,0));
								}
								catch (Exception ex)
								{
									ex.printStackTrace();
								}
							}
							RepositoryWfBranchCriteriaValue RpWfBrnchCrtrVL = new RepositoryWfBranchCriteriaValue();
							RpWfBrnchCrtrVL.LO_NUM1 = new Integer(Math.min(number[0], number[1])).toString();
							RpWfBrnchCrtrVL.HI_NUM1 = new Integer(Math.max(number[0], number[1])).toString();
							RpWfBrnchCrtrVL.Inactive = "N";
							RpWfBrnchCrtrVL.sSequence = "1";
							RpWfBrnchCrtrVL.Name2 = LocalListOfRepositoryWfBranchCriteria.get(selected).Name2 + RpWfBrnchCrtrVL.sSequence;
							ListOfWfBranchCriteriaValue.add(RpWfBrnchCrtrVL);
							LocalListOfRepositoryWfBranchCriteria.get(selected).CompareTo = GetHigherCaseCompareTo(compareTo);
							LocalListOfRepositoryWfBranchCriteria.get(selected).sOperation = GetHigherCaseBranchCriteriaOperation(sOperation);
							LocalListOfRepositoryWfBranchCriteria.get(selected).BusinessComponent = BusinessComponent;
							LocalListOfRepositoryWfBranchCriteria.get(selected).BusinessComponentField = BusinessComponentField;
							LocalListOfRepositoryWfBranchCriteria.get(selected).PropertyName = new String("");
							LocalListOfRepositoryWfBranchCriteria.get(selected).AppletName = new String("");
							LocalListOfRepositoryWfBranchCriteria.get(selected).AppletFieldName = new String("");
							LocalListOfRepositoryWfBranchCriteria.get(selected).SetListOfRepositoryWfBranchCriteriaValue(ListOfWfBranchCriteriaValue);
							setWfBranchCriteria(LocalListOfRepositoryWfBranchCriteria);
							SetValueTable(selected);
							SetValueTableEdit(selected);
						}
						else if (dataType.equals("DTYPE_DATE") || dataType.equals("DTYPE_DATETIME") || dataType.equals("DTYPE_TIME") || dataType.equals("DTYPE_UTCDATETIME"))
						{
							java.util.Date [] date = new java.util.Date [2];
							java.text.ParsePosition pos = new java.text.ParsePosition(0);
							java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
							format.setLenient(false);
							for (int i=0; i<table_2.getRowCount(); i++)
							{
								if (!isValidDate((String) table_2.getValueAt(i,0)))
								{
									String DisplayErrorMessage = "Can not update. Given values are not valid dates!";
									JLabel lblmessage = new JLabel(DisplayErrorMessage);
									lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
									JOptionPane.showMessageDialog(EditBranchCriteria.this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
									return;
								}
								try
								{
									date[i] = format.parse((String) table_2.getValueAt(i,0));
								}
								catch (Exception ex)
								{
									ex.printStackTrace();
								}
							}
							RepositoryWfBranchCriteriaValue RpWfBrnchCrtrVL = new RepositoryWfBranchCriteriaValue();
							RpWfBrnchCrtrVL.LO_DATE1 = format.format(minDate(date[0], date[1]));
							RpWfBrnchCrtrVL.HI_DATE1 = format.format(maxDate(date[0], date[1]));
							RpWfBrnchCrtrVL.Inactive = "N";
							RpWfBrnchCrtrVL.sSequence = "1";
							RpWfBrnchCrtrVL.Name2 = LocalListOfRepositoryWfBranchCriteria.get(selected).Name2 + RpWfBrnchCrtrVL.sSequence;
							ListOfWfBranchCriteriaValue.add(RpWfBrnchCrtrVL);
							LocalListOfRepositoryWfBranchCriteria.get(selected).CompareTo = GetHigherCaseCompareTo(compareTo);
							LocalListOfRepositoryWfBranchCriteria.get(selected).sOperation = GetHigherCaseBranchCriteriaOperation(sOperation);
							LocalListOfRepositoryWfBranchCriteria.get(selected).BusinessComponent = BusinessComponent;
							LocalListOfRepositoryWfBranchCriteria.get(selected).BusinessComponentField = BusinessComponentField;
							LocalListOfRepositoryWfBranchCriteria.get(selected).PropertyName = new String("");
							LocalListOfRepositoryWfBranchCriteria.get(selected).AppletName = new String("");
							LocalListOfRepositoryWfBranchCriteria.get(selected).AppletFieldName = new String("");
							LocalListOfRepositoryWfBranchCriteria.get(selected).SetListOfRepositoryWfBranchCriteriaValue(ListOfWfBranchCriteriaValue);
							setWfBranchCriteria(LocalListOfRepositoryWfBranchCriteria);
							SetValueTable(selected);
							SetValueTableEdit(selected);
						}
						else
						{
							String [] string = new String [2];
							for (int i=0; i<table_2.getRowCount(); i++)
							{
								string[i] = (String) table_2.getValueAt(i,0);
							}
							RepositoryWfBranchCriteriaValue RpWfBrnchCrtrVL = new RepositoryWfBranchCriteriaValue();
							RpWfBrnchCrtrVL.LO_CHAR1 = minString(string[0], string[1]);
							RpWfBrnchCrtrVL.HI_CHAR1 = maxString(string[0], string[1]);
							RpWfBrnchCrtrVL.Inactive = "N";
							RpWfBrnchCrtrVL.sSequence = "1";
							RpWfBrnchCrtrVL.Name2 = LocalListOfRepositoryWfBranchCriteria.get(selected).Name2 + RpWfBrnchCrtrVL.sSequence;
							ListOfWfBranchCriteriaValue.add(RpWfBrnchCrtrVL);
							LocalListOfRepositoryWfBranchCriteria.get(selected).CompareTo = GetHigherCaseCompareTo(compareTo);
							LocalListOfRepositoryWfBranchCriteria.get(selected).sOperation = GetHigherCaseBranchCriteriaOperation(sOperation);
							LocalListOfRepositoryWfBranchCriteria.get(selected).BusinessComponent = BusinessComponent;
							LocalListOfRepositoryWfBranchCriteria.get(selected).BusinessComponentField = BusinessComponentField;
							LocalListOfRepositoryWfBranchCriteria.get(selected).PropertyName = new String("");
							LocalListOfRepositoryWfBranchCriteria.get(selected).AppletName = new String("");
							LocalListOfRepositoryWfBranchCriteria.get(selected).AppletFieldName = new String("");
							LocalListOfRepositoryWfBranchCriteria.get(selected).SetListOfRepositoryWfBranchCriteriaValue(ListOfWfBranchCriteriaValue);
							setWfBranchCriteria(LocalListOfRepositoryWfBranchCriteria);
							SetValueTable(selected);
							SetValueTableEdit(selected);
						}
					}
					else // other than nulls and betweens
					{
						if (table_2.getRowCount() == 0)
						{
							String DisplayErrorMessage = "You must enter some values for the selected operation!";
							JLabel lblmessage = new JLabel(DisplayErrorMessage);
							lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
							JOptionPane.showMessageDialog(EditBranchCriteria.this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
							return;
						}
						if (dataType.equals("DTYPE_CURRENCY") || dataType.equals("DTYPE_INTEGER") || dataType.equals("DTYPE_NUMBER"))
						{
							Integer [] number = new Integer [table_2.getRowCount()];
							for (int i=0; i<table_2.getRowCount(); i++)
							{
								if (!isValidNumber((String) table_2.getValueAt(i,0)))
								{
									String DisplayErrorMessage = "Can not update. Given values are not valid numbers!";
									JLabel lblmessage = new JLabel(DisplayErrorMessage);
									lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
									JOptionPane.showMessageDialog(EditBranchCriteria.this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
									return;
								}
								try
								{
									number[i] = Integer.parseInt((String) table_2.getValueAt(i,0));
								}
								catch (Exception ex)
								{
									ex.printStackTrace();
								}
								RepositoryWfBranchCriteriaValue RpWfBrnchCrtrVL = new RepositoryWfBranchCriteriaValue();
								RpWfBrnchCrtrVL.LO_NUM1 = new Integer(number[i]).toString();
								RpWfBrnchCrtrVL.Inactive = "N";
								RpWfBrnchCrtrVL.sSequence = new Integer(i+1).toString();
								RpWfBrnchCrtrVL.Name2 = LocalListOfRepositoryWfBranchCriteria.get(selected).Name2 + RpWfBrnchCrtrVL.sSequence;
								ListOfWfBranchCriteriaValue.add(RpWfBrnchCrtrVL);
							}
							LocalListOfRepositoryWfBranchCriteria.get(selected).CompareTo = GetHigherCaseCompareTo(compareTo);
							LocalListOfRepositoryWfBranchCriteria.get(selected).sOperation = GetHigherCaseBranchCriteriaOperation(sOperation);
							LocalListOfRepositoryWfBranchCriteria.get(selected).BusinessComponent = BusinessComponent;
							LocalListOfRepositoryWfBranchCriteria.get(selected).BusinessComponentField = BusinessComponentField;
							LocalListOfRepositoryWfBranchCriteria.get(selected).PropertyName = new String("");
							LocalListOfRepositoryWfBranchCriteria.get(selected).AppletName = new String("");
							LocalListOfRepositoryWfBranchCriteria.get(selected).AppletFieldName = new String("");
							LocalListOfRepositoryWfBranchCriteria.get(selected).SetListOfRepositoryWfBranchCriteriaValue(ListOfWfBranchCriteriaValue);
							setWfBranchCriteria(LocalListOfRepositoryWfBranchCriteria);
							SetValueTable(selected);
							SetValueTableEdit(selected);
						}
						else if (dataType.equals("DTYPE_DATE") || dataType.equals("DTYPE_DATETIME") || dataType.equals("DTYPE_TIME") || dataType.equals("DTYPE_UTCDATETIME"))
						{
							java.util.Date [] date = new java.util.Date [table_2.getRowCount()];
							java.text.ParsePosition pos = new java.text.ParsePosition(0);
							java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
							format.setLenient(false);
							for (int i=0; i<table_2.getRowCount(); i++)
							{
								if (!isValidDate((String) table_2.getValueAt(i,0)))
								{
									String DisplayErrorMessage = "Can not update. Given values are not valid dates!";
									JLabel lblmessage = new JLabel(DisplayErrorMessage);
									lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
									JOptionPane.showMessageDialog(EditBranchCriteria.this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
									return;
								}
								try
								{
									date[i] = format.parse((String) table_2.getValueAt(i,0));
								}
								catch (Exception ex)
								{
									ex.printStackTrace();
								}
								RepositoryWfBranchCriteriaValue RpWfBrnchCrtrVL = new RepositoryWfBranchCriteriaValue();
								RpWfBrnchCrtrVL.LO_DATE1 = format.format(date[i]);
								RpWfBrnchCrtrVL.Inactive = "N";
								RpWfBrnchCrtrVL.sSequence = new Integer(i+1).toString();
								RpWfBrnchCrtrVL.Name2 = LocalListOfRepositoryWfBranchCriteria.get(selected).Name2 + RpWfBrnchCrtrVL.sSequence;
								ListOfWfBranchCriteriaValue.add(RpWfBrnchCrtrVL);
							}
							LocalListOfRepositoryWfBranchCriteria.get(selected).CompareTo = GetHigherCaseCompareTo(compareTo);
							LocalListOfRepositoryWfBranchCriteria.get(selected).sOperation = GetHigherCaseBranchCriteriaOperation(sOperation);
							LocalListOfRepositoryWfBranchCriteria.get(selected).BusinessComponent = BusinessComponent;
							LocalListOfRepositoryWfBranchCriteria.get(selected).BusinessComponentField = BusinessComponentField;
							LocalListOfRepositoryWfBranchCriteria.get(selected).PropertyName = new String("");
							LocalListOfRepositoryWfBranchCriteria.get(selected).AppletName = new String("");
							LocalListOfRepositoryWfBranchCriteria.get(selected).AppletFieldName = new String("");
							LocalListOfRepositoryWfBranchCriteria.get(selected).SetListOfRepositoryWfBranchCriteriaValue(ListOfWfBranchCriteriaValue);
							setWfBranchCriteria(LocalListOfRepositoryWfBranchCriteria);
							SetValueTable(selected);
							SetValueTableEdit(selected);
						}
						else
						{
							String [] string = new String [table_2.getRowCount()];
							for (int i=0; i<table_2.getRowCount(); i++)
							{
								string[i] = (String) table_2.getValueAt(i,0);
								RepositoryWfBranchCriteriaValue RpWfBrnchCrtrVL = new RepositoryWfBranchCriteriaValue();
								RpWfBrnchCrtrVL.LO_CHAR1 = string[i];
								RpWfBrnchCrtrVL.Inactive = "N";
								RpWfBrnchCrtrVL.sSequence = new Integer(i+1).toString();
								RpWfBrnchCrtrVL.Name2 = LocalListOfRepositoryWfBranchCriteria.get(selected).Name2 + RpWfBrnchCrtrVL.sSequence;
								ListOfWfBranchCriteriaValue.add(RpWfBrnchCrtrVL);
							}
							LocalListOfRepositoryWfBranchCriteria.get(selected).CompareTo = GetHigherCaseCompareTo(compareTo);
							LocalListOfRepositoryWfBranchCriteria.get(selected).sOperation = GetHigherCaseBranchCriteriaOperation(sOperation);
							LocalListOfRepositoryWfBranchCriteria.get(selected).BusinessComponent = BusinessComponent;
							LocalListOfRepositoryWfBranchCriteria.get(selected).BusinessComponentField = BusinessComponentField;
							LocalListOfRepositoryWfBranchCriteria.get(selected).PropertyName = new String("");
							LocalListOfRepositoryWfBranchCriteria.get(selected).AppletName = new String("");
							LocalListOfRepositoryWfBranchCriteria.get(selected).AppletFieldName = new String("");
							LocalListOfRepositoryWfBranchCriteria.get(selected).SetListOfRepositoryWfBranchCriteriaValue(ListOfWfBranchCriteriaValue);
							setWfBranchCriteria(LocalListOfRepositoryWfBranchCriteria);
							SetValueTable(selected);
							SetValueTableEdit(selected);
						}
					}
				}
				else // Expression
				{
					if (sOperation.equals("Between") || sOperation.equals("Not Between"))
					{
						String DisplayErrorMessage = "Operation can not be \'Between\' or \'Not Between\' when Compare To is \'Expression\'. Please re-try.";
						JLabel lblmessage = new JLabel(DisplayErrorMessage);
						lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
						JOptionPane.showMessageDialog(EditBranchCriteria.this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
						return;
					}
					int selected = table.getSelectedRow();
					if (BusinessComponent == null || BusinessComponent.equals(""))
					{
						String DisplayErrorMessage = "Invalid or missing data submitted: Business Component";
						JLabel lblmessage = new JLabel(DisplayErrorMessage);
						lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
						JOptionPane.showMessageDialog(EditBranchCriteria.this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
						return;
					}
					if (table_2.getRowCount() == 0)
					{
						String DisplayErrorMessage = "You must enter some values for the selected operation!";
						JLabel lblmessage = new JLabel(DisplayErrorMessage);
						lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
						JOptionPane.showMessageDialog(EditBranchCriteria.this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
						return;
					}

					ArrayList<RepositoryWfBranchCriteriaValue> ListOfWfBranchCriteriaValue = new ArrayList<RepositoryWfBranchCriteriaValue>();
					String [] string = new String [table_2.getRowCount()];
					for (int i=0; i<table_2.getRowCount(); i++)
					{
						string[i] = (String) table_2.getValueAt(i,0);
						RepositoryWfBranchCriteriaValue RpWfBrnchCrtrVL = new RepositoryWfBranchCriteriaValue();
						RpWfBrnchCrtrVL.LO_CHAR5 = string[i];
						RpWfBrnchCrtrVL.Inactive = "N";
						RpWfBrnchCrtrVL.sSequence = new Integer(i+1).toString();
						RpWfBrnchCrtrVL.Name2 = LocalListOfRepositoryWfBranchCriteria.get(selected).Name2 + RpWfBrnchCrtrVL.sSequence;
						ListOfWfBranchCriteriaValue.add(RpWfBrnchCrtrVL);
					}
					LocalListOfRepositoryWfBranchCriteria.get(selected).CompareTo = GetHigherCaseCompareTo(compareTo);
					LocalListOfRepositoryWfBranchCriteria.get(selected).sOperation = GetHigherCaseBranchCriteriaOperation(sOperation);
					LocalListOfRepositoryWfBranchCriteria.get(selected).BusinessComponent = BusinessComponent;
					LocalListOfRepositoryWfBranchCriteria.get(selected).BusinessComponentField = new String("");
					LocalListOfRepositoryWfBranchCriteria.get(selected).PropertyName = new String("");
					LocalListOfRepositoryWfBranchCriteria.get(selected).AppletName = new String("");
					LocalListOfRepositoryWfBranchCriteria.get(selected).AppletFieldName = new String("");
					LocalListOfRepositoryWfBranchCriteria.get(selected).SetListOfRepositoryWfBranchCriteriaValue(ListOfWfBranchCriteriaValue);
					setWfBranchCriteria(LocalListOfRepositoryWfBranchCriteria);
					SetValueTable(selected);
					SetValueTableEdit(selected);
				}
	    	}
	    });
	    btnUpdate.setFont(new Font("Tahoma", Font.PLAIN, 10));
	    btnUpdate.setBounds(512, 268, 89, 23);
	    panel.add(btnUpdate);
	    
	    JButton btnDelete_1 = new JButton("Delete");
	    btnDelete_1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		if (table.getSelectedRow() == -1) {
					String DisplayErrorMessage = "Please select a criteria to delete!";
					JLabel lblmessage = new JLabel(DisplayErrorMessage);
					lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
					//System.out.println("NAme: " + getParent().getInvoker().getTopLevelAncestor());
					JOptionPane.showMessageDialog(EditBranchCriteria.this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
					return;
	    		}
				JOptionPane warningPane = new JOptionPane();
				String DisplayMessage = "Are you sure you want to delete the selected branch criteria?";
				JLabel lblmessage = new JLabel(DisplayMessage);
				lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
				int choice = warningPane.showConfirmDialog(EditBranchCriteria.this,lblmessage,"Confirm",JOptionPane.YES_NO_OPTION); // 0 for Yes, 1 for No
				if (choice == 1)
				{
					return;
				}
				
				LocalListOfRepositoryWfBranchCriteria.remove(table.getSelectedRow());
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.removeRow(table.getSelectedRow());
	    	}
	    });
	    btnDelete_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
	    btnDelete_1.setBounds(611, 268, 89, 23);
	    panel.add(btnDelete_1);
	    
	    JLabel label_1 = new JLabel("");
	    label_1.setBounds(502, 107, 46, 14);
	    panel.add(label_1);
	    
	    JLabel lblWarningChooseCorrect = new JLabel("Choose correct Field Data Type please.");
	    lblWarningChooseCorrect.setHorizontalAlignment(SwingConstants.RIGHT);
	    lblWarningChooseCorrect.setForeground(Color.RED);
	    lblWarningChooseCorrect.setFont(new Font("Tahoma", Font.PLAIN, 10));
	    lblWarningChooseCorrect.setBounds(450, 135, 250, 14);
	    panel.add(lblWarningChooseCorrect);
	    
	    JLabel lblWarningGiveProper = new JLabel("Give proper Applet name please.");
	    lblWarningGiveProper.setHorizontalAlignment(SwingConstants.RIGHT);
	    lblWarningGiveProper.setForeground(Color.RED);
	    lblWarningGiveProper.setFont(new Font("Tahoma", Font.PLAIN, 10));
	    lblWarningGiveProper.setBounds(90, 135, 250, 14);
	    panel.add(lblWarningGiveProper);
	    
	    JLabel lblWarningChooseAppropriate = new JLabel("Give proper BC name please.");
	    lblWarningChooseAppropriate.setHorizontalAlignment(SwingConstants.RIGHT);
	    lblWarningChooseAppropriate.setForeground(Color.RED);
	    lblWarningChooseAppropriate.setFont(new Font("Tahoma", Font.PLAIN, 10));
	    lblWarningChooseAppropriate.setBounds(90, 188, 250, 14);
	    panel.add(lblWarningChooseAppropriate);
	    
	    JLabel lblWarningGiveProper_1 = new JLabel("Give proper Field name please.");
	    lblWarningGiveProper_1.setHorizontalAlignment(SwingConstants.RIGHT);
	    lblWarningGiveProper_1.setForeground(Color.RED);
	    lblWarningGiveProper_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
	    lblWarningGiveProper_1.setBounds(450, 188, 250, 14);
	    panel.add(lblWarningGiveProper_1);
	    
	    JLabel lblWarningPleaseCross = new JLabel("Reminder. Please cross check Applet, BC, Field and Field Data Type.");
	    lblWarningPleaseCross.setHorizontalAlignment(SwingConstants.RIGHT);
	    lblWarningPleaseCross.setForeground(Color.RED);
	    lblWarningPleaseCross.setFont(new Font("Tahoma", Font.PLAIN, 10));
	    lblWarningPleaseCross.setBounds(313, 295, 387, 14);
	    panel.add(lblWarningPleaseCross);
	    
	    JLabel lblWrongInputIn = new JLabel("Wrong input in these fields will probably result in an INVALID Workflow.");
	    lblWrongInputIn.setHorizontalAlignment(SwingConstants.RIGHT);
	    lblWrongInputIn.setForeground(Color.RED);
	    lblWrongInputIn.setFont(new Font("Tahoma", Font.PLAIN, 10));
	    lblWrongInputIn.setBounds(313, 312, 387, 14);
	    panel.add(lblWrongInputIn);
	}
	
	private boolean isValidNumber(String sString) {
		try
		{
			if (sString == null || sString.equals(""))
			{
				return true;
			}
			float f = Float.parseFloat(sString);
			return true;
		}
		catch (IllegalArgumentException e)
		{
			return false;
		}
	}

	private boolean isValidDate(String sString) {
		java.text.ParsePosition pos = new java.text.ParsePosition(0);
		java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		format.setLenient(false);
		try
		{
			if (sString == null || sString.equals(""))
			{
				return true;
			}
			java.util.Date date = format.parse(sString, pos);
			if (date == null)
			{
				return false;
			}
			else
			{
				return true;
			}
		}
		catch (Exception e)
		{
			return false;
		}
	}

	private java.util.Date maxDate(java.util.Date date1, java.util.Date date2) {
		if (date1.after(date2))
		{
			return date1;
		}
		else
		{
			return date2;
		}
	}

	private java.util.Date minDate(java.util.Date date1, java.util.Date date2) {
		if (date1.before(date2))
		{
			return date1;
		}
		else
		{
			return date2;
		}
	}

	private String maxString(String string1, String string2) {
		int res = string1.compareTo(string2);
		if (res<0)
		{
			return string2;
		}
		else
		{
			return string1;
		}
	}

	private String minString(String string1, String string2) {
		int res = string1.compareTo(string2);
		if (res>0)
		{
			return string2;
		}
		else
		{
			return string1;
		}
	}

	public void setWfBranchCriteria(ArrayList<RepositoryWfBranchCriteria> ListOfRepositoryWfBranchCriteria) {
		Cloner cloner = new Cloner();
		LocalListOfRepositoryWfBranchCriteria = cloner.deepClone(ListOfRepositoryWfBranchCriteria);
		String [] inp = new String [4];
		DefaultTableModel model = (DefaultTableModel)table.getModel();
		while (model.getRowCount() > 0)
		{
			model.removeRow(0);
		}
		for (int i=0; i<LocalListOfRepositoryWfBranchCriteria.size(); i++)
		{
			inp[0] = GetLowerCaseCompareTo(LocalListOfRepositoryWfBranchCriteria.get(i).CompareTo);
			inp[1] = GetLowerCaseBranchCriteriaOperation(LocalListOfRepositoryWfBranchCriteria.get(i).sOperation);
			if (LocalListOfRepositoryWfBranchCriteria.get(i).CompareTo.equals("PROPERTY"))
			{
				inp[2] = LocalListOfRepositoryWfBranchCriteria.get(i).PropertyName;
			}
			else
			{
				inp[2] = LocalListOfRepositoryWfBranchCriteria.get(i).BusinessComponent;
			}
			inp[3] = LocalListOfRepositoryWfBranchCriteria.get(i).BusinessComponentField;
			model.addRow(inp);
		}

		if (LocalListOfRepositoryWfBranchCriteria.get(0).GetListOfRepositoryWfBranchCriteriaValue().size()>0)
		{
			SetValueTable(0);
		}
	}

	private void SetValueTable(int SelectedIndex) {
		ArrayList<RepositoryWfBranchCriteriaValue> ListOfRepositoryWfBranchCriteriaValue = new ArrayList<RepositoryWfBranchCriteriaValue>(LocalListOfRepositoryWfBranchCriteria.get(SelectedIndex).GetListOfRepositoryWfBranchCriteriaValue());
		String [] inp = new String[1];
		DefaultTableModel model = (DefaultTableModel)table_1.getModel();
		while (model.getRowCount() > 0)
		{
			model.removeRow(0);
		}
		for (int i=0; i<ListOfRepositoryWfBranchCriteriaValue.size(); i++)
		{
			if (ListOfRepositoryWfBranchCriteriaValue.get(i).HI_CHAR1 != null && !ListOfRepositoryWfBranchCriteriaValue.get(i).HI_CHAR1.equals(""))
			{
				inp[0] = ListOfRepositoryWfBranchCriteriaValue.get(i).HI_CHAR1;
				model.addRow(inp);
			}
			if (ListOfRepositoryWfBranchCriteriaValue.get(i).HI_CHAR2 != null && !ListOfRepositoryWfBranchCriteriaValue.get(i).HI_CHAR2.equals(""))
			{
				inp[0] = ListOfRepositoryWfBranchCriteriaValue.get(i).HI_CHAR2;
				model.addRow(inp);
			}
			if (ListOfRepositoryWfBranchCriteriaValue.get(i).HI_CHAR3 != null && !ListOfRepositoryWfBranchCriteriaValue.get(i).HI_CHAR3.equals(""))
			{
				inp[0] = ListOfRepositoryWfBranchCriteriaValue.get(i).HI_CHAR3;
				model.addRow(inp);
			}
			if (ListOfRepositoryWfBranchCriteriaValue.get(i).HI_CHAR4 != null && !ListOfRepositoryWfBranchCriteriaValue.get(i).HI_CHAR4.equals(""))
			{
				inp[0] = ListOfRepositoryWfBranchCriteriaValue.get(i).HI_CHAR4;
				model.addRow(inp);
			}
			if (ListOfRepositoryWfBranchCriteriaValue.get(i).HI_DATE1 != null && !ListOfRepositoryWfBranchCriteriaValue.get(i).HI_DATE1.equals(""))
			{
				inp[0] = ListOfRepositoryWfBranchCriteriaValue.get(i).HI_DATE1;
				model.addRow(inp);
			}
			if (ListOfRepositoryWfBranchCriteriaValue.get(i).HI_DATE2 != null && !ListOfRepositoryWfBranchCriteriaValue.get(i).HI_DATE2.equals(""))
			{
				inp[0] = ListOfRepositoryWfBranchCriteriaValue.get(i).HI_DATE2;
				model.addRow(inp);
			}
			if (ListOfRepositoryWfBranchCriteriaValue.get(i).HI_DATE3 != null && !ListOfRepositoryWfBranchCriteriaValue.get(i).HI_DATE3.equals(""))
			{
				inp[0] = ListOfRepositoryWfBranchCriteriaValue.get(i).HI_DATE3;
				model.addRow(inp);
			}
			if (ListOfRepositoryWfBranchCriteriaValue.get(i).HI_DATE4 != null && !ListOfRepositoryWfBranchCriteriaValue.get(i).HI_DATE4.equals(""))
			{
				inp[0] = ListOfRepositoryWfBranchCriteriaValue.get(i).HI_DATE4;
				model.addRow(inp);
			}
			if (ListOfRepositoryWfBranchCriteriaValue.get(i).HI_NUM1 != null && !ListOfRepositoryWfBranchCriteriaValue.get(i).HI_NUM1.equals(""))
			{
				inp[0] = ListOfRepositoryWfBranchCriteriaValue.get(i).HI_NUM1;
				model.addRow(inp);
			}
			if (ListOfRepositoryWfBranchCriteriaValue.get(i).HI_NUM2 != null && !ListOfRepositoryWfBranchCriteriaValue.get(i).HI_NUM2.equals(""))
			{
				inp[0] = ListOfRepositoryWfBranchCriteriaValue.get(i).HI_NUM2;
				model.addRow(inp);
			}
			if (ListOfRepositoryWfBranchCriteriaValue.get(i).HI_NUM3 != null && !ListOfRepositoryWfBranchCriteriaValue.get(i).HI_NUM3.equals(""))
			{
				inp[0] = ListOfRepositoryWfBranchCriteriaValue.get(i).HI_NUM3;
				model.addRow(inp);
			}
			if (ListOfRepositoryWfBranchCriteriaValue.get(i).HI_NUM4 != null && !ListOfRepositoryWfBranchCriteriaValue.get(i).HI_NUM4.equals(""))
			{
				inp[0] = ListOfRepositoryWfBranchCriteriaValue.get(i).HI_NUM4;
				model.addRow(inp);
			}
			if (ListOfRepositoryWfBranchCriteriaValue.get(i).LO_CHAR1 != null && !ListOfRepositoryWfBranchCriteriaValue.get(i).LO_CHAR1.equals(""))
			{
				inp[0] = ListOfRepositoryWfBranchCriteriaValue.get(i).LO_CHAR1;
				model.addRow(inp);
			}
			if (ListOfRepositoryWfBranchCriteriaValue.get(i).LO_CHAR2 != null && !ListOfRepositoryWfBranchCriteriaValue.get(i).LO_CHAR2.equals(""))
			{
				inp[0] = ListOfRepositoryWfBranchCriteriaValue.get(i).LO_CHAR2;
				model.addRow(inp);
			}
			if (ListOfRepositoryWfBranchCriteriaValue.get(i).LO_CHAR3 != null && !ListOfRepositoryWfBranchCriteriaValue.get(i).LO_CHAR3.equals(""))
			{
				inp[0] = ListOfRepositoryWfBranchCriteriaValue.get(i).LO_CHAR3;
				model.addRow(inp);
			}
			if (ListOfRepositoryWfBranchCriteriaValue.get(i).LO_CHAR4 != null && !ListOfRepositoryWfBranchCriteriaValue.get(i).LO_CHAR4.equals(""))
			{
				inp[0] = ListOfRepositoryWfBranchCriteriaValue.get(i).LO_CHAR4;
				model.addRow(inp);
			}
			if (ListOfRepositoryWfBranchCriteriaValue.get(i).LO_CHAR5 != null && !ListOfRepositoryWfBranchCriteriaValue.get(i).LO_CHAR5.equals(""))
			{
				inp[0] = ListOfRepositoryWfBranchCriteriaValue.get(i).LO_CHAR5;
				model.addRow(inp);
			}
			if (ListOfRepositoryWfBranchCriteriaValue.get(i).LO_DATE1 != null && !ListOfRepositoryWfBranchCriteriaValue.get(i).LO_DATE1.equals(""))
			{
				inp[0] = ListOfRepositoryWfBranchCriteriaValue.get(i).LO_DATE1;
				model.addRow(inp);
			}
			if (ListOfRepositoryWfBranchCriteriaValue.get(i).LO_DATE2 != null && !ListOfRepositoryWfBranchCriteriaValue.get(i).LO_DATE2.equals(""))
			{
				inp[0] = ListOfRepositoryWfBranchCriteriaValue.get(i).LO_DATE2;
				model.addRow(inp);
			}
			if (ListOfRepositoryWfBranchCriteriaValue.get(i).LO_DATE3 != null && !ListOfRepositoryWfBranchCriteriaValue.get(i).LO_DATE3.equals(""))
			{
				inp[0] = ListOfRepositoryWfBranchCriteriaValue.get(i).LO_DATE3;
				model.addRow(inp);
			}
			if (ListOfRepositoryWfBranchCriteriaValue.get(i).LO_DATE4 != null && !ListOfRepositoryWfBranchCriteriaValue.get(i).LO_DATE4.equals(""))
			{
				inp[0] = ListOfRepositoryWfBranchCriteriaValue.get(i).LO_DATE4;
				model.addRow(inp);
			}
			if (ListOfRepositoryWfBranchCriteriaValue.get(i).LO_NUM1 != null && !ListOfRepositoryWfBranchCriteriaValue.get(i).LO_NUM1.equals(""))
			{
				inp[0] = ListOfRepositoryWfBranchCriteriaValue.get(i).LO_NUM1;
				model.addRow(inp);
			}
			if (ListOfRepositoryWfBranchCriteriaValue.get(i).LO_NUM2 != null && !ListOfRepositoryWfBranchCriteriaValue.get(i).LO_NUM2.equals(""))
			{
				inp[0] = ListOfRepositoryWfBranchCriteriaValue.get(i).LO_NUM2;
				model.addRow(inp);
			}
			if (ListOfRepositoryWfBranchCriteriaValue.get(i).LO_NUM3 != null && !ListOfRepositoryWfBranchCriteriaValue.get(i).LO_NUM3.equals(""))
			{
				inp[0] = ListOfRepositoryWfBranchCriteriaValue.get(i).LO_NUM3;
				model.addRow(inp);
			}
			if (ListOfRepositoryWfBranchCriteriaValue.get(i).LO_NUM4 != null && !ListOfRepositoryWfBranchCriteriaValue.get(i).LO_NUM4.equals(""))
			{
				inp[0] = ListOfRepositoryWfBranchCriteriaValue.get(i).LO_NUM4;
				model.addRow(inp);
			}
		}
	}

	private void SetRestOfFields(int SelectedIndex) {
		comboBox.setSelectedItem(GetLowerCaseCompareTo(LocalListOfRepositoryWfBranchCriteria.get(SelectedIndex).CompareTo));
		comboBox_1.setSelectedItem(GetLowerCaseBranchCriteriaOperation(LocalListOfRepositoryWfBranchCriteria.get(SelectedIndex).sOperation));
		String compare = (String) comboBox.getSelectedItem();
		if (compare.equals("Process Property")) {
			comboBox_2.setEnabled(true);
			textField.setEditable(false);
			textField_1.setEditable(false);
			textField_2.setEditable(false);
			comboBox_3.setEnabled(false);
			comboBox_2.setSelectedItem(LocalListOfRepositoryWfBranchCriteria.get(SelectedIndex).PropertyName);
		}
		if (compare.equals("Applet")) {
			comboBox_2.setEnabled(false);
			textField.setEditable(true);
			textField_1.setEditable(true);
			textField_2.setEditable(true);
			comboBox_3.setEnabled(true);
			textField.setText(LocalListOfRepositoryWfBranchCriteria.get(SelectedIndex).AppletName);
			textField_1.setText(LocalListOfRepositoryWfBranchCriteria.get(SelectedIndex).BusinessComponent);
			textField_2.setText(LocalListOfRepositoryWfBranchCriteria.get(SelectedIndex).AppletFieldName);
		}
		if (compare.equals("Business Component")) {
			comboBox_2.setEnabled(false);
			textField.setEditable(false);
			textField_1.setEditable(true);
			textField_2.setEditable(true);
			comboBox_3.setEnabled(true);
			textField.setText("");
			textField_1.setText(LocalListOfRepositoryWfBranchCriteria.get(SelectedIndex).BusinessComponent);
			textField_2.setText(LocalListOfRepositoryWfBranchCriteria.get(SelectedIndex).BusinessComponentField);
		}
		if (compare.equals("Expression")) {
			comboBox_2.setEnabled(false);
			textField.setEditable(false);
			textField_1.setEditable(true);
			textField_2.setEditable(false);
			comboBox_3.setEnabled(false);
			textField.setText("");
			textField_1.setText(LocalListOfRepositoryWfBranchCriteria.get(SelectedIndex).BusinessComponent);
			textField_2.setText("");
		}
	}

	private void SetValueTableEdit(int SelectedIndex) {
		ArrayList<RepositoryWfBranchCriteriaValue> ListOfRepositoryWfBranchCriteriaValue = new ArrayList<RepositoryWfBranchCriteriaValue>(LocalListOfRepositoryWfBranchCriteria.get(SelectedIndex).GetListOfRepositoryWfBranchCriteriaValue());
		String [] inp = new String[1];
		DefaultTableModel model = (DefaultTableModel)table_2.getModel();
		while (model.getRowCount() > 0)
		{
			model.removeRow(0);
		}
		for (int i=0; i<ListOfRepositoryWfBranchCriteriaValue.size(); i++)
		{
			if (ListOfRepositoryWfBranchCriteriaValue.get(i).HI_CHAR1 != null && !ListOfRepositoryWfBranchCriteriaValue.get(i).HI_CHAR1.equals(""))
			{
				inp[0] = ListOfRepositoryWfBranchCriteriaValue.get(i).HI_CHAR1;
				model.addRow(inp);
			}
			if (ListOfRepositoryWfBranchCriteriaValue.get(i).HI_CHAR2 != null && !ListOfRepositoryWfBranchCriteriaValue.get(i).HI_CHAR2.equals(""))
			{
				inp[0] = ListOfRepositoryWfBranchCriteriaValue.get(i).HI_CHAR2;
				model.addRow(inp);
			}
			if (ListOfRepositoryWfBranchCriteriaValue.get(i).HI_CHAR3 != null && !ListOfRepositoryWfBranchCriteriaValue.get(i).HI_CHAR3.equals(""))
			{
				inp[0] = ListOfRepositoryWfBranchCriteriaValue.get(i).HI_CHAR3;
				model.addRow(inp);
			}
			if (ListOfRepositoryWfBranchCriteriaValue.get(i).HI_CHAR4 != null && !ListOfRepositoryWfBranchCriteriaValue.get(i).HI_CHAR4.equals(""))
			{
				inp[0] = ListOfRepositoryWfBranchCriteriaValue.get(i).HI_CHAR4;
				model.addRow(inp);
			}
			if (ListOfRepositoryWfBranchCriteriaValue.get(i).HI_DATE1 != null && !ListOfRepositoryWfBranchCriteriaValue.get(i).HI_DATE1.equals(""))
			{
				inp[0] = ListOfRepositoryWfBranchCriteriaValue.get(i).HI_DATE1;
				model.addRow(inp);
			}
			if (ListOfRepositoryWfBranchCriteriaValue.get(i).HI_DATE2 != null && !ListOfRepositoryWfBranchCriteriaValue.get(i).HI_DATE2.equals(""))
			{
				inp[0] = ListOfRepositoryWfBranchCriteriaValue.get(i).HI_DATE2;
				model.addRow(inp);
			}
			if (ListOfRepositoryWfBranchCriteriaValue.get(i).HI_DATE3 != null && !ListOfRepositoryWfBranchCriteriaValue.get(i).HI_DATE3.equals(""))
			{
				inp[0] = ListOfRepositoryWfBranchCriteriaValue.get(i).HI_DATE3;
				model.addRow(inp);
			}
			if (ListOfRepositoryWfBranchCriteriaValue.get(i).HI_DATE4 != null && !ListOfRepositoryWfBranchCriteriaValue.get(i).HI_DATE4.equals(""))
			{
				inp[0] = ListOfRepositoryWfBranchCriteriaValue.get(i).HI_DATE4;
				model.addRow(inp);
			}
			if (ListOfRepositoryWfBranchCriteriaValue.get(i).HI_NUM1 != null && !ListOfRepositoryWfBranchCriteriaValue.get(i).HI_NUM1.equals(""))
			{
				inp[0] = ListOfRepositoryWfBranchCriteriaValue.get(i).HI_NUM1;
				model.addRow(inp);
			}
			if (ListOfRepositoryWfBranchCriteriaValue.get(i).HI_NUM2 != null && !ListOfRepositoryWfBranchCriteriaValue.get(i).HI_NUM2.equals(""))
			{
				inp[0] = ListOfRepositoryWfBranchCriteriaValue.get(i).HI_NUM2;
				model.addRow(inp);
			}
			if (ListOfRepositoryWfBranchCriteriaValue.get(i).HI_NUM3 != null && !ListOfRepositoryWfBranchCriteriaValue.get(i).HI_NUM3.equals(""))
			{
				inp[0] = ListOfRepositoryWfBranchCriteriaValue.get(i).HI_NUM3;
				model.addRow(inp);
			}
			if (ListOfRepositoryWfBranchCriteriaValue.get(i).HI_NUM4 != null && !ListOfRepositoryWfBranchCriteriaValue.get(i).HI_NUM4.equals(""))
			{
				inp[0] = ListOfRepositoryWfBranchCriteriaValue.get(i).HI_NUM4;
				model.addRow(inp);
			}
			if (ListOfRepositoryWfBranchCriteriaValue.get(i).LO_CHAR1 != null && !ListOfRepositoryWfBranchCriteriaValue.get(i).LO_CHAR1.equals(""))
			{
				inp[0] = ListOfRepositoryWfBranchCriteriaValue.get(i).LO_CHAR1;
				model.addRow(inp);
			}
			if (ListOfRepositoryWfBranchCriteriaValue.get(i).LO_CHAR2 != null && !ListOfRepositoryWfBranchCriteriaValue.get(i).LO_CHAR2.equals(""))
			{
				inp[0] = ListOfRepositoryWfBranchCriteriaValue.get(i).LO_CHAR2;
				model.addRow(inp);
			}
			if (ListOfRepositoryWfBranchCriteriaValue.get(i).LO_CHAR3 != null && !ListOfRepositoryWfBranchCriteriaValue.get(i).LO_CHAR3.equals(""))
			{
				inp[0] = ListOfRepositoryWfBranchCriteriaValue.get(i).LO_CHAR3;
				model.addRow(inp);
			}
			if (ListOfRepositoryWfBranchCriteriaValue.get(i).LO_CHAR4 != null && !ListOfRepositoryWfBranchCriteriaValue.get(i).LO_CHAR4.equals(""))
			{
				inp[0] = ListOfRepositoryWfBranchCriteriaValue.get(i).LO_CHAR4;
				model.addRow(inp);
			}
			if (ListOfRepositoryWfBranchCriteriaValue.get(i).LO_CHAR5 != null && !ListOfRepositoryWfBranchCriteriaValue.get(i).LO_CHAR5.equals(""))
			{
				inp[0] = ListOfRepositoryWfBranchCriteriaValue.get(i).LO_CHAR5;
				model.addRow(inp);
			}
			if (ListOfRepositoryWfBranchCriteriaValue.get(i).LO_DATE1 != null && !ListOfRepositoryWfBranchCriteriaValue.get(i).LO_DATE1.equals(""))
			{
				inp[0] = ListOfRepositoryWfBranchCriteriaValue.get(i).LO_DATE1;
				model.addRow(inp);
			}
			if (ListOfRepositoryWfBranchCriteriaValue.get(i).LO_DATE2 != null && !ListOfRepositoryWfBranchCriteriaValue.get(i).LO_DATE2.equals(""))
			{
				inp[0] = ListOfRepositoryWfBranchCriteriaValue.get(i).LO_DATE2;
				model.addRow(inp);
			}
			if (ListOfRepositoryWfBranchCriteriaValue.get(i).LO_DATE3 != null && !ListOfRepositoryWfBranchCriteriaValue.get(i).LO_DATE3.equals(""))
			{
				inp[0] = ListOfRepositoryWfBranchCriteriaValue.get(i).LO_DATE3;
				model.addRow(inp);
			}
			if (ListOfRepositoryWfBranchCriteriaValue.get(i).LO_DATE4 != null && !ListOfRepositoryWfBranchCriteriaValue.get(i).LO_DATE4.equals(""))
			{
				inp[0] = ListOfRepositoryWfBranchCriteriaValue.get(i).LO_DATE4;
				model.addRow(inp);
			}
			if (ListOfRepositoryWfBranchCriteriaValue.get(i).LO_NUM1 != null && !ListOfRepositoryWfBranchCriteriaValue.get(i).LO_NUM1.equals(""))
			{
				inp[0] = ListOfRepositoryWfBranchCriteriaValue.get(i).LO_NUM1;
				model.addRow(inp);
			}
			if (ListOfRepositoryWfBranchCriteriaValue.get(i).LO_NUM2 != null && !ListOfRepositoryWfBranchCriteriaValue.get(i).LO_NUM2.equals(""))
			{
				inp[0] = ListOfRepositoryWfBranchCriteriaValue.get(i).LO_NUM2;
				model.addRow(inp);
			}
			if (ListOfRepositoryWfBranchCriteriaValue.get(i).LO_NUM3 != null && !ListOfRepositoryWfBranchCriteriaValue.get(i).LO_NUM3.equals(""))
			{
				inp[0] = ListOfRepositoryWfBranchCriteriaValue.get(i).LO_NUM3;
				model.addRow(inp);
			}
			if (ListOfRepositoryWfBranchCriteriaValue.get(i).LO_NUM4 != null && !ListOfRepositoryWfBranchCriteriaValue.get(i).LO_NUM4.equals(""))
			{
				inp[0] = ListOfRepositoryWfBranchCriteriaValue.get(i).LO_NUM4;
				model.addRow(inp);
			}
		}
	}

	private String GetLowerCaseBranchCriteriaOperation(String sString) {
		if (sString.equals("EQ_ALL"))
		{
			return "All Must Match";
		}
		if (sString.equals("EQ_ALL_NC"))
		{
			return "All Must Match (Ignore Case)";
		}
		if (sString.equals("BETWEEN"))
		{
			return "Between";
		}
		if (sString.equals("GREATER_THAN"))
		{
			return "Greater Than";
		}
		if (sString.equals("IS_NOT_NULL"))
		{
			return "Is Not Null";
		}
		if (sString.equals("IS_NULL"))
		{
			return "Is Null";
		}
		if (sString.equals("LESS_THAN"))
		{
			return "Less Than";
		}
		if (sString.equals("NE_ALL"))
		{
			return "None Can Match";
		}
		if (sString.equals("NE_ALL_NC"))
		{
			return "None Can Match (Ignore Case)";
		}
		if (sString.equals("NOT_BETWEEN"))
		{
			return "Not Between";
		}
		if (sString.equals("EQ_ANY"))
		{
			return "One Must Match";
		}
		if (sString.equals("EQ_ANY_NC"))
		{
			return "One Must Match (Ignore Case)";
		}
		if (sString.equals("EQ_THIS"))
		{
			return "This Must Match";
		}
		if (sString.equals("EQ_THIS_NC"))
		{
			return "This Must Match (Ignore Case)";
		}
		return "";
	}

	private String GetHigherCaseBranchCriteriaOperation(String sString) {
		if (sString.equals("All Must Match"))
		{
			return "EQ_ALL";
		}
		if (sString.equals("All Must Match (Ignore Case)"))
		{
			return "EQ_ALL_NC";
		}
		if (sString.equals("Between"))
		{
			return "BETWEEN";
		}
		if (sString.equals("Greater Than"))
		{
			return "GREATER_THAN";
		}
		if (sString.equals("Is Not Null"))
		{
			return "IS_NOT_NULL";
		}
		if (sString.equals("Is Null"))
		{
			return "IS_NULL";
		}
		if (sString.equals("Less Than"))
		{
			return "LESS_THAN";
		}
		if (sString.equals("None Can Match"))
		{
			return "NE_ALL";
		}
		if (sString.equals("None Can Match (Ignore Case)"))
		{
			return "NE_ALL_NC";
		}
		if (sString.equals("Not Between"))
		{
			return "NOT_BETWEEN";
		}
		if (sString.equals("One Must Match"))
		{
			return "EQ_ANY";
		}
		if (sString.equals("One Must Match (Ignore Case)"))
		{
			return "EQ_ANY_NC";
		}
		if (sString.equals("This Must Match"))
		{
			return "EQ_THIS";
		}
		if (sString.equals("This Must Match (Ignore Case)"))
		{
			return "EQ_THIS_NC";
		}
		return "";
	}

	private String GetLowerCaseCompareTo(String sString) {
		if (sString.equals("APPLET"))
		{
			return "Applet";
		}
		if (sString.equals("BUSCOMP"))
		{
			return "Business Component";
		}
		if (sString.equals("EXPRESSION"))
		{
			return "Expression";
		}
		if (sString.equals("PROPERTY"))
		{
			return "Process Property";
		}
		return "";
	}

	

	private String GetHigherCaseCompareTo(String sString) {
		if (sString.equals("Applet"))
		{
			return "APPLET";
		}
		if (sString.equals("Business Component"))
		{
			return "BUSCOMP";
		}
		if (sString.equals("Expression"))
		{
			return "EXPRESSION";
		}
		if (sString.equals("Process Property"))
		{
			return "PROPERTY";
		}
		return "";
	}
}
