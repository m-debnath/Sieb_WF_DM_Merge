import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class AddNewFieldLower extends JDialog implements ActionListener {

	ArrayList<RepositoryWfProcessProp> listOfRepositoryWfProcessPropMerged;
	ArrayList<String> ListOfFieldName;
	ArrayList<String> ListOfFieldSequence;

	public boolean isDiscard;
	public String FieldName, sSequence, sFieldType, ValueSearchSpecification, PropertyName, BusinessComponent, BusinessComponentField, Comments, Inactive;

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextArea textArea;
	private JComboBox comboBox, comboBox_1;
	private JCheckBox checkBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AddNewFieldLower dialog = new AddNewFieldLower();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AddNewFieldLower() {
		super();
	}
	public AddNewFieldLower(Dialog dialog, ArrayList<RepositoryWfProcessProp> listOfRepositoryWfProcessPropMerged, ArrayList<String> ListOfFieldName, ArrayList<String> ListOfFieldSequence) {
		super(dialog,"Add New Field Input",true);
		isDiscard = false;
		this.listOfRepositoryWfProcessPropMerged = new ArrayList<RepositoryWfProcessProp>(listOfRepositoryWfProcessPropMerged);
		this.ListOfFieldName = new ArrayList<String>(ListOfFieldName);
		this.ListOfFieldSequence = new ArrayList<String>(ListOfFieldSequence);
		String [] proc_prop = new String[listOfRepositoryWfProcessPropMerged.size()];
		for (int i=0; i<listOfRepositoryWfProcessPropMerged.size(); i++)
		{
			proc_prop[i] = listOfRepositoryWfProcessPropMerged.get(i).Name2;
		}
		//setTitle("Add New Field Input");
		setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 300, 380);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblFieldName = new JLabel("Field Name:");
			lblFieldName.setFont(new Font("Tahoma", Font.PLAIN, 10));
			lblFieldName.setBounds(10, 13, 85, 14);
			contentPanel.add(lblFieldName);
		}
		{
			textField = new JTextField();
			textField.setFont(new Font("Tahoma", Font.PLAIN, 10));
			textField.setColumns(10);
			textField.setBounds(105, 11, 175, 20);
			contentPanel.add(textField);
		}
		{
			JLabel lblSequence = new JLabel("Sequence:");
			lblSequence.setFont(new Font("Tahoma", Font.PLAIN, 10));
			lblSequence.setBounds(10, 40, 85, 14);
			contentPanel.add(lblSequence);
		}
		{
			textField_1 = new JTextField();
			textField_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
			textField_1.setColumns(10);
			textField_1.setBounds(105, 38, 175, 20);
			contentPanel.add(textField_1);
			if (ListOfFieldSequence.size() == 0)
			{
				textField_1.setText("1");
			}
			else
			{
				try
				{
					int max = -1;
					int seq [] = new int [ListOfFieldSequence.size()];
					for (int i=0; i<ListOfFieldSequence.size(); i++)
					{
						seq[i] = Integer.parseInt(ListOfFieldSequence.get(i));
						if (seq[i] >= max)
						{
							max = seq[i];
						}
					}
					max++;
					textField_1.setText("" + max + "");
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		}
		{
			JLabel label = new JLabel("Type:");
			label.setFont(new Font("Tahoma", Font.PLAIN, 10));
			label.setBounds(10, 68, 85, 14);
			contentPanel.add(label);
		}
		{
			comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"Literal", "Expression", "Process Property", "Business Component"}));
			comboBox.setSelectedIndex(0);
			comboBox.setActionCommand("comboBox");
			comboBox.addActionListener(this);
			comboBox.setFont(new Font("Tahoma", Font.PLAIN, 10));
			comboBox.setBounds(105, 65, 175, 20);
			contentPanel.add(comboBox);
		}
		{
			JLabel label = new JLabel("Value / Expression:");
			label.setFont(new Font("Tahoma", Font.PLAIN, 10));
			label.setBounds(10, 93, 96, 14);
			contentPanel.add(label);
		}
		{
			textArea = new JTextArea();
			textArea.setFont(new Font("Tahoma", Font.PLAIN, 10));
			textArea.setBackground(Color.WHITE);
			textArea.setBounds(105, 94, 175, 74);
			textArea.setLineWrap(true); 

			JScrollPane textAreaPane = new JScrollPane(textArea);
			textAreaPane.setBounds(105, 94, 175, 74);
			contentPanel.add(textAreaPane);
		}
		{
			JLabel lblPropertyName = new JLabel("Property Name:");
			lblPropertyName.setFont(new Font("Tahoma", Font.PLAIN, 10));
			lblPropertyName.setBounds(10, 182, 85, 14);
			contentPanel.add(lblPropertyName);
		}
		{
			comboBox_1 = new JComboBox();
			comboBox_1.setEnabled(false);
			comboBox_1.setModel(new DefaultComboBoxModel(proc_prop));
			comboBox_1.setSelectedIndex(0);
			comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
			comboBox_1.setBounds(105, 179, 175, 20);
			contentPanel.add(comboBox_1);
		}
		{
			JLabel label = new JLabel("Bus Comp:");
			label.setFont(new Font("Tahoma", Font.PLAIN, 10));
			label.setBounds(10, 209, 85, 14);
			contentPanel.add(label);
		}
		{
			textField_2 = new JTextField();
			textField_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
			textField_2.setEditable(false);
			textField_2.setColumns(10);
			textField_2.setBounds(105, 207, 175, 20);
			contentPanel.add(textField_2);
		}
		{
			JLabel label = new JLabel("Bus Comp Field:");
			label.setFont(new Font("Tahoma", Font.PLAIN, 10));
			label.setBounds(10, 236, 85, 14);
			contentPanel.add(label);
		}
		{
			textField_3 = new JTextField();
			textField_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
			textField_3.setEditable(false);
			textField_3.setColumns(10);
			textField_3.setBounds(105, 234, 175, 20);
			contentPanel.add(textField_3);
		}
		{
			JLabel label = new JLabel("Comments:");
			label.setFont(new Font("Tahoma", Font.PLAIN, 10));
			label.setBounds(10, 263, 85, 14);
			contentPanel.add(label);
		}
		{
			textField_4 = new JTextField();
			textField_4.setFont(new Font("Tahoma", Font.PLAIN, 10));
			textField_4.setColumns(10);
			textField_4.setBounds(105, 261, 175, 20);
			contentPanel.add(textField_4);
		}
		
		JLabel label = new JLabel("Inactive:");
		label.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label.setBounds(10, 289, 85, 14);
		contentPanel.add(label);
		
		checkBox = new JCheckBox("");
		checkBox.setBounds(101, 285, 97, 23);
		contentPanel.add(checkBox);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Save");
				okButton.setToolTipText("Save");
				okButton.setActionCommand("Save");
				okButton.addActionListener(this);
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Discard");
				cancelButton.setToolTipText("Discard");
				cancelButton.setActionCommand("Discard");
				buttonPane.add(cancelButton);
				cancelButton.addActionListener(this);
			}
		}
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

	public void actionPerformed(ActionEvent e) {
		FieldName = new String("");
		sSequence = new String("");
		sFieldType = new String("");
		ValueSearchSpecification = new String("");
		PropertyName = new String("");
		BusinessComponent = new String("");
		BusinessComponentField = new String("");
		Comments = new String("");
		Inactive = new String("");
		String cmd = e.getActionCommand();
		String DisplayMessage = new String("");
		String DisplayErrorMessage = new String("");
		if (cmd.equals("Discard"))
		{
			JOptionPane warningPane = new JOptionPane();
			DisplayMessage = "Are you sure you want to discard?";
			JLabel lblmessage = new JLabel(DisplayMessage);
			lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
			int choice = warningPane.showConfirmDialog(this,lblmessage,"Confirm",JOptionPane.YES_NO_OPTION); // 0 for Yes, 1 for No
			if (choice == 1)
			{
				return;
			}
			isDiscard = true;
			this.setVisible(false);
		}
		if (cmd.equals("Save"))
		{
			String temp = textField.getText().trim();
			String temp_1 = textField_1.getText().trim();
			if (temp == null || temp.equals(""))
			{
				DisplayErrorMessage = "Field Name is a required field and can not be left blank!";
				JLabel lblmessage = new JLabel(DisplayErrorMessage);
				lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
				JOptionPane.showMessageDialog(this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
				return;
			}
			if (ListOfFieldName.contains(temp))
			{
				DisplayErrorMessage = "Field Name is already used. Please inssert a record that contains a unique Field Name!";
				JLabel lblmessage = new JLabel(DisplayErrorMessage);
				lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
				JOptionPane.showMessageDialog(this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
				return;
			}
			if (ListOfFieldSequence.contains(temp_1))
			{
				DisplayErrorMessage = "Sequence is already used. Please inssert a record that contains a unique Sequence!";
				JLabel lblmessage = new JLabel(DisplayErrorMessage);
				lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
				JOptionPane.showMessageDialog(this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
				return;
			}
			if (!isValidNumber(temp_1))
			{
				DisplayErrorMessage = "Sequence is not a valid number. Please inssert correct Sequence!";
				JLabel lblmessage = new JLabel(DisplayErrorMessage);
				lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
				JOptionPane.showMessageDialog(this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
				return;
			}
			FieldName = textField.getText().trim();
			sSequence = textField_1.getText().trim();
			sFieldType = (String) comboBox.getSelectedItem();
			if (sFieldType.equals("Literal") || sFieldType.equals("Expression"))
			{
				ValueSearchSpecification = textArea.getText().trim();
			}
			if (sFieldType.equals("Process Property"))
			{
				PropertyName = (String) comboBox_1.getSelectedItem();
			}
			if (sFieldType.equals("Business Component"))
			{
				BusinessComponent = textField_2.getText().trim();
				BusinessComponentField = textField_3.getText().trim();
			}
			Comments = textField_4.getText().trim();

			if (checkBox.isSelected() == true)
			{
				Inactive = "Y";
			}
			else
			{
				Inactive = "N";
			}

			this.setVisible(false);
		}
		if (cmd.equals("comboBox"))
		{
			String sType = (String) comboBox.getSelectedItem();
			if (sType.equals("Process Property"))
			{
				comboBox_1.setEnabled(true);
				textField_2.setEditable(false);
				textField_3.setEditable(false);
				textArea.setEditable(false);
				textArea.setBackground(Color.LIGHT_GRAY);
			}
			else if (sType.equals("Business Component"))
			{
				comboBox_1.setEnabled(false);
				textField_2.setEditable(true);
				textField_3.setEditable(true);
				textArea.setEditable(false);
				textArea.setBackground(Color.LIGHT_GRAY);
			}
			else
			{
				comboBox_1.setEnabled(false);
				textField_2.setEditable(false);
				textField_3.setEditable(false);
				textArea.setEditable(true);
				textArea.setBackground(Color.WHITE);
			}
		}
	}
}
