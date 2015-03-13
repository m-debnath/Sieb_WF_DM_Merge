import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JCheckBox;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


public class ConflictEaiComponentMap extends JDialog implements ActionListener {

	public String SourceComponentName, DestinationComponentName, SourceSearchSpecification, ParentComponentMapName;
	public ArrayList<EaiFieldMap> ListOfEaiFieldMap;

	private final JPanel contentPanel = new MyPanel();
	private JScrollPane scrollPane;
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
	private String DisplayErrorMessage;
	private JCheckBox checkBox;
	private JCheckBox checkBox_1;
	private JCheckBox checkBox_2;
	//private JList<EaiFieldMap> list, list_1, list_2;
	private JScrollPane scrollpane, scrollpane_1, scrollpane_2;
	private JTable table, table_1,table_2;
	JButton button, button_1, button_2, button_3, button_4, button_5;
	JButton btnEnter, btnDiscard, button_6, button_7, button_8, button_9, okButton;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ConflictEaiComponentMap dialog = new ConflictEaiComponentMap();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */

	public ConflictEaiComponentMap() {
		super();
	}
	public ConflictEaiComponentMap(Frame frame, ArrayList<EaiFieldMap> listOfLowerEaiFieldMap, ArrayList<EaiFieldMap> listOfHigherEaiFieldMap, ArrayList<EaiFieldMap> listOfNewEaiFieldMap) {
		super(frame,"Conflicting EAI Component Maps",true);
		//setResizable(false);
		setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 700, 600);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		scrollPane = new JScrollPane(contentPanel);
		getContentPane().add(scrollPane, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel label = new JLabel("Data Map Name:");
		label.setFont(new Font("Tahoma", Font.BOLD, 12));
		label.setBounds(10, 13, 100, 15);
		contentPanel.add(label);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBounds(116, 11, 764, 20);
		contentPanel.add(textField);
		
		JLabel lblIntegrationComponentMap = new JLabel("Integration Component Map Name:");
		lblIntegrationComponentMap.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblIntegrationComponentMap.setBounds(20, 43, 194, 15);
		contentPanel.add(lblIntegrationComponentMap);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(224, 42, 656, 20);
		contentPanel.add(textField_1);
		
		JLabel lblNewLabel = new JLabel("Lower Version Details Below...");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(10, 69, 175, 14);
		contentPanel.add(lblNewLabel);
		
		JLabel label_1 = new JLabel("Source Component Name");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_1.setBounds(10, 95, 128, 14);
		contentPanel.add(label_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(10, 117, 194, 20);
		contentPanel.add(textField_2);
		
		JLabel label_2 = new JLabel("Target Component Name");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_2.setBounds(212, 95, 146, 14);
		contentPanel.add(label_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(212, 117, 196, 20);
		contentPanel.add(textField_3);
		
		JLabel label_3 = new JLabel("Source Serarch Specification");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_3.setBounds(418, 94, 146, 14);
		contentPanel.add(label_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(418, 117, 256, 20);
		contentPanel.add(textField_4);
		
		JLabel label_4 = new JLabel("Parent Component Map Name");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_4.setBounds(684, 95, 146, 14);
		contentPanel.add(label_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(684, 118, 196, 20);
		contentPanel.add(textField_5);
		
		JLabel lblNewLabel_1 = new JLabel("EAI Field Map");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_1.setBounds(10, 148, 65, 14);
		contentPanel.add(lblNewLabel_1);
		
		table = new JTable(listOfLowerEaiFieldMap.size(),3);
		table.setFont(new Font("Tahoma", Font.PLAIN, 10));
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		for (int i = 0; i < listOfLowerEaiFieldMap.size(); i++)
		{
			table.setValueAt(listOfLowerEaiFieldMap.get(i).SourceFieldExpression, i, 0);
			table.setValueAt(listOfLowerEaiFieldMap.get(i).DestinationFieldName, i, 1);
			table.setValueAt(listOfLowerEaiFieldMap.get(i).Comments, i, 2);
		}
		table.getColumnModel().getColumn(0).setHeaderValue("Source Expression");
		table.getColumnModel().getColumn(1).setHeaderValue("Target Field Name");
		table.getColumnModel().getColumn(2).setHeaderValue("Comments");
		table.getTableHeader().resizeAndRepaint();
		scrollpane = new JScrollPane(table);
		scrollpane.setBounds(10, 173, 870, 100);
		contentPanel.add(scrollpane);
		
		JLabel lblHigherVersionDetails = new JLabel("Higher Version Details Below...");
		lblHigherVersionDetails.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblHigherVersionDetails.setBounds(10, 304, 175, 14);
		contentPanel.add(lblHigherVersionDetails);
		
		JLabel label_6 = new JLabel("Source Component Name");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_6.setBounds(10, 330, 128, 14);
		contentPanel.add(label_6);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBounds(10, 352, 194, 20);
		contentPanel.add(textField_6);
		
		JLabel label_7 = new JLabel("Target Component Name");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_7.setBounds(212, 330, 146, 14);
		contentPanel.add(label_7);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBounds(212, 352, 196, 20);
		contentPanel.add(textField_7);
		
		JLabel label_8 = new JLabel("Source Serarch Specification");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_8.setBounds(418, 329, 146, 14);
		contentPanel.add(label_8);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBounds(418, 352, 256, 20);
		contentPanel.add(textField_8);
		
		JLabel label_9 = new JLabel("Parent Component Map Name");
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_9.setBounds(684, 330, 146, 14);
		contentPanel.add(label_9);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_9.setEditable(false);
		textField_9.setColumns(10);
		textField_9.setBounds(684, 353, 196, 20);
		contentPanel.add(textField_9);
		
		JLabel label_10 = new JLabel("EAI Field Map");
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_10.setBounds(10, 383, 65, 14);
		contentPanel.add(label_10);
		
		table_1 = new JTable(listOfHigherEaiFieldMap.size(),3);
		table_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		table_1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		for (int i = 0; i < listOfHigherEaiFieldMap.size(); i++)
		{
			table_1.setValueAt(listOfHigherEaiFieldMap.get(i).SourceFieldExpression, i, 0);
			table_1.setValueAt(listOfHigherEaiFieldMap.get(i).DestinationFieldName, i, 1);
			table_1.setValueAt(listOfHigherEaiFieldMap.get(i).Comments, i, 2);
		}
		table_1.getColumnModel().getColumn(0).setHeaderValue("Source Expression");
		table_1.getColumnModel().getColumn(1).setHeaderValue("Target Field Name");
		table_1.getColumnModel().getColumn(2).setHeaderValue("Comments");
		table_1.getTableHeader().resizeAndRepaint();
		scrollpane_1 = new JScrollPane(table_1);
		scrollpane_1.setBounds(10, 408, 870, 100);
		contentPanel.add(scrollpane_1);
		
		JLabel lblEnterNewDetails = new JLabel("New Details Below... (Already showing previously merged EAI Field Maps, you can change as per your needs)");
		lblEnterNewDetails.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEnterNewDetails.setBounds(10, 539, 664, 14);
		contentPanel.add(lblEnterNewDetails);
		
		JLabel label_11 = new JLabel("Source Component Name");
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_11.setBounds(10, 565, 128, 14);
		contentPanel.add(label_11);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_10.setColumns(10);
		textField_10.setBounds(10, 587, 194, 20);
		contentPanel.add(textField_10);
		
		JLabel label_12 = new JLabel("Target Component Name");
		label_12.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_12.setBounds(212, 565, 146, 14);
		contentPanel.add(label_12);
		
		textField_11 = new JTextField();
		textField_11.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_11.setColumns(10);
		textField_11.setBounds(212, 587, 196, 20);
		contentPanel.add(textField_11);
		
		JLabel label_13 = new JLabel("Source Serarch Specification");
		label_13.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_13.setBounds(418, 564, 146, 14);
		contentPanel.add(label_13);
		
		textField_12 = new JTextField();
		textField_12.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_12.setColumns(10);
		textField_12.setBounds(418, 587, 256, 20);
		contentPanel.add(textField_12);
		
		JLabel label_14 = new JLabel("Parent Component Map Name");
		label_14.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_14.setBounds(684, 565, 146, 14);
		contentPanel.add(label_14);
		
		textField_13 = new JTextField();
		textField_13.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_13.setColumns(10);
		textField_13.setBounds(684, 588, 196, 20);
		contentPanel.add(textField_13);
		
		JLabel label_15 = new JLabel("EAI Field Map");
		label_15.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_15.setBounds(10, 618, 65, 14);
		contentPanel.add(label_15);
		
		table_2 = new JTable(listOfNewEaiFieldMap.size(),3);
		table_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		table_2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		for (int i = 0; i < listOfNewEaiFieldMap.size(); i++)
		{
			table_2.setValueAt(listOfNewEaiFieldMap.get(i).SourceFieldExpression, i, 0);
			table_2.setValueAt(listOfNewEaiFieldMap.get(i).DestinationFieldName, i, 1);
			table_2.setValueAt(listOfNewEaiFieldMap.get(i).Comments, i, 2);
		}
		table_2.getColumnModel().getColumn(0).setHeaderValue("Source Expression");
		table_2.getColumnModel().getColumn(1).setHeaderValue("Target Field Name");
		table_2.getColumnModel().getColumn(2).setHeaderValue("Comments");
		table_2.getTableHeader().resizeAndRepaint();
		scrollpane_2 = new JScrollPane(table_2);
		scrollpane_2.setBounds(10, 643, 870, 100);
		contentPanel.add(scrollpane_2);
		
		JLabel label_5 = new JLabel("Resolve the conflict below");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_5.setBounds(10, 770, 277, 15);
		contentPanel.add(label_5);
		
		checkBox = new JCheckBox("Use the lower version component map");
		checkBox.setFont(new Font("Tahoma", Font.PLAIN, 10));
		checkBox.setBounds(10, 792, 204, 23);
		contentPanel.add(checkBox);
		checkBox.addActionListener(this);
		
		checkBox_1 = new JCheckBox("Use the higher version component map");
		checkBox_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		checkBox_1.setBounds(10, 814, 204, 23);
		contentPanel.add(checkBox_1);
		checkBox_1.addActionListener(this);
		
		checkBox_2 = new JCheckBox("Use the new component map");
		checkBox_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		checkBox_2.setBounds(224, 792, 175, 23);
		contentPanel.add(checkBox_2);
		checkBox_2.addActionListener(this);

		button = new JButton("");
		button.setIcon(new ImageIcon(getClass().getResource("add-icon.png")));
		button.setBounds(855, 144, 23, 23);
		contentPanel.add(button);
		button.setActionCommand("Lower Add");
		button.setToolTipText("Add");
		button.addActionListener(this);
		
		button_1 = new JButton("");
		button_1.setIcon(new ImageIcon(getClass().getResource("del-icon.png")));
		button_1.setBounds(822, 144, 23, 23);
		contentPanel.add(button_1);
		button_1.setActionCommand("Lower Del");
		button_1.setToolTipText("Delete");
		button_1.addActionListener(this);
		
		button_2 = new JButton("");
		button_2.setIcon(new ImageIcon(getClass().getResource("add-icon.png")));
		button_2.setBounds(855, 379, 23, 23);
		contentPanel.add(button_2);
		button_2.setActionCommand("Higher Add");
		button_2.setToolTipText("Add");
		button_2.addActionListener(this);
		
		button_3 = new JButton("");
		button_3.setIcon(new ImageIcon(getClass().getResource("del-icon.png")));
		button_3.setBounds(822, 379, 23, 23);
		contentPanel.add(button_3);
		button_3.setActionCommand("Higher Del");
		button_3.setToolTipText("Delete");
		button_3.addActionListener(this);
		
		button_4 = new JButton("");
		button_4.setIcon(new ImageIcon(getClass().getResource("add-icon.png")));
		button_4.setBounds(855, 614, 23, 23);
		contentPanel.add(button_4);
		button_4.setActionCommand("New Add");
		button_4.setToolTipText("Add");
		button_4.addActionListener(this);
		
		button_5 = new JButton("");
		button_5.setIcon(new ImageIcon(getClass().getResource("del-icon.png")));
		button_5.setBounds(822, 614, 23, 23);
		button_5.setToolTipText("Delete");
		contentPanel.add(button_5);
		button_5.setActionCommand("New Del");
		button_5.addActionListener(this);

		textField_14 = new JTextField();
		textField_14.setBounds(10, 273, 290, 20);
		contentPanel.add(textField_14);
		textField_14.setColumns(10);
		textField_14.setEditable(false);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(299, 273, 290, 20);
		contentPanel.add(textField_15);
		textField_15.setEditable(false);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(589, 273, 290, 20);
		contentPanel.add(textField_16);
		textField_16.setEditable(false);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(11, 508, 290, 20);
		contentPanel.add(textField_17);
		textField_17.setEditable(false);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(300, 508, 290, 20);
		contentPanel.add(textField_18);
		textField_18.setEditable(false);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(590, 508, 290, 20);
		contentPanel.add(textField_19);
		textField_19.setEditable(false);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(10, 744, 290, 20);
		contentPanel.add(textField_20);
		textField_20.setEditable(false);
		
		textField_21 = new JTextField();
		textField_14.setEditable(false);
		textField_21.setColumns(10);
		textField_21.setBounds(299, 744, 290, 20);
		contentPanel.add(textField_21);
		textField_21.setEditable(false);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(589, 744, 290, 20);
		contentPanel.add(textField_22);
		textField_22.setEditable(false);

		btnEnter = new JButton("");
		btnEnter.setEnabled(false);
		btnEnter.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnEnter.setBounds(857, 295, 23, 23);
		btnEnter.setActionCommand("Lower Enter");
		btnEnter.setIcon(new ImageIcon(getClass().getResource("Enter-icon.GIF")));
		btnEnter.setToolTipText("Enter");
		btnEnter.addActionListener(this);
		contentPanel.add(btnEnter);
		
		btnDiscard = new JButton("");
		btnDiscard.setEnabled(false);
		btnDiscard.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnDiscard.setBounds(822, 295, 23, 23);
		btnDiscard.setActionCommand("Lower Discard");
		btnDiscard.setIcon(new ImageIcon(getClass().getResource("Discard-icon.GIF")));
		btnDiscard.setToolTipText("Discard");
		btnDiscard.addActionListener(this);
		contentPanel.add(btnDiscard);
		
		button_6 = new JButton("");
		button_6.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_6.setEnabled(false);
		button_6.setBounds(822, 530, 23, 23);
		button_6.setActionCommand("Higher Discard");
		button_6.setIcon(new ImageIcon(getClass().getResource("Discard-icon.GIF")));
		button_6.setToolTipText("Discard");
		button_6.addActionListener(this);
		contentPanel.add(button_6);
		
		button_7 = new JButton("");
		button_7.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_7.setEnabled(false);
		button_7.setBounds(857, 530, 23, 23);
		button_7.setActionCommand("Higher Enter");
		button_7.setIcon(new ImageIcon(getClass().getResource("Enter-icon.GIF")));
		button_7.setToolTipText("Enter");
		button_7.addActionListener(this);
		contentPanel.add(button_7);
		
		button_8 = new JButton("");
		button_8.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_8.setEnabled(false);
		button_8.setBounds(822, 766, 23, 23);
		button_8.setActionCommand("New Discard");
		button_8.setIcon(new ImageIcon(getClass().getResource("Discard-icon.GIF")));
		button_8.setToolTipText("Discard");
		button_8.addActionListener(this);
		contentPanel.add(button_8);
		
		button_9 = new JButton("");
		button_9.setFont(new Font("Tahoma", Font.PLAIN, 10));
		button_9.setEnabled(false);
		button_9.setBounds(857, 766, 23, 23);
		button_9.setActionCommand("New Enter");
		button_9.setIcon(new ImageIcon(getClass().getResource("Enter-icon.GIF")));
		button_9.setToolTipText("Enter");
		button_9.addActionListener(this);
		contentPanel.add(button_9);

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

	public void actionPerformed (ActionEvent e) {
		String cmd = e.getActionCommand();
		String DisplayMessage = new String("");
		if (cmd.equals("Use the lower version component map"))
		{
			if (checkBox.isSelected() == true)
			{
				checkBox_1.setSelected(false);
				checkBox_2.setSelected(false);
			}
		}
		if (cmd.equals("Use the higher version component map"))
		{
			if (checkBox_1.isSelected() == true)
			{
				checkBox.setSelected(false);
				checkBox_2.setSelected(false);
			}
		}
		if (cmd.equals("Use the new component map"))
		{
			if (checkBox_2.isSelected() == true)
			{
				checkBox.setSelected(false);
				checkBox_1.setSelected(false);
			}
		}
		if (cmd.equals("Lower Del"))
		{
			if (table.getSelectedRow() == -1)
			{
				DisplayErrorMessage = "Please select a row first then press delete.";
				JLabel lblmessage = new JLabel(DisplayErrorMessage);
				lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
				JOptionPane.showMessageDialog(this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
				return;
			}
			JOptionPane warningPane = new JOptionPane();
			DisplayMessage = "Are you sure you want to delete the selected row?";
			JLabel lblmessage = new JLabel(DisplayMessage);
			lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
			int choice = warningPane.showConfirmDialog(this,lblmessage,"Confirm",JOptionPane.YES_NO_OPTION); // 0 for Yes, 1 for No
			if (choice == 1)
			{
				return;
			}
			DefaultTableModel model = (DefaultTableModel)table.getModel();
			model.removeRow(table.getSelectedRow());
		}
		if (cmd.equals("Higher Del"))
		{
			if (table_1.getSelectedRow() == -1)
			{
				DisplayErrorMessage = "Please select a row first then press delete.";
				JLabel lblmessage = new JLabel(DisplayErrorMessage);
				lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
				JOptionPane.showMessageDialog(this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
				return;
			}
			JOptionPane warningPane = new JOptionPane();
			DisplayMessage = "Are you sure you want to delete the selected row?";
			JLabel lblmessage = new JLabel(DisplayMessage);
			lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
			int choice = warningPane.showConfirmDialog(this,lblmessage,"Confirm",JOptionPane.YES_NO_OPTION); // 0 for Yes, 1 for No
			if (choice == 1)
			{
				return;
			}
			DefaultTableModel model = (DefaultTableModel)table_1.getModel();
			model.removeRow(table_1.getSelectedRow());
		}
		if (cmd.equals("New Del"))
		{
			if (table_2.getSelectedRow() == -1)
			{
				DisplayErrorMessage = "Please select a row first then press delete.";
				JLabel lblmessage = new JLabel(DisplayErrorMessage);
				lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
				JOptionPane.showMessageDialog(this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
				return;
			}
			JOptionPane warningPane = new JOptionPane();
			DisplayMessage = "Are you sure you want to delete the selected row?";
			JLabel lblmessage = new JLabel(DisplayMessage);
			lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
			int choice = warningPane.showConfirmDialog(this,lblmessage,"Confirm",JOptionPane.YES_NO_OPTION); // 0 for Yes, 1 for No
			if (choice == 1)
			{
				return;
			}
			DefaultTableModel model = (DefaultTableModel)table_2.getModel();
			model.removeRow(table_2.getSelectedRow());
		}
		if (cmd.equals("Lower Add"))
		{
			textField_14.setEditable(true);
			textField_15.setEditable(true);
			textField_15.requestFocusInWindow();
			textField_16.setEditable(true);
			btnDiscard.setEnabled(true);
			btnEnter.setEnabled(true);
			button.setEnabled(false);
			button_1.setEnabled(false);
			button_2.setEnabled(false);
			button_3.setEnabled(false);
			button_4.setEnabled(false);
			button_5.setEnabled(false);
			okButton.setEnabled(false);
		}
		if (cmd.equals("Higher Add"))
		{
			textField_17.setEditable(true);
			textField_18.setEditable(true);
			textField_18.requestFocusInWindow();
			textField_19.setEditable(true);
			button_6.setEnabled(true);
			button_7.setEnabled(true);
			button.setEnabled(false);
			button_1.setEnabled(false);
			button_2.setEnabled(false);
			button_3.setEnabled(false);
			button_4.setEnabled(false);
			button_5.setEnabled(false);
			okButton.setEnabled(false);
		}
		if (cmd.equals("New Add"))
		{
			textField_20.setEditable(true);
			textField_21.setEditable(true);
			textField_21.requestFocusInWindow();
			textField_22.setEditable(true);
			button_8.setEnabled(true);
			button_9.setEnabled(true);
			button.setEnabled(false);
			button_1.setEnabled(false);
			button_2.setEnabled(false);
			button_3.setEnabled(false);
			button_4.setEnabled(false);
			button_5.setEnabled(false);
			okButton.setEnabled(false);
		}
		if (cmd.equals("Lower Discard"))
		{
			textField_14.setText("");
			textField_15.setText("");
			textField_16.setText("");
			textField_14.setEditable(false);
			textField_15.setEditable(false);
			textField_16.setEditable(false);
			btnDiscard.setEnabled(false);
			btnEnter.setEnabled(false);
			button.setEnabled(true);
			button_1.setEnabled(true);
			button_2.setEnabled(true);
			button_3.setEnabled(true);
			button_4.setEnabled(true);
			button_5.setEnabled(true);
			okButton.setEnabled(true);
		}
		if (cmd.equals("Higher Discard"))
		{
			textField_17.setText("");
			textField_18.setText("");
			textField_19.setText("");
			textField_17.setEditable(false);
			textField_18.setEditable(false);
			textField_19.setEditable(false);
			button_6.setEnabled(false);
			button_7.setEnabled(false);
			button.setEnabled(true);
			button_1.setEnabled(true);
			button_2.setEnabled(true);
			button_3.setEnabled(true);
			button_4.setEnabled(true);
			button_5.setEnabled(true);
			okButton.setEnabled(true);
		}
		if (cmd.equals("New Discard"))
		{
			textField_20.setText("");
			textField_21.setText("");
			textField_22.setText("");
			textField_20.setEditable(false);
			textField_21.setEditable(false);
			textField_22.setEditable(false);
			button_8.setEnabled(false);
			button_9.setEnabled(false);
			button.setEnabled(true);
			button_1.setEnabled(true);
			button_2.setEnabled(true);
			button_3.setEnabled(true);
			button_4.setEnabled(true);
			button_5.setEnabled(true);
			okButton.setEnabled(true);
		}
		if (cmd.equals("Lower Enter"))
		{
			String srcexp = textField_14.getText().trim();
			String trgtfld = textField_15.getText().trim();
			String comment = textField_16.getText().trim();
			String [] inp = new String [] {srcexp, trgtfld, comment};
			if ((srcexp == null || srcexp.equals("")) && (trgtfld == null || trgtfld.equals("")))
			{
				DisplayErrorMessage = "Invalid or missing data submitted: Source Expression, Target Field Name";
				JLabel lblmessage = new JLabel(DisplayErrorMessage);
				lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
				JOptionPane.showMessageDialog(this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
				return;
			}
			if (srcexp == null || srcexp.equals(""))
			{
				DisplayErrorMessage = "Invalid or missing data submitted: Source Expression";
				JLabel lblmessage = new JLabel(DisplayErrorMessage);
				lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
				JOptionPane.showMessageDialog(this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
				return;
			}
			if (trgtfld == null || trgtfld.equals(""))
			{
				DisplayErrorMessage = "Invalid or missing data submitted: Target Field Name";
				JLabel lblmessage = new JLabel(DisplayErrorMessage);
				lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
				JOptionPane.showMessageDialog(this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
				return;
			}
			DefaultTableModel model = (DefaultTableModel)table.getModel();
			model.addRow(inp);
			textField_14.setText("");
			textField_15.setText("");
			textField_16.setText("");
			textField_14.setEditable(false);
			textField_15.setEditable(false);
			textField_16.setEditable(false);
			btnDiscard.setEnabled(false);
			btnEnter.setEnabled(false);
			button.setEnabled(true);
			button_1.setEnabled(true);
			button_2.setEnabled(true);
			button_3.setEnabled(true);
			button_4.setEnabled(true);
			button_5.setEnabled(true);
			okButton.setEnabled(true);
		}
		
		if (cmd.equals("Higher Enter"))
		{
			String srcexp = textField_17.getText().trim();
			String trgtfld = textField_18.getText().trim();
			String comment = textField_19.getText().trim();
			String [] inp = new String [] {srcexp, trgtfld, comment};
			if ((srcexp == null || srcexp.equals("")) && (trgtfld == null || trgtfld.equals("")))
			{
				DisplayErrorMessage = "Invalid or missing data submitted: Source Expression, Target Field Name";
				JLabel lblmessage = new JLabel(DisplayErrorMessage);
				lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
				JOptionPane.showMessageDialog(this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
				return;
			}
			if (srcexp == null || srcexp.equals(""))
			{
				DisplayErrorMessage = "Invalid or missing data submitted: Source Expression";
				JLabel lblmessage = new JLabel(DisplayErrorMessage);
				lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
				JOptionPane.showMessageDialog(this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
				return;
			}
			if (trgtfld == null || trgtfld.equals(""))
			{
				DisplayErrorMessage = "Invalid or missing data submitted: Target Field Name";
				JLabel lblmessage = new JLabel(DisplayErrorMessage);
				lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
				JOptionPane.showMessageDialog(this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
				return;
			}
			DefaultTableModel model = (DefaultTableModel)table_1.getModel();
			model.addRow(inp);
			textField_17.setText("");
			textField_18.setText("");
			textField_19.setText("");
			textField_17.setEditable(false);
			textField_18.setEditable(false);
			textField_19.setEditable(false);
			button_6.setEnabled(false);
			button_7.setEnabled(false);
			button.setEnabled(true);
			button_1.setEnabled(true);
			button_2.setEnabled(true);
			button_3.setEnabled(true);
			button_4.setEnabled(true);
			button_5.setEnabled(true);
			okButton.setEnabled(true);
		}
		
		if (cmd.equals("New Enter"))
		{
			String srcexp = textField_20.getText().trim();
			String trgtfld = textField_21.getText().trim();
			String comment = textField_22.getText().trim();
			String [] inp = new String [] {srcexp, trgtfld, comment};
			if ((srcexp == null || srcexp.equals("")) && (trgtfld == null || trgtfld.equals("")))
			{
				DisplayErrorMessage = "Invalid or missing data submitted: Source Expression, Target Field Name";
				JLabel lblmessage = new JLabel(DisplayErrorMessage);
				lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
				JOptionPane.showMessageDialog(this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
				return;
			}
			if (srcexp == null || srcexp.equals(""))
			{
				DisplayErrorMessage = "Invalid or missing data submitted: Source Expression";
				JLabel lblmessage = new JLabel(DisplayErrorMessage);
				lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
				JOptionPane.showMessageDialog(this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
				return;
			}
			if (trgtfld == null || trgtfld.equals(""))
			{
				DisplayErrorMessage = "Invalid or missing data submitted: Target Field Name";
				JLabel lblmessage = new JLabel(DisplayErrorMessage);
				lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
				JOptionPane.showMessageDialog(this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
				return;
			}
			DefaultTableModel model = (DefaultTableModel)table_2.getModel();
			model.addRow(inp);
			textField_20.setText("");
			textField_21.setText("");
			textField_22.setText("");
			textField_20.setEditable(false);
			textField_21.setEditable(false);
			textField_22.setEditable(false);
			button_8.setEnabled(false);
			button_9.setEnabled(false);
			button.setEnabled(true);
			button_1.setEnabled(true);
			button_2.setEnabled(true);
			button_3.setEnabled(true);
			button_4.setEnabled(true);
			button_5.setEnabled(true);
			okButton.setEnabled(true);
		}
		if (cmd.equals("OK"))
		{
			if (checkBox.isSelected() == false && checkBox_1.isSelected() == false && checkBox_2.isSelected() == false)
			{
				DisplayErrorMessage = "Invalid or missing data submitted: Resolution option";
				JLabel lblmessage = new JLabel(DisplayErrorMessage);
				lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
				JOptionPane.showMessageDialog(this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
				return;
			}
			if (checkBox.isSelected() == true)
			{
				SourceComponentName = textField_2.getText().trim();
				DestinationComponentName = textField_3.getText().trim();
				SourceSearchSpecification = textField_4.getText().trim();
				ParentComponentMapName = textField_5.getText().trim();

				ListOfEaiFieldMap = new ArrayList<EaiFieldMap>();

				DefaultTableModel model = (DefaultTableModel)table.getModel();
				for (int i=0; i<model.getRowCount(); i++)
				{
					String srcExp = (String)model.getValueAt(i,0);
					String trgtFld = (String)model.getValueAt(i,1);
					String comment = (String)model.getValueAt(i,2);
					EaiFieldMap eaiFieldMap = new EaiFieldMap(comment, trgtFld, srcExp);
					ListOfEaiFieldMap.add(eaiFieldMap);
				}
			}
			if (checkBox_1.isSelected() == true)
			{
				SourceComponentName = textField_6.getText().trim();
				DestinationComponentName = textField_7.getText().trim();
				SourceSearchSpecification = textField_8.getText().trim();
				ParentComponentMapName = textField_9.getText().trim();

				ListOfEaiFieldMap = new ArrayList<EaiFieldMap>();

				DefaultTableModel model = (DefaultTableModel)table_1.getModel();
				for (int i=0; i<model.getRowCount(); i++)
				{
					String srcExp = (String)model.getValueAt(i,0);
					String trgtFld = (String)model.getValueAt(i,1);
					String comment = (String)model.getValueAt(i,2);
					EaiFieldMap eaiFieldMap = new EaiFieldMap(comment, trgtFld, srcExp);
					ListOfEaiFieldMap.add(eaiFieldMap);
				}
			}
			if (checkBox_2.isSelected() == true)
			{
				String newSrcExp = textField_10.getText().trim();
				if (newSrcExp == null || newSrcExp.equals(""))
				{
					DisplayErrorMessage = "Invalid or missing data submitted: New Source Expression";
					JLabel lblmessage = new JLabel(DisplayErrorMessage);
					lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
					JOptionPane.showMessageDialog(this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
					return;

				}
				SourceComponentName = textField_10.getText().trim();
				DestinationComponentName = textField_11.getText().trim();
				SourceSearchSpecification = textField_12.getText().trim();
				ParentComponentMapName = textField_13.getText().trim();

				ListOfEaiFieldMap = new ArrayList<EaiFieldMap>();

				DefaultTableModel model = (DefaultTableModel)table_2.getModel();
				for (int i=0; i<model.getRowCount(); i++)
				{
					String srcExp = (String)model.getValueAt(i,0);
					String trgtFld = (String)model.getValueAt(i,1);
					String comment = (String)model.getValueAt(i,2);
					EaiFieldMap eaiFieldMap = new EaiFieldMap(comment, trgtFld, srcExp);
					ListOfEaiFieldMap.add(eaiFieldMap);
				}
			}

			this.setVisible(false);
		}
	}

	public ArrayList<EaiFieldMap> GetListOfEaiFieldMap() {
		return ListOfEaiFieldMap;
	}

	public void setDataMapName(String sString) {
		textField.setText(sString);
	}

	public void setICName(String sString) {
		textField_1.setText(sString);
	}

	public void setLowerSrcCmpntName(String sString) {
		textField_2.setText(sString);
	}

	public void setLowerTrgtCmpntName(String sString) {
		textField_3.setText(sString);
	}

	public void setLowerSrcSrchSpec(String sString) {
		textField_4.setText(sString);
	}

	public void setLowerPrntCmpntName(String sString) {
		textField_5.setText(sString);
	}

	public void setHigherSrcCmpntName(String sString) {
		textField_6.setText(sString);
	}

	public void setHigherTrgtCmpntName(String sString) {
		textField_7.setText(sString);
	}

	public void setHigherSrcSrchSpec(String sString) {
		textField_8.setText(sString);
	}

	public void setHigherPrntCmpntName(String sString) {
		textField_9.setText(sString);
	}

	public void setNewSrcCmpntName(String sString) {
		textField_10.setText(sString);
	}

	public void setNewTrgtCmpntName(String sString) {
		textField_11.setText(sString);
	}

	public void setNewSrcSrchSpec(String sString) {
		textField_12.setText(sString);
	}

	public void setNewPrntCmpntName(String sString) {
		textField_13.setText(sString);
	}
}
