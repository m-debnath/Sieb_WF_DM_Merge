import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Dialog;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;


public class EnterNewValue extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	public String val;
	public boolean isDiscard = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			EnterNewValue dialog = new EnterNewValue();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	
	public EnterNewValue() {
		super();
	}
	public EnterNewValue(Dialog dialog) {
		super(dialog, "Enter New Value", true);
		setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
		//setTitle("Enter New Value");
		setBounds(100, 100, 400, 160);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblEnterValue = new JLabel("Enter Value:");
			lblEnterValue.setFont(new Font("Tahoma", Font.PLAIN, 10));
			lblEnterValue.setBounds(40, 39, 78, 14);
			contentPanel.add(lblEnterValue);
		}
		{
			textField = new JTextField();
			textField.setFont(new Font("Tahoma", Font.PLAIN, 10));
			textField.setColumns(10);
			textField.setBounds(128, 37, 204, 20);
			contentPanel.add(textField);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						val = textField.getText().trim();
						if (val == null || val.equals("")) {
							String DisplayErrorMessage = "Please enter a value!";
							JLabel lblmessage = new JLabel(DisplayErrorMessage);
							lblmessage.setFont(new Font("Tahoma", Font.PLAIN, 10));
							//System.out.println("NAme: " + getParent().getInvoker().getTopLevelAncestor());
							JOptionPane.showMessageDialog(EnterNewValue.this, lblmessage, "ERROR", JOptionPane.ERROR_MESSAGE);
							return;
						}
						setVisible(false);
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						isDiscard = true;
						setVisible(false);
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
