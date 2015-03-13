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
import javax.swing.DefaultComboBoxModel;
import java.awt.Dialog;
import java.awt.Color;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class AddNewInputArgHigher extends JDialog implements ActionListener {

	ArrayList<RepositoryWfProcessProp> listOfRepositoryWfProcessPropMerged;
	ArrayList<String> ListOfInpArgName;
	ArrayList<String> ListOfFieldSequence;

	public String InputArgument, sArgType, ValueSearchSpecification, BusinessComponent, BusinessComponentField, Comments, sSequence, PrpopertyName, Inactive;
	public boolean isDiscard;

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_1;
	private JTextField textField_4;
	private JComboBox comboBox, comboBox_1;
	private JTextArea textArea;
	private JCheckBox checkBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AddNewInputArgHigher dialog = new AddNewInputArgHigher();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AddNewInputArgHigher() {
		super();
	}

	public AddNewInputArgHigher(Dialog dialog, ArrayList<RepositoryWfProcessProp> listOfRepositoryWfProcessPropMerged, ArrayList<String> ListOfInpArgName, ArrayList<String> ListOfFieldSequence) {
		super(dialog,"Add new Input Argument",true);
		isDiscard = false;
		this.listOfRepositoryWfProcessPropMerged = new ArrayList<RepositoryWfProcessProp>(listOfRepositoryWfProcessPropMerged);
		this.ListOfInpArgName = new ArrayList<String>(ListOfInpArgName);
		this.ListOfFieldSequence = new ArrayList<String>(ListOfFieldSequence);
		String [] proc_prop = new String[listOfRepositoryWfProcessPropMerged.size()];
		for (int i=0; i<listOfRepositoryWfProcessPropMerged.size(); i++)
		{
			proc_prop[i] = listOfRepositoryWfProcessPropMerged.get(i).Name2;
		}

		//setTitle("Add new Input Argument");
		setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 300, 351);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblInputArgument = new JLabel("Input Argument:");
		lblInputArgument.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblInputArgument.setBounds(10, 11, 85, 14);
		contentPanel.add(lblInputArgument);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField.setColumns(10);
		textField.setBounds(105, 9, 175, 20);
		contentPanel.add(textField);
		
		JLabel lblType = new JLabel("Type:");
		lblType.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblType.setBounds(10, 36, 85, 14);
		contentPanel.add(lblType);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Literal", "Expression", "Business Component", "Process Property"}));
		comboBox.setSelectedIndex(0);
		comboBox.setActionCommand("comboBox");
		comboBox.addActionListener(this);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 10));
		comboBox.setBounds(105, 33, 175, 20);
		contentPanel.add(comboBox);
		
		JLabel lblValueExpression = new JLabel("Value / Expression:");
		lblValueExpression.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblValueExpression.setBounds(10, 63, 96, 14);
		contentPanel.add(lblValueExpression);
		
		JLabel lblPropertyName = new JLabel("Property Name:");
		lblPropertyName.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblPropertyName.setBounds(10, 152, 85, 14);
		contentPanel.add(lblPropertyName);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(proc_prop));
		comboBox_1.setEnabled(false);
		comboBox_1.setSelectedIndex(0);
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		comboBox_1.setBounds(105, 149, 175, 20);
		contentPanel.add(comboBox_1);
		
		JLabel lblComments = new JLabel("Comments:");
		lblComments.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblComments.setBounds(10, 233, 85, 14);
		contentPanel.add(lblComments);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_2.setColumns(10);
		textField_2.setBounds(105, 231, 175, 20);
		contentPanel.add(textField_2);
		
		JLabel lblSequence = new JLabel("Sequence:");
		lblSequence.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblSequence.setBounds(10, 260, 85, 14);
		contentPanel.add(lblSequence);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_3.setColumns(10);
		textField_3.setBounds(105, 258, 175, 20);
		contentPanel.add(textField_3);

		if (ListOfFieldSequence.size() == 0)
		{
			textField_3.setText("1");
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
				textField_3.setText("" + max + "");
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
		
		textArea = new JTextArea();
		textArea.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textArea.setBounds(105, 64, 175, 74);
		textArea.setLineWrap(true); 

		JScrollPane textAreaPane = new JScrollPane(textArea);
		textAreaPane.setBounds(105, 64, 175, 74);
		contentPanel.add(textAreaPane);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_1.setColumns(10);
		textField_1.setBounds(105, 177, 175, 20);
		contentPanel.add(textField_1);
		
		JLabel lblBusnessComponent = new JLabel("Bus Comp:");
		lblBusnessComponent.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblBusnessComponent.setBounds(10, 179, 85, 14);
		contentPanel.add(lblBusnessComponent);
		
		JLabel lblBusCompField = new JLabel("Bus Comp Field:");
		lblBusCompField.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblBusCompField.setBounds(10, 206, 85, 14);
		contentPanel.add(lblBusCompField);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_4.setColumns(10);
		textField_4.setBounds(105, 204, 175, 20);
		contentPanel.add(textField_4);
		
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
				buttonPane.add(okButton);
				okButton.addActionListener(this);
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
		InputArgument = new String("");
		sArgType = new String("");
		ValueSearchSpecification = new String("");
		PrpopertyName = new String("");
		BusinessComponent = new String("");
		BusinessComponentField = new String("");
		Comments = new String("");
		sSequence = new String("");
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
			String temp_1 = textField_3.getText().trim();
			if (temp == null || temp.equals(""))
			{
				DisplayErrorMessage = "Input Argument is a required field and can not be left blank!";
				JLabel lblmessage = new JLabel(DisplayErrorMessage);
				lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
				JOptionPane.showMessageDialog(this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
				return;
			}
			if (ListOfInpArgName.contains(temp))
			{
				DisplayErrorMessage = "Input Argument name is already used. Please inssert a record that contains a unique Input Argument name!";
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
			InputArgument = textField.getText().trim();
			sArgType = (String) comboBox.getSelectedItem();
			if (sArgType.equals("Literal") || sArgType.equals("Expression"))
			{
				ValueSearchSpecification = textArea.getText().trim();
			}
			if (sArgType.equals("Process Property"))
			{
				PrpopertyName = (String) comboBox_1.getSelectedItem();
			}
			if (sArgType.equals("Business Component"))
			{
				BusinessComponent = textField_1.getText().trim();
				BusinessComponentField = textField_4.getText().trim();
			}
			Comments = textField_2.getText().trim();
			sSequence = textField_3.getText().trim();

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
				textField_1.setEditable(false);
				textField_4.setEditable(false);
				textArea.setEditable(false);
				textArea.setBackground(Color.LIGHT_GRAY);
			}
			else if (sType.equals("Business Component"))
			{
				comboBox_1.setEnabled(false);
				textField_1.setEditable(true);
				textField_4.setEditable(true);
				textArea.setEditable(false);
				textArea.setBackground(Color.LIGHT_GRAY);
			}
			else
			{
				comboBox_1.setEnabled(false);
				textField_1.setEditable(false);
				textField_4.setEditable(false);
				textArea.setEditable(true);
				textArea.setBackground(Color.WHITE);
			}
		}
	}
}
