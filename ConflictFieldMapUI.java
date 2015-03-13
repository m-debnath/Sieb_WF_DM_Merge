import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ConflictFieldMapUI extends JDialog implements ActionListener {

	private final JPanel contentPanel = new MyPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_9;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private ImageIcon icon;
	private String DisplayErrorMessage;
	private JCheckBox checkBox;
	private JCheckBox checkBox_1;
	private JCheckBox checkBox_2;
	private JScrollPane scrollpane;

	public String finalSrcExp, finalTrgtFieldName, finalComments;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConflictFieldMapUI frame = new ConflictFieldMapUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ConflictFieldMapUI() {
		super();
	}
	public ConflictFieldMapUI(Frame frame) {
		super(frame,"Conflicting EAI Field Maps",true);
		finalSrcExp = new String("");
		finalTrgtFieldName = new String("");
		finalComments = new String("");
		//setTitle("Conflicting EAI Field Maps");
		setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		setBounds(50, 50, 690, 530);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		scrollpane = new JScrollPane(contentPanel);
		getContentPane().add(scrollpane, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel label = new JLabel("Data Map Name:");
		label.setFont(new Font("Tahoma", Font.BOLD, 12));
		label.setBounds(10, 13, 204, 15);
		contentPanel.add(label);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBounds(116, 11, 841, 20);
		contentPanel.add(textField);
		
		JLabel label_1 = new JLabel("Integration Component Map");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_1.setBounds(11, 39, 204, 15);
		contentPanel.add(label_1);
		
		JLabel label_2 = new JLabel("Integration Field Map:: From Lower Version");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_2.setBounds(10, 119, 277, 15);
		contentPanel.add(label_2);
		
		JLabel label_3 = new JLabel("Integration Field Map:: From Higher Version");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_3.setBounds(10, 199, 277, 15);
		contentPanel.add(label_3);
		
		JLabel label_4 = new JLabel("Integration Field Map:: Create New");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_4.setBounds(10, 279, 277, 15);
		contentPanel.add(label_4);
		
		JLabel label_5 = new JLabel("Name");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_5.setBounds(11, 62, 46, 14);
		contentPanel.add(label_5);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(11, 85, 182, 20);
		contentPanel.add(textField_1);
		
		JLabel label_6 = new JLabel("Source Component Name");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_6.setBounds(203, 62, 128, 14);
		contentPanel.add(label_6);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(203, 84, 182, 20);
		contentPanel.add(textField_2);
		
		JLabel label_7 = new JLabel("Target Component Name");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_7.setBounds(395, 62, 146, 14);
		contentPanel.add(label_7);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(395, 84, 182, 20);
		contentPanel.add(textField_3);
		
		JLabel label_8 = new JLabel("Source Serarch Specification");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_8.setBounds(585, 62, 146, 14);
		contentPanel.add(label_8);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(585, 85, 182, 20);
		contentPanel.add(textField_4);
		
		JLabel label_9 = new JLabel("Parent Component Map Name");
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_9.setBounds(778, 61, 146, 14);
		contentPanel.add(label_9);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(777, 84, 182, 20);
		contentPanel.add(textField_5);
		
		JLabel label_10 = new JLabel("Source Expression");
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_10.setBounds(10, 142, 169, 14);
		contentPanel.add(label_10);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBounds(10, 165, 403, 20);
		contentPanel.add(textField_6);
		
		JLabel label_11 = new JLabel("Target Field Name");
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_11.setBounds(423, 141, 128, 14);
		contentPanel.add(label_11);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBounds(423, 165, 231, 20);
		contentPanel.add(textField_7);
		
		JLabel label_12 = new JLabel("Comments");
		label_12.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_12.setBounds(664, 142, 146, 14);
		contentPanel.add(label_12);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBounds(664, 165, 294, 20);
		contentPanel.add(textField_8);
		
		JLabel label_13 = new JLabel("Source Expression");
		label_13.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_13.setBounds(10, 222, 169, 14);
		contentPanel.add(label_13);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_9.setEditable(false);
		textField_9.setColumns(10);
		textField_9.setBounds(10, 245, 403, 20);
		contentPanel.add(textField_9);
		
		JLabel label_14 = new JLabel("Target Field Name");
		label_14.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_14.setBounds(423, 221, 128, 14);
		contentPanel.add(label_14);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_10.setEditable(false);
		textField_10.setColumns(10);
		textField_10.setBounds(423, 245, 231, 20);
		contentPanel.add(textField_10);
		
		JLabel label_15 = new JLabel("Comments");
		label_15.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_15.setBounds(664, 222, 146, 14);
		contentPanel.add(label_15);
		
		textField_11 = new JTextField();
		textField_11.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_11.setEditable(false);
		textField_11.setColumns(10);
		textField_11.setBounds(664, 245, 294, 20);
		contentPanel.add(textField_11);
		
		JLabel label_16 = new JLabel("Source Expression");
		label_16.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_16.setBounds(10, 302, 169, 14);
		contentPanel.add(label_16);
		
		textField_12 = new JTextField();
		textField_12.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_12.setColumns(10);
		textField_12.setBounds(10, 325, 403, 20);
		contentPanel.add(textField_12);
		
		JLabel label_17 = new JLabel("Target Field Name");
		label_17.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_17.setBounds(423, 301, 128, 14);
		contentPanel.add(label_17);
		
		textField_13 = new JTextField();
		textField_13.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_13.setEditable(false);
		textField_13.setColumns(10);
		textField_13.setBounds(423, 325, 231, 20);
		contentPanel.add(textField_13);
		
		JLabel label_18 = new JLabel("Comments");
		label_18.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_18.setBounds(664, 302, 146, 14);
		contentPanel.add(label_18);
		
		textField_14 = new JTextField();
		textField_14.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_14.setColumns(10);
		textField_14.setBounds(664, 325, 294, 20);
		contentPanel.add(textField_14);
		
		JLabel label_19 = new JLabel("Resolve the conflict below");
		label_19.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_19.setBounds(10, 356, 277, 15);
		contentPanel.add(label_19);
		
		checkBox = new JCheckBox("Use the lower version expression");
		checkBox.setFont(new Font("Tahoma", Font.PLAIN, 10));
		checkBox.setBounds(10, 378, 182, 23);
		contentPanel.add(checkBox);
		checkBox.addActionListener(this);
		
		checkBox_1 = new JCheckBox("Use the higher version expression");
		checkBox_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		checkBox_1.setBounds(10, 404, 182, 23);
		contentPanel.add(checkBox_1);
		checkBox_1.addActionListener(this);
		
		checkBox_2 = new JCheckBox("Use the new expression");
		checkBox_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		checkBox_2.setBounds(10, 430, 146, 23);
		contentPanel.add(checkBox_2);
		checkBox_2.addActionListener(this);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Ok");
				okButton.setActionCommand("Ok");
				okButton.addActionListener(this);
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
	}

	public void setDatamapName(String sName) {
		textField.setText(sName);
	}

	public void setICName(String sName) {
		textField_1.setText(sName);
	}

	public void setSrcCompName(String sString) {
		textField_2.setText(sString);
	}

	public void setTrgtCompName(String sString) {
		textField_3.setText(sString);
	}

	public void setSrcSrchSpec(String sString) {
		textField_4.setText(sString);
	}

	public void setPrntCompName(String sString) {
		textField_5.setText(sString);
	}

	public void setLowerSrcExp(String sString) {
		textField_6.setText(sString);
	}

	public void setLowerTrgtFieldName(String sString) {
		textField_7.setText(sString);
	}

	public void setLowerComments(String sString) {
		textField_8.setText(sString);
	}

	public void setHigherSrcExp(String sString) {
		textField_9.setText(sString);
	}

	public void setHigherTrgtFieldName(String sString) {
		textField_10.setText(sString);
	}

	public void setHigherComments(String sString) {
		textField_11.setText(sString);
	}

	public void setNewSrcExp(String sString) {
		textField_12.setText(sString);
	}

	public void setNewTrgtFieldName(String sString) {
		textField_13.setText(sString);
	}

	public void setNewComments(String sString) {
		textField_14.setText(sString);
	}

	public void actionPerformed (ActionEvent e) {
		String cmd = e.getActionCommand();
		if (cmd.equals("Use the lower version expression"))
		{
			if (checkBox.isSelected() == true)
			{
				checkBox_1.setSelected(false);
				checkBox_2.setSelected(false);
			}
		}
		if (cmd.equals("Use the higher version expression"))
		{
			if (checkBox_1.isSelected() == true)
			{
				checkBox.setSelected(false);
				checkBox_2.setSelected(false);
			}
		}
		if (cmd.equals("Use the new expression"))
		{
			if (checkBox_2.isSelected() == true)
			{
				checkBox.setSelected(false);
				checkBox_1.setSelected(false);
			}
		}
		if (cmd.equals("Ok"))
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
				finalSrcExp = textField_6.getText().trim();
				finalTrgtFieldName = textField_7.getText().trim();
				finalComments = textField_8.getText().trim();
			}

			if (checkBox_1.isSelected() == true)
			{
				finalSrcExp = textField_9.getText().trim();
				finalTrgtFieldName = textField_10.getText().trim();
				finalComments = textField_11.getText().trim();
			}

			if (checkBox_2.isSelected() == true)
			{
				String newSrcExp = textField_12.getText().trim();
				if (newSrcExp == null || newSrcExp.equals(""))
				{
					DisplayErrorMessage = "Invalid or missing data submitted: New Source Expression";
					JLabel lblmessage = new JLabel(DisplayErrorMessage);
					lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
					JOptionPane.showMessageDialog(this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
					return;

				}
				finalSrcExp = textField_12.getText().trim();
				finalTrgtFieldName = textField_13.getText().trim();
				finalComments = textField_14.getText().trim();
			}

			this.setVisible(false);
		}
	}
}