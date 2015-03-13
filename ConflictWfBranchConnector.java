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
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class ConflictWfBranchConnector extends JDialog implements ActionListener {
	public String FinalFromStepName, FinalToStepName;

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private ArrayList<RepositoryWfStep> listOfrepWfStep;
	JCheckBox chckbxUseTheLower, chckbxUseTheHigher, chckbxUseTheNew;
	JComboBox comboBox_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ConflictWfBranchConnector dialog = new ConflictWfBranchConnector();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */

	public ConflictWfBranchConnector() {
	}

	public ConflictWfBranchConnector(Frame frame) {
		super(frame,"Conflicting WF Branch Connector",true);
		//setTitle("Conflicting WF Branch Connector");
		setBounds(100, 100, 530, 365);
		setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel label = new JLabel("WF Name:");
		label.setFont(new Font("Tahoma", Font.BOLD, 12));
		label.setBounds(10, 13, 63, 14);
		contentPanel.add(label);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBounds(79, 11, 431, 20);
		contentPanel.add(textField);
		
		JLabel lblBranchConnectorName = new JLabel("Branch Connector Name:");
		lblBranchConnectorName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblBranchConnectorName.setBounds(20, 40, 157, 14);
		contentPanel.add(lblBranchConnectorName);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(187, 38, 323, 20);
		contentPanel.add(textField_1);
		
		JLabel lblBrachConnectorDetails = new JLabel("Brach Connector Details: From Lower Version");
		lblBrachConnectorDetails.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblBrachConnectorDetails.setBounds(30, 69, 341, 15);
		contentPanel.add(lblBrachConnectorDetails);
		
		JLabel lblBrachConnectorDetails_1 = new JLabel("Brach Connector Details: From Higher Version");
		lblBrachConnectorDetails_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblBrachConnectorDetails_1.setBounds(30, 120, 341, 15);
		contentPanel.add(lblBrachConnectorDetails_1);
		
		JLabel lblBrachConnectorDetails_2 = new JLabel("Brach Connector Details: Create New");
		lblBrachConnectorDetails_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblBrachConnectorDetails_2.setBounds(30, 174, 341, 15);
		contentPanel.add(lblBrachConnectorDetails_2);
		
		JLabel lblNewLabel = new JLabel("This branch connects");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel.setBounds(40, 95, 101, 14);
		contentPanel.add(lblNewLabel);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_2.setBounds(140, 92, 146, 20);
		contentPanel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblStepTo = new JLabel("step to");
		lblStepTo.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblStepTo.setBounds(296, 95, 34, 14);
		contentPanel.add(lblStepTo);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(331, 92, 146, 20);
		contentPanel.add(textField_3);
		
		JLabel lblStep = new JLabel("step.");
		lblStep.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblStep.setBounds(487, 95, 34, 14);
		contentPanel.add(lblStep);
		
		JLabel label_1 = new JLabel("This branch connects");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_1.setBounds(40, 149, 101, 14);
		contentPanel.add(label_1);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(140, 146, 146, 20);
		contentPanel.add(textField_4);
		
		JLabel label_2 = new JLabel("step to");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_2.setBounds(296, 149, 34, 14);
		contentPanel.add(label_2);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(331, 146, 146, 20);
		contentPanel.add(textField_5);
		
		JLabel label_3 = new JLabel("step.");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_3.setBounds(487, 149, 34, 14);
		contentPanel.add(label_3);
		
		JLabel label_4 = new JLabel("This branch connects");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_4.setBounds(40, 203, 101, 14);
		contentPanel.add(label_4);
		
		JLabel label_6 = new JLabel("step to");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_6.setBounds(296, 203, 34, 14);
		contentPanel.add(label_6);
		
		JLabel label_7 = new JLabel("step.");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_7.setBounds(487, 203, 34, 14);
		contentPanel.add(label_7);
		
		JLabel label_8 = new JLabel("Resolve the conflict below");
		label_8.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_8.setBounds(20, 227, 277, 15);
		contentPanel.add(label_8);
		
		chckbxUseTheLower = new JCheckBox("Use the lower version branch connector");
		chckbxUseTheLower.setFont(new Font("Tahoma", Font.PLAIN, 10));
		chckbxUseTheLower.setBounds(20, 249, 256, 23);
		chckbxUseTheLower.addActionListener(this);
		contentPanel.add(chckbxUseTheLower);
		
		chckbxUseTheHigher = new JCheckBox("Use the higher version branch connector");
		chckbxUseTheHigher.setFont(new Font("Tahoma", Font.PLAIN, 10));
		chckbxUseTheHigher.addActionListener(this);
		chckbxUseTheHigher.setBounds(20, 275, 256, 23);
		contentPanel.add(chckbxUseTheHigher);
		
		chckbxUseTheNew = new JCheckBox("Use the new branch connector");
		chckbxUseTheNew.setFont(new Font("Tahoma", Font.PLAIN, 10));
		chckbxUseTheNew.addActionListener(this);
		chckbxUseTheNew.setBounds(286, 249, 181, 23);
		contentPanel.add(chckbxUseTheNew);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"10", "20"}));
		comboBox_1.setSelectedIndex(0);
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		comboBox_1.setBounds(331, 200, 146, 20);
		contentPanel.add(comboBox_1);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBounds(140, 200, 146, 20);
		contentPanel.add(textField_6);
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

	public void setWFName(String sString) {
		textField.setText(sString);
	}

	public void setBranchConnName(String sString) {
		textField_1.setText(sString);
	}

	public void setLowerFromStep(String sString) {
		textField_2.setText(sString);
	}

	public void setLowerToStep(String sString) {
		textField_3.setText(sString);
	}

	public void setHigherFromStep(String sString) {
		textField_4.setText(sString);
	}

	public void setHigherToStep(String sString) {
		textField_5.setText(sString);
	}

	public void setNewFromStep(String sString) {
		textField_6.setText(sString);
	}

	public void setNewToStep(ArrayList<RepositoryWfStep> listOfrepWfStepMerged, String sString) {
		if (listOfrepWfStepMerged.size()>0)
		{
			String [] Steps = new String [listOfrepWfStepMerged.size()];
			for (int i = 0; i < listOfrepWfStepMerged.size(); i++) {
				Steps[i] = listOfrepWfStepMerged.get(i).Name3;
			}
			comboBox_1.setModel(new DefaultComboBoxModel(Steps));
			if (sString == null || sString.equals(""))
			{
				comboBox_1.setSelectedIndex(0);
			}
			else
			{
				comboBox_1.setSelectedItem(sString);
			}
		}
		else
		{
			comboBox_1.setSelectedIndex(0);
		}
	}

	public void actionPerformed (ActionEvent e) {
		String cmd = e.getActionCommand();
		String DisplayErrorMessage = new String("");
		if (cmd.equals("Use the lower version branch connector"))
		{
			if (chckbxUseTheLower.isSelected() == true)
			{
				chckbxUseTheHigher.setSelected(false);
				chckbxUseTheNew.setSelected(false);
			}
		}
		if (cmd.equals("Use the higher version branch connector"))
		{
			if (chckbxUseTheHigher.isSelected() == true)
			{
				chckbxUseTheLower.setSelected(false);
				chckbxUseTheNew.setSelected(false);
			}
		}
		if (cmd.equals("Use the new branch connector"))
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
			FinalFromStepName = new String("");
			FinalToStepName = new String("");

			if (chckbxUseTheLower.isSelected() == true) {
				FinalFromStepName = textField_2.getText();
				FinalToStepName = textField_3.getText();
			}

			if (chckbxUseTheHigher.isSelected() == true) {
				FinalFromStepName = textField_4.getText();
				FinalToStepName = textField_5.getText();
			}

			if (chckbxUseTheNew.isSelected() == true) {
				FinalFromStepName = textField_6.getText();
				FinalToStepName = (String) comboBox_1.getSelectedItem();
			}

			this.setVisible(false);
		}
	}
}
