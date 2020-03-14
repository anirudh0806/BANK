package ui;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.WindowConstants;
import javax.swing.text.NumberFormatter;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.NumberFormat;

public class WithdrawlScreen extends JInternalFrame {
	
	private JFormattedTextField amountField;
	
	public WithdrawlScreen() {
		getContentPane().setLayout(null);
		
		JLabel lblDeposits = new JLabel("Withdrawls");
		lblDeposits.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		lblDeposits.setBounds(420, 29, 200, 46);
		getContentPane().add(lblDeposits);
		
		JLabel lblCustmerAcNo = new JLabel("Custmer A/C No:");
		lblCustmerAcNo.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblCustmerAcNo.setBounds(162, 126, 164, 33);
		getContentPane().add(lblCustmerAcNo);
		
		JLabel lblAmount = new JLabel("Amount:");
		lblAmount.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblAmount.setBounds(244, 171, 82, 33);
		getContentPane().add(lblAmount);
		
		JLabel lblDepositMethod = new JLabel("Withdrawl method:");
		lblDepositMethod.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblDepositMethod.setBounds(145, 216, 181, 33);
		getContentPane().add(lblDepositMethod);
		
		JComboBox acNoField = new JComboBox();
		acNoField.setBounds(352, 121, 200, 51);
		getContentPane().add(acNoField);
		
		NumberFormat doubleFormat = NumberFormat.getInstance();
		NumberFormatter dformatter = new NumberFormatter(doubleFormat);
        dformatter.setValueClass(Double.class);
        dformatter.setMinimum(1.0);
        dformatter.setMaximum(100000.0);
        dformatter.setAllowsInvalid(false);
        
		amountField = new JFormattedTextField(dformatter);
		amountField.setBounds(352, 176, 200, 28);
		getContentPane().add(amountField);
		amountField.setColumns(10);
		
		JComboBox depositMethodCombo = new JComboBox();
		depositMethodCombo.setBounds(352, 211, 200, 51);
		getContentPane().add(depositMethodCombo);
		
		JButton approveBtn = new JButton("Approve");
		approveBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		approveBtn.setBounds(227, 295, 117, 29);
		getContentPane().add(approveBtn);
		
		JButton cancelBtn = new JButton("Cancel");
		cancelBtn.setBounds(380, 295, 117, 29);
		getContentPane().add(cancelBtn);
		
		setClosable(true);
		setSize(800,500);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
}
