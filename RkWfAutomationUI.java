import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Color;
import java.util.*;
import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;

public class RkWfAutomationUI implements ActionListener
{
	JFrame frame;
	JLabel emptyLabel;
	ImageIcon icon, aboutIcon;
	GridLayout panelLayout;
	JPanel framePanel;
	JLabel lowerWfFolderLabel, higherWfFolderLabel, targetWfFolderLabel, aboutLabel, blankLabel;
	JTextField lowerWfFolderField, higherWfFolderField, targetWfFolderField;
	JButton rekeyButton, rekeyDMButton, lowerSrcBtn, higherSrcBtn, targetBtn;
	JCheckBox chkBox, chkBox1, chkBox2, chkBox3, chkBox4;
	Toolkit tk;
	Dimension screenSize;
	final int WIDTH;
	final int HEIGHT;
	int lowerFileCtr, higherFileCtr, commonFileCtr;
	ArrayList<RepositoryWfProcessProp> listOfRepositoryWfProcessPropLower, listOfRepositoryWfProcessPropHigher, listOfRepositoryWfProcessPropMerged, templistOfRepositoryWfProcessProp;
	ArrayList<RepositoryWfStep> listOfRepositoryWfStepLower, listOfRepositoryWfStepHigher, listOfRepositoryWfStepMerged, templistOfRepositoryWfStep;
	ArrayList<RepositoryWfBranchConnector> listOfRepositoryWfBranchConnectorLower, listOfRepositoryWfBranchConnectorHigher, listOfRepositoryWfBranchConnectorMerged, templistOfRepositoryWfBranchConnector;
	ArrayList<RepositoryWfBranchCriteriaValue> tempListOfRepositoryWfBranchCriteriaValue;
	ArrayList<RepositoryWfBranchCriteria> tempListOfRepositoryWfBranchCriteria;
	ArrayList<RepositoryWfStepBranch> tempListOfRepositoryWfStepBranch;
	ArrayList<RepositoryWfStepIOArgument> tempListOfRepositoryWfStepIOArgument;
	ArrayList<RepositoryWfStepRecipient> tempListOfRepositoryWfStepRecipient;
	RepositoryWorkflowProcess repositoryWorkflowProcessLower, repositoryWorkflowProcessHigher, repositoryWorkflowProcessMerged;
	EaiObjectMap eaiObjectMapLower, eaiObjectMapHigher, eaiObjectMapMerged;
	RepositoryWfProcessProp repositoryWfProcessPropLower, repositoryWfProcessPropHigher;
	RepositoryWfStep repositoryWfStepLower, repositoryWfStepHigher;
	RepositoryWfBranchConnector repositoryWfBranchConnectorLower, repositoryWfBranchConnectorHigher;
	ArrayList<RepositoryWorkflowProcess> listOfRepositoryWorkflowProcessLower, listOfRepositoryWorkflowProcessHigher;

	ArrayList<String> xmlListOfStepAttrLower, xmlListOfStepAttrHigher;
	ArrayList<String> xmlListOfWfStepBranchAttrLower, xmlListOfWfStepBranchAttrHigher;
	ArrayList<String> xmlListOfWfStepIOArgumentAttrLower, xmlListOfWfStepIOArgumentAttrHigher;
	ArrayList<String> xmlListOfWfStepRecipientAttrLower, xmlListOfWfStepRecipientAttrHigher;
	ArrayList<String> xmlListOfWfBranchCriteriaAttrLower, xmlListOfWfBranchCriteriaAttrHigher;
	ArrayList<String> xmlListOfWfBranchCriteriaValueAttrLower, xmlListOfWfBranchCriteriaValueAttrHigher;
	ArrayList<String> xmlListOfWokflowProcessLower;
	ArrayList<String> xmlListOfWokflowProcessHigher;


	String StepType;

	RepositoryWfStep repWfStepLower, repWfStepHigher;
	RepositoryWfStepBranch repWfStepBranchLower, repWfStepBranchHigher;
	RepositoryWfStepIOArgument repWfStepIOArgumentLower, repWfStepIOArgumentHigher;
	RepositoryWfStepRecipient repWfStepRecipientLower, repWfStepRecipientHigher;
	RepositoryWfBranchCriteria repWfBranchCriteriaLower, repWfBranchCriteriaHigher;
	RepositoryWfBranchCriteriaValue repWfBranchCriteriaValueLower, repWfBranchCriteriaValueHigher;

	ArrayList<RepositoryWfStep> listOfrepWfStepLower, listOfrepWfStepHigher, listOfrepWfStepCommonMerged, listOfrepWfStepLowerMerged, listOfrepWfStepHigherMerged, listOfrepWfStepFinalMerged;
	ArrayList<RepositoryWfStepBranch> listOfrepWfStepBranchLower, listOfrepWfStepBranchHigher, listOfrepWfStepBranchCommonMerged, listOfrepWfStepBranchLowerMerged, listOfrepWfStepBranchHigherMerged, listOfrepWfStepBranchFinalMerged;
	ArrayList<RepositoryWfStepIOArgument> listOfrepWfStepIOArgumentLower, listOfrepWfStepIOArgumentHigher, listOfrepWfStepIOArgumentCommonMerged, listOfrepWfStepIOArgumentLowerMerged, listOfrepWfStepIOArgumentHigherMerged, listOfrepWfStepIOArgumentFinalMerged;
	ArrayList<RepositoryWfStepRecipient> listOfrepWfStepRecipientLower, listOfrepWfStepRecipientHigher, listOfrepWfStepRecipientCommonMerged, listOfrepWfStepRecipientLowerMerged, listOfrepWfStepRecipientHigherMerged, listOfrepWfStepRecipientFinalMerged;
	ArrayList<RepositoryWfBranchCriteria> listOfrepWfBranchCriteriaLower, listOfrepWfBranchCriteriaHigher, listOfrepWfBranchCriteriaCommonMerged, listOfrepWfBranchCriteriaLowerMerged, listOfrepWfBranchCriteriaHigherMerged, listOfrepWfBranchCriteriaFinalMerged;
	ArrayList<RepositoryWfBranchCriteriaValue> listOfrepWfBranchCriteriaValueLower, listOfrepWfBranchCriteriaValueHigher, listOfrepWfBranchCriteriaValueCommonMerged, listOfrepWfBranchCriteriaValueLowerMerged, listOfrepWfBranchCriteriaValueHigherMerged, listOfrepWfBranchCriteriaValueFinalMerged;

	public RkWfAutomationUI() {
		tk = Toolkit.getDefaultToolkit();
		screenSize = tk.getScreenSize();
		WIDTH = screenSize.width;
		HEIGHT = screenSize.height;

		icon = new ImageIcon(getClass().getResource("siebel-7-icon.png"));
		aboutIcon = new ImageIcon(getClass().getResource("md-icon.gif"));
		framePanel = new JPanel();
		lowerWfFolderLabel = new JLabel("Point lower release directory:");
		lowerWfFolderLabel.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lowerWfFolderLabel.setBounds(10, 11, 163, 14);
		framePanel.add(lowerWfFolderLabel);

		lowerWfFolderField = new JTextField();
		lowerWfFolderField.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lowerWfFolderField.setBounds(148, 8, 287, 20);
		framePanel.add(lowerWfFolderField);
		lowerWfFolderField.setColumns(10);

		higherWfFolderLabel = new JLabel("Point higher release directory:");
		higherWfFolderLabel.setFont(new Font("Tahoma", Font.PLAIN, 10));
		higherWfFolderLabel.setBounds(10, 36, 163, 14);
		framePanel.add(higherWfFolderLabel);

		higherWfFolderField = new JTextField();
		higherWfFolderField.setFont(new Font("Tahoma", Font.PLAIN, 10));
		higherWfFolderField.setBounds(148, 33, 287, 20);
		framePanel.add(higherWfFolderField);
		higherWfFolderField.setColumns(10);
		
		targetWfFolderLabel = new JLabel("Target directory:");
		targetWfFolderLabel.setFont(new Font("Tahoma", Font.PLAIN, 10));
		targetWfFolderLabel.setBounds(10, 61, 163, 14);
		framePanel.add(targetWfFolderLabel);

		targetWfFolderField = new JTextField();
		targetWfFolderField.setFont(new Font("Tahoma", Font.PLAIN, 10));
		targetWfFolderField.setColumns(10);
		targetWfFolderField.setBounds(148, 58, 287, 20);
		framePanel.add(targetWfFolderField);

		rekeyDMButton = new JButton("Rekey Datamaps");
		rekeyDMButton.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rekeyDMButton.setBounds(330, 150, 135, 23);
		framePanel.add(rekeyDMButton);

		rekeyButton = new JButton("Rekey Workflows");
		rekeyButton.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rekeyButton.setBounds(183, 150, 137, 23);
		framePanel.add(rekeyButton);

		
		/*aboutLabel = new JLabel("By Mukul D, Tech Mahindra Ltd.");
		aboutLabel.setIcon(aboutIcon);
		aboutLabel.setForeground(Color.BLUE);
		aboutLabel.setFont(new Font("Tahoma", Font.BOLD, 8));
		aboutLabel.setBounds(10, 198, 164, 14);
		framePanel.add(aboutLabel);
		*/

		/*JTextArea updates = new JTextArea();
		updates.setFont(new Font("Tahoma", Font.PLAIN, 10));
		updates.setBounds(250, 98, 212, 75);
		updates.setLineWrap(true);
		updates.setEditable(false);
		framePanel.add(updates);*/
		
		chkBox = new JCheckBox("Resolve conflicts through guided UI");
		chkBox.setFont(new Font("Tahoma", Font.PLAIN, 10));
		chkBox.setBounds(6, 98, 350, 14);
		//chkBox.setBackground(Color.CYAN);
		//chkBox.addActionListener(this);
		chkBox.setSelected(true);
		chkBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chkBox1.isSelected() == true)
				{
					chkBox.setSelected(true);
					chkBox1.setSelected(false);
					chkBox2.setEnabled(false);
					chkBox3.setEnabled(false);
				}
				else
				{
					chkBox.setSelected(false);
					chkBox1.setSelected(true);
					chkBox2.setEnabled(true);
					chkBox3.setEnabled(true);
					
				}
			}
		});
		framePanel.add(chkBox);

		chkBox1 = new JCheckBox("Silent mode - choose release to give preference;");
		chkBox1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		chkBox1.setBounds(6, 118, 350, 14);
		//chkBox1.setBackground(Color.CYAN);
		//chkBox1.addActionListener(this);
		chkBox1.setSelected(false);
		framePanel.add(chkBox1);
		chkBox1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chkBox.isSelected() == true)
				{
					chkBox.setSelected(false);
					chkBox1.setSelected(true);
					chkBox2.setEnabled(true);
					chkBox3.setEnabled(true);
				}
				else
				{
					chkBox.setSelected(true);
					chkBox1.setSelected(false);
					chkBox2.setEnabled(false);
					chkBox3.setEnabled(false);
					
				}
			}
		});

		chkBox2 = new JCheckBox("Lower release");
		chkBox2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		chkBox2.setBounds(16, 138, 150, 14);
		//chkBox2.setBackground(Color.CYAN);
		//chkBox2.addActionListener(this);
		chkBox2.setEnabled(false);
		chkBox2.setSelected(true);
		chkBox2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chkBox3.isSelected() == true)
				{
					chkBox2.setSelected(true);
					chkBox3.setSelected(false);
				}
				else
				{
					chkBox2.setSelected(false);
					chkBox3.setSelected(true);
				}
			}
		});
		framePanel.add(chkBox2);

		chkBox3 = new JCheckBox("Higher release.");
		chkBox3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		chkBox3.setBounds(16, 158, 150, 14);
		//chkBox3.setBackground(Color.CYAN);
		//chkBox3.addActionListener(this);
		chkBox3.setEnabled(false);
		chkBox3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chkBox2.isSelected() == true)
				{
					chkBox3.setSelected(true);
					chkBox2.setSelected(false);
				}
				else
				{
					chkBox3.setSelected(false);
					chkBox2.setSelected(true);
				}
			}
		});
		framePanel.add(chkBox3);

		lowerSrcBtn = new JButton("");
		lowerSrcBtn.setIcon(new ImageIcon(RkWfAutomationUI.class.getResource("/com/sun/java/swing/plaf/windows/icons/Directory.gif")));
		lowerSrcBtn.setBounds(440, 7, 25, 21);
		framePanel.add(lowerSrcBtn);
		
		higherSrcBtn = new JButton("");
		higherSrcBtn.setIcon(new ImageIcon(RkWfAutomationUI.class.getResource("/com/sun/java/swing/plaf/windows/icons/Directory.gif")));
		higherSrcBtn.setBounds(440, 32, 25, 21);
		framePanel.add(higherSrcBtn);
		
		targetBtn = new JButton("");
		targetBtn.setIcon(new ImageIcon(RkWfAutomationUI.class.getResource("/com/sun/java/swing/plaf/windows/icons/Directory.gif")));
		targetBtn.setBounds(440, 57, 25, 21);
		framePanel.add(targetBtn);

		framePanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		framePanel.setLayout(null);
		
		//framePanel.setBackground(Color.CYAN);

		frame = new JFrame("Siebel Workflow & Datamap Rekey Automation Tool v1.1");
		frame.setIconImage(icon.getImage());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(framePanel);
		frame.setLocation(WIDTH / 4, HEIGHT / 4);
		frame.setBounds(100, 100, 479, 215);
		//frame.pack();
		frame.setResizable(false);
		frame.setVisible(true);

		rekeyButton.addActionListener(this);
		rekeyDMButton.addActionListener(this);
		lowerSrcBtn.addActionListener(this);
		higherSrcBtn.addActionListener(this);
		targetBtn.addActionListener(this);
	}

	public static void main(String [] args) {
		RkWfAutomationUI rf = new RkWfAutomationUI();
	}

	public void actionPerformed(ActionEvent e) {
		try
		{
			//String cmd = e.getActionCommand();
			JButton pressed = (JButton)e.getSource();
			String lowerWfFolderName = new String();
			String higherWfFolderName = new String();
			String targetWfFolderName = new String();
			ArrayList<String> ErrorMessage;
			String DisplayErrorMessage = new String("Invalid or missing data submitted: ");
			String DisplayMessage = new String();
			boolean fileReadErrorFlag, fileWfErrorFlag;
			if (pressed.equals(lowerSrcBtn))
			{
				//System.out.println("Lower button success");
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.setDialogTitle("Choose lower release dir...");
				fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				fileChooser.showOpenDialog(frame);
				lowerWfFolderField.setText(fileChooser.getSelectedFile().getAbsolutePath());
			}
			if (pressed.equals(higherSrcBtn))
			{
				//System.out.println("Higher button success");
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.setDialogTitle("Choose higher release dir...");
				fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				fileChooser.showOpenDialog(frame);
				higherWfFolderField.setText(fileChooser.getSelectedFile().getAbsolutePath());
			}
			if (pressed.equals(targetBtn))
			{
				//System.out.println("Target button success");
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.setDialogTitle("Choose target dir...");
				fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				fileChooser.showOpenDialog(frame);
				targetWfFolderField.setText(fileChooser.getSelectedFile().getAbsolutePath());
			}
			if (pressed.equals(rekeyButton))
			{
				int conflictchoice=99;
				if (chkBox.isSelected()==true)
				{
					conflictchoice = 0;
				}
				else
				{
					if (chkBox2.isSelected()==true)
					{
						conflictchoice = 1;
					}
					else
					{
						conflictchoice = 2;
					}
				}
				ErrorMessage = new ArrayList<String>();
				lowerWfFolderName = lowerWfFolderField.getText().replaceAll("\\\\", "\\\\" + "\\\\");
				higherWfFolderName = higherWfFolderField.getText().replaceAll("\\\\", "\\\\" + "\\\\");
				targetWfFolderName = targetWfFolderField.getText().replaceAll("\\\\", "\\\\" + "\\\\");

				// Checking for mandatory i/ps
				if (lowerWfFolderName.equals(""))
				{
					ErrorMessage.add("Lower release directory");
				}
				if (higherWfFolderName.equals(""))
				{
					ErrorMessage.add("Higher release directory");
				}
				if (targetWfFolderName.equals(""))
				{
					ErrorMessage.add("Target directory");
				}
				for (int i=0; i<ErrorMessage.size(); i++)
				{
					if (i == ErrorMessage.size() - 1)
					{
						DisplayErrorMessage = DisplayErrorMessage + ErrorMessage.get(i);
					}
					else
					{
						DisplayErrorMessage = DisplayErrorMessage + ErrorMessage.get(i) + ", ";
					}
				}

				if (ErrorMessage.size() > 0)
				{
					JLabel lblmessage = new JLabel(DisplayErrorMessage);
					lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
					JOptionPane.showMessageDialog(frame, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
					return;
				}
				// ENd Checking for mandatory i/ps

				File lowerWfFolder = new File(lowerWfFolderName);
				File higherWfFolder = new File(higherWfFolderName);
				File targetWfFolder = new File(targetWfFolderName);

				if (!lowerWfFolder.exists() || !higherWfFolder.exists()) // Checking if source directories exists
				{
					DisplayErrorMessage = "Either of the Lower or Higher release directiories does not exist!";
					JLabel lblmessage = new JLabel(DisplayErrorMessage);
					lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
					JOptionPane.showMessageDialog(frame, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
					return;
				}

				if (!lowerWfFolder.canRead() || !higherWfFolder.canRead()) // Checking if the source directories are readable
				{
					DisplayErrorMessage = "Either of the Lower or Higher release directiories are not readable!";
					JLabel lblmessage = new JLabel(DisplayErrorMessage);
					lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
					JOptionPane.showMessageDialog(frame, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
					return;
				}
				
				//System.out.println("Lower: " + lowerWfFolder.getName());
				//System.out.println("Higher: " + higherWfFolder.getName());
				//System.out.println("Target: " + targetWfFolder.getName());
				if (lowerWfFolder.getName().equals(targetWfFolder.getName()) || higherWfFolder.getName().equals(targetWfFolder.getName()))
				{
					DisplayErrorMessage = "Target folder can not be same as Lower or Higher source folder!";
					JLabel lblmessage = new JLabel(DisplayErrorMessage);
					lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
					JOptionPane.showMessageDialog(frame, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
					return;
				}

				if ((lowerWfFolder.getPath() + lowerWfFolder.getName()).equals(higherWfFolder.getPath() + higherWfFolder.getName()))
				{
					DisplayErrorMessage = "Lower and Higher source folder can not be same!";
					JLabel lblmessage = new JLabel(DisplayErrorMessage);
					lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
					JOptionPane.showMessageDialog(frame, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
					return;
				}

				
				String[] lowerWfFileList, higherWFFileList;
				// It is also possible to filter the list of returned files.
				// This example does not return any files that start with `.'.
				FilenameFilter filter = new FilenameFilter() {
					public boolean accept(File dir, String name) {
						return name.endsWith(".xml");
					}
				};
				lowerWfFileList = lowerWfFolder.list(filter);
				higherWFFileList = higherWfFolder.list(filter);
				if (lowerWfFileList.length < 1 || higherWFFileList.length < 1)
				{
					DisplayErrorMessage = "Either of the Lower or Higher release directiories does not contain any XML (*.xml) files!";
					JLabel lblmessage = new JLabel(DisplayErrorMessage);
					lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
					JOptionPane.showMessageDialog(frame, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
					return;
				}
				/*else
				{
					DisplayMessage = "Lower WFs: " + lowerWfFileList.length + " || Higher WFs: " + higherWFFileList.length;
					JOptionPane.showMessageDialog(frame, DisplayMessage, "Message", JOptionPane.INFORMATION_MESSAGE);
				}*/

				// Checking if XML files in the source directories are readable and are valid WFs
				fileReadErrorFlag = false;
				fileWfErrorFlag = false;
				String fileReadErrorLow = new String("");
				String fileWfErrorLow = new String("");
				String fileReadErrorHigh = new String("");
				String fileWfErrorHigh = new String("");
				for (int i=0; i<lowerWfFileList.length; i++)
				{
					File tempXML = new File(lowerWfFolderName + "\\\\" + lowerWfFileList[i]);
					if (!tempXML.canRead())
					{
						fileReadErrorLow = lowerWfFolderName + "\\\\" + lowerWfFileList[i];
						fileReadErrorFlag = true;
						break;
					}
					//System.out.println(fileReadErrorFlag);
					DocumentBuilderFactory tempFactory = DocumentBuilderFactory.newInstance();
					Document tempDoc = tempFactory.newDocumentBuilder().parse(lowerWfFolderName + "\\\\" + lowerWfFileList[i]);
					NodeList tempNodeList = tempDoc.getElementsByTagName("RepositoryWorkflowProcess");
					if (tempNodeList.getLength() == 0)
					{
						fileWfErrorLow = lowerWfFolderName + "\\\\" + lowerWfFileList[i];
						fileWfErrorFlag = true;
						break;
					}
					//System.out.println(fileWfErrorFlag);
				}
				for (int i=0; i<higherWFFileList.length; i++)
				{
					File tempXML = new File(higherWfFolderName + "\\\\" + higherWFFileList[i]);
					if (!tempXML.canRead())
					{
						fileReadErrorHigh = higherWfFolderName + "\\\\" + higherWFFileList[i];
						fileReadErrorFlag = true;
						break;
					}
					//System.out.println(fileReadErrorFlag);
					DocumentBuilderFactory tempFactory = DocumentBuilderFactory.newInstance();
					Document tempDoc = tempFactory.newDocumentBuilder().parse(higherWfFolderName + "\\\\" + higherWFFileList[i]);
					NodeList tempNodeList = tempDoc.getElementsByTagName("RepositoryWorkflowProcess");
					if (tempNodeList.getLength() == 0)
					{
						fileWfErrorHigh = higherWfFolderName + "\\\\" + higherWFFileList[i];
						fileWfErrorFlag = true;
						break;
					}
					//System.out.println(fileWfErrorFlag);
				}
				if (fileReadErrorFlag)
				{
					DisplayErrorMessage = fileReadErrorLow + " and " + fileReadErrorHigh + " files are not readable!";
					JLabel lblmessage = new JLabel(DisplayErrorMessage);
					lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
					JOptionPane.showMessageDialog(frame, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
					return;
				}
				if (fileWfErrorFlag)
				{
					DisplayErrorMessage = fileWfErrorLow + " and " + fileWfErrorHigh + " files are not valid WF XMLs!";
					JLabel lblmessage = new JLabel(DisplayErrorMessage);
					lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
					JOptionPane.showMessageDialog(frame, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
					return;
				}
				// End Checking if XML files in the source directories are readable and are valid WF xmls
				
				int choice = 99;
				if (targetWfFolder.exists())
				{
					JOptionPane warningPane = new JOptionPane();
					DisplayMessage = "Target Folder already exists. Overwrite it?";
					JLabel lblmessage = new JLabel(DisplayMessage);
					lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
					choice = warningPane.showConfirmDialog(frame,lblmessage,"Overwrite Warning",JOptionPane.YES_NO_OPTION); // 0 for Yes, 1 for No
					if (choice == 1)
					{
						return;
					}
				}

				if (choice == 99)
				{
					if (!targetWfFolder.mkdirs())
					{
						DisplayErrorMessage = "Unable to create target directory!";
						JLabel lblmessage = new JLabel(DisplayErrorMessage);
						lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
						JOptionPane.showMessageDialog(frame, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
						return;
					}
				}
				else
				{
					if (!this.doDelete(targetWfFolder))
					{
						DisplayErrorMessage = "Unable to delete old target directory!";
						JLabel lblmessage = new JLabel(DisplayErrorMessage);
						lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
						JOptionPane.showMessageDialog(frame, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
						return;
					}
					if (!targetWfFolder.mkdirs())
					{
						DisplayErrorMessage = "Unable to create new target directory!";
						JLabel lblmessage = new JLabel(DisplayErrorMessage);
						lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
						JOptionPane.showMessageDialog(frame, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
						return;
					}
				}

				// Code for consolidating unmatched WFs into the merged dir
				int lowerCtr, higherAuxCtr, higherCtr, lowerAuxCtr, lowerMatchCtr, higherMatchCtr;
				lowerFileCtr = 0;
				higherFileCtr = 0;
				commonFileCtr = 0;
				for (lowerCtr=0; lowerCtr<lowerWfFileList.length; lowerCtr++)
				{
					for (higherAuxCtr=0; higherAuxCtr<higherWFFileList.length; higherAuxCtr++)
					{
						if (lowerWfFileList[lowerCtr].equals(higherWFFileList[higherAuxCtr]))
						{
							break;
						}
					}
					if (higherAuxCtr == higherWFFileList.length)
					{
						copy(new File(lowerWfFolderName + "\\\\" + lowerWfFileList[lowerCtr]), new File(targetWfFolderName + "\\\\" + lowerWfFileList[lowerCtr])); //Lower add
						lowerFileCtr++;
					}
				}

				for (higherCtr=0; higherCtr<higherWFFileList.length; higherCtr++)
				{
					for (lowerAuxCtr=0; lowerAuxCtr<lowerWfFileList.length; lowerAuxCtr++)
					{
						if (higherWFFileList[higherCtr].equals(lowerWfFileList[lowerAuxCtr]))
						{
							break;
						}
					}
					if (lowerAuxCtr == lowerWfFileList.length)
					{
						copy(new File(higherWfFolderName + "\\\\" + higherWFFileList[higherCtr]), new File(targetWfFolderName + "\\\\" + higherWFFileList[higherCtr])); //Higher add
						higherFileCtr++;
					}
				}
				// End Code for consolidating unmatched WFs into the merged dir

				//Merging the common WFs
				for (lowerMatchCtr=0; lowerMatchCtr<lowerWfFileList.length; lowerMatchCtr++)
				{
					for (higherMatchCtr=0; higherMatchCtr<higherWFFileList.length; higherMatchCtr++)
					{
						if (lowerWfFileList[lowerMatchCtr].equals(higherWFFileList[higherMatchCtr]))
						{
							DocumentBuilderFactory factoryLower = DocumentBuilderFactory.newInstance();
							Document docLower = factoryLower.newDocumentBuilder().parse(lowerWfFolderName + "\\\\" + lowerWfFileList[lowerMatchCtr]);
							NodeList xmlWorkflowProcessListLower = docLower.getElementsByTagName("RepositoryWorkflowProcess");
							listOfRepositoryWorkflowProcessLower = new ArrayList<RepositoryWorkflowProcess>();

							DocumentBuilderFactory factoryHigher = DocumentBuilderFactory.newInstance();
							Document docHigher = factoryHigher.newDocumentBuilder().parse(higherWfFolderName + "\\\\" + higherWFFileList[higherMatchCtr]);
							NodeList xmlWorkflowProcessListHigher = docHigher.getElementsByTagName("RepositoryWorkflowProcess");
							listOfRepositoryWorkflowProcessHigher = new ArrayList<RepositoryWorkflowProcess>();

							for (int z=0; z<xmlWorkflowProcessListLower.getLength(); z++)
							{
								Element xmlWf = (Element)xmlWorkflowProcessListLower.item(z);
								NodeList xmlWfAttrList = xmlWf.getChildNodes();
								xmlListOfWokflowProcessLower = new ArrayList<String>();
								//System.out.println("Size: " + xmlWfAttrList.getLength());
								for (int c=0; c<xmlWfAttrList.getLength(); c++) {
									Element xmlWorkFlowProcessAttr = (Element)xmlWfAttrList.item(c);
									//System.out.println(xmlWorkFlowProcessAttr.getNodeName());
									//System.out.println(xmlWorkFlowProcessAttr.getNodeName() + ": " + xmlWorkFlowProcessAttr.getTextContent());
									if (xmlWorkFlowProcessAttr.getNodeName().equals("ListOfRepositoryWfProcessProp"))
									{
										NodeList xmlRepositoryWfProcessPropListLower = xmlWorkFlowProcessAttr.getElementsByTagName("RepositoryWfProcessProp");
										listOfRepositoryWfProcessPropLower = new ArrayList<RepositoryWfProcessProp>();
										for (int d=0; d<xmlRepositoryWfProcessPropListLower.getLength(); d++)
										{
											Element xmlProcProp = (Element)xmlRepositoryWfProcessPropListLower.item(d);
											NodeList xmlProcPropAttrList = xmlProcProp.getChildNodes();
											ArrayList<String> xmlListOfProcPropAttrLower = new ArrayList<String>();
											for (int f=0; f<xmlProcPropAttrList.getLength(); f++)
											{
												Element xmlProcPropAttr = (Element)xmlProcPropAttrList.item(f);
												xmlListOfProcPropAttrLower.add(xmlProcPropAttr.getTextContent());
												//System.out.println(xmlProcPropAttr.getTextContent());
											}

											repositoryWfProcessPropLower = new RepositoryWfProcessProp(xmlListOfProcPropAttrLower.get(0), xmlListOfProcPropAttrLower.get(1), xmlListOfProcPropAttrLower.get(2), xmlListOfProcPropAttrLower.get(3), xmlListOfProcPropAttrLower.get(4), xmlListOfProcPropAttrLower.get(5), xmlListOfProcPropAttrLower.get(6), xmlListOfProcPropAttrLower.get(7), xmlListOfProcPropAttrLower.get(8), xmlListOfProcPropAttrLower.get(9), xmlListOfProcPropAttrLower.get(10), xmlListOfProcPropAttrLower.get(11), xmlListOfProcPropAttrLower.get(12), xmlListOfProcPropAttrLower.get(13));
											listOfRepositoryWfProcessPropLower.add(repositoryWfProcessPropLower);
										}
									}
									else if (xmlWorkFlowProcessAttr.getNodeName().equals("ListOfRepositoryWfBranchConnector"))
									{
										NodeList xmlRepositoryWfBranchConnectorListLower = xmlWorkFlowProcessAttr.getElementsByTagName("RepositoryWfBranchConnector");
										listOfRepositoryWfBranchConnectorLower = new ArrayList<RepositoryWfBranchConnector>();
										for (int d=0; d<xmlRepositoryWfBranchConnectorListLower.getLength(); d++) {
											 // Get element
											Element xmlBrnchConn = (Element)xmlRepositoryWfBranchConnectorListLower.item(d);
											NodeList xmlBrnchConnAttrList = xmlBrnchConn.getChildNodes();
											ArrayList<String> xmlListOfBrnchConnAttrLower = new ArrayList<String>();
											for (int f=0; f<xmlBrnchConnAttrList.getLength(); f++)
											{
												Element xmlBrnchConnAttr = (Element)xmlBrnchConnAttrList.item(f);
												xmlListOfBrnchConnAttrLower.add(xmlBrnchConnAttr.getTextContent());
											}

											repositoryWfBranchConnectorLower = new RepositoryWfBranchConnector(xmlListOfBrnchConnAttrLower.get(0), xmlListOfBrnchConnAttrLower.get(1), xmlListOfBrnchConnAttrLower.get(2), xmlListOfBrnchConnAttrLower.get(3), xmlListOfBrnchConnAttrLower.get(4), xmlListOfBrnchConnAttrLower.get(5), xmlListOfBrnchConnAttrLower.get(6), xmlListOfBrnchConnAttrLower.get(7));
											listOfRepositoryWfBranchConnectorLower.add(repositoryWfBranchConnectorLower);
											
										}
									}
									else if (xmlWorkFlowProcessAttr.getNodeName().equals("ListOfRepositoryWfStep"))
									{
										NodeList xmlStepListLower = xmlWorkFlowProcessAttr.getElementsByTagName("RepositoryWfStep");// Processing Wf Steps for Lower Version Workflow
										StepType = new String();
										listOfrepWfStepLower = new ArrayList<RepositoryWfStep>();
										//System.out.println("\nLower XML Document Contains " + xmlStepListLower.getLength() + "  Process Properties.");
										//System.out.println("\nLow");
										for (int i=0; i<xmlStepListLower.getLength(); i++) {
											// Get element
											//System.out.println("\n\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
											Element xmlStep = (Element)xmlStepListLower.item(i);
											NodeList xmlStepAttrList = xmlStep.getChildNodes();
											xmlListOfStepAttrLower = new ArrayList<String>();
											listOfrepWfStepBranchLower = new ArrayList<RepositoryWfStepBranch>();
											listOfrepWfStepIOArgumentLower = new ArrayList<RepositoryWfStepIOArgument>();
											listOfrepWfStepRecipientLower = new ArrayList<RepositoryWfStepRecipient>();
											for (int j=0; j<xmlStepAttrList.getLength(); j++)
											{
												Element xmlStepAttr = (Element)xmlStepAttrList.item(j);
												if (xmlStepAttr.getNodeName().equals("ListOfRepositoryWfStepBranch"))
												{
													NodeList xmlStepBranchListLower = xmlStepAttr.getElementsByTagName("RepositoryWfStepBranch");
													///System.out.println("No. of branches from this step: " + xmlStepBranchListLower.getLength());
													for (int k=0; k<xmlStepBranchListLower.getLength(); k++)
													{
														Element xmlStepBranch = (Element)xmlStepBranchListLower.item(k);
														NodeList xmlStepBranchAttrList = xmlStepBranch.getChildNodes();
														xmlListOfWfStepBranchAttrLower = new ArrayList<String>();
														listOfrepWfBranchCriteriaLower = new ArrayList<RepositoryWfBranchCriteria>();
														//System.out.println("No. of attributes of this branch: " + xmlStepBranchAttrList.getLength());
														for (int r=0; r<xmlStepBranchAttrList.getLength(); r++)
														{
															Element xmlStepBranchAttr = (Element)xmlStepBranchAttrList.item(r);
															if (xmlStepBranchAttr.getNodeName().equals("ListOfRepositoryWfBranchCriteria"))
															{
																NodeList xmlStepBranchCriteriaListLower = xmlStepBranchAttr.getElementsByTagName("RepositoryWfBranchCriteria");
																//System.out.println("No. of branch criterias from this branch: " + xmlStepBranchCriteriaListLower.getLength());
																for (int x=0; x<xmlStepBranchCriteriaListLower.getLength(); x++)
																{
																	Element xmlStepBranchCriteria = (Element)xmlStepBranchCriteriaListLower.item(x);
																	NodeList xmlStepBranchCriteriaAttrList = xmlStepBranchCriteria.getChildNodes();
																	xmlListOfWfBranchCriteriaAttrLower = new ArrayList<String>();
																	listOfrepWfBranchCriteriaValueLower = new ArrayList<RepositoryWfBranchCriteriaValue>();
																	//System.out.println("No. of attributes of this branch criteria: " + xmlStepBranchCriteriaAttrList.getLength());
																	for (int y=0; y<xmlStepBranchCriteriaAttrList.getLength(); y++)
																	{
																		Element xmlWfBranchCriteriaAttr = (Element)xmlStepBranchCriteriaAttrList.item(y);
																		if (xmlWfBranchCriteriaAttr.getNodeName().equals("ListOfRepositoryWfBranchCriteriaValue"))
																		{
																			NodeList xmlBranchCriteriaValueListLower = xmlWfBranchCriteriaAttr.getElementsByTagName("RepositoryWfBranchCriteriaValue");
																			//System.out.println("No. of branch criteria values of this branch criteria: " + xmlBranchCriteriaValueListLower.getLength());
																			for (int m=0; m<xmlBranchCriteriaValueListLower.getLength(); m++)
																			{
																				Element xmlBranchCriteriaValue = (Element)xmlBranchCriteriaValueListLower.item(m);
																				NodeList xmlBranchCriteriaValueAttrList = xmlBranchCriteriaValue.getChildNodes();
																				xmlListOfWfBranchCriteriaValueAttrLower = new ArrayList<String>();
																				//System.out.println("No. of attributes of this branch criteria: " + xmlBranchCriteriaValueAttrList.getLength());
																				for (int n=0; n<xmlBranchCriteriaValueAttrList.getLength(); n++)
																				{
																					Element xmlBranchCriteriaValueAttr = (Element)xmlBranchCriteriaValueAttrList.item(n);
																					xmlListOfWfBranchCriteriaValueAttrLower.add(xmlBranchCriteriaValueAttr.getTextContent());
																					//System.out.println(xmlBranchCriteriaValueAttr.getNodeName() + " :\t" + xmlBranchCriteriaValueAttr.getTextContent());
																				}
																				repWfBranchCriteriaValueLower = new RepositoryWfBranchCriteriaValue(xmlListOfWfBranchCriteriaValueAttrLower.get(0), xmlListOfWfBranchCriteriaValueAttrLower.get(1), xmlListOfWfBranchCriteriaValueAttrLower.get(2), xmlListOfWfBranchCriteriaValueAttrLower.get(3), xmlListOfWfBranchCriteriaValueAttrLower.get(4), xmlListOfWfBranchCriteriaValueAttrLower.get(5), xmlListOfWfBranchCriteriaValueAttrLower.get(6), xmlListOfWfBranchCriteriaValueAttrLower.get(7), xmlListOfWfBranchCriteriaValueAttrLower.get(8), xmlListOfWfBranchCriteriaValueAttrLower.get(9), xmlListOfWfBranchCriteriaValueAttrLower.get(10), xmlListOfWfBranchCriteriaValueAttrLower.get(11), xmlListOfWfBranchCriteriaValueAttrLower.get(12), xmlListOfWfBranchCriteriaValueAttrLower.get(13), xmlListOfWfBranchCriteriaValueAttrLower.get(14), xmlListOfWfBranchCriteriaValueAttrLower.get(15), xmlListOfWfBranchCriteriaValueAttrLower.get(16), xmlListOfWfBranchCriteriaValueAttrLower.get(17), xmlListOfWfBranchCriteriaValueAttrLower.get(18), xmlListOfWfBranchCriteriaValueAttrLower.get(19), xmlListOfWfBranchCriteriaValueAttrLower.get(20), xmlListOfWfBranchCriteriaValueAttrLower.get(21), xmlListOfWfBranchCriteriaValueAttrLower.get(22), xmlListOfWfBranchCriteriaValueAttrLower.get(23), xmlListOfWfBranchCriteriaValueAttrLower.get(24), xmlListOfWfBranchCriteriaValueAttrLower.get(25), xmlListOfWfBranchCriteriaValueAttrLower.get(26), xmlListOfWfBranchCriteriaValueAttrLower.get(27), xmlListOfWfBranchCriteriaValueAttrLower.get(28));
																				listOfrepWfBranchCriteriaValueLower.add(repWfBranchCriteriaValueLower);
																				//System.out.println("Brnch Ctr Val: " + repWfBranchCriteriaValueLower.LO_CHAR1);
																			}
																		}
																		else
																		{
																			xmlListOfWfBranchCriteriaAttrLower.add(xmlWfBranchCriteriaAttr.getTextContent());
																			//System.out.println(xmlWfBranchCriteriaAttr.getNodeName() + " :\t" + xmlWfBranchCriteriaAttr.getTextContent());
																		}
																	}

																	//System.out.println(xmlListOfWfBranchCriteriaAttrLower);
																	repWfBranchCriteriaLower = new RepositoryWfBranchCriteria(xmlListOfWfBranchCriteriaAttrLower.get(0), xmlListOfWfBranchCriteriaAttrLower.get(1), xmlListOfWfBranchCriteriaAttrLower.get(2), xmlListOfWfBranchCriteriaAttrLower.get(3), xmlListOfWfBranchCriteriaAttrLower.get(4), xmlListOfWfBranchCriteriaAttrLower.get(5), xmlListOfWfBranchCriteriaAttrLower.get(6), xmlListOfWfBranchCriteriaAttrLower.get(7), xmlListOfWfBranchCriteriaAttrLower.get(8), xmlListOfWfBranchCriteriaAttrLower.get(9), xmlListOfWfBranchCriteriaAttrLower.get(10), xmlListOfWfBranchCriteriaAttrLower.get(11), listOfrepWfBranchCriteriaValueLower);
																	listOfrepWfBranchCriteriaLower.add(repWfBranchCriteriaLower);
																	//System.out.println("Branch Criteria Name: " + repWfBranchCriteriaLower.getName2());
																}
															}
															else {
																xmlListOfWfStepBranchAttrLower.add(xmlStepBranchAttr.getTextContent());
																//System.out.println(xmlStepBranchAttr.getNodeName() + " :\t" + xmlStepBranchAttr.getTextContent());
															}
														} // End of Workflow Step  Branch For Loop

														repWfStepBranchLower = new RepositoryWfStepBranch(xmlListOfWfStepBranchAttrLower.get(0), xmlListOfWfStepBranchAttrLower.get(1), xmlListOfWfStepBranchAttrLower.get(2), xmlListOfWfStepBranchAttrLower.get(3), xmlListOfWfStepBranchAttrLower.get(4), xmlListOfWfStepBranchAttrLower.get(5), xmlListOfWfStepBranchAttrLower.get(6), xmlListOfWfStepBranchAttrLower.get(7), xmlListOfWfStepBranchAttrLower.get(8), xmlListOfWfStepBranchAttrLower.get(9), xmlListOfWfStepBranchAttrLower.get(10), xmlListOfWfStepBranchAttrLower.get(11), xmlListOfWfStepBranchAttrLower.get(12), xmlListOfWfStepBranchAttrLower.get(13), xmlListOfWfStepBranchAttrLower.get(14), xmlListOfWfStepBranchAttrLower.get(15), xmlListOfWfStepBranchAttrLower.get(16), listOfrepWfBranchCriteriaLower);
														listOfrepWfStepBranchLower.add(repWfStepBranchLower);
														//System.out.println("WF Step Branch Name: " + repWfStepBranchLower.Name2);
														//repWfStepBranchLower = new RepositoryWfStepBranch(xmlListOfWfStepBranchAttrLower.get(0), xmlListOfWfStepBranchAttrLower.get(1), xmlListOfWfStepBranchAttrLower.get(2), xmlListOfWfStepBranchAttrLower.get(3), xmlListOfWfStepBranchAttrLower.get(4), xmlListOfWfStepBranchAttrLower.get(5), xmlListOfWfStepBranchAttrLower.get(6), xmlListOfWfStepBranchAttrLower.get(7), xmlListOfWfStepBranchAttrLower.get(8), xmlListOfWfStepBranchAttrLower.get(9), xmlListOfWfStepBranchAttrLower.get(10), xmlListOfWfStepBranchAttrLower.get(11), xmlListOfWfStepBranchAttrLower.get(12), xmlListOfWfStepBranchAttrLower.get(13), xmlListOfWfStepBranchAttrLower.get(14), xmlListOfWfStepBranchAttrLower.get(15), xmlListOfWfStepBranchAttrLower.get(16));
														//listOfrepWfStepBranchLower.add(repWfStepBranchLower);

													}
												}
												else if (xmlStepAttr.getNodeName().equals("ListOfRepositoryWfStepIOArgument"))
												{
													NodeList xmlStepIOArgumentListLower = xmlStepAttr.getElementsByTagName("RepositoryWfStepIOArgument");
													//System.out.println("No. of IO arguments of this step: " + xmlStepIOArgumentListLower.getLength());
													for (int k=0; k<xmlStepIOArgumentListLower.getLength(); k++)
													{
														Element xmlStepIOArgument = (Element)xmlStepIOArgumentListLower.item(k);
														NodeList xmlStepIOArgumentAttrList = xmlStepIOArgument.getChildNodes();
														xmlListOfWfStepIOArgumentAttrLower = new ArrayList<String>();
														//System.out.println("No. of attributes of this IOArgument: " + xmlStepIOArgumentAttrList.getLength());
														for (int r=0; r<xmlStepIOArgumentAttrList.getLength(); r++)
														{
															Element xmlStepIOArgumentAttr = (Element)xmlStepIOArgumentAttrList.item(r);
															xmlListOfWfStepIOArgumentAttrLower.add(xmlStepIOArgumentAttr.getTextContent());
															//System.out.println(xmlStepIOArgumentAttr.getNodeName() + " :\t" + xmlStepIOArgumentAttr.getTextContent());
														} // End of Workflow Step IO Argument For Loop

														repWfStepIOArgumentLower = new RepositoryWfStepIOArgument(xmlListOfWfStepIOArgumentAttrLower.get(0), xmlListOfWfStepIOArgumentAttrLower.get(1), xmlListOfWfStepIOArgumentAttrLower.get(2), xmlListOfWfStepIOArgumentAttrLower.get(3), xmlListOfWfStepIOArgumentAttrLower.get(4), xmlListOfWfStepIOArgumentAttrLower.get(5), xmlListOfWfStepIOArgumentAttrLower.get(6), xmlListOfWfStepIOArgumentAttrLower.get(7), xmlListOfWfStepIOArgumentAttrLower.get(8), xmlListOfWfStepIOArgumentAttrLower.get(9), xmlListOfWfStepIOArgumentAttrLower.get(10), xmlListOfWfStepIOArgumentAttrLower.get(11));
														listOfrepWfStepIOArgumentLower.add(repWfStepIOArgumentLower);
														//System.out.println("IO Proc Prop: " + repWfStepIOArgumentLower.PropertyName);
													}
												}
												else if (xmlStepAttr.getNodeName().equals("ListOfRepositoryWfStepRecipient"))
												{
													NodeList xmlStepRecipientListLower = xmlStepAttr.getElementsByTagName("RepositoryWfStepRecipient");
													//System.out.println("No. of recipients of this step: " + xmlStepRecipientListLower.getLength());
													for (int k=0; k<xmlStepRecipientListLower.getLength(); k++)
													{
														Element xmlStepRecipient = (Element)xmlStepRecipientListLower.item(k);
														NodeList xmlStepRecipientAttrList = xmlStepRecipient.getChildNodes();
														xmlListOfWfStepRecipientAttrLower = new ArrayList<String>();
														//System.out.println("No. of attributes of this Recipient: " + xmlStepRecipientAttrList.getLength());
														for (int r=0; r<xmlStepRecipientAttrList.getLength(); r++)
														{
															Element xmlStepRecipientAttr = (Element)xmlStepRecipientAttrList.item(r);
															xmlListOfWfStepRecipientAttrLower.add(xmlStepRecipientAttr.getTextContent());
															//System.out.println(xmlStepRecipientAttr.getNodeName() + " :\t" + xmlStepRecipientAttr.getTextContent());
														} // End of Workflow Step Recipient For Loop

														repWfStepRecipientLower = new RepositoryWfStepRecipient(xmlListOfWfStepRecipientAttrLower.get(0), xmlListOfWfStepRecipientAttrLower.get(1), xmlListOfWfStepRecipientAttrLower.get(2), xmlListOfWfStepRecipientAttrLower.get(3), xmlListOfWfStepRecipientAttrLower.get(4), xmlListOfWfStepRecipientAttrLower.get(5), xmlListOfWfStepRecipientAttrLower.get(6), xmlListOfWfStepRecipientAttrLower.get(7), xmlListOfWfStepRecipientAttrLower.get(8), xmlListOfWfStepRecipientAttrLower.get(9));
														listOfrepWfStepRecipientLower.add(repWfStepRecipientLower);
													}
												}
												else
												{
													xmlListOfStepAttrLower.add(xmlStepAttr.getTextContent());
													//System.out.println(xmlStepAttr.getNodeName() + " :\t" + xmlStepAttr.getTextContent() + " :\t" + xmlStepAttr.hasChildNodes());
													if (xmlStepAttr.getNodeName().equals("Type"))
													{
														StepType = xmlStepAttr.getTextContent();
													}
												}
											}
											//System.out.println("\nWf Step Type: " + StepType);
											repWfStepLower = new RepositoryWfStep(xmlListOfStepAttrLower.get(0), xmlListOfStepAttrLower.get(1), xmlListOfStepAttrLower.get(2), xmlListOfStepAttrLower.get(3), xmlListOfStepAttrLower.get(4), xmlListOfStepAttrLower.get(5), xmlListOfStepAttrLower.get(6), xmlListOfStepAttrLower.get(7), xmlListOfStepAttrLower.get(8), xmlListOfStepAttrLower.get(9), xmlListOfStepAttrLower.get(10), xmlListOfStepAttrLower.get(11), xmlListOfStepAttrLower.get(12), xmlListOfStepAttrLower.get(13), xmlListOfStepAttrLower.get(14), xmlListOfStepAttrLower.get(15), xmlListOfStepAttrLower.get(16), xmlListOfStepAttrLower.get(17), listOfrepWfStepBranchLower, listOfrepWfStepIOArgumentLower, listOfrepWfStepRecipientLower);
											listOfrepWfStepLower.add(repWfStepLower);
											//System.out.println("WF Step Name: " + repWfStepLower.Name3);
										} // End of Workflow Step For Loop

										// Printing Step Names for Lower Version Workflow
										for(int k=0;k<listOfrepWfStepLower.size();k++) {
											RepositoryWfStep tempLower = (RepositoryWfStep)listOfrepWfStepLower.get(k);
											//System.out.println("Step " + (k+1) + " Name: " + tempLower.Name3);
										}
										// End of Lower
									}
									else
									{
										xmlListOfWokflowProcessLower.add(xmlWorkFlowProcessAttr.getTextContent());
									}
								}
								repositoryWorkflowProcessLower = new RepositoryWorkflowProcess(xmlListOfWokflowProcessLower.get(0), xmlListOfWokflowProcessLower.get(1), xmlListOfWokflowProcessLower.get(2), xmlListOfWokflowProcessLower.get(3), xmlListOfWokflowProcessLower.get(4), xmlListOfWokflowProcessLower.get(5), xmlListOfWokflowProcessLower.get(6), xmlListOfWokflowProcessLower.get(7), xmlListOfWokflowProcessLower.get(8), xmlListOfWokflowProcessLower.get(9), xmlListOfWokflowProcessLower.get(10), xmlListOfWokflowProcessLower.get(11), xmlListOfWokflowProcessLower.get(12), xmlListOfWokflowProcessLower.get(13), xmlListOfWokflowProcessLower.get(14), xmlListOfWokflowProcessLower.get(15), xmlListOfWokflowProcessLower.get(16), xmlListOfWokflowProcessLower.get(17), xmlListOfWokflowProcessLower.get(18), xmlListOfWokflowProcessLower.get(19), listOfrepWfStepLower, listOfRepositoryWfProcessPropLower, listOfRepositoryWfBranchConnectorLower);
							}
							
							for (int z=0; z<xmlWorkflowProcessListHigher.getLength(); z++)
							{
								Element xmlWf = (Element)xmlWorkflowProcessListHigher.item(z);
								NodeList xmlWfAttrList = xmlWf.getChildNodes();
								xmlListOfWokflowProcessHigher = new ArrayList<String>();
								for (int c=0; c<xmlWfAttrList.getLength(); c++) {
									Element xmlWorkFlowProcessAttr = (Element)xmlWfAttrList.item(c);
									//System.out.println(xmlWorkFlowProcessAttr.getNodeName());
									if (xmlWorkFlowProcessAttr.getNodeName().equals("ListOfRepositoryWfProcessProp"))
									{
										NodeList xmlRepositoryWfProcessPropListHigher = xmlWorkFlowProcessAttr.getElementsByTagName("RepositoryWfProcessProp");
										listOfRepositoryWfProcessPropHigher = new ArrayList<RepositoryWfProcessProp>();
										for (int d=0; d<xmlRepositoryWfProcessPropListHigher.getLength(); d++)
										{
											Element xmlProcProp = (Element)xmlRepositoryWfProcessPropListHigher.item(d);
											NodeList xmlProcPropAttrList = xmlProcProp.getChildNodes();
											ArrayList<String> xmlListOfProcPropAttrHigher = new ArrayList<String>();
											for (int f=0; f<xmlProcPropAttrList.getLength(); f++)
											{
												Element xmlProcPropAttr = (Element)xmlProcPropAttrList.item(f);
												xmlListOfProcPropAttrHigher.add(xmlProcPropAttr.getTextContent());
											}

											repositoryWfProcessPropHigher = new RepositoryWfProcessProp(xmlListOfProcPropAttrHigher.get(0), xmlListOfProcPropAttrHigher.get(1), xmlListOfProcPropAttrHigher.get(2), xmlListOfProcPropAttrHigher.get(3), xmlListOfProcPropAttrHigher.get(4), xmlListOfProcPropAttrHigher.get(5), xmlListOfProcPropAttrHigher.get(6), xmlListOfProcPropAttrHigher.get(7), xmlListOfProcPropAttrHigher.get(8), xmlListOfProcPropAttrHigher.get(9), xmlListOfProcPropAttrHigher.get(10), xmlListOfProcPropAttrHigher.get(11), xmlListOfProcPropAttrHigher.get(12), xmlListOfProcPropAttrHigher.get(13));
											listOfRepositoryWfProcessPropHigher.add(repositoryWfProcessPropHigher);
										}
									}
									else if (xmlWorkFlowProcessAttr.getNodeName().equals("ListOfRepositoryWfBranchConnector"))
									{
										NodeList xmlRepositoryWfBranchConnectorListHigher = xmlWorkFlowProcessAttr.getElementsByTagName("RepositoryWfBranchConnector");
										listOfRepositoryWfBranchConnectorHigher = new ArrayList<RepositoryWfBranchConnector>();
										for (int d=0; d<xmlRepositoryWfBranchConnectorListHigher.getLength(); d++) {
											 // Get element
											Element xmlBrnchConn = (Element)xmlRepositoryWfBranchConnectorListHigher.item(d);
											NodeList xmlBrnchConnAttrList = xmlBrnchConn.getChildNodes();
											ArrayList<String> xmlListOfBrnchConnAttrHigher = new ArrayList<String>();
											for (int f=0; f<xmlBrnchConnAttrList.getLength(); f++)
											{
												Element xmlBrnchConnAttr = (Element)xmlBrnchConnAttrList.item(f);
												xmlListOfBrnchConnAttrHigher.add(xmlBrnchConnAttr.getTextContent());
											}

											repositoryWfBranchConnectorHigher = new RepositoryWfBranchConnector(xmlListOfBrnchConnAttrHigher.get(0), xmlListOfBrnchConnAttrHigher.get(1), xmlListOfBrnchConnAttrHigher.get(2), xmlListOfBrnchConnAttrHigher.get(3), xmlListOfBrnchConnAttrHigher.get(4), xmlListOfBrnchConnAttrHigher.get(5), xmlListOfBrnchConnAttrHigher.get(6), xmlListOfBrnchConnAttrHigher.get(7));
											listOfRepositoryWfBranchConnectorHigher.add(repositoryWfBranchConnectorHigher);
											
										}
									}
									else if (xmlWorkFlowProcessAttr.getNodeName().equals("ListOfRepositoryWfStep"))
									{
										NodeList xmlStepListHigher = xmlWorkFlowProcessAttr.getElementsByTagName("RepositoryWfStep");
										StepType = new String();
										listOfrepWfStepHigher = new ArrayList<RepositoryWfStep>();
										//System.out.println("\nHigher XML Document Contains " + xmlStepListHigher.getLength() + "  Process Properties.");
										//System.out.println("\nHigher");
										for (int i=0; i<xmlStepListHigher.getLength(); i++) {
											// Get element
											//System.out.println("\n\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
											Element xmlStep = (Element)xmlStepListHigher.item(i);
											NodeList xmlStepAttrList = xmlStep.getChildNodes();
											xmlListOfStepAttrHigher = new ArrayList<String>();
											listOfrepWfStepBranchHigher = new ArrayList<RepositoryWfStepBranch>();
											listOfrepWfStepIOArgumentHigher = new ArrayList<RepositoryWfStepIOArgument>();
											listOfrepWfStepRecipientHigher = new ArrayList<RepositoryWfStepRecipient>();
											for (int j=0; j<xmlStepAttrList.getLength(); j++)
											{
												Element xmlStepAttr = (Element)xmlStepAttrList.item(j);
												if (xmlStepAttr.getNodeName().equals("ListOfRepositoryWfStepBranch"))
												{
													NodeList xmlStepBranchListHigher = xmlStepAttr.getElementsByTagName("RepositoryWfStepBranch");
													///System.out.println("No. of branches from this step: " + xmlStepBranchListHigher.getLength());
													for (int k=0; k<xmlStepBranchListHigher.getLength(); k++)
													{
														Element xmlStepBranch = (Element)xmlStepBranchListHigher.item(k);
														NodeList xmlStepBranchAttrList = xmlStepBranch.getChildNodes();
														xmlListOfWfStepBranchAttrHigher = new ArrayList<String>();
														listOfrepWfBranchCriteriaHigher = new ArrayList<RepositoryWfBranchCriteria>();
														//System.out.println("No. of attributes of this branch: " + xmlStepBranchAttrList.getLength());
														for (int r=0; r<xmlStepBranchAttrList.getLength(); r++)
														{
															Element xmlStepBranchAttr = (Element)xmlStepBranchAttrList.item(r);
															if (xmlStepBranchAttr.getNodeName().equals("ListOfRepositoryWfBranchCriteria"))
															{
																NodeList xmlStepBranchCriteriaListHigher = xmlStepBranchAttr.getElementsByTagName("RepositoryWfBranchCriteria");
																//System.out.println("No. of branch criterias from this branch: " + xmlStepBranchCriteriaListHigher.getLength());
																for (int x=0; x<xmlStepBranchCriteriaListHigher.getLength(); x++)
																{
																	Element xmlStepBranchCriteria = (Element)xmlStepBranchCriteriaListHigher.item(x);
																	NodeList xmlStepBranchCriteriaAttrList = xmlStepBranchCriteria.getChildNodes();
																	xmlListOfWfBranchCriteriaAttrHigher = new ArrayList<String>();
																	listOfrepWfBranchCriteriaValueHigher = new ArrayList<RepositoryWfBranchCriteriaValue>();
																	//System.out.println("No. of attributes of this branch criteria: " + xmlStepBranchCriteriaAttrList.getLength());
																	for (int y=0; y<xmlStepBranchCriteriaAttrList.getLength(); y++)
																	{
																		Element xmlWfBranchCriteriaAttr = (Element)xmlStepBranchCriteriaAttrList.item(y);
																		if (xmlWfBranchCriteriaAttr.getNodeName().equals("ListOfRepositoryWfBranchCriteriaValue"))
																		{
																			NodeList xmlBranchCriteriaValueListHigher = xmlWfBranchCriteriaAttr.getElementsByTagName("RepositoryWfBranchCriteriaValue");
																			//System.out.println("No. of branch criteria values of this branch criteria: " + xmlBranchCriteriaValueListHigher.getLength());
																			for (int m=0; m<xmlBranchCriteriaValueListHigher.getLength(); m++)
																			{
																				Element xmlBranchCriteriaValue = (Element)xmlBranchCriteriaValueListHigher.item(m);
																				NodeList xmlBranchCriteriaValueAttrList = xmlBranchCriteriaValue.getChildNodes();
																				xmlListOfWfBranchCriteriaValueAttrHigher = new ArrayList<String>();
																				//System.out.println("No. of attributes of this branch criteria: " + xmlBranchCriteriaValueAttrList.getLength());
																				for (int n=0; n<xmlBranchCriteriaValueAttrList.getLength(); n++)
																				{
																					Element xmlBranchCriteriaValueAttr = (Element)xmlBranchCriteriaValueAttrList.item(n);
																					xmlListOfWfBranchCriteriaValueAttrHigher.add(xmlBranchCriteriaValueAttr.getTextContent());
																					//System.out.println(xmlBranchCriteriaValueAttr.getNodeName() + " :\t" + xmlBranchCriteriaValueAttr.getTextContent());
																				}
																				repWfBranchCriteriaValueHigher = new RepositoryWfBranchCriteriaValue(xmlListOfWfBranchCriteriaValueAttrHigher.get(0), xmlListOfWfBranchCriteriaValueAttrHigher.get(1), xmlListOfWfBranchCriteriaValueAttrHigher.get(2), xmlListOfWfBranchCriteriaValueAttrHigher.get(3), xmlListOfWfBranchCriteriaValueAttrHigher.get(4), xmlListOfWfBranchCriteriaValueAttrHigher.get(5), xmlListOfWfBranchCriteriaValueAttrHigher.get(6), xmlListOfWfBranchCriteriaValueAttrHigher.get(7), xmlListOfWfBranchCriteriaValueAttrHigher.get(8), xmlListOfWfBranchCriteriaValueAttrHigher.get(9), xmlListOfWfBranchCriteriaValueAttrHigher.get(10), xmlListOfWfBranchCriteriaValueAttrHigher.get(11), xmlListOfWfBranchCriteriaValueAttrHigher.get(12), xmlListOfWfBranchCriteriaValueAttrHigher.get(13), xmlListOfWfBranchCriteriaValueAttrHigher.get(14), xmlListOfWfBranchCriteriaValueAttrHigher.get(15), xmlListOfWfBranchCriteriaValueAttrHigher.get(16), xmlListOfWfBranchCriteriaValueAttrHigher.get(17), xmlListOfWfBranchCriteriaValueAttrHigher.get(18), xmlListOfWfBranchCriteriaValueAttrHigher.get(19), xmlListOfWfBranchCriteriaValueAttrHigher.get(20), xmlListOfWfBranchCriteriaValueAttrHigher.get(21), xmlListOfWfBranchCriteriaValueAttrHigher.get(22), xmlListOfWfBranchCriteriaValueAttrHigher.get(23), xmlListOfWfBranchCriteriaValueAttrHigher.get(24), xmlListOfWfBranchCriteriaValueAttrHigher.get(25), xmlListOfWfBranchCriteriaValueAttrHigher.get(26), xmlListOfWfBranchCriteriaValueAttrHigher.get(27), xmlListOfWfBranchCriteriaValueAttrHigher.get(28));
																				listOfrepWfBranchCriteriaValueHigher.add(repWfBranchCriteriaValueHigher);
																				//System.out.println("Brnch Ctr Val: " + repWfBranchCriteriaValueHigher.LO_CHAR1);
																			}
																		}
																		else
																		{
																			xmlListOfWfBranchCriteriaAttrHigher.add(xmlWfBranchCriteriaAttr.getTextContent());
																			//System.out.println(xmlWfBranchCriteriaAttr.getNodeName() + " :\t" + xmlWfBranchCriteriaAttr.getTextContent());
																		}
																	}

																	//System.out.println(xmlListOfWfBranchCriteriaAttrHigher);
																	repWfBranchCriteriaHigher = new RepositoryWfBranchCriteria(xmlListOfWfBranchCriteriaAttrHigher.get(0), xmlListOfWfBranchCriteriaAttrHigher.get(1), xmlListOfWfBranchCriteriaAttrHigher.get(2), xmlListOfWfBranchCriteriaAttrHigher.get(3), xmlListOfWfBranchCriteriaAttrHigher.get(4), xmlListOfWfBranchCriteriaAttrHigher.get(5), xmlListOfWfBranchCriteriaAttrHigher.get(6), xmlListOfWfBranchCriteriaAttrHigher.get(7), xmlListOfWfBranchCriteriaAttrHigher.get(8), xmlListOfWfBranchCriteriaAttrHigher.get(9), xmlListOfWfBranchCriteriaAttrHigher.get(10), xmlListOfWfBranchCriteriaAttrHigher.get(11), listOfrepWfBranchCriteriaValueHigher);
																	listOfrepWfBranchCriteriaHigher.add(repWfBranchCriteriaHigher);
																	//System.out.println("Branch Criteria Name: " + repWfBranchCriteriaHigher.getName2());
																}
															}
															else {
																xmlListOfWfStepBranchAttrHigher.add(xmlStepBranchAttr.getTextContent());
																//System.out.println(xmlStepBranchAttr.getNodeName() + " :\t" + xmlStepBranchAttr.getTextContent());
															}
														} // End of Workflow Step  Branch For Loop

														repWfStepBranchHigher = new RepositoryWfStepBranch(xmlListOfWfStepBranchAttrHigher.get(0), xmlListOfWfStepBranchAttrHigher.get(1), xmlListOfWfStepBranchAttrHigher.get(2), xmlListOfWfStepBranchAttrHigher.get(3), xmlListOfWfStepBranchAttrHigher.get(4), xmlListOfWfStepBranchAttrHigher.get(5), xmlListOfWfStepBranchAttrHigher.get(6), xmlListOfWfStepBranchAttrHigher.get(7), xmlListOfWfStepBranchAttrHigher.get(8), xmlListOfWfStepBranchAttrHigher.get(9), xmlListOfWfStepBranchAttrHigher.get(10), xmlListOfWfStepBranchAttrHigher.get(11), xmlListOfWfStepBranchAttrHigher.get(12), xmlListOfWfStepBranchAttrHigher.get(13), xmlListOfWfStepBranchAttrHigher.get(14), xmlListOfWfStepBranchAttrHigher.get(15), xmlListOfWfStepBranchAttrHigher.get(16), listOfrepWfBranchCriteriaHigher);
														listOfrepWfStepBranchHigher.add(repWfStepBranchHigher);
														//System.out.println("WF Step Branch Name: " + repWfStepBranchHigher.Name2);
														//repWfStepBranchHigher = new RepositoryWfStepBranch(xmlListOfWfStepBranchAttrHigher.get(0), xmlListOfWfStepBranchAttrHigher.get(1), xmlListOfWfStepBranchAttrHigher.get(2), xmlListOfWfStepBranchAttrHigher.get(3), xmlListOfWfStepBranchAttrHigher.get(4), xmlListOfWfStepBranchAttrHigher.get(5), xmlListOfWfStepBranchAttrHigher.get(6), xmlListOfWfStepBranchAttrHigher.get(7), xmlListOfWfStepBranchAttrHigher.get(8), xmlListOfWfStepBranchAttrHigher.get(9), xmlListOfWfStepBranchAttrHigher.get(10), xmlListOfWfStepBranchAttrHigher.get(11), xmlListOfWfStepBranchAttrHigher.get(12), xmlListOfWfStepBranchAttrHigher.get(13), xmlListOfWfStepBranchAttrHigher.get(14), xmlListOfWfStepBranchAttrHigher.get(15), xmlListOfWfStepBranchAttrHigher.get(16));
														//listOfrepWfStepBranchHigher.add(repWfStepBranchHigher);

													}
												}
												else if (xmlStepAttr.getNodeName().equals("ListOfRepositoryWfStepIOArgument"))
												{
													NodeList xmlStepIOArgumentListHigher = xmlStepAttr.getElementsByTagName("RepositoryWfStepIOArgument");
													//System.out.println("No. of IO arguments of this step: " + xmlStepIOArgumentListHigher.getLength());
													for (int k=0; k<xmlStepIOArgumentListHigher.getLength(); k++)
													{
														Element xmlStepIOArgument = (Element)xmlStepIOArgumentListHigher.item(k);
														NodeList xmlStepIOArgumentAttrList = xmlStepIOArgument.getChildNodes();
														xmlListOfWfStepIOArgumentAttrHigher = new ArrayList<String>();
														//System.out.println("No. of attributes of this IOArgument: " + xmlStepIOArgumentAttrList.getLength());
														for (int r=0; r<xmlStepIOArgumentAttrList.getLength(); r++)
														{
															Element xmlStepIOArgumentAttr = (Element)xmlStepIOArgumentAttrList.item(r);
															xmlListOfWfStepIOArgumentAttrHigher.add(xmlStepIOArgumentAttr.getTextContent());
															//System.out.println(xmlStepIOArgumentAttr.getNodeName() + " :\t" + xmlStepIOArgumentAttr.getTextContent());
														} // End of Workflow Step IO Argument For Loop

														repWfStepIOArgumentHigher = new RepositoryWfStepIOArgument(xmlListOfWfStepIOArgumentAttrHigher.get(0), xmlListOfWfStepIOArgumentAttrHigher.get(1), xmlListOfWfStepIOArgumentAttrHigher.get(2), xmlListOfWfStepIOArgumentAttrHigher.get(3), xmlListOfWfStepIOArgumentAttrHigher.get(4), xmlListOfWfStepIOArgumentAttrHigher.get(5), xmlListOfWfStepIOArgumentAttrHigher.get(6), xmlListOfWfStepIOArgumentAttrHigher.get(7), xmlListOfWfStepIOArgumentAttrHigher.get(8), xmlListOfWfStepIOArgumentAttrHigher.get(9), xmlListOfWfStepIOArgumentAttrHigher.get(10), xmlListOfWfStepIOArgumentAttrHigher.get(11));
														listOfrepWfStepIOArgumentHigher.add(repWfStepIOArgumentHigher);
														//System.out.println("IO Proc Prop: " + repWfStepIOArgumentHigher.PropertyName);
													}
												}
												else if (xmlStepAttr.getNodeName().equals("ListOfRepositoryWfStepRecipient"))
												{
													NodeList xmlStepRecipientListHigher = xmlStepAttr.getElementsByTagName("RepositoryWfStepRecipient");
													//System.out.println("No. of recipients of this step: " + xmlStepRecipientListHigher.getLength());
													for (int k=0; k<xmlStepRecipientListHigher.getLength(); k++)
													{
														Element xmlStepRecipient = (Element)xmlStepRecipientListHigher.item(k);
														NodeList xmlStepRecipientAttrList = xmlStepRecipient.getChildNodes();
														xmlListOfWfStepRecipientAttrHigher = new ArrayList<String>();
														//System.out.println("No. of attributes of this Recipient: " + xmlStepRecipientAttrList.getLength());
														for (int r=0; r<xmlStepRecipientAttrList.getLength(); r++)
														{
															Element xmlStepRecipientAttr = (Element)xmlStepRecipientAttrList.item(r);
															xmlListOfWfStepRecipientAttrHigher.add(xmlStepRecipientAttr.getTextContent());
															//System.out.println(xmlStepRecipientAttr.getNodeName() + " :\t" + xmlStepRecipientAttr.getTextContent());
														} // End of Workflow Step Recipient For Loop

														repWfStepRecipientHigher = new RepositoryWfStepRecipient(xmlListOfWfStepRecipientAttrHigher.get(0), xmlListOfWfStepRecipientAttrHigher.get(1), xmlListOfWfStepRecipientAttrHigher.get(2), xmlListOfWfStepRecipientAttrHigher.get(3), xmlListOfWfStepRecipientAttrHigher.get(4), xmlListOfWfStepRecipientAttrHigher.get(5), xmlListOfWfStepRecipientAttrHigher.get(6), xmlListOfWfStepRecipientAttrHigher.get(7), xmlListOfWfStepRecipientAttrHigher.get(8), xmlListOfWfStepRecipientAttrHigher.get(9));
														listOfrepWfStepRecipientHigher.add(repWfStepRecipientHigher);
													}
												}
												else
												{
													xmlListOfStepAttrHigher.add(xmlStepAttr.getTextContent());
													//System.out.println(xmlStepAttr.getNodeName() + " :\t" + xmlStepAttr.getTextContent() + " :\t" + xmlStepAttr.hasChildNodes());
													if (xmlStepAttr.getNodeName().equals("Type"))
													{
														StepType = xmlStepAttr.getTextContent();
													}
												}
											}
											//System.out.println("\nWf Step Type: " + StepType);
											repWfStepHigher = new RepositoryWfStep(xmlListOfStepAttrHigher.get(0), xmlListOfStepAttrHigher.get(1), xmlListOfStepAttrHigher.get(2), xmlListOfStepAttrHigher.get(3), xmlListOfStepAttrHigher.get(4), xmlListOfStepAttrHigher.get(5), xmlListOfStepAttrHigher.get(6), xmlListOfStepAttrHigher.get(7), xmlListOfStepAttrHigher.get(8), xmlListOfStepAttrHigher.get(9), xmlListOfStepAttrHigher.get(10), xmlListOfStepAttrHigher.get(11), xmlListOfStepAttrHigher.get(12), xmlListOfStepAttrHigher.get(13), xmlListOfStepAttrHigher.get(14), xmlListOfStepAttrHigher.get(15), xmlListOfStepAttrHigher.get(16), xmlListOfStepAttrHigher.get(17), listOfrepWfStepBranchHigher, listOfrepWfStepIOArgumentHigher, listOfrepWfStepRecipientHigher);
											listOfrepWfStepHigher.add(repWfStepHigher);
											//System.out.println("WF Step Name: " + repWfStepHigher.Name3);
										} // End of Workflow Step For Loop

										// Printing Step Names for Higher Version Workflow
										for(int k=0;k<listOfrepWfStepHigher.size();k++) {
											RepositoryWfStep tempHigher = (RepositoryWfStep)listOfrepWfStepHigher.get(k);
											//System.out.println("Step " + (k+1) + " Name: " + tempHigher.Name3);
										}
										// End of Higher
									}
									else
									{
										xmlListOfWokflowProcessHigher.add(xmlWorkFlowProcessAttr.getTextContent());
									}

									
								}
								repositoryWorkflowProcessHigher = new RepositoryWorkflowProcess(xmlListOfWokflowProcessHigher.get(0), xmlListOfWokflowProcessHigher.get(1), xmlListOfWokflowProcessHigher.get(2), xmlListOfWokflowProcessHigher.get(3), xmlListOfWokflowProcessHigher.get(4), xmlListOfWokflowProcessHigher.get(5), xmlListOfWokflowProcessHigher.get(6), xmlListOfWokflowProcessHigher.get(7), xmlListOfWokflowProcessHigher.get(8), xmlListOfWokflowProcessHigher.get(9), xmlListOfWokflowProcessHigher.get(10), xmlListOfWokflowProcessHigher.get(11), xmlListOfWokflowProcessHigher.get(12), xmlListOfWokflowProcessHigher.get(13), xmlListOfWokflowProcessHigher.get(14), xmlListOfWokflowProcessHigher.get(15), xmlListOfWokflowProcessHigher.get(16), xmlListOfWokflowProcessHigher.get(17), xmlListOfWokflowProcessHigher.get(18), xmlListOfWokflowProcessHigher.get(19), listOfrepWfStepHigher, listOfRepositoryWfProcessPropHigher, listOfRepositoryWfBranchConnectorHigher);
							}

							MergeWfProcProp mergeWfProcPop = new MergeWfProcProp();
							listOfRepositoryWfProcessPropMerged = mergeWfProcPop.compareProcPropList(conflictchoice, frame, repositoryWorkflowProcessLower.ProcessName, repositoryWorkflowProcessLower.GetListOfRepositoryWfProcessProp(), repositoryWorkflowProcessHigher.GetListOfRepositoryWfProcessProp());

							for (int p=0; p<listOfRepositoryWfProcessPropMerged.size(); p++)
							{
								//System.out.println("Process Prop name: " + listOfRepositoryWfProcessPropMerged.get(p).Name2);
							}

							MergeWfStep mergeWfStep = new MergeWfStep();
							listOfRepositoryWfStepMerged = mergeWfStep.compareWfStep(conflictchoice, frame, listOfRepositoryWfProcessPropMerged, repositoryWorkflowProcessLower.ProcessName, repositoryWorkflowProcessLower.GetListOfRepositoryWfStep(), repositoryWorkflowProcessHigher.GetListOfRepositoryWfStep());

							for (int p=0; p<listOfRepositoryWfStepMerged.size(); p++)
							{
								//System.out.println("Step Name: " + listOfRepositoryWfStepMerged.get(p).Name3);
							}

							MergeWfBranchConnector mergeWfBranchConnector = new MergeWfBranchConnector();
							listOfRepositoryWfBranchConnectorMerged = mergeWfBranchConnector.compareBranchConnList(conflictchoice, frame, repositoryWorkflowProcessLower.ProcessName, repositoryWorkflowProcessLower.GetListOfRepositoryWfBranchConnector(), repositoryWorkflowProcessHigher.GetListOfRepositoryWfBranchConnector(), listOfRepositoryWfStepMerged);

							for (int p=0; p<listOfRepositoryWfBranchConnectorMerged.size(); p++)
							{
								//System.out.println("Branch Connector Name: " + listOfRepositoryWfBranchConnectorMerged.get(p).Name2);
							}

							repositoryWorkflowProcessMerged = new RepositoryWorkflowProcess(repositoryWorkflowProcessLower.BusinessObject, repositoryWorkflowProcessLower.CacheLocale, repositoryWorkflowProcessLower.Comments, repositoryWorkflowProcessLower.Description, repositoryWorkflowProcessLower.EffectiveEndDate, repositoryWorkflowProcessLower.EffectiveStartDate, repositoryWorkflowProcessLower.ErrorProcessName, repositoryWorkflowProcessLower.sGroup, repositoryWorkflowProcessLower.Inactive, repositoryWorkflowProcessLower.Module, repositoryWorkflowProcessLower.sName, repositoryWorkflowProcessLower.PersistentFrequency, repositoryWorkflowProcessLower.PersistentLevel, repositoryWorkflowProcessLower.ProcessName, repositoryWorkflowProcessLower.ProjectName, repositoryWorkflowProcessLower.ReplicationLevel, repositoryWorkflowProcessLower.sRunnable, repositoryWorkflowProcessLower.Status, repositoryWorkflowProcessLower.Version, repositoryWorkflowProcessLower.WorkflowMode,listOfRepositoryWfStepMerged, listOfRepositoryWfProcessPropMerged, listOfRepositoryWfBranchConnectorMerged);

							templistOfRepositoryWfStep = new ArrayList<RepositoryWfStep>(repositoryWorkflowProcessMerged.GetListOfRepositoryWfStep());
							templistOfRepositoryWfProcessProp = new ArrayList<RepositoryWfProcessProp>(repositoryWorkflowProcessMerged.GetListOfRepositoryWfProcessProp());
							templistOfRepositoryWfBranchConnector = new ArrayList<RepositoryWfBranchConnector>(repositoryWorkflowProcessMerged.GetListOfRepositoryWfBranchConnector());

							//System.out.println(repositoryWorkflowProcessMerged.BusinessObject + "||" + repositoryWorkflowProcessMerged.CacheLocale + "||" + repositoryWorkflowProcessMerged.Comments + "||" + repositoryWorkflowProcessMerged.Description + "||" + repositoryWorkflowProcessMerged.EffectiveEndDate + "||" + repositoryWorkflowProcessMerged.EffectiveStartDate + "||" + repositoryWorkflowProcessMerged.ErrorProcessName + "||" + repositoryWorkflowProcessMerged.sGroup + "||" + repositoryWorkflowProcessMerged.Inactive + "||" + repositoryWorkflowProcessMerged.Module + "||" + repositoryWorkflowProcessMerged.sName + "||" + repositoryWorkflowProcessMerged.PersistentFrequency + "||" + repositoryWorkflowProcessMerged.PersistentLevel + "||" + repositoryWorkflowProcessMerged.ProcessName + "||" + repositoryWorkflowProcessMerged.ProjectName + "||" + repositoryWorkflowProcessMerged.ReplicationLevel + "||" + repositoryWorkflowProcessMerged.sRunnable + "||" + repositoryWorkflowProcessMerged.Status + "||" + repositoryWorkflowProcessMerged.Version + "||" + repositoryWorkflowProcessMerged.WorkflowMode);

							for (int p=0; p<templistOfRepositoryWfProcessProp.size(); p++)
							{
								//System.out.println("Process Prop name: " + templistOfRepositoryWfProcessProp.get(p).Name2);
							}

							for (int p=0; p<templistOfRepositoryWfBranchConnector.size(); p++)
							{
								//System.out.println("Branch Connector Name: " + templistOfRepositoryWfBranchConnector.get(p).Name2);
							}

							for (int p=0; p<templistOfRepositoryWfStep.size(); p++)
							{
								//System.out.println("Step Name: " + templistOfRepositoryWfStep.get(p).Name3);
							}

							copy(new File(lowerWfFolderName + "\\\\" + lowerWfFileList[lowerMatchCtr]), new File(targetWfFolderName + "\\\\" + higherWFFileList[higherMatchCtr]));
							commonFileCtr++;

							DocumentBuilderFactory factoryTarget = DocumentBuilderFactory.newInstance();
							Document docTarget = factoryTarget.newDocumentBuilder().parse(targetWfFolderName + "\\\\" + higherWFFileList[higherMatchCtr]);
							docTarget.setXmlStandalone(true);

							Element xmlListOfRepWfProc = (Element)docTarget.getElementsByTagName("ListOfRepositoryWorkflowProcess").item(0);

							Element element = (Element)docTarget.getElementsByTagName("RepositoryWorkflowProcess").item(0);
							element.getParentNode().removeChild(element);
							docTarget.normalize();

							Element xmlRepWfProc = docTarget.createElement("RepositoryWorkflowProcess");

							xmlListOfRepWfProc.appendChild(xmlRepWfProc);

							Element xmlRepWfProcAttr = docTarget.createElement("BusinessObject");
							xmlRepWfProc.appendChild(xmlRepWfProcAttr).setTextContent(repositoryWorkflowProcessMerged.BusinessObject);
							xmlRepWfProcAttr = docTarget.createElement("CacheLocale");
							xmlRepWfProc.appendChild(xmlRepWfProcAttr).setTextContent(repositoryWorkflowProcessMerged.CacheLocale);
							xmlRepWfProcAttr = docTarget.createElement("Comments");
							xmlRepWfProc.appendChild(xmlRepWfProcAttr).setTextContent(repositoryWorkflowProcessMerged.Comments);
							xmlRepWfProcAttr = docTarget.createElement("Description");
							xmlRepWfProc.appendChild(xmlRepWfProcAttr).setTextContent(repositoryWorkflowProcessMerged.Description);
							xmlRepWfProcAttr = docTarget.createElement("EffectiveEndDate");
							xmlRepWfProc.appendChild(xmlRepWfProcAttr).setTextContent(repositoryWorkflowProcessMerged.EffectiveEndDate);
							xmlRepWfProcAttr = docTarget.createElement("EffectiveStartDate");
							xmlRepWfProc.appendChild(xmlRepWfProcAttr).setTextContent(repositoryWorkflowProcessMerged.EffectiveStartDate);
							xmlRepWfProcAttr = docTarget.createElement("ErrorProcessName");
							xmlRepWfProc.appendChild(xmlRepWfProcAttr).setTextContent(repositoryWorkflowProcessMerged.ErrorProcessName);
							xmlRepWfProcAttr = docTarget.createElement("Group");
							xmlRepWfProc.appendChild(xmlRepWfProcAttr).setTextContent(repositoryWorkflowProcessMerged.sGroup);
							xmlRepWfProcAttr = docTarget.createElement("Inactive");
							xmlRepWfProc.appendChild(xmlRepWfProcAttr).setTextContent(repositoryWorkflowProcessMerged.Inactive);
							xmlRepWfProcAttr = docTarget.createElement("Module");
							xmlRepWfProc.appendChild(xmlRepWfProcAttr).setTextContent(repositoryWorkflowProcessMerged.Module);
							xmlRepWfProcAttr = docTarget.createElement("Name");
							xmlRepWfProc.appendChild(xmlRepWfProcAttr).setTextContent(repositoryWorkflowProcessMerged.sName.substring(0,repositoryWorkflowProcessMerged.sName.lastIndexOf(":")+1) + " " + Integer.toString(Integer.parseInt(repositoryWorkflowProcessMerged.Version) + 1));
							xmlRepWfProcAttr = docTarget.createElement("PersistentFrequency");
							xmlRepWfProc.appendChild(xmlRepWfProcAttr).setTextContent(repositoryWorkflowProcessMerged.PersistentFrequency);
							xmlRepWfProcAttr = docTarget.createElement("PersistentLevel");
							xmlRepWfProc.appendChild(xmlRepWfProcAttr).setTextContent(repositoryWorkflowProcessMerged.PersistentLevel);
							xmlRepWfProcAttr = docTarget.createElement("ProcessName");
							xmlRepWfProc.appendChild(xmlRepWfProcAttr).setTextContent(repositoryWorkflowProcessMerged.ProcessName);
							xmlRepWfProcAttr = docTarget.createElement("ProjectName");
							xmlRepWfProc.appendChild(xmlRepWfProcAttr).setTextContent(repositoryWorkflowProcessMerged.ProjectName);
							xmlRepWfProcAttr = docTarget.createElement("ReplicationLevel");
							xmlRepWfProc.appendChild(xmlRepWfProcAttr).setTextContent(repositoryWorkflowProcessMerged.ReplicationLevel);
							xmlRepWfProcAttr = docTarget.createElement("Runnable");
							xmlRepWfProc.appendChild(xmlRepWfProcAttr).setTextContent(repositoryWorkflowProcessMerged.sRunnable);
							xmlRepWfProcAttr = docTarget.createElement("Status");
							xmlRepWfProc.appendChild(xmlRepWfProcAttr).setTextContent(repositoryWorkflowProcessMerged.Status);
							xmlRepWfProcAttr = docTarget.createElement("Version");
							xmlRepWfProc.appendChild(xmlRepWfProcAttr).setTextContent(Integer.toString(Integer.parseInt(repositoryWorkflowProcessMerged.Version) + 1));
							xmlRepWfProcAttr = docTarget.createElement("WorkflowMode");
							xmlRepWfProc.appendChild(xmlRepWfProcAttr).setTextContent(repositoryWorkflowProcessMerged.WorkflowMode);

							//Writing Process Properties
							Element xmlListOfWfProcProp = docTarget.createElement("ListOfRepositoryWfProcessProp");
							xmlRepWfProc.appendChild(xmlListOfWfProcProp);

							for (int p=0; p<templistOfRepositoryWfProcessProp.size(); p++)
							{
								Element xmlRepWfProcProp = docTarget.createElement("RepositoryWfProcessProp");
								xmlListOfWfProcProp.appendChild(xmlRepWfProcProp);

								Element xmlRepWfProcPropAttr = docTarget.createElement("AccessMode");
								xmlRepWfProcProp.appendChild(xmlRepWfProcPropAttr).setTextContent(templistOfRepositoryWfProcessProp.get(p).AccessMode);
								xmlRepWfProcPropAttr = docTarget.createElement("BusinessComponent");
								xmlRepWfProcProp.appendChild(xmlRepWfProcPropAttr).setTextContent(templistOfRepositoryWfProcessProp.get(p).BusinessComponent);
								xmlRepWfProcPropAttr = docTarget.createElement("CorrelatorFlag");
								xmlRepWfProcProp.appendChild(xmlRepWfProcPropAttr).setTextContent(templistOfRepositoryWfProcessProp.get(p).CorrelatorFlag);
								xmlRepWfProcPropAttr = docTarget.createElement("Comments");
								xmlRepWfProcProp.appendChild(xmlRepWfProcPropAttr).setTextContent(templistOfRepositoryWfProcessProp.get(p).Comments);
								xmlRepWfProcPropAttr = docTarget.createElement("DataType");
								xmlRepWfProcProp.appendChild(xmlRepWfProcPropAttr).setTextContent(templistOfRepositoryWfProcessProp.get(p).DataType);
								xmlRepWfProcPropAttr = docTarget.createElement("DefaultDate");
								xmlRepWfProcProp.appendChild(xmlRepWfProcPropAttr).setTextContent(templistOfRepositoryWfProcessProp.get(p).DefaultDate);
								xmlRepWfProcPropAttr = docTarget.createElement("DefaultNumber");
								xmlRepWfProcProp.appendChild(xmlRepWfProcPropAttr).setTextContent(templistOfRepositoryWfProcessProp.get(p).DefaultNumber);
								xmlRepWfProcPropAttr = docTarget.createElement("DefaultString");
								xmlRepWfProcProp.appendChild(xmlRepWfProcPropAttr).setTextContent(templistOfRepositoryWfProcessProp.get(p).DefaultString);
								xmlRepWfProcPropAttr = docTarget.createElement("DisplayName");
								xmlRepWfProcProp.appendChild(xmlRepWfProcPropAttr).setTextContent(templistOfRepositoryWfProcessProp.get(p).DisplayName);
								xmlRepWfProcPropAttr = docTarget.createElement("InOut");
								xmlRepWfProcProp.appendChild(xmlRepWfProcPropAttr).setTextContent(templistOfRepositoryWfProcessProp.get(p).InOut);
								xmlRepWfProcPropAttr = docTarget.createElement("Inactive");
								xmlRepWfProcProp.appendChild(xmlRepWfProcPropAttr).setTextContent(templistOfRepositoryWfProcessProp.get(p).Inactive);
								xmlRepWfProcPropAttr = docTarget.createElement("IntegrationObject");
								xmlRepWfProcProp.appendChild(xmlRepWfProcPropAttr).setTextContent(templistOfRepositoryWfProcessProp.get(p).IntegrationObject);
								xmlRepWfProcPropAttr = docTarget.createElement("Name2");
								xmlRepWfProcProp.appendChild(xmlRepWfProcPropAttr).setTextContent(templistOfRepositoryWfProcessProp.get(p).Name2);
								xmlRepWfProcPropAttr = docTarget.createElement("VirtualField");
								xmlRepWfProcProp.appendChild(xmlRepWfProcPropAttr).setTextContent(templistOfRepositoryWfProcessProp.get(p).VirtualField);
							}

							//Writing Wf Steps
							Element xmlListOfWfStep = docTarget.createElement("ListOfRepositoryWfStep");
							xmlRepWfProc.appendChild(xmlListOfWfStep);
							/*tempListOfRepositoryWfBranchCriteriaValue;
							tempListOfRepositoryWfBranchCriteria;
							tempListOfRepositoryWfStepBranch;
							tempListOfRepositoryWfStepIOArgument;
							tempListOfRepositoryWfStepRecipient;*/

							for (int p=0; p<templistOfRepositoryWfStep.size(); p++)
							{
								Element xmlRepWfStep = docTarget.createElement("RepositoryWfStep");
								xmlListOfWfStep.appendChild(xmlRepWfStep);

								Element xmlRepWfStepAttr = docTarget.createElement("AllowRetryFlag");
								xmlRepWfStep.appendChild(xmlRepWfStepAttr).setTextContent(templistOfRepositoryWfStep.get(p).AllowRetryFlag);
								xmlRepWfStepAttr = docTarget.createElement("BusinessComponent");
								xmlRepWfStep.appendChild(xmlRepWfStepAttr).setTextContent(templistOfRepositoryWfStep.get(p).BusinessComponent);
								xmlRepWfStepAttr = docTarget.createElement("Operation");
								xmlRepWfStep.appendChild(xmlRepWfStepAttr).setTextContent(templistOfRepositoryWfStep.get(p).sOperation);
								xmlRepWfStepAttr = docTarget.createElement("BusinessServiceMethod");
								xmlRepWfStep.appendChild(xmlRepWfStepAttr).setTextContent(templistOfRepositoryWfStep.get(p).BusinessServiceMethod);
								xmlRepWfStepAttr = docTarget.createElement("BusinessServiceName");
								xmlRepWfStep.appendChild(xmlRepWfStepAttr).setTextContent(templistOfRepositoryWfStep.get(p).BusinessServiceName);
								xmlRepWfStepAttr = docTarget.createElement("Comments");
								xmlRepWfStep.appendChild(xmlRepWfStepAttr).setTextContent(templistOfRepositoryWfStep.get(p).Comments);
								xmlRepWfStepAttr = docTarget.createElement("Description");
								xmlRepWfStep.appendChild(xmlRepWfStepAttr).setTextContent(templistOfRepositoryWfStep.get(p).Description);
								xmlRepWfStepAttr = docTarget.createElement("ErrorCode");
								xmlRepWfStep.appendChild(xmlRepWfStepAttr).setTextContent(templistOfRepositoryWfStep.get(p).ErrorCode);
								xmlRepWfStepAttr = docTarget.createElement("ErrorMessage");
								xmlRepWfStep.appendChild(xmlRepWfStepAttr).setTextContent(templistOfRepositoryWfStep.get(p).ErrorMessage);
								xmlRepWfStepAttr = docTarget.createElement("EvaluateAll");
								xmlRepWfStep.appendChild(xmlRepWfStepAttr).setTextContent(templistOfRepositoryWfStep.get(p).EvaluateAll);
								xmlRepWfStepAttr = docTarget.createElement("Inactive");
								xmlRepWfStep.appendChild(xmlRepWfStepAttr).setTextContent(templistOfRepositoryWfStep.get(p).Inactive);
								xmlRepWfStepAttr = docTarget.createElement("Layout");
								xmlRepWfStep.appendChild(xmlRepWfStepAttr).setTextContent(templistOfRepositoryWfStep.get(p).Layout);
								xmlRepWfStepAttr = docTarget.createElement("MaximumIterations");
								xmlRepWfStep.appendChild(xmlRepWfStepAttr).setTextContent(templistOfRepositoryWfStep.get(p).MaximumIterations);
								xmlRepWfStepAttr = docTarget.createElement("Name3");
								xmlRepWfStep.appendChild(xmlRepWfStepAttr).setTextContent(templistOfRepositoryWfStep.get(p).Name3);
								xmlRepWfStepAttr = docTarget.createElement("ProcessingMode");
								xmlRepWfStep.appendChild(xmlRepWfStepAttr).setTextContent(templistOfRepositoryWfStep.get(p).ProcessingMode);
								xmlRepWfStepAttr = docTarget.createElement("SubprocessName");
								xmlRepWfStep.appendChild(xmlRepWfStepAttr).setTextContent(templistOfRepositoryWfStep.get(p).SubprocessName);
								xmlRepWfStepAttr = docTarget.createElement("Type");
								xmlRepWfStep.appendChild(xmlRepWfStepAttr).setTextContent(templistOfRepositoryWfStep.get(p).sType);
								xmlRepWfStepAttr = docTarget.createElement("UserInteractView");
								xmlRepWfStep.appendChild(xmlRepWfStepAttr).setTextContent(templistOfRepositoryWfStep.get(p).UserInteractView);

								tempListOfRepositoryWfStepBranch = new ArrayList<RepositoryWfStepBranch>(templistOfRepositoryWfStep.get(p).GetListOfRepositoryWfStepBranch());

								// Writing Wf StepBranch
								Element xmlListOfWfStepBranch = docTarget.createElement("ListOfRepositoryWfStepBranch");
								xmlRepWfStep.appendChild(xmlListOfWfStepBranch);

								for (int q=0; q<tempListOfRepositoryWfStepBranch.size(); q++)
								{
									Element xmlRepWfStepBranch = docTarget.createElement("RepositoryWfStepBranch");
									xmlListOfWfStepBranch.appendChild(xmlRepWfStepBranch);

									Element xmlRepWfStepBranchAttr = docTarget.createElement("Comments");
									xmlRepWfStepBranch.appendChild(xmlRepWfStepBranchAttr).setTextContent(tempListOfRepositoryWfStepBranch.get(q).Comments);
									xmlRepWfStepBranchAttr = docTarget.createElement("Count");
									xmlRepWfStepBranch.appendChild(xmlRepWfStepBranchAttr).setTextContent(tempListOfRepositoryWfStepBranch.get(q).Count);
									xmlRepWfStepBranchAttr = docTarget.createElement("EvaluateSequence");
									xmlRepWfStepBranch.appendChild(xmlRepWfStepBranchAttr).setTextContent(tempListOfRepositoryWfStepBranch.get(q).EvaluateSequence);
									xmlRepWfStepBranchAttr = docTarget.createElement("Event");
									xmlRepWfStepBranch.appendChild(xmlRepWfStepBranchAttr).setTextContent(tempListOfRepositoryWfStepBranch.get(q).sEvent);
									xmlRepWfStepBranchAttr = docTarget.createElement("EventCancelFlag");
									xmlRepWfStepBranch.appendChild(xmlRepWfStepBranchAttr).setTextContent(tempListOfRepositoryWfStepBranch.get(q).EventCancelFlag);
									xmlRepWfStepBranchAttr = docTarget.createElement("EventObject");
									xmlRepWfStepBranch.appendChild(xmlRepWfStepBranchAttr).setTextContent(tempListOfRepositoryWfStepBranch.get(q).sEventObject);
									xmlRepWfStepBranchAttr = docTarget.createElement("EventObjectType");
									xmlRepWfStepBranch.appendChild(xmlRepWfStepBranchAttr).setTextContent(tempListOfRepositoryWfStepBranch.get(q).EventObjectType);
									xmlRepWfStepBranchAttr = docTarget.createElement("EventVisibility");
									xmlRepWfStepBranch.appendChild(xmlRepWfStepBranchAttr).setTextContent(tempListOfRepositoryWfStepBranch.get(q).EventVisibility);
									xmlRepWfStepBranchAttr = docTarget.createElement("Expression");
									xmlRepWfStepBranch.appendChild(xmlRepWfStepBranchAttr).setTextContent(tempListOfRepositoryWfStepBranch.get(q).sExpression);
									xmlRepWfStepBranchAttr = docTarget.createElement("Inactive");
									xmlRepWfStepBranch.appendChild(xmlRepWfStepBranchAttr).setTextContent(tempListOfRepositoryWfStepBranch.get(q).Inactive);
									xmlRepWfStepBranchAttr = docTarget.createElement("Name2");
									xmlRepWfStepBranch.appendChild(xmlRepWfStepBranchAttr).setTextContent(tempListOfRepositoryWfStepBranch.get(q).Name2);
									xmlRepWfStepBranchAttr = docTarget.createElement("Subevent");
									xmlRepWfStepBranch.appendChild(xmlRepWfStepBranchAttr).setTextContent(tempListOfRepositoryWfStepBranch.get(q).Subevent);
									xmlRepWfStepBranchAttr = docTarget.createElement("TimeLimit");
									xmlRepWfStepBranch.appendChild(xmlRepWfStepBranchAttr).setTextContent(tempListOfRepositoryWfStepBranch.get(q).TimeLimit);
									xmlRepWfStepBranchAttr = docTarget.createElement("Type");
									xmlRepWfStepBranch.appendChild(xmlRepWfStepBranchAttr).setTextContent(tempListOfRepositoryWfStepBranch.get(q).sType);
									xmlRepWfStepBranchAttr = docTarget.createElement("UserEventName");
									xmlRepWfStepBranch.appendChild(xmlRepWfStepBranchAttr).setTextContent(tempListOfRepositoryWfStepBranch.get(q).UserEventName);
									xmlRepWfStepBranchAttr = docTarget.createElement("UserEventStorage");
									xmlRepWfStepBranch.appendChild(xmlRepWfStepBranchAttr).setTextContent(tempListOfRepositoryWfStepBranch.get(q).UserEventStorage);
									xmlRepWfStepBranchAttr = docTarget.createElement("UserEventTimeout");
									xmlRepWfStepBranch.appendChild(xmlRepWfStepBranchAttr).setTextContent(tempListOfRepositoryWfStepBranch.get(q).UserEventTimeout);

									//Writing BranchCriteria
									tempListOfRepositoryWfBranchCriteria = tempListOfRepositoryWfStepBranch.get(q).GetListOfRepositoryWfBranchCriteria();

									Element xmlListOfWfBranchCriteria = docTarget.createElement("ListOfRepositoryWfBranchCriteria");
									xmlRepWfStepBranch.appendChild(xmlListOfWfBranchCriteria);
									for (int r=0; r<tempListOfRepositoryWfBranchCriteria.size(); r++)
									{
										Element xmlRepWfBranchCriteria = docTarget.createElement("RepositoryWfBranchCriteria");
										xmlListOfWfBranchCriteria.appendChild(xmlRepWfBranchCriteria);
										
										Element xmlRepWfBranchCriteriaAttr = docTarget.createElement("AppletFieldName");
										xmlRepWfBranchCriteria.appendChild(xmlRepWfBranchCriteriaAttr).setTextContent(tempListOfRepositoryWfBranchCriteria.get(r).AppletFieldName);
										xmlRepWfBranchCriteriaAttr = docTarget.createElement("AppletName");
										xmlRepWfBranchCriteria.appendChild(xmlRepWfBranchCriteriaAttr).setTextContent(tempListOfRepositoryWfBranchCriteria.get(r).AppletName);
										xmlRepWfBranchCriteriaAttr = docTarget.createElement("Operation");
										xmlRepWfBranchCriteria.appendChild(xmlRepWfBranchCriteriaAttr).setTextContent(tempListOfRepositoryWfBranchCriteria.get(r).sOperation);
										xmlRepWfBranchCriteriaAttr = docTarget.createElement("BusinessComponent");
										xmlRepWfBranchCriteria.appendChild(xmlRepWfBranchCriteriaAttr).setTextContent(tempListOfRepositoryWfBranchCriteria.get(r).BusinessComponent);
										xmlRepWfBranchCriteriaAttr = docTarget.createElement("BusinessComponentField");
										xmlRepWfBranchCriteria.appendChild(xmlRepWfBranchCriteriaAttr).setTextContent(tempListOfRepositoryWfBranchCriteria.get(r).BusinessComponentField);
										xmlRepWfBranchCriteriaAttr = docTarget.createElement("Comments");
										xmlRepWfBranchCriteria.appendChild(xmlRepWfBranchCriteriaAttr).setTextContent(tempListOfRepositoryWfBranchCriteria.get(r).Comments);
										xmlRepWfBranchCriteriaAttr = docTarget.createElement("CompareTo");
										xmlRepWfBranchCriteria.appendChild(xmlRepWfBranchCriteriaAttr).setTextContent(tempListOfRepositoryWfBranchCriteria.get(r).CompareTo);
										xmlRepWfBranchCriteriaAttr = docTarget.createElement("Inactive");
										xmlRepWfBranchCriteria.appendChild(xmlRepWfBranchCriteriaAttr).setTextContent(tempListOfRepositoryWfBranchCriteria.get(r).Inactive);
										xmlRepWfBranchCriteriaAttr = docTarget.createElement("ItemTypeName");
										xmlRepWfBranchCriteria.appendChild(xmlRepWfBranchCriteriaAttr).setTextContent(tempListOfRepositoryWfBranchCriteria.get(r).ItemTypeName);
										xmlRepWfBranchCriteriaAttr = docTarget.createElement("Name2");
										xmlRepWfBranchCriteria.appendChild(xmlRepWfBranchCriteriaAttr).setTextContent(tempListOfRepositoryWfBranchCriteria.get(r).Name2);
										xmlRepWfBranchCriteriaAttr = docTarget.createElement("PropertyName");
										xmlRepWfBranchCriteria.appendChild(xmlRepWfBranchCriteriaAttr).setTextContent(tempListOfRepositoryWfBranchCriteria.get(r).PropertyName);
										xmlRepWfBranchCriteriaAttr = docTarget.createElement("Sequence");
										xmlRepWfBranchCriteria.appendChild(xmlRepWfBranchCriteriaAttr).setTextContent(tempListOfRepositoryWfBranchCriteria.get(r).sSequence);

										//Writing BranchCriteriaValue
										tempListOfRepositoryWfBranchCriteriaValue = tempListOfRepositoryWfBranchCriteria.get(r).GetListOfRepositoryWfBranchCriteriaValue();

										Element xmlListOfWfBranchCriteriaValue = docTarget.createElement("ListOfRepositoryWfBranchCriteriaValue");
										xmlRepWfBranchCriteria.appendChild(xmlListOfWfBranchCriteriaValue);

										for (int s=0; s<tempListOfRepositoryWfBranchCriteriaValue.size(); s++)
										{
											Element xmlRepWfBranchCriteriaValue = docTarget.createElement("RepositoryWfBranchCriteriaValue");
											xmlListOfWfBranchCriteriaValue.appendChild(xmlRepWfBranchCriteriaValue);
											Element xmlRepWfBranchCriteriaValueAttr = docTarget.createElement("Comments");
											xmlRepWfBranchCriteriaValue.appendChild(xmlRepWfBranchCriteriaValueAttr).setTextContent(tempListOfRepositoryWfBranchCriteriaValue.get(s).Comments);
											xmlRepWfBranchCriteriaValueAttr = docTarget.createElement("HI_CHAR1");
											xmlRepWfBranchCriteriaValue.appendChild(xmlRepWfBranchCriteriaValueAttr).setTextContent(tempListOfRepositoryWfBranchCriteriaValue.get(s).HI_CHAR1);
											xmlRepWfBranchCriteriaValueAttr = docTarget.createElement("HI_CHAR2");
											xmlRepWfBranchCriteriaValue.appendChild(xmlRepWfBranchCriteriaValueAttr).setTextContent(tempListOfRepositoryWfBranchCriteriaValue.get(s).HI_CHAR2);
											xmlRepWfBranchCriteriaValueAttr = docTarget.createElement("HI_CHAR3");
											xmlRepWfBranchCriteriaValue.appendChild(xmlRepWfBranchCriteriaValueAttr).setTextContent(tempListOfRepositoryWfBranchCriteriaValue.get(s).HI_CHAR3);
											xmlRepWfBranchCriteriaValueAttr = docTarget.createElement("HI_CHAR4");
											xmlRepWfBranchCriteriaValue.appendChild(xmlRepWfBranchCriteriaValueAttr).setTextContent(tempListOfRepositoryWfBranchCriteriaValue.get(s).HI_CHAR4);
											xmlRepWfBranchCriteriaValueAttr = docTarget.createElement("HI_DATE1");
											xmlRepWfBranchCriteriaValue.appendChild(xmlRepWfBranchCriteriaValueAttr).setTextContent(tempListOfRepositoryWfBranchCriteriaValue.get(s).HI_DATE1);
											xmlRepWfBranchCriteriaValueAttr = docTarget.createElement("HI_DATE2");
											xmlRepWfBranchCriteriaValue.appendChild(xmlRepWfBranchCriteriaValueAttr).setTextContent(tempListOfRepositoryWfBranchCriteriaValue.get(s).HI_DATE2);
											xmlRepWfBranchCriteriaValueAttr = docTarget.createElement("HI_DATE3");
											xmlRepWfBranchCriteriaValue.appendChild(xmlRepWfBranchCriteriaValueAttr).setTextContent(tempListOfRepositoryWfBranchCriteriaValue.get(s).HI_DATE3);
											xmlRepWfBranchCriteriaValueAttr = docTarget.createElement("HI_DATE4");
											xmlRepWfBranchCriteriaValue.appendChild(xmlRepWfBranchCriteriaValueAttr).setTextContent(tempListOfRepositoryWfBranchCriteriaValue.get(s).HI_DATE4);
											xmlRepWfBranchCriteriaValueAttr = docTarget.createElement("HI_NUM1");
											xmlRepWfBranchCriteriaValue.appendChild(xmlRepWfBranchCriteriaValueAttr).setTextContent(tempListOfRepositoryWfBranchCriteriaValue.get(s).HI_NUM1);
											xmlRepWfBranchCriteriaValueAttr = docTarget.createElement("HI_NUM2");
											xmlRepWfBranchCriteriaValue.appendChild(xmlRepWfBranchCriteriaValueAttr).setTextContent(tempListOfRepositoryWfBranchCriteriaValue.get(s).HI_NUM2);
											xmlRepWfBranchCriteriaValueAttr = docTarget.createElement("HI_NUM3");
											xmlRepWfBranchCriteriaValue.appendChild(xmlRepWfBranchCriteriaValueAttr).setTextContent(tempListOfRepositoryWfBranchCriteriaValue.get(s).HI_NUM3);
											xmlRepWfBranchCriteriaValueAttr = docTarget.createElement("HI_NUM4");
											xmlRepWfBranchCriteriaValue.appendChild(xmlRepWfBranchCriteriaValueAttr).setTextContent(tempListOfRepositoryWfBranchCriteriaValue.get(s).HI_NUM4);
											xmlRepWfBranchCriteriaValueAttr = docTarget.createElement("Inactive");
											xmlRepWfBranchCriteriaValue.appendChild(xmlRepWfBranchCriteriaValueAttr).setTextContent(tempListOfRepositoryWfBranchCriteriaValue.get(s).Inactive);
											xmlRepWfBranchCriteriaValueAttr = docTarget.createElement("LO_CHAR1");
											xmlRepWfBranchCriteriaValue.appendChild(xmlRepWfBranchCriteriaValueAttr).setTextContent(tempListOfRepositoryWfBranchCriteriaValue.get(s).LO_CHAR1);
											xmlRepWfBranchCriteriaValueAttr = docTarget.createElement("LO_CHAR2");
											xmlRepWfBranchCriteriaValue.appendChild(xmlRepWfBranchCriteriaValueAttr).setTextContent(tempListOfRepositoryWfBranchCriteriaValue.get(s).LO_CHAR2);
											xmlRepWfBranchCriteriaValueAttr = docTarget.createElement("LO_CHAR3");
											xmlRepWfBranchCriteriaValue.appendChild(xmlRepWfBranchCriteriaValueAttr).setTextContent(tempListOfRepositoryWfBranchCriteriaValue.get(s).LO_CHAR3);
											xmlRepWfBranchCriteriaValueAttr = docTarget.createElement("LO_CHAR4");
											xmlRepWfBranchCriteriaValue.appendChild(xmlRepWfBranchCriteriaValueAttr).setTextContent(tempListOfRepositoryWfBranchCriteriaValue.get(s).LO_CHAR4);
											xmlRepWfBranchCriteriaValueAttr = docTarget.createElement("LO_CHAR5");
											xmlRepWfBranchCriteriaValue.appendChild(xmlRepWfBranchCriteriaValueAttr).setTextContent(tempListOfRepositoryWfBranchCriteriaValue.get(s).LO_CHAR5);
											xmlRepWfBranchCriteriaValueAttr = docTarget.createElement("LO_DATE1");
											xmlRepWfBranchCriteriaValue.appendChild(xmlRepWfBranchCriteriaValueAttr).setTextContent(tempListOfRepositoryWfBranchCriteriaValue.get(s).LO_DATE1);
											xmlRepWfBranchCriteriaValueAttr = docTarget.createElement("LO_DATE2");
											xmlRepWfBranchCriteriaValue.appendChild(xmlRepWfBranchCriteriaValueAttr).setTextContent(tempListOfRepositoryWfBranchCriteriaValue.get(s).LO_DATE2);
											xmlRepWfBranchCriteriaValueAttr = docTarget.createElement("LO_DATE3");
											xmlRepWfBranchCriteriaValue.appendChild(xmlRepWfBranchCriteriaValueAttr).setTextContent(tempListOfRepositoryWfBranchCriteriaValue.get(s).LO_DATE3);
											xmlRepWfBranchCriteriaValueAttr = docTarget.createElement("LO_DATE4");
											xmlRepWfBranchCriteriaValue.appendChild(xmlRepWfBranchCriteriaValueAttr).setTextContent(tempListOfRepositoryWfBranchCriteriaValue.get(s).LO_DATE4);
											xmlRepWfBranchCriteriaValueAttr = docTarget.createElement("LO_NUM1");
											xmlRepWfBranchCriteriaValue.appendChild(xmlRepWfBranchCriteriaValueAttr).setTextContent(tempListOfRepositoryWfBranchCriteriaValue.get(s).LO_NUM1);
											xmlRepWfBranchCriteriaValueAttr = docTarget.createElement("LO_NUM2");
											xmlRepWfBranchCriteriaValue.appendChild(xmlRepWfBranchCriteriaValueAttr).setTextContent(tempListOfRepositoryWfBranchCriteriaValue.get(s).LO_NUM2);
											xmlRepWfBranchCriteriaValueAttr = docTarget.createElement("LO_NUM3");
											xmlRepWfBranchCriteriaValue.appendChild(xmlRepWfBranchCriteriaValueAttr).setTextContent(tempListOfRepositoryWfBranchCriteriaValue.get(s).LO_NUM3);
											xmlRepWfBranchCriteriaValueAttr = docTarget.createElement("LO_NUM4");
											xmlRepWfBranchCriteriaValue.appendChild(xmlRepWfBranchCriteriaValueAttr).setTextContent(tempListOfRepositoryWfBranchCriteriaValue.get(s).LO_NUM4);
											xmlRepWfBranchCriteriaValueAttr = docTarget.createElement("Name2");
											xmlRepWfBranchCriteriaValue.appendChild(xmlRepWfBranchCriteriaValueAttr).setTextContent(tempListOfRepositoryWfBranchCriteriaValue.get(s).Name2);
											xmlRepWfBranchCriteriaValueAttr = docTarget.createElement("Sequence");
											xmlRepWfBranchCriteriaValue.appendChild(xmlRepWfBranchCriteriaValueAttr).setTextContent(tempListOfRepositoryWfBranchCriteriaValue.get(s).sSequence);
										}
									}
								}

								tempListOfRepositoryWfStepIOArgument = new ArrayList<RepositoryWfStepIOArgument>(templistOfRepositoryWfStep.get(p).GetListOfRepositoryWfStepIOArgument());

								// Writing Wf StepIOArg
								Element xmlListOfWfStepIOArg = docTarget.createElement("ListOfRepositoryWfStepIOArgument");
								xmlRepWfStep.appendChild(xmlListOfWfStepIOArg);

								for (int q=0; q<tempListOfRepositoryWfStepIOArgument.size(); q++)
								{
									Element xmlRepWfStepIOArg = docTarget.createElement("RepositoryWfStepIOArgument");
									xmlListOfWfStepIOArg.appendChild(xmlRepWfStepIOArg);
									Element xmlRepWfStepIOArgAttr = docTarget.createElement("BusinessComponent");
									xmlRepWfStepIOArg.appendChild(xmlRepWfStepIOArgAttr).setTextContent(tempListOfRepositoryWfStepIOArgument.get(q).BusinessComponent);
									xmlRepWfStepIOArgAttr = docTarget.createElement("BusinessComponentField");
									xmlRepWfStepIOArg.appendChild(xmlRepWfStepIOArgAttr).setTextContent(tempListOfRepositoryWfStepIOArgument.get(q).BusinessComponentField);
									xmlRepWfStepIOArgAttr = docTarget.createElement("Comments");
									xmlRepWfStepIOArg.appendChild(xmlRepWfStepIOArgAttr).setTextContent(tempListOfRepositoryWfStepIOArgument.get(q).Comments);
									xmlRepWfStepIOArgAttr = docTarget.createElement("Inactive");
									xmlRepWfStepIOArg.appendChild(xmlRepWfStepIOArgAttr).setTextContent(tempListOfRepositoryWfStepIOArgument.get(q).Inactive);
									xmlRepWfStepIOArgAttr = docTarget.createElement("InputFlag");
									xmlRepWfStepIOArg.appendChild(xmlRepWfStepIOArgAttr).setTextContent(tempListOfRepositoryWfStepIOArgument.get(q).InputFlag);
									xmlRepWfStepIOArgAttr = docTarget.createElement("ItemTypeName");
									xmlRepWfStepIOArg.appendChild(xmlRepWfStepIOArgAttr).setTextContent(tempListOfRepositoryWfStepIOArgument.get(q).ItemTypeName);
									xmlRepWfStepIOArgAttr = docTarget.createElement("Name2");
									xmlRepWfStepIOArg.appendChild(xmlRepWfStepIOArgAttr).setTextContent(tempListOfRepositoryWfStepIOArgument.get(q).Name2);
									xmlRepWfStepIOArgAttr = docTarget.createElement("OutputArg");
									xmlRepWfStepIOArg.appendChild(xmlRepWfStepIOArgAttr).setTextContent(tempListOfRepositoryWfStepIOArgument.get(q).OutputArg);
									xmlRepWfStepIOArgAttr = docTarget.createElement("PropertyName");
									xmlRepWfStepIOArg.appendChild(xmlRepWfStepIOArgAttr).setTextContent(tempListOfRepositoryWfStepIOArgument.get(q).PropertyName);
									xmlRepWfStepIOArgAttr = docTarget.createElement("Sequence");
									xmlRepWfStepIOArg.appendChild(xmlRepWfStepIOArgAttr).setTextContent(tempListOfRepositoryWfStepIOArgument.get(q).sSequence);
									xmlRepWfStepIOArgAttr = docTarget.createElement("Type");
									xmlRepWfStepIOArg.appendChild(xmlRepWfStepIOArgAttr).setTextContent(tempListOfRepositoryWfStepIOArgument.get(q).sType);
									xmlRepWfStepIOArgAttr = docTarget.createElement("ValueSearchSpecification");
									xmlRepWfStepIOArg.appendChild(xmlRepWfStepIOArgAttr).setTextContent(tempListOfRepositoryWfStepIOArgument.get(q).ValueSearchSpecification);
								}

								tempListOfRepositoryWfStepRecipient = new ArrayList<RepositoryWfStepRecipient>(templistOfRepositoryWfStep.get(p).GetListOfRepositoryWfStepRecipient());

								// Writing Wf StepRecipient
								Element xmlListOfWfStepRecipient = docTarget.createElement("ListOfRepositoryWfStepRecipient");
								xmlRepWfStep.appendChild(xmlListOfWfStepRecipient);

								for (int q=0; q<tempListOfRepositoryWfStepRecipient.size(); q++)
								{
									Element xmlRepWfStepRecipient = docTarget.createElement("RepositoryWfStepRecipient");
									xmlListOfWfStepRecipient.appendChild(xmlRepWfStepRecipient);
									Element xmlRepWfStepRecipientAttr = docTarget.createElement("BusinessComponentField");
									xmlRepWfStepRecipient.appendChild(xmlRepWfStepRecipientAttr).setTextContent(tempListOfRepositoryWfStepRecipient.get(q).BusinessComponentField);
									xmlRepWfStepRecipientAttr = docTarget.createElement("BusinessComponentName");
									xmlRepWfStepRecipient.appendChild(xmlRepWfStepRecipientAttr).setTextContent(tempListOfRepositoryWfStepRecipient.get(q).BusinessComponentName);
									xmlRepWfStepRecipientAttr = docTarget.createElement("Comments");
									xmlRepWfStepRecipient.appendChild(xmlRepWfStepRecipientAttr).setTextContent(tempListOfRepositoryWfStepRecipient.get(q).Comments);
									xmlRepWfStepRecipientAttr = docTarget.createElement("Expression");
									xmlRepWfStepRecipient.appendChild(xmlRepWfStepRecipientAttr).setTextContent(tempListOfRepositoryWfStepRecipient.get(q).sExpression);
									xmlRepWfStepRecipientAttr = docTarget.createElement("Inactive");
									xmlRepWfStepRecipient.appendChild(xmlRepWfStepRecipientAttr).setTextContent(tempListOfRepositoryWfStepRecipient.get(q).Inactive);
									xmlRepWfStepRecipientAttr = docTarget.createElement("Name2");
									xmlRepWfStepRecipient.appendChild(xmlRepWfStepRecipientAttr).setTextContent(tempListOfRepositoryWfStepRecipient.get(q).Name2);
									xmlRepWfStepRecipientAttr = docTarget.createElement("ProcessPropertyName");
									xmlRepWfStepRecipient.appendChild(xmlRepWfStepRecipientAttr).setTextContent(tempListOfRepositoryWfStepRecipient.get(q).ProcessPropertyName);
									xmlRepWfStepRecipientAttr = docTarget.createElement("RecipientName");
									xmlRepWfStepRecipient.appendChild(xmlRepWfStepRecipientAttr).setTextContent(tempListOfRepositoryWfStepRecipient.get(q).RecipientName);
									xmlRepWfStepRecipientAttr = docTarget.createElement("RecipientTypeCode");
									xmlRepWfStepRecipient.appendChild(xmlRepWfStepRecipientAttr).setTextContent(tempListOfRepositoryWfStepRecipient.get(q).RecipientTypeCode);
									xmlRepWfStepRecipientAttr = docTarget.createElement("ValueTypeCode");
									xmlRepWfStepRecipient.appendChild(xmlRepWfStepRecipientAttr).setTextContent(tempListOfRepositoryWfStepRecipient.get(q).ValueTypeCode);
								}
							}

							//Writing Branch Connectors
							Element xmlListOfWfBranchConnector = docTarget.createElement("ListOfRepositoryWfBranchConnector");
							xmlRepWfProc.appendChild(xmlListOfWfBranchConnector);

							for (int p=0;p<templistOfRepositoryWfBranchConnector.size();p++){
								Element xmlRepWfBrnchConn = docTarget.createElement("RepositoryWfBranchConnector");
								//xmlRepWfBrnchConn.appendChild(docTarget.createTextNode("data"));
								xmlListOfWfBranchConnector.appendChild(xmlRepWfBrnchConn);

								Element xmlRepWfBrnchConnAttr = docTarget.createElement("Comments");
								xmlRepWfBrnchConn.appendChild(xmlRepWfBrnchConnAttr).setTextContent(templistOfRepositoryWfBranchConnector.get(p).Comments);
								xmlRepWfBrnchConnAttr = docTarget.createElement("FromStepName");
								xmlRepWfBrnchConn.appendChild(xmlRepWfBrnchConnAttr).setTextContent(templistOfRepositoryWfBranchConnector.get(p).FromStepName);
								xmlRepWfBrnchConnAttr = docTarget.createElement("Inactive");
								xmlRepWfBrnchConn.appendChild(xmlRepWfBrnchConnAttr).setTextContent(templistOfRepositoryWfBranchConnector.get(p).Inactive);
								xmlRepWfBrnchConnAttr = docTarget.createElement("Layout");
								xmlRepWfBrnchConn.appendChild(xmlRepWfBrnchConnAttr).setTextContent(templistOfRepositoryWfBranchConnector.get(p).Layout);
								xmlRepWfBrnchConnAttr = docTarget.createElement("Name2");
								xmlRepWfBrnchConn.appendChild(xmlRepWfBrnchConnAttr).setTextContent(templistOfRepositoryWfBranchConnector.get(p).Name2);
								xmlRepWfBrnchConnAttr = docTarget.createElement("ForBranchName");
								xmlRepWfBrnchConn.appendChild(xmlRepWfBrnchConnAttr).setTextContent(templistOfRepositoryWfBranchConnector.get(p).ForBranchName);
								xmlRepWfBrnchConnAttr = docTarget.createElement("ParentType");
								xmlRepWfBrnchConn.appendChild(xmlRepWfBrnchConnAttr).setTextContent(templistOfRepositoryWfBranchConnector.get(p).ParentType);
								xmlRepWfBrnchConnAttr = docTarget.createElement("ToStepName");
								xmlRepWfBrnchConn.appendChild(xmlRepWfBrnchConnAttr).setTextContent(templistOfRepositoryWfBranchConnector.get(p).ToStepName);
							}

							TransformerFactory transformerFactory = TransformerFactory.newInstance();
							Transformer transformer = transformerFactory.newTransformer();
							DOMSource source = new DOMSource(docTarget);
							FileWriter fstream = new FileWriter(targetWfFolderName + "\\\\" + higherWFFileList[higherMatchCtr]);
							BufferedWriter out = new BufferedWriter(fstream);
							StreamResult result =  new StreamResult(out);
							transformer.setOutputProperty(OutputKeys.INDENT, "yes");
							transformer.transform(source, result);
						}
					}
				}
				//End of Merging the common WFs
				DisplayMessage = lowerFileCtr + " WF(s) copied from Lower Version. " + higherFileCtr + " WF(s) copied from Higher Version. " + commonFileCtr + " common WF(s) merged.";
				JLabel lblmessage = new JLabel(DisplayMessage);
				lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
				JOptionPane.showMessageDialog(frame, lblmessage, "Workflow merging completed successfully", JOptionPane.INFORMATION_MESSAGE);
			}

			if (pressed.equals(rekeyDMButton))
			{	
				int conflictchoice=99;
				if (chkBox.isSelected()==true)
				{
					conflictchoice = 0;
				}
				else
				{
					if (chkBox2.isSelected()==true)
					{
						conflictchoice = 1;
					}
					else
					{
						conflictchoice = 2;
					}
				}
				ErrorMessage = new ArrayList<String>();
				String lowerDMFolderName = new String("");
				String higherDMFolderName = new String("");
				String targetDMFolderName = new String("");
				lowerDMFolderName = lowerWfFolderField.getText().replaceAll("\\\\", "\\\\" + "\\\\");
				higherDMFolderName = higherWfFolderField.getText().replaceAll("\\\\", "\\\\" + "\\\\");
				targetDMFolderName = targetWfFolderField.getText().replaceAll("\\\\", "\\\\" + "\\\\");

				// Checking for mandatory i/ps
				if (lowerDMFolderName.equals(""))
				{
					ErrorMessage.add("Lower release directory");
				}
				if (higherDMFolderName.equals(""))
				{
					ErrorMessage.add("Higher release directory");
				}
				if (targetDMFolderName.equals(""))
				{
					ErrorMessage.add("Target directory");
				}
				for (int i=0; i<ErrorMessage.size(); i++)
				{
					if (i == ErrorMessage.size() - 1)
					{
						DisplayErrorMessage = DisplayErrorMessage + ErrorMessage.get(i);
					}
					else
					{
						DisplayErrorMessage = DisplayErrorMessage + ErrorMessage.get(i) + ", ";
					}
				}

				if (ErrorMessage.size() > 0)
				{
					JLabel lblmessage = new JLabel(DisplayErrorMessage);
					lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
					JOptionPane.showMessageDialog(frame, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
					return;
				}
				// ENd Checking for mandatory i/ps

				File lowerDMFolder = new File(lowerDMFolderName);
				File higherDMFolder = new File(higherDMFolderName);
				File targetDMFolder = new File(targetDMFolderName);

				if (!lowerDMFolder.exists() || !higherDMFolder.exists()) // Checking if source directories exists
				{
					DisplayErrorMessage = "Either of the Lower or Higher release directiories does not exist!";
					JLabel lblmessage = new JLabel(DisplayErrorMessage);
					lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
					JOptionPane.showMessageDialog(frame, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
					return;
				}

				if (!lowerDMFolder.canRead() || !higherDMFolder.canRead()) // Checking if the source directories are readable
				{
					DisplayErrorMessage = "Either of the Lower or Higher release directiories are not readable!";
					JLabel lblmessage = new JLabel(DisplayErrorMessage);
					lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
					JOptionPane.showMessageDialog(frame, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
					return;
				}

				if (lowerDMFolder.getName().equals(targetDMFolder.getName()) || higherDMFolder.getName().equals(targetDMFolder.getName()))
				{
					DisplayErrorMessage = "Target folder can not be same as Lower or Higher source folder!";
					JLabel lblmessage = new JLabel(DisplayErrorMessage);
					lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
					JOptionPane.showMessageDialog(frame, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
					return;
				}

				if ((lowerDMFolder.getPath() + lowerDMFolder.getName()).equals(higherDMFolder.getPath() + higherDMFolder.getName()))
				{
					DisplayErrorMessage = "Lower and Higher source folder can not be same!";
					JLabel lblmessage = new JLabel(DisplayErrorMessage);
					lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
					JOptionPane.showMessageDialog(frame, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
					return;
				}
				
				String[] lowerDMFileList, higherDMFileList;
				// It is also possible to filter the list of returned files.
				// This example does not return any files that start with `.'.
				FilenameFilter filter = new FilenameFilter() {
					public boolean accept(File dir, String name) {
						return name.endsWith(".XML");
					}
				};
				lowerDMFileList = lowerDMFolder.list(filter);
				higherDMFileList = higherDMFolder.list(filter);
				if (lowerDMFileList.length < 1 || higherDMFileList.length < 1)
				{
					DisplayErrorMessage = "Either of the Lower or Higher release directiories does not contain any XML (*.xml) files!";
					JLabel lblmessage = new JLabel(DisplayErrorMessage);
					lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
					JOptionPane.showMessageDialog(frame, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
					return;
				}
				/*else
				{
					DisplayMessage = "Lower WFs: " + lowerDMFileList.length + " || Higher WFs: " + higherDMFileList.length;
					JOptionPane.showMessageDialog(frame, DisplayMessage, "Message", JOptionPane.INFORMATION_MESSAGE);
				}*/

				// Checking if XML files in the source directories are readable and are valid WFs
				fileReadErrorFlag = false;
				fileWfErrorFlag = false;
				String fileReadErrorLow = new String("");
				String fileDmErrorLow = new String("");
				String fileReadErrorHigh = new String("");
				String fileDmErrorHigh = new String("");
				for (int i=0; i<lowerDMFileList.length; i++)
				{
					File tempXML = new File(lowerDMFolderName + "\\\\" + lowerDMFileList[i]);
					if (!tempXML.canRead())
					{
						fileReadErrorLow = lowerDMFolderName + "\\\\" + lowerDMFileList[i];
						fileReadErrorFlag = true;
						break;
					}
					//System.out.println(fileReadErrorFlag);
					DocumentBuilderFactory tempFactory = DocumentBuilderFactory.newInstance();
					//System.out.println("Name: " + lowerDMFolderName + "\\" + lowerDMFileList[i]);
					Document tempDoc = tempFactory.newDocumentBuilder().parse(lowerDMFolderName + "\\\\" + lowerDMFileList[i]);
					NodeList tempNodeList = tempDoc.getElementsByTagName("EaiObjectMap");
					if (tempNodeList.getLength() == 0)
					{
						fileDmErrorLow = lowerDMFolderName + "\\\\" + lowerDMFileList[i];
						fileWfErrorFlag = true;
						break;
					}
					//System.out.println(fileWfErrorFlag);
				}
				for (int i=0; i<higherDMFileList.length; i++)
				{
					File tempXML = new File(higherDMFolderName + "\\\\" + higherDMFileList[i]);
					if (!tempXML.canRead())
					{
						fileReadErrorHigh = higherDMFolderName + "\\\\" + higherDMFileList[i];
						fileReadErrorFlag = true;
						break;
					}
					//System.out.println(fileReadErrorFlag);
					DocumentBuilderFactory tempFactory = DocumentBuilderFactory.newInstance();
					Document tempDoc = tempFactory.newDocumentBuilder().parse(higherDMFolderName + "\\\\" + higherDMFileList[i]);
					NodeList tempNodeList = tempDoc.getElementsByTagName("EaiObjectMap");
					if (tempNodeList.getLength() == 0)
					{
						fileDmErrorHigh = higherDMFolderName + "\\\\" + higherDMFileList[i];
						fileWfErrorFlag = true;
						break;
					}
					//System.out.println(fileWfErrorFlag);
				}
				if (fileReadErrorFlag)
				{
					DisplayErrorMessage = fileReadErrorLow + " and " + fileReadErrorHigh + " files are not readable!";
					JLabel lblmessage = new JLabel(DisplayErrorMessage);
					lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
					JOptionPane.showMessageDialog(frame, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
					return;
				}
				if (fileWfErrorFlag)
				{
					DisplayErrorMessage = fileDmErrorLow + " and " + fileDmErrorHigh + " files are not valid DATAMAP XMLs!";
					JLabel lblmessage = new JLabel(DisplayErrorMessage);
					lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
					JOptionPane.showMessageDialog(frame, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
					return;
				}
				// End Checking if XML files in the source directories are readable and are valid WF xmls
				
				int choice = 99;
				if (targetDMFolder.exists())
				{
					JOptionPane warningPane = new JOptionPane();
					DisplayMessage = "Target Folder already exists. This tool will overwrite the content. Do you want to proceed anyway?";
					JLabel lblmessage = new JLabel(DisplayMessage);
					lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
					choice = warningPane.showConfirmDialog(frame,lblmessage,"Overwrite Warning",JOptionPane.YES_NO_OPTION); // 0 for Yes, 1 for No
					if (choice == 1)
					{
						return;
					}
				}

				if (choice == 99)
				{
					if (!targetDMFolder.mkdirs())
					{
						DisplayErrorMessage = "Unable to create target directory!";
						JLabel lblmessage = new JLabel(DisplayErrorMessage);
						lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
						JOptionPane.showMessageDialog(frame, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
						return;
					}
				}
				else
				{
					if (!this.doDelete(targetDMFolder))
					{
						DisplayErrorMessage = "Unable to delete old target directory!";
						JLabel lblmessage = new JLabel(DisplayErrorMessage);
						lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
						JOptionPane.showMessageDialog(frame, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
						return;
					}
					if (!targetDMFolder.mkdirs())
					{
						DisplayErrorMessage = "Unable to create new target directory!";
						JLabel lblmessage = new JLabel(DisplayErrorMessage);
						lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
						JOptionPane.showMessageDialog(frame, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
						return;
					}
				}

				// Code for consolidating unmatched DMs into the merged dir
				int lowerCtr, higherAuxCtr, higherCtr, lowerAuxCtr, lowerMatchCtr, higherMatchCtr;
				lowerFileCtr = 0;
				higherFileCtr = 0;
				commonFileCtr = 0;
				for (lowerCtr=0; lowerCtr<lowerDMFileList.length; lowerCtr++)
				{
					for (higherAuxCtr=0; higherAuxCtr<higherDMFileList.length; higherAuxCtr++)
					{
						if (lowerDMFileList[lowerCtr].equals(higherDMFileList[higherAuxCtr]))
						{
							break;
						}
					}
					if (higherAuxCtr == higherDMFileList.length)
					{
						copy(new File(lowerDMFolderName + "\\\\" + lowerDMFileList[lowerCtr]), new File(targetDMFolderName + "\\\\" + lowerDMFileList[lowerCtr])); //Lower add
						lowerFileCtr++;
					}
				}

				for (higherCtr=0; higherCtr<higherDMFileList.length; higherCtr++)
				{
					for (lowerAuxCtr=0; lowerAuxCtr<lowerDMFileList.length; lowerAuxCtr++)
					{
						if (higherDMFileList[higherCtr].equals(lowerDMFileList[lowerAuxCtr]))
						{
							break;
						}
					}
					if (lowerAuxCtr == lowerDMFileList.length)
					{
						copy(new File(higherDMFolderName + "\\\\" + higherDMFileList[higherCtr]), new File(targetDMFolderName + "\\\\" + higherDMFileList[higherCtr])); //Higher add
						higherFileCtr++;
					}
				}
				// End Code for consolidating unmatched DMs into the merged dir

				for (lowerMatchCtr=0; lowerMatchCtr<lowerDMFileList.length; lowerMatchCtr++)
				{
					for (higherMatchCtr=0; higherMatchCtr<higherDMFileList.length; higherMatchCtr++)
					{
						if (lowerDMFileList[lowerMatchCtr].equals(higherDMFileList[higherMatchCtr]))
						{
							DocumentBuilderFactory factoryLower = DocumentBuilderFactory.newInstance();
							Document docLower = factoryLower.newDocumentBuilder().parse(lowerDMFolderName + "\\\\" + lowerDMFileList[lowerMatchCtr]);
							NodeList xmlEaiObjectMapListLower = docLower.getElementsByTagName("EaiObjectMap");
							ArrayList<EaiObjectMap> listOfEaiObjectMapLower = new ArrayList<EaiObjectMap>();

							DocumentBuilderFactory factoryHigher = DocumentBuilderFactory.newInstance();
							Document docHigher = factoryHigher.newDocumentBuilder().parse(higherDMFolderName + "\\\\" + higherDMFileList[higherMatchCtr]);
							NodeList xmlEaiObjectMapListHigher = docHigher.getElementsByTagName("EaiObjectMap");
							ArrayList<EaiObjectMap> listOfEaiObjectMapHigher = new ArrayList<EaiObjectMap>();

							for (int z=0; z<xmlEaiObjectMapListLower.getLength(); z++)
							{
								Element xmlDM = (Element)xmlEaiObjectMapListLower.item(z);
								NodeList xmlDMAttrList = xmlDM.getChildNodes();
								ArrayList<String> xmlListOfEaiObjectMapAttrLower = new ArrayList<String>();
								ArrayList<EaiComponentMap> listOfEaiComponentMapLower = new ArrayList<EaiComponentMap>();
								ArrayList<EaiMapArgument> listOfEaiMapArgumentLower = new ArrayList<EaiMapArgument>();

								for (int c=0; c<xmlDMAttrList.getLength(); c++)
								{
									Element xmlEaiObjectMapAttr = (Element)xmlDMAttrList.item(c);

									if (xmlEaiObjectMapAttr.getNodeName().equals("ListOfEaiComponentMap"))
									{
										NodeList xmlEaiComponentMapListLower = xmlEaiObjectMapAttr.getElementsByTagName("EaiComponentMap");
										ArrayList<String> xmlEaiComponentMapAttrListLower;
										for (int d=0; d<xmlEaiComponentMapListLower.getLength(); d++)
										{
											Element xmlEaiComponentMap = (Element)xmlEaiComponentMapListLower.item(d);
											NodeList xmlEaiComponentMapAttrList = xmlEaiComponentMap.getChildNodes();
											xmlEaiComponentMapAttrListLower = new ArrayList<String>();
											
											ArrayList<EaiFieldMap> listOfEaiFieldMapLower = new ArrayList<EaiFieldMap>();
											for (int f=0; f<xmlEaiComponentMapAttrList.getLength(); f++)
											{
												Element xmlComponentMapAttr = (Element)xmlEaiComponentMapAttrList.item(f);
												if (xmlComponentMapAttr.getNodeName().equals("ListOfEaiFieldMap"))
												{
													NodeList xmlEaiFieldMapListHigher = xmlComponentMapAttr.getElementsByTagName("EaiFieldMap");
													ArrayList<String> xmlEaiFieldMapAttrListString;
													for (int t=0; t<xmlEaiFieldMapListHigher.getLength(); t++)
													{
														Element xmlEaiFieldMap = (Element)xmlEaiFieldMapListHigher.item(t);
														NodeList xmlEaiFieldMapAttrList = xmlEaiFieldMap.getChildNodes();
														xmlEaiFieldMapAttrListString = new ArrayList<String>();
														for (int w=0; w<xmlEaiFieldMapAttrList.getLength(); w++)
														{
															Element xmlEaiFieldMapAttr = (Element)xmlEaiFieldMapAttrList.item(w);
															xmlEaiFieldMapAttrListString.add(xmlEaiFieldMapAttr.getTextContent());
														}
														listOfEaiFieldMapLower.add(new EaiFieldMap(xmlEaiFieldMapAttrListString.get(0), xmlEaiFieldMapAttrListString.get(1), xmlEaiFieldMapAttrListString.get(2)));
													}
													
												}
												else
												{
													xmlEaiComponentMapAttrListLower.add(xmlComponentMapAttr.getTextContent());
													//System.out.println(": " + xmlEaiComponentMapAttr.getTextContent() + "|" + xmlEaiComponentMapAttr.getNodeName());
												}
											}

											listOfEaiComponentMapLower.add(new EaiComponentMap(xmlEaiComponentMapAttrListLower.get(0), xmlEaiComponentMapAttrListLower.get(1), xmlEaiComponentMapAttrListLower.get(2), xmlEaiComponentMapAttrListLower.get(3), xmlEaiComponentMapAttrListLower.get(4), xmlEaiComponentMapAttrListLower.get(5), xmlEaiComponentMapAttrListLower.get(6), xmlEaiComponentMapAttrListLower.get(7), listOfEaiFieldMapLower));
										}
									}
									else if (xmlEaiObjectMapAttr.getNodeName().equals("ListOfEaiMapArgument"))
									{
										NodeList xmlEaiMapArgumentListLower = xmlEaiObjectMapAttr.getElementsByTagName("EaiMapArgument");
										for (int d=0; d<xmlEaiMapArgumentListLower.getLength(); d++)
										{
											Element xmlEaiMapArgument = (Element)xmlEaiMapArgumentListLower.item(d);
											NodeList xmlEaiMapArgumentAttrList = xmlEaiMapArgument.getChildNodes();
											ArrayList<String> xmlListOfEaiMapArgumentAttrLower = new ArrayList<String>();
											for (int f=0; f<xmlEaiMapArgumentAttrList.getLength(); f++)
											{
												Element xmlEaiMapArgumentAttr = (Element)xmlEaiMapArgumentAttrList.item(f);
												xmlListOfEaiMapArgumentAttrLower.add(xmlEaiMapArgumentAttr.getTextContent());
											}

											listOfEaiMapArgumentLower.add(new EaiMapArgument(xmlListOfEaiMapArgumentAttrLower.get(0), xmlListOfEaiMapArgumentAttrLower.get(1), xmlListOfEaiMapArgumentAttrLower.get(2), xmlListOfEaiMapArgumentAttrLower.get(3)));
										}
									}
									else
									{
										xmlListOfEaiObjectMapAttrLower.add(xmlEaiObjectMapAttr.getTextContent());
									}
								}
								eaiObjectMapLower = new EaiObjectMap(xmlListOfEaiObjectMapAttrLower.get(0), xmlListOfEaiObjectMapAttrLower.get(1), xmlListOfEaiObjectMapAttrLower.get(2), xmlListOfEaiObjectMapAttrLower.get(3), listOfEaiComponentMapLower, listOfEaiMapArgumentLower);
							}

							//higher
							for (int z=0; z<xmlEaiObjectMapListHigher.getLength(); z++)
							{
								Element xmlDM = (Element)xmlEaiObjectMapListHigher.item(z);
								NodeList xmlDMAttrList = xmlDM.getChildNodes();
								ArrayList<String> xmlListOfEaiObjectMapAttrHigher = new ArrayList<String>();
								ArrayList<EaiComponentMap> listOfEaiComponentMapHigher = new ArrayList<EaiComponentMap>();
								ArrayList<EaiMapArgument> listOfEaiMapArgumentHigher = new ArrayList<EaiMapArgument>();

								for (int c=0; c<xmlDMAttrList.getLength(); c++)
								{
									Element xmlEaiObjectMapAttr = (Element)xmlDMAttrList.item(c);

									if (xmlEaiObjectMapAttr.getNodeName().equals("ListOfEaiComponentMap"))
									{
										NodeList xmlEaiComponentMapListHigher = xmlEaiObjectMapAttr.getElementsByTagName("EaiComponentMap");
										ArrayList<String> xmlEaiComponentMapAttrListHigher;
										for (int d=0; d<xmlEaiComponentMapListHigher.getLength(); d++)
										{
											Element xmlEaiComponentMap = (Element)xmlEaiComponentMapListHigher.item(d);
											NodeList xmlEaiComponentMapAttrList = xmlEaiComponentMap.getChildNodes();
											xmlEaiComponentMapAttrListHigher = new ArrayList<String>();
											
											ArrayList<EaiFieldMap> listOfEaiFieldMapHigher = new ArrayList<EaiFieldMap>();
											for (int f=0; f<xmlEaiComponentMapAttrList.getLength(); f++)
											{
												Element xmlComponentMapAttr = (Element)xmlEaiComponentMapAttrList.item(f);
												if (xmlComponentMapAttr.getNodeName().equals("ListOfEaiFieldMap"))
												{
													NodeList xmlEaiFieldMapListHigher = xmlComponentMapAttr.getElementsByTagName("EaiFieldMap");
													ArrayList<String> xmlEaiFieldMapAttrListString;
													for (int t=0; t<xmlEaiFieldMapListHigher.getLength(); t++)
													{
														Element xmlEaiFieldMap = (Element)xmlEaiFieldMapListHigher.item(t);
														NodeList xmlEaiFieldMapAttrList = xmlEaiFieldMap.getChildNodes();
														xmlEaiFieldMapAttrListString = new ArrayList<String>();
														for (int w=0; w<xmlEaiFieldMapAttrList.getLength(); w++)
														{
															Element xmlEaiFieldMapAttr = (Element)xmlEaiFieldMapAttrList.item(w);
															xmlEaiFieldMapAttrListString.add(xmlEaiFieldMapAttr.getTextContent());
														}
														listOfEaiFieldMapHigher.add(new EaiFieldMap(xmlEaiFieldMapAttrListString.get(0), xmlEaiFieldMapAttrListString.get(1), xmlEaiFieldMapAttrListString.get(2)));
													}
													
												}
												else
												{
													xmlEaiComponentMapAttrListHigher.add(xmlComponentMapAttr.getTextContent());
													//System.out.println(": " + xmlEaiComponentMapAttr.getTextContent() + "|" + xmlEaiComponentMapAttr.getNodeName());
												}
											}

											listOfEaiComponentMapHigher.add(new EaiComponentMap(xmlEaiComponentMapAttrListHigher.get(0), xmlEaiComponentMapAttrListHigher.get(1), xmlEaiComponentMapAttrListHigher.get(2), xmlEaiComponentMapAttrListHigher.get(3), xmlEaiComponentMapAttrListHigher.get(4), xmlEaiComponentMapAttrListHigher.get(5), xmlEaiComponentMapAttrListHigher.get(6), xmlEaiComponentMapAttrListHigher.get(7), listOfEaiFieldMapHigher));
										}
									}
									else if (xmlEaiObjectMapAttr.getNodeName().equals("ListOfEaiMapArgument"))
									{
										NodeList xmlEaiMapArgumentListHigher = xmlEaiObjectMapAttr.getElementsByTagName("EaiMapArgument");
										for (int d=0; d<xmlEaiMapArgumentListHigher.getLength(); d++)
										{
											Element xmlEaiMapArgument = (Element)xmlEaiMapArgumentListHigher.item(d);
											NodeList xmlEaiMapArgumentAttrList = xmlEaiMapArgument.getChildNodes();
											ArrayList<String> xmlListOfEaiMapArgumentAttrHigher = new ArrayList<String>();
											for (int f=0; f<xmlEaiMapArgumentAttrList.getLength(); f++)
											{
												Element xmlEaiMapArgumentAttr = (Element)xmlEaiMapArgumentAttrList.item(f);
												xmlListOfEaiMapArgumentAttrHigher.add(xmlEaiMapArgumentAttr.getTextContent());
											}

											listOfEaiMapArgumentHigher.add(new EaiMapArgument(xmlListOfEaiMapArgumentAttrHigher.get(0), xmlListOfEaiMapArgumentAttrHigher.get(1), xmlListOfEaiMapArgumentAttrHigher.get(2), xmlListOfEaiMapArgumentAttrHigher.get(3)));
										}
									}
									else
									{
										xmlListOfEaiObjectMapAttrHigher.add(xmlEaiObjectMapAttr.getTextContent());
									}
								}
								eaiObjectMapHigher = new EaiObjectMap(xmlListOfEaiObjectMapAttrHigher.get(0), xmlListOfEaiObjectMapAttrHigher.get(1), xmlListOfEaiObjectMapAttrHigher.get(2), xmlListOfEaiObjectMapAttrHigher.get(3), listOfEaiComponentMapHigher, listOfEaiMapArgumentHigher);
							}

							//Now start merging
							MergeEaiComponentMap mergeEaiComponentMap = new MergeEaiComponentMap();
							MergeEaiMapArgument mergeEaiMapArgument = new MergeEaiMapArgument();

							ArrayList<EaiComponentMap> listOfEaiComponentMapMerged = new ArrayList<EaiComponentMap>(mergeEaiComponentMap.compareEaiComponentMapList(conflictchoice,frame,eaiObjectMapLower.Comments, eaiObjectMapLower.DestinationObjectName, eaiObjectMapLower.sName, eaiObjectMapLower.SourceObjectName, eaiObjectMapLower.GetListOfEaiComponentMap(), eaiObjectMapHigher.GetListOfEaiComponentMap()));
							//System.out.println("asd " + listOfEaiComponentMapMerged.get(0).Comments);
							ArrayList<EaiMapArgument> listOfEaiMapArgument = new ArrayList<EaiMapArgument>(mergeEaiMapArgument.compareEaiMapArgumentList(conflictchoice, frame, eaiObjectMapLower.sName, eaiObjectMapLower.GetListOfEaiMapArgument(), eaiObjectMapHigher.GetListOfEaiMapArgument()));

							eaiObjectMapMerged = new EaiObjectMap(eaiObjectMapLower.Comments, eaiObjectMapLower.DestinationObjectName, eaiObjectMapLower.sName, eaiObjectMapLower.SourceObjectName, listOfEaiComponentMapMerged, listOfEaiMapArgument);

							ArrayList<EaiComponentMap> tempListOfEaiComponentMap = eaiObjectMapMerged.GetListOfEaiComponentMap();
							ArrayList<EaiMapArgument> tempListOfEaiMapArgument = eaiObjectMapMerged.GetListOfEaiMapArgument();

							//System.out.println("Data Map Name: " + eaiObjectMapMerged.sName + "||Map Argument No: " + tempListOfEaiMapArgument.size());
							//Write new XML
							copy(new File(lowerDMFolderName + "\\\\" + lowerDMFileList[lowerMatchCtr]), new File(targetDMFolderName + "\\\\" + higherDMFileList[higherMatchCtr]));
							commonFileCtr++;

							DocumentBuilderFactory factoryTarget = DocumentBuilderFactory.newInstance();
							Document docTarget = factoryTarget.newDocumentBuilder().parse(targetDMFolderName + "\\\\" + higherDMFileList[higherMatchCtr]);
							docTarget.setXmlStandalone(true);

							Element xmlListOfEaiObjectMap = (Element)docTarget.getElementsByTagName("ListOfEaiDataMap").item(0);

							Element element = (Element)docTarget.getElementsByTagName("EaiObjectMap").item(0);
							element.getParentNode().removeChild(element);
							docTarget.normalize();

							Element xmlEaiObjectMap = docTarget.createElement("EaiObjectMap");

							xmlListOfEaiObjectMap.appendChild(xmlEaiObjectMap);
							//write chilg tags
							Element xmlEaiObjectMapAttr = docTarget.createElement("Comments");
							xmlEaiObjectMap.appendChild(xmlEaiObjectMapAttr).setTextContent(eaiObjectMapMerged.Comments);
							xmlEaiObjectMapAttr = docTarget.createElement("DestinationObjectName");
							xmlEaiObjectMap.appendChild(xmlEaiObjectMapAttr).setTextContent(eaiObjectMapMerged.DestinationObjectName);
							xmlEaiObjectMapAttr = docTarget.createElement("Name");
							xmlEaiObjectMap.appendChild(xmlEaiObjectMapAttr).setTextContent(eaiObjectMapMerged.sName);
							xmlEaiObjectMapAttr = docTarget.createElement("SourceObjectName");
							xmlEaiObjectMap.appendChild(xmlEaiObjectMapAttr).setTextContent(eaiObjectMapMerged.SourceObjectName);

							//Write EAI Component Maps
							Element xmlListOfEaiComponentMap = docTarget.createElement("ListOfEaiComponentMap");
							xmlEaiObjectMap.appendChild(xmlListOfEaiComponentMap);

							for (int p=0; p<tempListOfEaiComponentMap.size(); p++)
							{
								Element xmlEaiComponentMap = docTarget.createElement("EaiComponentMap");
								xmlListOfEaiComponentMap.appendChild(xmlEaiComponentMap);

								Element xmlEaiComponentMapAttr = docTarget.createElement("Comments");
								xmlEaiComponentMap.appendChild(xmlEaiComponentMapAttr).setTextContent(tempListOfEaiComponentMap.get(p).Comments);
								xmlEaiComponentMapAttr = docTarget.createElement("DestinationComponentName");
								xmlEaiComponentMap.appendChild(xmlEaiComponentMapAttr).setTextContent(tempListOfEaiComponentMap.get(p).DestinationComponentName);
								xmlEaiComponentMapAttr = docTarget.createElement("DestinationValidation");
								xmlEaiComponentMap.appendChild(xmlEaiComponentMapAttr).setTextContent(tempListOfEaiComponentMap.get(p).DestinationValidation );
								xmlEaiComponentMapAttr = docTarget.createElement("Name");
								xmlEaiComponentMap.appendChild(xmlEaiComponentMapAttr).setTextContent(tempListOfEaiComponentMap.get(p).sName);
								xmlEaiComponentMapAttr = docTarget.createElement("ParentComponentMapName");
								xmlEaiComponentMap.appendChild(xmlEaiComponentMapAttr).setTextContent(tempListOfEaiComponentMap.get(p).ParentComponentMapName);
								xmlEaiComponentMapAttr = docTarget.createElement("SourceComponentName");
								xmlEaiComponentMap.appendChild(xmlEaiComponentMapAttr).setTextContent(tempListOfEaiComponentMap.get(p).SourceComponentName);
								xmlEaiComponentMapAttr = docTarget.createElement("SourceSearchSpecification");
								xmlEaiComponentMap.appendChild(xmlEaiComponentMapAttr).setTextContent(tempListOfEaiComponentMap.get(p).SourceSearchSpecification );
								xmlEaiComponentMapAttr = docTarget.createElement("SourceValidation");
								xmlEaiComponentMap.appendChild(xmlEaiComponentMapAttr).setTextContent(tempListOfEaiComponentMap.get(p).SourceValidation );

								ArrayList<EaiFieldMap> tempListOfEaiFieldMap = tempListOfEaiComponentMap.get(p).GetListOfEaiFieldMap();

								Element xmlListOfEaiFieldMap = docTarget.createElement("ListOfEaiFieldMap");
								xmlEaiComponentMap.appendChild(xmlListOfEaiFieldMap);

								for (int q=0; q<tempListOfEaiFieldMap.size(); q++)
								{
									Element xmlEaiFieldMap = docTarget.createElement("EaiFieldMap");
									xmlListOfEaiFieldMap.appendChild(xmlEaiFieldMap);
									Element xmlEaiFieldMapAttr = docTarget.createElement("Comments");
									xmlEaiFieldMap.appendChild(xmlEaiFieldMapAttr).setTextContent(tempListOfEaiFieldMap.get(q).Comments);
									xmlEaiFieldMapAttr = docTarget.createElement("DestinationFieldName");
									xmlEaiFieldMap.appendChild(xmlEaiFieldMapAttr).setTextContent(tempListOfEaiFieldMap.get(q).DestinationFieldName);
									xmlEaiFieldMapAttr = docTarget.createElement("SourceFieldExpression");
									xmlEaiFieldMap.appendChild(xmlEaiFieldMapAttr).setTextContent(tempListOfEaiFieldMap.get(q).SourceFieldExpression);
								}
							}

							//Write EAIMapArgument
							Element xmlListOfEAIMapArgument = docTarget.createElement("ListOfEaiMapArgument");
							xmlEaiObjectMap.appendChild(xmlListOfEAIMapArgument);

							for (int p=0; p<tempListOfEaiMapArgument.size(); p++)
							{
								//System.out.println("Arg " + p);
								Element xmlEaiMapArgument = docTarget.createElement("EaiMapArgument");
								xmlListOfEAIMapArgument.appendChild(xmlEaiMapArgument);

								Element xmlEaiMapArgumentAttr = docTarget.createElement("Comments");
								xmlEaiMapArgument.appendChild(xmlEaiMapArgumentAttr).setTextContent(tempListOfEaiMapArgument.get(p).Comments);
								xmlEaiMapArgumentAttr = docTarget.createElement("DataType");
								xmlEaiMapArgument.appendChild(xmlEaiMapArgumentAttr).setTextContent(tempListOfEaiMapArgument.get(p).DataType);
								xmlEaiMapArgumentAttr = docTarget.createElement("DisplayName");
								xmlEaiMapArgument.appendChild(xmlEaiMapArgumentAttr).setTextContent(tempListOfEaiMapArgument.get(p).DisplayName);
								xmlEaiMapArgumentAttr = docTarget.createElement("Name");
								xmlEaiMapArgument.appendChild(xmlEaiMapArgumentAttr).setTextContent(tempListOfEaiMapArgument.get(p).sName);
							}

							TransformerFactory transformerFactory = TransformerFactory.newInstance();
							Transformer transformer = transformerFactory.newTransformer();
							DOMSource source = new DOMSource(docTarget);
							FileWriter fstream = new FileWriter(targetDMFolderName + "\\\\" + higherDMFileList[higherMatchCtr]);
							BufferedWriter out = new BufferedWriter(fstream);
							StreamResult result =  new StreamResult(out);
							transformer.setOutputProperty(OutputKeys.INDENT, "yes");
							transformer.transform(source, result);
						}
					}
				}
				DisplayMessage = lowerFileCtr + " DM(s) copied from Lower Version. " + higherFileCtr + " DM(s) copied from Higher Version. " + commonFileCtr + " DM(s) merged.";
				JLabel lblmessage = new JLabel(DisplayMessage);
				lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
				JOptionPane.showMessageDialog(frame, lblmessage, "Datamap merging completed successfully", JOptionPane.INFORMATION_MESSAGE);
			}
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}

	// Copies src file to dst file.
	// If the dst file does not exist, it is created
	private void copy(File src, File dst) throws IOException {
		InputStream in = new FileInputStream(src);
		OutputStream out = new FileOutputStream(dst);

		// Transfer bytes from in to out
		byte[] buf = new byte[1024];
		int len;
		while ((len = in.read(buf)) > 0) {
			out.write(buf, 0, len);
		}
		in.close();
		out.close();
	}

	private boolean doDelete(File path) throws IOException
	{
		if (path.isDirectory()) {
			for (File child : path.listFiles()) {
				doDelete(child);
			}
		}
		return path.delete();
	}
}