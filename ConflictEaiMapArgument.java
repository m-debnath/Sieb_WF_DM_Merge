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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ConflictEaiMapArgument extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
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
	private String DisplayErrorMessage;
	private JCheckBox chckbxUseTheLower, chckbxUseTheHigher, chckbxUseTheNew;
	private JComboBox comboBox;

	public String DisplayName, DataType, Comments;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ConflictEaiMapArgument dialog = new ConflictEaiMapArgument();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */

	public ConflictEaiMapArgument() {
	}

	public ConflictEaiMapArgument(Frame frame) {
		super(frame,"Conflicting EAI Map Arguments",true);

		DisplayName = new String("");
		DataType = new String("");
		Comments = new String("");
		//setTitle("Conflicting EAI Map Arguments");
		//setResizable(true);
		setBounds(100, 100, 640, 480);
		setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Data Map Name:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 11, 100, 14);
		contentPanel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(120, 9, 504, 20);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Argument Name:");
		lblNewLabel_1.setBounds(20, 39, 100, 14);
		contentPanel.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(130, 36, 494, 20);
		contentPanel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblEaiMapFrom = new JLabel("Integration Map Argument: From Lower Version");
		lblEaiMapFrom.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEaiMapFrom.setBounds(20, 78, 341, 15);
		contentPanel.add(lblEaiMapFrom);
		
		JLabel lblIntegrationMapArgument = new JLabel("Integration Map Argument: From Higher Version");
		lblIntegrationMapArgument.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblIntegrationMapArgument.setBounds(20, 158, 341, 15);
		contentPanel.add(lblIntegrationMapArgument);
		
		JLabel lblIntegrationMapArgument_1 = new JLabel("Integration Map Argument: Create New");
		lblIntegrationMapArgument_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblIntegrationMapArgument_1.setBounds(20, 238, 341, 15);
		contentPanel.add(lblIntegrationMapArgument_1);
		
		JLabel label_3 = new JLabel("Resolve the conflict below");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_3.setBounds(20, 315, 277, 15);
		contentPanel.add(label_3);
		
		chckbxUseTheLower = new JCheckBox("Use the lower version argument");
		chckbxUseTheLower.setFont(new Font("Tahoma", Font.PLAIN, 10));
		chckbxUseTheLower.setBounds(20, 337, 182, 23);
		chckbxUseTheLower.addActionListener(this);
		contentPanel.add(chckbxUseTheLower);
		
		chckbxUseTheHigher = new JCheckBox("Use the higher version argument");
		chckbxUseTheHigher.setFont(new Font("Tahoma", Font.PLAIN, 10));
		chckbxUseTheHigher.setBounds(20, 363, 182, 23);
		chckbxUseTheHigher.addActionListener(this);
		contentPanel.add(chckbxUseTheHigher);
		
		chckbxUseTheNew = new JCheckBox("Use the new argument");
		chckbxUseTheNew.setFont(new Font("Tahoma", Font.PLAIN, 10));
		chckbxUseTheNew.setBounds(20, 389, 146, 23);
		chckbxUseTheNew.addActionListener(this);
		contentPanel.add(chckbxUseTheNew);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"DTYPE_BOOL", "DTYPE_CURRENCY", "DTYPE_DATE", "DTYPE_DATETIME", "DTYPE_ID", "DTYPE_INTEGER", "DTYPE_NOTE", "DTYPE_NUMBER", "DTYPE_PHONE", "DTYPE_TEXT", "DTYPE_TIME", "DTYPE_UTCDATETIME"}));
		comboBox.setSelectedIndex(0);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 10));
		comboBox.setBounds(210, 288, 170, 20);
		contentPanel.add(comboBox);
		
		JLabel lblDisplayName = new JLabel("Display Name");
		lblDisplayName.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblDisplayName.setBounds(30, 104, 128, 14);
		contentPanel.add(lblDisplayName);
		
		JLabel lblDisplayName_1 = new JLabel("Display Name");
		lblDisplayName_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblDisplayName_1.setBounds(30, 184, 128, 14);
		contentPanel.add(lblDisplayName_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(30, 128, 170, 20);
		contentPanel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(30, 208, 170, 20);
		contentPanel.add(textField_3);
		
		JLabel lblDisplayName_2 = new JLabel("Display Name");
		lblDisplayName_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblDisplayName_2.setBounds(30, 264, 128, 14);
		contentPanel.add(lblDisplayName_2);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_4.setColumns(10);
		textField_4.setBounds(30, 288, 170, 20);
		contentPanel.add(textField_4);
		
		JLabel lblDataType = new JLabel("Data Type");
		lblDataType.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblDataType.setBounds(210, 104, 146, 14);
		contentPanel.add(lblDataType);
		
		JLabel lblDataType_1 = new JLabel("Data Type");
		lblDataType_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblDataType_1.setBounds(210, 184, 146, 14);
		contentPanel.add(lblDataType_1);
		
		JLabel lblDataType_2 = new JLabel("Data Type");
		lblDataType_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblDataType_2.setBounds(210, 264, 146, 14);
		contentPanel.add(lblDataType_2);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(210, 128, 170, 20);
		contentPanel.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBounds(210, 208, 170, 20);
		contentPanel.add(textField_6);
		
		JLabel lblComments = new JLabel("Comments");
		lblComments.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblComments.setBounds(390, 104, 128, 14);
		contentPanel.add(lblComments);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBounds(390, 128, 234, 20);
		contentPanel.add(textField_7);
		
		JLabel lblComments_1 = new JLabel("Comments");
		lblComments_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblComments_1.setBounds(390, 184, 128, 14);
		contentPanel.add(lblComments_1);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBounds(390, 208, 234, 20);
		contentPanel.add(textField_8);
		
		JLabel lblComments_2 = new JLabel("Comments");
		lblComments_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblComments_2.setBounds(390, 264, 128, 14);
		contentPanel.add(lblComments_2);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_9.setColumns(10);
		textField_9.setBounds(390, 288, 234, 20);
		contentPanel.add(textField_9);

		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				okButton.addActionListener(this);
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
	}

	public void actionPerformed (ActionEvent e) {
		String cmd = e.getActionCommand();
		if (cmd.equals("Use the lower version argument"))
		{
			if (chckbxUseTheLower.isSelected() == true)
			{
				chckbxUseTheHigher.setSelected(false);
				chckbxUseTheNew.setSelected(false);
			}
		}
		if (cmd.equals("Use the higher version argument"))
		{
			if (chckbxUseTheHigher.isSelected() == true)
			{
				chckbxUseTheLower.setSelected(false);
				chckbxUseTheNew.setSelected(false);
			}
		}
		if (cmd.equals("Use the new argument"))
		{
			if (chckbxUseTheNew.isSelected() == true)
			{
				chckbxUseTheLower.setSelected(false);
				chckbxUseTheHigher.setSelected(false);
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
				DisplayName = textField_2.getText().trim();
				DataType = textField_5.getText().trim();
				Comments = textField_7.getText().trim();
			}
			if (chckbxUseTheHigher.isSelected() == true) {
				DisplayName = textField_3.getText().trim();
				DataType = textField_6.getText().trim();
				Comments = textField_8.getText().trim();
			}
			if (chckbxUseTheNew.isSelected() == true)
			{
				String newDispName = textField_4.getText().trim();
				if (newDispName == null || newDispName.equals(""))
				{
					DisplayErrorMessage = "Invalid or missing data submitted: New Display Name";
					JLabel lblmessage = new JLabel(DisplayErrorMessage);
					lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
					JOptionPane.showMessageDialog(this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
					return;

				}
				DisplayName = textField_4.getText().trim();
				DataType = (String)comboBox.getSelectedItem();
				Comments = textField_9.getText().trim();
			}

			this.setVisible(false);
		}
	}

	public void setDataMapName(String sString) {
		textField.setText(sString);
	}

	public void setArgumentName(String sString) {
		textField_1.setText(sString);
	}

	public void setLowerDisplayName(String sString) {
		textField_2.setText(sString);
	}

	public void setLowerDataType(String sString) {
		textField_5.setText(sString);
	}

	public void setLowerComments(String sString) {
		textField_7.setText(sString);
	}

	public void setHigherDisplayName(String sString) {
		textField_3.setText(sString);
	}

	public void setHigherDataType(String sString) {
		textField_6.setText(sString);
	}

	public void setHigherComments(String sString) {
		textField_8.setText(sString);
	}

	public void setNewDisplayName(String sString) {
		textField_4.setText(sString);
	}

	public void setNewDataType(String sString) {
		comboBox.setSelectedItem(sString);
	}

	public void setNewComments(String sString) {
		textField_9.setText(sString);
	}
}
