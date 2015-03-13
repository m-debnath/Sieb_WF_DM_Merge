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
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class AddOpArgLower extends JDialog implements ActionListener {

	ArrayList<RepositoryWfProcessProp> listOfRepositoryWfProcessPropMerged;
	ArrayList<String> ListOfPropertyName;
	ArrayList<String> ListOfFieldSequence;

	public boolean isDiscard;
	public String PropertyName, sSequence, sFieldType, ValueSearchSpecification, OpArg, BusinessComponent, BusinessComponentField, Comments, Inactive;

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_1;
	private JTextArea textArea;
	private JComboBox comboBox, comboBox_1;
	private JCheckBox checkBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AddOpArgLower dialog = new AddOpArgLower();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AddOpArgLower() {
		super();
	}

	public AddOpArgLower(Dialog dialog, ArrayList<RepositoryWfProcessProp> listOfRepositoryWfProcessPropMerged, ArrayList<String> ListOfPropertyName, ArrayList<String> ListOfFieldSequence) {
		super(dialog,"Add new Output Argument",true);
		isDiscard = false;
		this.listOfRepositoryWfProcessPropMerged = new ArrayList<RepositoryWfProcessProp>(listOfRepositoryWfProcessPropMerged);
		this.ListOfPropertyName = new ArrayList<String>(ListOfPropertyName);
		this.ListOfFieldSequence = new ArrayList<String>(ListOfFieldSequence);
		String [] proc_prop = new String[listOfRepositoryWfProcessPropMerged.size()];
		for (int i=0; i<listOfRepositoryWfProcessPropMerged.size(); i++)
		{
			proc_prop[i] = listOfRepositoryWfProcessPropMerged.get(i).Name2;
		}
		setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		//setTitle("Add new Output Argument");
		setBounds(100, 100, 300, 380);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel label = new JLabel("Sequence:");
			label.setFont(new Font("Tahoma", Font.PLAIN, 10));
			label.setBounds(10, 40, 85, 14);
			contentPanel.add(label);
		}
		{
			JLabel label = new JLabel("Type:");
			label.setFont(new Font("Tahoma", Font.PLAIN, 10));
			label.setBounds(10, 68, 85, 14);
			contentPanel.add(label);
		}
		{
			textField = new JTextField();
			textField.setFont(new Font("Tahoma", Font.PLAIN, 10));
			textField.setColumns(10);
			textField.setBounds(105, 38, 175, 20);
			contentPanel.add(textField);
			if (ListOfFieldSequence.size() == 0)
			{
				textField.setText("1");
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
					textField.setText("" + max + "");
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		}
		{
			comboBox_1 = new JComboBox();
			comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Literal", "Expression", "Output Argument", "Business Component"}));
			comboBox_1.setSelectedIndex(0);
			comboBox_1.setActionCommand("comboBox_1");
			comboBox_1.addActionListener(this);
			comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
			comboBox_1.setBounds(105, 65, 175, 20);
			contentPanel.add(comboBox_1);
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
			JLabel label = new JLabel("Bus Comp:");
			label.setFont(new Font("Tahoma", Font.PLAIN, 10));
			label.setBounds(10, 208, 85, 14);
			contentPanel.add(label);
		}
		{
			textField_2 = new JTextField();
			textField_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
			textField_2.setEditable(false);
			textField_2.setColumns(10);
			textField_2.setBounds(105, 206, 175, 20);
			contentPanel.add(textField_2);
		}
		{
			JLabel label = new JLabel("Bus Comp Field:");
			label.setFont(new Font("Tahoma", Font.PLAIN, 10));
			label.setBounds(10, 235, 85, 14);
			contentPanel.add(label);
		}
		{
			textField_3 = new JTextField();
			textField_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
			textField_3.setEditable(false);
			textField_3.setColumns(10);
			textField_3.setBounds(105, 233, 175, 20);
			contentPanel.add(textField_3);
		}
		{
			JLabel label = new JLabel("Comments:");
			label.setFont(new Font("Tahoma", Font.PLAIN, 10));
			label.setBounds(10, 262, 85, 14);
			contentPanel.add(label);
		}
		{
			textField_4 = new JTextField();
			textField_4.setFont(new Font("Tahoma", Font.PLAIN, 10));
			textField_4.setColumns(10);
			textField_4.setBounds(105, 260, 175, 20);
			contentPanel.add(textField_4);
		}
		{
			JLabel label = new JLabel("Property Name:");
			label.setFont(new Font("Tahoma", Font.PLAIN, 10));
			label.setBounds(10, 14, 85, 14);
			contentPanel.add(label);
		}
		{
			comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(proc_prop));
			comboBox.setSelectedIndex(0);
			comboBox.setFont(new Font("Tahoma", Font.PLAIN, 10));
			comboBox.setBounds(105, 11, 175, 20);
			contentPanel.add(comboBox);
		}
		{
			JLabel lblOpArgument = new JLabel("O/p Argument:");
			lblOpArgument.setFont(new Font("Tahoma", Font.PLAIN, 10));
			lblOpArgument.setBounds(10, 181, 85, 14);
			contentPanel.add(lblOpArgument);
		}
		{
			textField_1 = new JTextField();
			textField_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
			textField_1.setEditable(false);
			textField_1.setColumns(10);
			textField_1.setBounds(105, 179, 175, 20);
			contentPanel.add(textField_1);
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
		PropertyName = new String("");
		sSequence = new String("");
		sFieldType = new String("");
		ValueSearchSpecification = new String("");
		OpArg = new String("");
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
		if (cmd.equals("comboBox_1"))
		{
			String sType = (String) comboBox_1.getSelectedItem();
			if (sType.equals("Output Argument"))
			{
				textField_1.setEditable(true);
				textField_2.setEditable(false);
				textField_3.setEditable(false);
				textArea.setEditable(false);
				textArea.setBackground(Color.LIGHT_GRAY);
			}
			else if (sType.equals("Business Component"))
			{
				textField_1.setEditable(false);
				textField_2.setEditable(true);
				textField_3.setEditable(true);
				textArea.setEditable(false);
				textArea.setBackground(Color.LIGHT_GRAY);
			}
			else
			{
				textField_1.setEditable(false);
				textField_2.setEditable(false);
				textField_3.setEditable(false);
				textArea.setEditable(true);
				textArea.setBackground(Color.WHITE);
			}
		}
		if (cmd.equals("Save"))
		{
			String temp = (String) comboBox.getSelectedItem();
			String temp_1 = textField.getText().trim();
			if (ListOfPropertyName.contains(temp))
			{
				DisplayErrorMessage = "Property Name is already used. Please inssert a record that contains a unique Property Name!";
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
			PropertyName = (String) comboBox.getSelectedItem();
			sSequence = textField.getText().trim();
			sFieldType = (String) comboBox_1.getSelectedItem();
			if (sFieldType.equals("Literal") || sFieldType.equals("Expression"))
			{
				ValueSearchSpecification = textArea.getText().trim();
			}
			if (sFieldType.equals("Output Argument"))
			{
				OpArg = textField_1.getText().trim();
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
	}
}
