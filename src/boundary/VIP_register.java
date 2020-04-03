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
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class VIP_register extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VIP_register frame = new VIP_register();
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
	public VIP_register() {
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
        chckbxNewCheckBox.setFont(new Font("ËÎÌו", Font.PLAIN, 18));
        chckbxNewCheckBox.setBounds(25, 9, 106, 27);
        group.add(chckbxNewCheckBox);
        panel.add(chckbxNewCheckBox);
        
        JCheckBox chckbxTakeAway = new JCheckBox("Telephone");
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
					JFrame whether_register= new whether_register();
				}
			}
		});
		btnBack.setFont(new Font("Times New Roman", Font.BOLD, 38));
		btnBack.setBounds(149, 565, 200, 65);
		contentPane.add(btnBack);
		
		JButton btnConfirm = new JButton("Submit!");
        btnConfirm.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		setVisible(false);
				JFrame less_than_10= new less_than_10();
        	}
        });
        btnConfirm.setFont(new Font("Times New Roman", Font.BOLD, 38));
        btnConfirm.setBounds(423, 565, 200, 65);
        contentPane.add(btnConfirm);
        
        setVisible(true);
	}

}
