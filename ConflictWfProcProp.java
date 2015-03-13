import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Frame;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class ConflictWfProcProp extends JDialog implements ActionListener {

	public String AccessMode; //1 - RW
	public String BusinessComponent; //public 2
	public String Comments; //3
	public String CorrelatorFlag; //4 - N
	public String DataType; //5 - VARCHAR for String
	public String DefaultDate; //6
	public String DefaultNumber; //7
	public String DefaultString; //8
	public String DisplayName; //9
	public String InOut; //10 - INOUT
	public String Inactive; //11 - N
	public String IntegrationObject; //12
	public String VirtualField; //14

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
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_26;
	private JTextField textField_28;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JCheckBox chckbxUseTheLower;
	private JCheckBox chckbxUseTheHigher;
	private JCheckBox chckbxUseTheNew;
	private JCheckBox chckbxNewCheckBox;
	private JCheckBox checkBox;
	private JCheckBox checkBox_1;
	private JCheckBox checkBox_2, checkBox_3, checkBox_4;
	private JComboBox comboBox, comboBox_1, comboBox_2, comboBox_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ConflictWfProcProp dialog = new ConflictWfProcProp();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */

	public ConflictWfProcProp() {
		super();
	}
	public ConflictWfProcProp(Frame frame) {
		super(frame,"Conflicting Workflow Process Properties",true);
		//setTitle("Conflicting Workflow Process Properties");
		//setResizable(false);
		setBounds(100, 100, 800, 600);
		setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WF Name:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 11, 63, 14);
		contentPanel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField.setBounds(79, 9, 705, 20);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		JLabel lblProcessPropertyName = new JLabel("Process Property Name:");
		lblProcessPropertyName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblProcessPropertyName.setBounds(20, 38, 145, 14);
		contentPanel.add(lblProcessPropertyName);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_1.setEditable(false);
		textField_1.setBounds(175, 36, 609, 20);
		contentPanel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblProcPropAttributes = new JLabel("Proc Prop Attributes: From Lower Version");
		lblProcPropAttributes.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblProcPropAttributes.setBounds(30, 67, 341, 15);
		contentPanel.add(lblProcPropAttributes);
		
		JLabel label = new JLabel("Resolve the conflict below");
		label.setFont(new Font("Tahoma", Font.BOLD, 12));
		label.setBounds(20, 465, 277, 15);
		contentPanel.add(label);
		
		chckbxUseTheLower = new JCheckBox("Use the lower version process property");
		chckbxUseTheLower.setFont(new Font("Tahoma", Font.PLAIN, 10));
		chckbxUseTheLower.setBounds(20, 487, 310, 23);
		chckbxUseTheLower.addActionListener(this);
		contentPanel.add(chckbxUseTheLower);
		
		chckbxUseTheHigher = new JCheckBox("Use the higher version process property");
		chckbxUseTheHigher.setFont(new Font("Tahoma", Font.PLAIN, 10));
		chckbxUseTheHigher.setBounds(20, 513, 310, 23);
		chckbxUseTheHigher.addActionListener(this);
		contentPanel.add(chckbxUseTheHigher);
		
		chckbxUseTheNew = new JCheckBox("Use the new process property");
		chckbxUseTheNew.setFont(new Font("Tahoma", Font.PLAIN, 10));
		chckbxUseTheNew.setBounds(364, 487, 310, 23);
		chckbxUseTheNew.addActionListener(this);
		contentPanel.add(chckbxUseTheNew);
		
		JLabel lblNewLabel_1 = new JLabel("Display Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_1.setBounds(30, 93, 71, 14);
		contentPanel.add(lblNewLabel_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_2.setEditable(false);
		textField_2.setBounds(30, 116, 100, 20);
		contentPanel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblInout = new JLabel("In/Out");
		lblInout.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblInout.setBounds(140, 93, 50, 14);
		contentPanel.add(lblInout);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(140, 116, 94, 20);
		contentPanel.add(textField_3);
		
		JLabel lblBusinessComponent = new JLabel("Business Component");
		lblBusinessComponent.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblBusinessComponent.setBounds(244, 93, 100, 14);
		contentPanel.add(lblBusinessComponent);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(244, 116, 100, 20);
		contentPanel.add(textField_4);
		
		JLabel lblVirtualField = new JLabel("Virtual Field");
		lblVirtualField.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblVirtualField.setBounds(354, 93, 100, 14);
		contentPanel.add(lblVirtualField);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(354, 116, 100, 20);
		contentPanel.add(textField_5);
		
		JLabel lblDefaultString = new JLabel("Default String");
		lblDefaultString.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblDefaultString.setBounds(464, 93, 100, 14);
		contentPanel.add(lblDefaultString);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBounds(464, 116, 100, 20);
		contentPanel.add(textField_6);
		
		JLabel lblDefaultDate = new JLabel("Default Date");
		lblDefaultDate.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblDefaultDate.setBounds(574, 93, 100, 14);
		contentPanel.add(lblDefaultDate);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBounds(574, 116, 100, 20);
		contentPanel.add(textField_7);
		
		JLabel lblDataType = new JLabel("Data Type");
		lblDataType.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblDataType.setBounds(684, 93, 100, 14);
		contentPanel.add(lblDataType);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBounds(684, 116, 100, 20);
		contentPanel.add(textField_8);
		
		JLabel lblIntegrationObject = new JLabel("Integration Object");
		lblIntegrationObject.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblIntegrationObject.setBounds(30, 143, 100, 14);
		contentPanel.add(lblIntegrationObject);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_9.setEditable(false);
		textField_9.setColumns(10);
		textField_9.setBounds(30, 166, 100, 20);
		contentPanel.add(textField_9);
		
		JLabel lblDefaultDate_1 = new JLabel("Default Number");
		lblDefaultDate_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblDefaultDate_1.setBounds(140, 143, 100, 14);
		contentPanel.add(lblDefaultDate_1);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_10.setEditable(false);
		textField_10.setColumns(10);
		textField_10.setBounds(140, 166, 94, 20);
		contentPanel.add(textField_10);
		
		JLabel lblCorrelatorFlag = new JLabel("Correlator Flag");
		lblCorrelatorFlag.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblCorrelatorFlag.setBounds(259, 143, 71, 14);
		contentPanel.add(lblCorrelatorFlag);
		
		chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setEnabled(false);
		chckbxNewCheckBox.setBounds(284, 163, 21, 23);
		chckbxNewCheckBox.setActionCommand("Lower Corelator Flag");
		chckbxNewCheckBox.addActionListener(this);
		contentPanel.add(chckbxNewCheckBox);
		
		JLabel lblInactive = new JLabel("Inactive");
		lblInactive.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblInactive.setBounds(386, 143, 36, 14);
		contentPanel.add(lblInactive);
		
		checkBox = new JCheckBox("");
		checkBox.setEnabled(false);
		checkBox.setBounds(394, 163, 21, 23);
		checkBox.setActionCommand("Lower Inactive");
		checkBox.addActionListener(this);
		contentPanel.add(checkBox);
		
		JLabel lblComments = new JLabel("Comments");
		lblComments.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblComments.setBounds(464, 147, 100, 14);
		contentPanel.add(lblComments);
		
		textField_11 = new JTextField();
		textField_11.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_11.setEditable(false);
		textField_11.setColumns(10);
		textField_11.setBounds(464, 170, 210, 20);
		contentPanel.add(textField_11);
		
		JLabel lblAccessMode = new JLabel("Access Mode");
		lblAccessMode.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblAccessMode.setBounds(684, 147, 100, 14);
		contentPanel.add(lblAccessMode);
		
		textField_12 = new JTextField();
		textField_12.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_12.setEditable(false);
		textField_12.setColumns(10);
		textField_12.setBounds(684, 170, 100, 20);
		contentPanel.add(textField_12);
		
		JLabel lblProcPropAttributes_1 = new JLabel("Proc Prop Attributes: From Higher Version");
		lblProcPropAttributes_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblProcPropAttributes_1.setBounds(30, 197, 341, 15);
		contentPanel.add(lblProcPropAttributes_1);
		
		JLabel label_3 = new JLabel("Display Name");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_3.setBounds(30, 223, 71, 14);
		contentPanel.add(label_3);
		
		JLabel label_4 = new JLabel("In/Out");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_4.setBounds(140, 223, 50, 14);
		contentPanel.add(label_4);
		
		JLabel label_5 = new JLabel("Business Component");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_5.setBounds(244, 223, 100, 14);
		contentPanel.add(label_5);
		
		JLabel label_6 = new JLabel("Virtual Field");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_6.setBounds(354, 223, 100, 14);
		contentPanel.add(label_6);
		
		JLabel label_7 = new JLabel("Default String");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_7.setBounds(464, 223, 100, 14);
		contentPanel.add(label_7);
		
		JLabel label_8 = new JLabel("Default Date");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_8.setBounds(574, 223, 100, 14);
		contentPanel.add(label_8);
		
		JLabel label_9 = new JLabel("Data Type");
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_9.setBounds(684, 223, 100, 14);
		contentPanel.add(label_9);
		
		textField_13 = new JTextField();
		textField_13.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_13.setEditable(false);
		textField_13.setColumns(10);
		textField_13.setBounds(684, 246, 100, 20);
		contentPanel.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_14.setEditable(false);
		textField_14.setColumns(10);
		textField_14.setBounds(574, 246, 100, 20);
		contentPanel.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_15.setEditable(false);
		textField_15.setColumns(10);
		textField_15.setBounds(464, 246, 100, 20);
		contentPanel.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_16.setEditable(false);
		textField_16.setColumns(10);
		textField_16.setBounds(354, 246, 100, 20);
		contentPanel.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_17.setEditable(false);
		textField_17.setColumns(10);
		textField_17.setBounds(244, 246, 100, 20);
		contentPanel.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_18.setEditable(false);
		textField_18.setColumns(10);
		textField_18.setBounds(140, 246, 94, 20);
		contentPanel.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_19.setEditable(false);
		textField_19.setColumns(10);
		textField_19.setBounds(30, 246, 100, 20);
		contentPanel.add(textField_19);
		
		JLabel label_10 = new JLabel("Integration Object");
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_10.setBounds(30, 273, 100, 14);
		contentPanel.add(label_10);
		
		textField_20 = new JTextField();
		textField_20.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_20.setEditable(false);
		textField_20.setColumns(10);
		textField_20.setBounds(30, 296, 100, 20);
		contentPanel.add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_21.setEditable(false);
		textField_21.setColumns(10);
		textField_21.setBounds(140, 296, 94, 20);
		contentPanel.add(textField_21);
		
		JLabel lblDefaultNumber = new JLabel("Default Number");
		lblDefaultNumber.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblDefaultNumber.setBounds(140, 273, 100, 14);
		contentPanel.add(lblDefaultNumber);
		
		JLabel label_12 = new JLabel("Correlator Flag");
		label_12.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_12.setBounds(259, 273, 71, 14);
		contentPanel.add(label_12);
		
		checkBox_1 = new JCheckBox("");
		checkBox_1.setEnabled(false);
		checkBox_1.setBounds(284, 293, 21, 23);
		checkBox_1.setActionCommand("Higher Corelator");
		checkBox_1.addActionListener(this);
		contentPanel.add(checkBox_1);
		
		JLabel label_13 = new JLabel("Inactive");
		label_13.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_13.setBounds(386, 273, 36, 14);
		contentPanel.add(label_13);
		
		checkBox_2 = new JCheckBox("");
		checkBox_2.setEnabled(false);
		checkBox_2.setBounds(394, 293, 21, 23);
		checkBox_2.setActionCommand("Higher Inactive");
		checkBox_2.addActionListener(this);
		contentPanel.add(checkBox_2);
		
		JLabel label_14 = new JLabel("Comments");
		label_14.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_14.setBounds(464, 277, 100, 14);
		contentPanel.add(label_14);
		
		textField_22 = new JTextField();
		textField_22.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_22.setEditable(false);
		textField_22.setColumns(10);
		textField_22.setBounds(464, 300, 210, 20);
		contentPanel.add(textField_22);
		
		JLabel lblAccessMode_1 = new JLabel("Access Mode");
		lblAccessMode_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblAccessMode_1.setBounds(684, 277, 100, 14);
		contentPanel.add(lblAccessMode_1);
		
		textField_23 = new JTextField();
		textField_23.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_23.setEditable(false);
		textField_23.setColumns(10);
		textField_23.setBounds(684, 300, 100, 20);
		contentPanel.add(textField_23);
		
		JLabel lblProcPropAttributes_2 = new JLabel("Proc Prop Attributes: Create New");
		lblProcPropAttributes_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblProcPropAttributes_2.setBounds(30, 327, 341, 15);
		contentPanel.add(lblProcPropAttributes_2);
		
		JLabel label_17 = new JLabel("Display Name");
		label_17.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_17.setBounds(30, 353, 71, 14);
		contentPanel.add(label_17);
		
		JLabel label_18 = new JLabel("In/Out");
		label_18.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_18.setBounds(140, 353, 50, 14);
		contentPanel.add(label_18);
		
		JLabel label_19 = new JLabel("Business Component");
		label_19.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_19.setBounds(244, 353, 100, 14);
		contentPanel.add(label_19);
		
		JLabel label_20 = new JLabel("Virtual Field");
		label_20.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_20.setBounds(354, 353, 100, 14);
		contentPanel.add(label_20);
		
		JLabel label_21 = new JLabel("Default String");
		label_21.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_21.setBounds(464, 353, 100, 14);
		contentPanel.add(label_21);
		
		JLabel label_22 = new JLabel("Default Date");
		label_22.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_22.setBounds(574, 353, 100, 14);
		contentPanel.add(label_22);
		
		JLabel label_23 = new JLabel("Data Type");
		label_23.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_23.setBounds(684, 353, 100, 14);
		contentPanel.add(label_23);
		
		textField_26 = new JTextField();
		textField_26.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_26.setColumns(10);
		textField_26.setBounds(464, 376, 100, 20);
		contentPanel.add(textField_26);
		
		textField_28 = new JTextField();
		textField_28.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_28.setColumns(10);
		textField_28.setBounds(244, 376, 100, 20);
		contentPanel.add(textField_28);
		
		textField_30 = new JTextField();
		textField_30.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_30.setColumns(10);
		textField_30.setBounds(30, 376, 100, 20);
		contentPanel.add(textField_30);
		
		JLabel label_24 = new JLabel("Integration Object");
		label_24.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_24.setBounds(30, 403, 100, 14);
		contentPanel.add(label_24);
		
		textField_31 = new JTextField();
		textField_31.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_31.setColumns(10);
		textField_31.setBounds(30, 426, 100, 20);
		contentPanel.add(textField_31);
		
		JLabel lblDefaultNumber_1 = new JLabel("Default Number");
		lblDefaultNumber_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblDefaultNumber_1.setBounds(140, 403, 100, 14);
		contentPanel.add(lblDefaultNumber_1);
		
		JLabel label_26 = new JLabel("Correlator Flag");
		label_26.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_26.setBounds(259, 403, 71, 14);
		contentPanel.add(label_26);
		
		checkBox_3 = new JCheckBox("");
		checkBox_3.setBounds(284, 423, 21, 23);
		checkBox_3.setActionCommand("New Corelator");
		checkBox_3.addActionListener(this);
		contentPanel.add(checkBox_3);
		
		JLabel label_27 = new JLabel("Inactive");
		label_27.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_27.setBounds(386, 403, 36, 14);
		contentPanel.add(label_27);
		
		checkBox_4 = new JCheckBox("");
		checkBox_4.setBounds(394, 423, 21, 23);
		checkBox_4.setActionCommand("New Inactive");
		checkBox_4.addActionListener(this);
		contentPanel.add(checkBox_4);
		
		JLabel label_28 = new JLabel("Comments");
		label_28.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_28.setBounds(464, 407, 100, 14);
		contentPanel.add(label_28);
		
		textField_33 = new JTextField();
		textField_33.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_33.setColumns(10);
		textField_33.setBounds(464, 430, 210, 20);
		contentPanel.add(textField_33);
		
		JLabel lblAccessMode_2 = new JLabel("Access Mode");
		lblAccessMode_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblAccessMode_2.setBounds(684, 407, 100, 14);
		contentPanel.add(lblAccessMode_2);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"String", "Number", "Date", "Hierarchy", "Binary", "Integration Object", "Alias"}));
		comboBox.setBounds(684, 375, 100, 20);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 10));
		contentPanel.add(comboBox);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"READ", "RW"}));
		comboBox_1.setBounds(684, 429, 100, 20);
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		contentPanel.add(comboBox_1);
		
		comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"In", "In/Out", "None", "Out"}));
		comboBox_2.setSelectedIndex(0);
		comboBox_2.setBounds(140, 375, 100, 20);
		comboBox_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		contentPanel.add(comboBox_2);
		
		comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Created", "Created By", "Id", "Merge Sequence Number", "Num Calls", "Outline Number", "Startup Flag", "Updated", "Updated By"}));
		comboBox_3.setSelectedIndex(0);
		comboBox_3.setBounds(354, 375, 100, 20);
		comboBox_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		contentPanel.add(comboBox_3);
		
		textField_34 = new JTextField();
		textField_34.setBounds(574, 376, 100, 20);
		textField_34.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_34.setColumns(10);
		contentPanel.add(textField_34);
		
		textField_35 = new JTextField();
		textField_35.setBounds(140, 425, 100, 20);
		textField_35.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_35.setColumns(10);
		contentPanel.add(textField_35);

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
		String DisplayErrorMessage = new String("");

		if (cmd.equals("Use the lower version process property"))
		{
			if (chckbxUseTheLower.isSelected() == true)
			{
				chckbxUseTheHigher.setSelected(false);
				chckbxUseTheNew.setSelected(false);
			}
		}
		if (cmd.equals("Use the higher version process property"))
		{
			if (chckbxUseTheHigher.isSelected() == true)
			{
				chckbxUseTheLower.setSelected(false);
				chckbxUseTheNew.setSelected(false);
			}
		}
		if (cmd.equals("Use the new process property"))
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
				AccessMode = new String(textField_12.getText().trim());
				BusinessComponent = new String(textField_4.getText().trim());
				Comments = new String(textField_11.getText().trim());
				if (chckbxNewCheckBox.isSelected() == true)
				{
					CorrelatorFlag = new String("Y");
				}
				else
				{
					CorrelatorFlag = new String("N");
				}
				if (textField_8.getText().trim().equals("Alias"))
				{
					DataType = new String("ALIAS");
				}
				if (textField_8.getText().trim().equals("Binary"))
				{
					DataType = new String("BINARY");
				}
				if (textField_8.getText().trim().equals("Date"))
				{
					DataType = new String("DATE");
				}
				if (textField_8.getText().trim().equals("String"))
				{
					DataType = new String("VARCHAR");
				}
				if (textField_8.getText().trim().equals("Hierarchy"))
				{
					DataType = new String("PROPSET_CHILD");
				}
				if (textField_8.getText().trim().equals("Number"))
				{
					DataType = new String("NUMBER");
				}
				if (textField_8.getText().trim().equals("Integration Object"))
				{
					DataType = new String("INT_OBJ");
				}
				DefaultDate = new String(textField_7.getText().trim());
				DefaultNumber = new String(textField_10.getText().trim());
				DefaultString = new String(textField_6.getText().trim());
				DisplayName = new String(textField_2.getText().trim());
				if (textField_3.getText().trim().equals("In"))
				{
					InOut = new String("IN");
				}
				if (textField_3.getText().trim().equals("Out"))
				{
					InOut = new String("OUT");
				}
				if (textField_3.getText().trim().equals("In/Out"))
				{
					InOut = new String("INOUT");
				}
				if (textField_3.getText().trim().equals("None"))
				{
					InOut = new String("NONE");
				}
				if (checkBox.isSelected() == true)
				{
					Inactive = new String("Y");
				}
				else
				{
					Inactive = new String("");
				}
				IntegrationObject = new String(textField_9.getText().trim());
				VirtualField = new String(textField_5.getText().trim());
			}

			if (chckbxUseTheHigher.isSelected() == true) {
				AccessMode = new String(textField_23.getText().trim());
				BusinessComponent = new String(textField_17.getText().trim());
				Comments = new String(textField_22.getText().trim());
				if (checkBox_1.isSelected() == true)
				{
					CorrelatorFlag = new String("Y");
				}
				else
				{
					CorrelatorFlag = new String("N");
				}
				if (textField_13.getText().trim().equals("Alias"))
				{
					DataType = new String("ALIAS");
				}
				if (textField_13.getText().trim().equals("Binary"))
				{
					DataType = new String("BINARY");
				}
				if (textField_13.getText().trim().equals("Date"))
				{
					DataType = new String("DATE");
				}
				if (textField_13.getText().trim().equals("String"))
				{
					DataType = new String("VARCHAR");
				}
				if (textField_13.getText().trim().equals("Hierarchy"))
				{
					DataType = new String("PROPSET_CHILD");
				}
				if (textField_13.getText().trim().equals("Number"))
				{
					DataType = new String("NUMBER");
				}
				if (textField_13.getText().trim().equals("Integration Object"))
				{
					DataType = new String("INT_OBJ");
				}
				DefaultDate = new String(textField_14.getText().trim());
				DefaultNumber = new String(textField_21.getText().trim());
				DefaultString = new String(textField_15.getText().trim());
				DisplayName = new String(textField_19.getText().trim());
				if (textField_18.getText().trim().equals("In"))
				{
					InOut = new String("IN");
				}
				if (textField_18.getText().trim().equals("Out"))
				{
					InOut = new String("OUT");
				}
				if (textField_18.getText().trim().equals("In/Out"))
				{
					InOut = new String("INOUT");
				}
				if (textField_18.getText().trim().equals("None"))
				{
					InOut = new String("NONE");
				}
				if (checkBox_2.isSelected() == true)
				{
					Inactive = new String("Y");
				}
				else
				{
					Inactive = new String("");
				}
				IntegrationObject = new String(textField_20.getText().trim());
				VirtualField = new String(textField_16.getText().trim());
			}

			if (chckbxUseTheNew.isSelected() == true) {
				//code to validate Default Number
				if (!isValidNumber(textField_35.getText().trim()))
				{
					DisplayErrorMessage = "Invalid data submitted: New Default Number";
					JLabel lblmessage = new JLabel(DisplayErrorMessage);
					lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
					JOptionPane.showMessageDialog(this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
					return;
				}
				if (!isValidDate(textField_34.getText().trim()))
				{
					DisplayErrorMessage = "Invalid data submitted: New Default Date";
					JLabel lblmessage = new JLabel(DisplayErrorMessage);
					lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
					JOptionPane.showMessageDialog(this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
					return;
				}
				//code to validate Default Date
				AccessMode = (String)comboBox_1.getSelectedItem();
				BusinessComponent = new String(textField_28.getText().trim());
				Comments = new String(textField_33.getText().trim());
				if (checkBox_3.isSelected() == true)
				{
					CorrelatorFlag = new String("Y");
				}
				else
				{
					CorrelatorFlag = new String("N");
				}
				String scomboBox = (String)comboBox.getSelectedItem();
				if (scomboBox.equals("Alias"))
				{
					DataType = new String("ALIAS");
				}
				if (scomboBox.equals("Binary"))
				{
					DataType = new String("BINARY");
				}
				if (scomboBox.equals("Date"))
				{
					DataType = new String("DATE");
				}
				if (scomboBox.equals("String"))
				{
					DataType = new String("VARCHAR");
				}
				if (scomboBox.equals("Hierarchy"))
				{
					DataType = new String("PROPSET_CHILD");
				}
				if (scomboBox.equals("Number"))
				{
					DataType = new String("NUMBER");
				}
				if (scomboBox.equals("Integration Object"))
				{
					DataType = new String("INT_OBJ");
				}
				DefaultDate = new String(textField_34.getText().trim());
				DefaultNumber = new String(textField_35.getText().trim());
				DefaultString = new String(textField_26.getText().trim());
				DisplayName = new String(textField_30.getText().trim());
				String scomboBox_2 = (String)comboBox_2.getSelectedItem();
				if (scomboBox_2.equals("In"))
				{
					InOut = new String("IN");
				}
				if (scomboBox_2.equals("Out"))
				{
					InOut = new String("OUT");
				}
				if (scomboBox_2.equals("In/Out"))
				{
					InOut = new String("INOUT");
				}
				if (scomboBox_2.equals("None"))
				{
					InOut = new String("NONE");
				}
				if (checkBox_4.isSelected() == true)
				{
					Inactive = new String("Y");
				}
				else
				{
					Inactive = new String("");
				}
				IntegrationObject = new String(textField_31.getText().trim());
				String sVirtualField = (String)comboBox_3.getSelectedItem();
				VirtualField = new String(sVirtualField);
			}

			this.setVisible(false);
		}
	}

	public void setWfName(String sString) {
		textField.setText(sString);
	}

	public void setPPName(String sString) {
		textField_1.setText(sString);
	}

	public void setLowerDispName(String sString) {
		textField_2.setText(sString);
	}

	public void setLowerInOut(String sString) {
		if (sString.equals("IN"))
		{
			textField_3.setText("In");
		}
		if (sString.equals("OUT"))
		{
			textField_3.setText("Out");
		}
		if (sString.equals("INOUT"))
		{
			textField_3.setText("In/Out");
		}
		if (sString.equals("NONE"))
		{
			textField_3.setText("None");
		}
	}

	public void setLowerBC(String sString) {
		textField_4.setText(sString);
	}

	public void setLowerVF(String sString) {
		textField_5.setText(sString);
	}

	public void setLowerDefaultString(String sString) {
		textField_6.setText(sString);
	}

	public void setLowerDefaultDate(String sString) {
		textField_7.setText(sString);
	}

	public void setLowerDataType(String sString) {
		if (sString.equals("ALIAS"))
		{
			textField_8.setText("Alias");
		}
		if (sString.equals("BINARY"))
		{
			textField_8.setText("Binary");
		}
		if (sString.equals("DATE"))
		{
			textField_8.setText("Date");
		}
		if (sString.equals("VARCHAR"))
		{
			textField_8.setText("String");
		}
		if (sString.equals("PROPSET_CHILD"))
		{
			textField_8.setText("Hierarchy");
		}
		if (sString.equals("INT_OBJ"))
		{
			textField_8.setText("Integration Object");
		}
		if (sString.equals("NUMBER"))
		{
			textField_8.setText("Number");
		}
	}

	public void setLowerIO(String sString) {
		textField_9.setText(sString);
	}

	public void setLowerDefaultNumber(String sString) {
		textField_10.setText(sString);
	}

	public void setLowerCorrelator(String sString) {
		if (sString.equals("Y"))
		{
			chckbxNewCheckBox.setSelected(true);
		}
		else
		{
			chckbxNewCheckBox.setSelected(false);
		}
	}

	public void setLowerInactive(String sString) {
		if (sString.equals("Y"))
		{
			checkBox.setSelected(true);
		}
		else
		{
			checkBox.setSelected(false);
		}
	}

	public void setLowerComments(String sString) {
		textField_11.setText(sString);
	}

	public void setLowerAccessMode(String sString) {
		textField_12.setText(sString);
	}

	public void setHigherDispName(String sString) {
		textField_19.setText(sString);
	}

	public void setHigherInOut(String sString) {
		if (sString.equals("IN"))
		{
			textField_18.setText("In");
		}
		if (sString.equals("OUT"))
		{
			textField_18.setText("Out");
		}
		if (sString.equals("INOUT"))
		{
			textField_18.setText("In/Out");
		}
		if (sString.equals("NONE"))
		{
			textField_18.setText("None");
		}
	}

	public void setHigherBC(String sString) {
		textField_17.setText(sString);
	}

	public void setHigherVF(String sString) {
		textField_16.setText(sString);
	}

	public void setHigherDefaultString(String sString) {
		textField_15.setText(sString);
	}

	public void setHigherDefaultDate(String sString) {
		textField_14.setText(sString);
	}

	public void setHigherDataType(String sString) {
		if (sString.equals("ALIAS"))
		{
			textField_13.setText("Alias");
		}
		if (sString.equals("BINARY"))
		{
			textField_13.setText("Binary");
		}
		if (sString.equals("DATE"))
		{
			textField_13.setText("Date");
		}
		if (sString.equals("VARCHAR"))
		{
			textField_13.setText("String");
		}
		if (sString.equals("PROPSET_CHILD"))
		{
			textField_13.setText("Hierarchy");
		}
		if (sString.equals("INT_OBJ"))
		{
			textField_13.setText("Integration Object");
		}
		if (sString.equals("NUMBER"))
		{
			textField_13.setText("Number");
		}
	}

	public void setHigherIO(String sString) {
		textField_20.setText(sString);
	}

	public void setHigherDefaultNumber(String sString) {
		textField_21.setText(sString);
	}

	public void setHigherCorrelator(String sString) {
		if (sString.equals("Y"))
		{
			checkBox_1.setSelected(true);
		}
		else
		{
			checkBox_1.setSelected(false);
		}
	}

	public void setHigherInactive(String sString) {
		if (sString.equals("Y"))
		{
			checkBox_2.setSelected(true);
		}
		else
		{
			checkBox_2.setSelected(false);
		}
	}

	public void setHigherComments(String sString) {
		textField_22.setText(sString);
	}

	public void setHigherAccessMode(String sString) {
		textField_23.setText(sString);
	}

	public void setNewDispName(String sString) {
		textField_30.setText(sString);
	}

	public void setNewInOut(String sString) {
		if (sString.equals("IN"))
		{
			comboBox_2.setSelectedItem("In");
		}
		if (sString.equals("OUT"))
		{
			comboBox_2.setSelectedItem("Out");
		}
		if (sString.equals("INOUT"))
		{
			comboBox_2.setSelectedItem("In/Out");
		}
		if (sString.equals("NONE"))
		{
			comboBox_2.setSelectedItem("None");
		}
	}

	public void setNewBC(String sString) {
		textField_28.setText(sString);
	}

	public void setNewVF(String DataType, String sString) {
		if (DataType.equals("ALIAS"))
		{		
			comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"", "Created", "Created By", "Id", "Merge Sequence Number", "Num Calls", "Outline Number", "Startup Flag", "Updated", "Updated By"}));
		}
		else
		{
			comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"", "Created", "Created By", "Id", "Updated", "Updated By"}));
		}

		comboBox_3.setSelectedItem(sString);
	}

	public void setNewDefaultString(String sString) {
		textField_26.setText(sString);
	}

	public void setNewDefaultDate(String sString) {
		textField_34.setText(sString);
	}

	public void setNewDataType(String sString) {
		if (sString.equals("ALIAS"))
		{
			comboBox.setSelectedItem("Alias");
		}
		if (sString.equals("BINARY"))
		{
			comboBox.setSelectedItem("Binary");
		}
		if (sString.equals("DATE"))
		{
			comboBox.setSelectedItem("Date");
		}
		if (sString.equals("VARCHAR"))
		{
			comboBox.setSelectedItem("String");
		}
		if (sString.equals("PROPSET_CHILD"))
		{
			comboBox.setSelectedItem("Hierarchy");
		}
		if (sString.equals("INT_OBJ"))
		{
			comboBox.setSelectedItem("Integration Object");
		}
		if (sString.equals("NUMBER"))
		{
			comboBox.setSelectedItem("Number");
		}
	}

	public void setNewIO(String sString) {
		textField_31.setText(sString);
	}

	public void setNewDefaultNumber(String sString) {
		textField_35.setText(sString);
	}

	public void setNewCorrelator(String sString) {
		if (sString.equals("Y"))
		{
			checkBox_3.setSelected(true);
		}
		else
		{
			checkBox_3.setSelected(false);
		}
	}

	public void setNewInactive(String sString) {
		if (sString.equals("Y"))
		{
			checkBox_4.setSelected(true);
		}
		else
		{
			checkBox_4.setSelected(false);
		}
	}

	public void setNewComments(String sString) {
		textField_33.setText(sString);
	}

	public void setNewAccessMode(String sString) {
		comboBox_1.setSelectedItem(sString);
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
}
