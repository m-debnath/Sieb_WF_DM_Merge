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


public class AddNewSrchSpecLower extends JDialog implements ActionListener {
	ArrayList<String> ListOfFieldSequence;

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JComboBox comboBox;
	private JTextArea textArea;
	private JCheckBox checkBox;

	public boolean isDiscard;
	public String ExpressionBusinessComponent, FilterBusinessComponent, BCField, sSrchType, ValueSearchSpecification, Comments, sSequence, Inactive;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AddNewSrchSpecLower dialog = new AddNewSrchSpecLower();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AddNewSrchSpecLower() {
		super();
	}

	public AddNewSrchSpecLower(Dialog dialog, String ExpBC, ArrayList<String> ListOfFieldSequence) {
		super(dialog,"Add new Search Specification",true);
		isDiscard = false;
		this.ListOfFieldSequence = new ArrayList<String>(ListOfFieldSequence);
		//setTitle("Add new Search Specification");
		setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 300, 350);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblExpressionBc = new JLabel("Expression BC:");
			lblExpressionBc.setFont(new Font("Tahoma", Font.PLAIN, 10));
			lblExpressionBc.setBounds(10, 13, 85, 14);
			contentPanel.add(lblExpressionBc);
		}
		{
			textField = new JTextField();
			textField.setFont(new Font("Tahoma", Font.PLAIN, 10));
			textField.setColumns(10);
			textField.setBounds(105, 11, 175, 20);
			textField.setText(ExpBC);
			contentPanel.add(textField);
		}
		{
			JLabel lblFilterBc = new JLabel("Filter BC:");
			lblFilterBc.setFont(new Font("Tahoma", Font.PLAIN, 10));
			lblFilterBc.setBounds(10, 40, 85, 14);
			contentPanel.add(lblFilterBc);
		}
		{
			textField_1 = new JTextField();
			textField_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
			textField_1.setColumns(10);
			textField_1.setBounds(105, 38, 175, 20);
			contentPanel.add(textField_1);
		}
		
		JLabel label = new JLabel("Type:");
		label.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label.setBounds(10, 95, 85, 14);
		contentPanel.add(label);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Literal", "Expression"}));
		comboBox.setSelectedIndex(0);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 10));
		comboBox.setBounds(105, 92, 175, 20);
		contentPanel.add(comboBox);
		
		JLabel label_1 = new JLabel("Value / Expression:");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_1.setBounds(10, 122, 96, 14);
		contentPanel.add(label_1);
		
		textArea = new JTextArea();
		textArea.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textArea.setBounds(105, 123, 175, 74);
		textArea.setLineWrap(true); 

		JScrollPane textAreaPane = new JScrollPane(textArea);
		textAreaPane.setBounds(105, 123, 175, 74);
		contentPanel.add(textAreaPane);
		
		JLabel label_2 = new JLabel("Comments:");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_2.setBounds(10, 206, 85, 14);
		contentPanel.add(label_2);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_2.setColumns(10);
		textField_2.setBounds(105, 204, 175, 20);
		contentPanel.add(textField_2);
		
		JLabel label_3 = new JLabel("Sequence:");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_3.setBounds(10, 233, 85, 14);
		contentPanel.add(label_3);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_3.setColumns(10);
		textField_3.setBounds(105, 231, 175, 20);
		contentPanel.add(textField_3);
		
		JLabel label_4 = new JLabel("Inactive:");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_4.setBounds(10, 259, 85, 14);
		contentPanel.add(label_4);
		
		checkBox = new JCheckBox("");
		checkBox.setBounds(101, 255, 97, 23);
		contentPanel.add(checkBox);

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
		
		JLabel lblBcField = new JLabel("BC Field:");
		lblBcField.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblBcField.setBounds(10, 67, 85, 14);
		contentPanel.add(lblBcField);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_4.setColumns(10);
		textField_4.setBounds(105, 65, 175, 20);
		contentPanel.add(textField_4);
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
				cancelButton.addActionListener(this);
				buttonPane.add(cancelButton);
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
		String cmd = e.getActionCommand();
		String DisplayMessage = new String("");
		String DisplayErrorMessage = new String("");
		ExpressionBusinessComponent = new String("");
		FilterBusinessComponent = new String("");
		sSrchType = new String("");
		ValueSearchSpecification = new String("");
		Comments = new String("");
		sSequence = new String("");
		Inactive = new String("");

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
				DisplayErrorMessage = "Expression Business Component is a required field and can not be left blank!";
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
			ExpressionBusinessComponent = textField.getText().trim();
			FilterBusinessComponent = textField_1.getText().trim();
			BCField = textField_4.getText().trim();
			sSrchType = (String) comboBox.getSelectedItem();
			ValueSearchSpecification = textArea.getText().trim();
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
	}
}
