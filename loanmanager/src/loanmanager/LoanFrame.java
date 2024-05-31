package loanmanager;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.GridLayout;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Color;

public class LoanFrame extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField NameInput;
    private JTextField TypeInput;
    private JTextField WithdrawalInput;
    private JTextField DepositInput;
    private JTextField AmountInput;
    private JTextField InterestInput;
    private JTextField PaymentsInput;
    private JTextArea resultArea;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    LoanFrame frame = new LoanFrame();
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
    public LoanFrame() {
        setFont(new Font("Arial", Font.PLAIN, 14));
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(665, 482);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        JPanel panel = new JPanel();
        JPanel panel_1 = new JPanel();
        JPanel panel_2 = new JPanel();
        JPanel panel_4 = new JPanel();
        JPanel panel_3 = new JPanel();
        panel_3.setBackground(new Color(255, 255, 255));
        
        GroupLayout gl_contentPane = new GroupLayout(contentPane);
        gl_contentPane.setHorizontalGroup(
        	gl_contentPane.createParallelGroup(Alignment.TRAILING)
        		.addComponent(panel, GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
        		.addGroup(gl_contentPane.createSequentialGroup()
        			.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 312, GroupLayout.PREFERRED_SIZE))
        		.addComponent(panel_4, GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
        		.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE)
        );
        gl_contentPane.setVerticalGroup(
        	gl_contentPane.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_contentPane.createSequentialGroup()
        			.addComponent(panel, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
        				.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
        				.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(panel_4, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
        );
        panel_3.setLayout(new GridLayout(1, 1));
        
        JScrollPane scrollPane = new JScrollPane();
        panel_3.add(scrollPane);

        resultArea = new JTextArea();
        resultArea.setLineWrap(true);
        resultArea.setWrapStyleWord(true);
        resultArea.setEditable(false);
        scrollPane.setViewportView(resultArea);
        
        panel_4.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

        JButton Calculate = new JButton("Load Calculator");
        Calculate.setHorizontalAlignment(SwingConstants.LEFT);
        panel_4.add(Calculate);

        JButton Reset = new JButton("Reset");
        panel_4.add(Reset);

        JButton Exit = new JButton("Exit");
        panel_4.add(Exit);

        JLabel lblNewLabel_4 = new JLabel("Amount of Loan*");
        lblNewLabel_4.setBounds(10, 14, 100, 14);

        JLabel lblNewLabel_5 = new JLabel("Interest Rate*");
        lblNewLabel_5.setBounds(10, 52, 100, 14);

        JLabel lblNewLabel_6 = new JLabel("Number of Payments*");
        lblNewLabel_6.setBounds(10, 90, 108, 14);

        AmountInput = new JTextField();
        AmountInput.setBounds(128, 11, 125, 20);
        AmountInput.setColumns(10);

        InterestInput = new JTextField();
        InterestInput.setBounds(128, 49, 125, 20);
        InterestInput.setColumns(10);

        PaymentsInput = new JTextField();
        PaymentsInput.setBounds(128, 87, 125, 20);
        PaymentsInput.setColumns(10);
        panel_2.setLayout(null);
        panel_2.add(lblNewLabel_4);
        panel_2.add(AmountInput);
        panel_2.add(lblNewLabel_5);
        panel_2.add(InterestInput);
        panel_2.add(lblNewLabel_6);
        panel_2.add(PaymentsInput);

        JLabel lblFullName = new JLabel("Full Name*");
        lblFullName.setBounds(10, 14, 131, 14);

        JLabel lblNewLabel_1 = new JLabel("Account Type*");
        lblNewLabel_1.setBounds(10, 52, 131, 14);

        JLabel lblNewLabel_2 = new JLabel("Withdrawal");
        lblNewLabel_2.setBounds(10, 90, 131, 14);

        JLabel lblNewLabel_3 = new JLabel("Deposit");
        lblNewLabel_3.setBounds(10, 128, 131, 14);

        NameInput = new JTextField();
        NameInput.setBounds(151, 11, 156, 20);
        NameInput.setColumns(10);

        TypeInput = new JTextField();
        TypeInput.setBounds(151, 49, 156, 20);
        TypeInput.setColumns(10);

        WithdrawalInput = new JTextField();
        WithdrawalInput.setBounds(151, 87, 156, 20);
        WithdrawalInput.setColumns(10);

        DepositInput = new JTextField();
        DepositInput.setBounds(151, 125, 156, 20);
        DepositInput.setColumns(10);
        panel_1.setLayout(null);
        panel_1.add(lblFullName);
        panel_1.add(NameInput);
        panel_1.add(lblNewLabel_1);
        panel_1.add(TypeInput);
        panel_1.add(lblNewLabel_2);
        panel_1.add(WithdrawalInput);
        panel_1.add(lblNewLabel_3);
        panel_1.add(DepositInput);
        panel.setLayout(new GridLayout(0, 1, 0, 0));

        JLabel lblNewLabel = new JLabel("Loan Management System");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("Arial", Font.BOLD, 28));
        panel.add(lblNewLabel);
        contentPane.setLayout(gl_contentPane);

        // Add action listeners to the buttons
        Calculate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Handle Load Calculator button click
                try {
                    String name = NameInput.getText();
                    String accountType = TypeInput.getText();
                    if (name.isEmpty() || accountType.isEmpty() || 
                        AmountInput.getText().isEmpty() || InterestInput.getText().isEmpty() || 
                        PaymentsInput.getText().isEmpty()) {
                        resultArea.setText("Please fill in all required fields.");
                        return;
                    }
                    double loanAmount = Double.parseDouble(AmountInput.getText());
                    double interestRate = Double.parseDouble(InterestInput.getText());
                    int numberOfPayments = Integer.parseInt(PaymentsInput.getText());
                    double monthlyPayment = calculateMonthlyPayment(loanAmount, interestRate, numberOfPayments);
                    double totalPayment = monthlyPayment * numberOfPayments;

                    resultArea.setText(String.format(
                        "Name: %s%nAccount Type: %s%nAmount of Loan: %.2f%nInterest Rate: %.2f%%%nNumber of Payments: %d%nMonthly Payment: %.2f%nTotal Payment: %.2f",
                        name, accountType, loanAmount, interestRate, numberOfPayments, monthlyPayment, totalPayment));
                } catch (NumberFormatException ex) {
                    resultArea.setText("Please enter valid numbers.");
                }
            }
        });

        Reset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Handle Reset button click
                resetFields();
                resultArea.setText("");
            }
        });

        Exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Handle Exit button click
                System.exit(0);
            }
        });
    }

    private void resetFields() {
        NameInput.setText("");
        TypeInput.setText("");
        WithdrawalInput.setText("");
        DepositInput.setText("");
        AmountInput.setText("");
        InterestInput.setText("");
        PaymentsInput.setText("");
    }

    private double calculateMonthlyPayment(double loanAmount, double InterestRate, int numberOfPayments) {
        return (loanAmount*(1+InterestRate/100)/numberOfPayments);
    }
}


