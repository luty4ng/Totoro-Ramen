package boundary;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;

import entity.Member;
import entity.Order;

import javax.swing.SwingConstants;
import javax.swing.JTextField;

/**
 * Functions: 
 * 	1. the user can register as a VIP member.
 *  2. if the entered message for registering is invalid, there will be corresponding warnings.
 *  3. if register successfully, he or she can see the new VIP number and login directly.
 */
public class VIP_register extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private String firstName;
	private String surName;
	private String contact;
	private String email;
	private String phoneNum;
	private Order order;
	private Member member;
	private String newID;

	/**
	 * Create the frame.
	 * @param order The order of this customer.
	 */
	public VIP_register(Order order) {
		this.order = order;
		setTitle("VIP Register");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(740, 200, 800, 740);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblThePriceOf = new JLabel("Enter your infromation please.");
		lblThePriceOf.setHorizontalAlignment(SwingConstants.CENTER);
		lblThePriceOf.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		lblThePriceOf.setBounds(139, 57, 498, 35);
		contentPane.add(lblThePriceOf);
		
		JLabel label = new JLabel("Register as a VIP member!");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		label.setBounds(139, 142, 474, 35);
		contentPane.add(label);
		
		JLabel lblNewLabel = new JLabel("First Name         :");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		lblNewLabel.setBounds(197, 257, 178, 40);
		contentPane.add(lblNewLabel);
		
		JLabel lblSurname = new JLabel("Surname            :");
		lblSurname.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		lblSurname.setBounds(197, 319, 166, 40);
		contentPane.add(lblSurname);
		
		textField = new JTextField();
		textField.setFont(new Font("Dialog", Font.PLAIN, 32));
		textField.setBounds(377, 257, 200, 40);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Dialog", Font.PLAIN, 32));
		textField_1.setColumns(10);
		textField_1.setBounds(377, 319, 200, 40);
		contentPane.add(textField_1);
		
		JPanel panel = new JPanel();
        panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 255, 0), new Color(0, 0, 255)));
        panel.setBounds(377, 387, 278, 46);
        contentPane.add(panel);
        panel.setLayout(null);
        
        ButtonGroup group =new ButtonGroup();
        
        JCheckBox chckbxNewCheckBox = new JCheckBox("E-mail");
        chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == chckbxNewCheckBox) {
					contact = "email";
				}
			}
		});
        chckbxNewCheckBox.setFont(new Font("ËÎÌו", Font.PLAIN, 18));
        chckbxNewCheckBox.setBounds(25, 9, 106, 27);
        group.add(chckbxNewCheckBox);
        panel.add(chckbxNewCheckBox);
        
        JCheckBox chckbxTakeAway = new JCheckBox("Telephone");
        chckbxTakeAway.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == chckbxTakeAway) {
					contact = "telephone";
				}
			}
		});
        chckbxTakeAway.setFont(new Font("ËÎÌו", Font.PLAIN, 18));
        chckbxTakeAway.setBounds(137, 9, 123, 27);
        group.add(chckbxTakeAway);
        panel.add(chckbxTakeAway);
        
        JLabel lblDiningOptions = new JLabel("Contact Method :");
        lblDiningOptions.setFont(new Font("Times New Roman", Font.PLAIN, 23));
        lblDiningOptions.setBounds(197, 393, 178, 33);
        contentPane.add(lblDiningOptions);
        
        JLabel lblContactDetials = new JLabel("Contact Details   :");
        lblContactDetials.setFont(new Font("Times New Roman", Font.PLAIN, 23));
        lblContactDetials.setBounds(197, 458, 178, 33);
        contentPane.add(lblContactDetials);
        
        textField_2 = new JTextField();
        textField_2.setFont(new Font("Dialog", Font.PLAIN, 32));
        textField_2.setColumns(10);
        textField_2.setBounds(377, 458, 278, 40);
        contentPane.add(textField_2);
        
        JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnBack) {
					setVisible(false);
					JFrame whether_register= new whether_register(order);
				}
			}
		});
		btnBack.setFont(new Font("Times New Roman", Font.BOLD, 38));
		btnBack.setBounds(111, 594, 273, 65);
		contentPane.add(btnBack);
		
        JLabel lblSorryYourEmail = new JLabel("Sorry! Your e-mail is invalid.");
        lblSorryYourEmail.setHorizontalAlignment(SwingConstants.CENTER);
        lblSorryYourEmail.setFont(new Font("Times New Roman", Font.PLAIN, 25));
        lblSorryYourEmail.setForeground(Color.RED);
        lblSorryYourEmail.setVisible(false);
        lblSorryYourEmail.setBounds(100, 530, 580, 33);
        contentPane.add(lblSorryYourEmail);
        
        JLabel lblSorryYourEmail1 = new JLabel("Sorry! Your phone number is invalid.");
        lblSorryYourEmail1.setHorizontalAlignment(SwingConstants.CENTER);
        lblSorryYourEmail1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
        lblSorryYourEmail1.setForeground(Color.RED);
        lblSorryYourEmail1.setVisible(false);
        lblSorryYourEmail1.setBounds(100, 530, 580, 33);
        contentPane.add(lblSorryYourEmail1);
        
        JLabel lblSorryYourEmail2 = new JLabel("Successfully register! You can log in directly.");
        lblSorryYourEmail2.setHorizontalAlignment(SwingConstants.CENTER);
        lblSorryYourEmail2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
        lblSorryYourEmail2.setForeground(Color.BLUE);
        lblSorryYourEmail2.setVisible(false);
        lblSorryYourEmail2.setBounds(100, 515, 580, 33);
        contentPane.add(lblSorryYourEmail2);
        
        JLabel lblSorryYourEmail3 = new JLabel("Your VIP number is "+newID+".");
        lblSorryYourEmail3.setHorizontalAlignment(SwingConstants.CENTER);
        lblSorryYourEmail3.setFont(new Font("Times New Roman", Font.PLAIN, 25));
        lblSorryYourEmail3.setForeground(Color.BLUE);
        lblSorryYourEmail3.setVisible(false);
        lblSorryYourEmail3.setBounds(100, 540, 580, 33);
        contentPane.add(lblSorryYourEmail3);
        
        JButton btnlog_in = new JButton("Log in directly");
        btnlog_in.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnlog_in) {
					setVisible(false);
					JFrame less_than_10 = new less_than_10(order, newID);
				}
			}
        });
        btnlog_in.setFont(new Font("Times New Roman", Font.BOLD, 38));
        btnlog_in.setBounds(423, 594, 273, 65);
        btnlog_in.setVisible(false);
        contentPane.add(btnlog_in);
		
		member = new Member();
		JButton btnConfirm = new JButton("Submit!");
        btnConfirm.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnConfirm) {
					firstName = textField.getText();
					surName = textField_1.getText();
					if(contact == "email") {
						email = textField_2.getText();
						phoneNum = "00000000000";
					}else {
						email = "123@gmail.com";
						phoneNum = textField_2.getText();
					}
					newID = member.register(surName, firstName, email, phoneNum);
					if(newID == "email") {
						lblSorryYourEmail.setVisible(true);
						lblSorryYourEmail1.setVisible(false);
						lblSorryYourEmail2.setVisible(false);
						lblSorryYourEmail3.setVisible(false);
					}else if(newID == "phone") {
						lblSorryYourEmail.setVisible(false);
						lblSorryYourEmail1.setVisible(true);
						lblSorryYourEmail2.setVisible(false);
						lblSorryYourEmail3.setVisible(false);
					}else {
						lblSorryYourEmail.setVisible(false);
						lblSorryYourEmail1.setVisible(false);
						lblSorryYourEmail2.setVisible(true);
						lblSorryYourEmail3.setText("Your VIP number is "+newID+".");
						lblSorryYourEmail3.setVisible(true);
						btnConfirm.setVisible(false);
						btnConfirm.setEnabled(false);
						btnlog_in.setVisible(true);
					}
				}
			}
        });
        btnConfirm.setFont(new Font("Times New Roman", Font.BOLD, 38));
        btnConfirm.setBounds(423, 594, 270, 65);
        contentPane.add(btnConfirm);
        
        setVisible(true);
	}
}
