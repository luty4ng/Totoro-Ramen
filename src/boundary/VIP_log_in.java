package boundary;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entity.MQDocument;
import entity.Member;
import entity.Order;

import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class VIP_log_in extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private Order order;
	private Member member;
	private MQDocument doc = null;
	/**
	 * Launch the application.
	 */
/*	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VIP_log_in frame = new VIP_log_in();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
*/
	/**
	 * Create the frame.
	 */
	public VIP_log_in(Order order) {
		this.order = order;
		this.member = new Member();
		this.doc = new MQDocument();
		setTitle("VIP log in");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(740, 200, 800, 740);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblThePriceOf = new JLabel("Please enter your VIP number");
		lblThePriceOf.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		lblThePriceOf.setBounds(170, 160, 472, 41);
		contentPane.add(lblThePriceOf);
		
		textField = new JTextField();
		textField.setFont(new Font("ËÎÌו", Font.PLAIN, 35));
		textField.setBounds(169, 290, 437, 56);
		textField.setDocument(doc);
		doc.errorBeep(true);
		doc.setMaxLength(6);
		doc.setCharLimit("[0-9]");
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnBack) {
					setVisible(false);
					JFrame loyalty_scheme= new loyalty_scheme(order);
				}
			}
		});
		btnBack.setFont(new Font("Times New Roman", Font.BOLD, 38));
		btnBack.setBounds(65, 470, 290, 70);
		contentPane.add(btnBack);
		
		JLabel lblNewLabel = new JLabel("Sorry! Your VIP number doesn't exist.");
        lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setForeground(Color.RED);
        lblNewLabel.setVisible(false);
        lblNewLabel.setBounds(197, 372, 400, 56);
        contentPane.add(lblNewLabel);
        
        JLabel lblNewLabel1 = new JLabel("Sorry! You haven't input your VIP number.");
        lblNewLabel1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        lblNewLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel1.setForeground(Color.RED);
        lblNewLabel1.setVisible(false);
        lblNewLabel1.setBounds(197, 372, 400, 56);
        contentPane.add(lblNewLabel1);
        
        JLabel lblNewLabel2 = new JLabel("Sorry! Your input should be 6 numbers.");
        lblNewLabel2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        lblNewLabel2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel2.setForeground(Color.RED);
        lblNewLabel2.setVisible(false);
        lblNewLabel2.setBounds(197, 372, 400, 56);
        contentPane.add(lblNewLabel2);
		
		JButton btnConfirm = new JButton("Confirm!");
        btnConfirm.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		if(member.login(textField.getText())) {
        			setVisible(false);
        			if(Integer.parseInt(member.getStamps(textField.getText())) < 10) {
        				JFrame less_than_10 = new less_than_10(order, textField.getText());
        			}else {
        				JFrame enough_for_discount = new enough_for_discount(order, textField.getText());
        			}
        		}else if(textField.getText().trim().equals("")) {
        			lblNewLabel.setVisible(false);
        			lblNewLabel1.setVisible(true);
        			lblNewLabel2.setVisible(false);
        		}else if(textField.getText().length() != 6) {
        			lblNewLabel.setVisible(false);
        			lblNewLabel1.setVisible(false);
        			lblNewLabel2.setVisible(true);
        		}
        		else {
        			lblNewLabel.setVisible(true);
        			lblNewLabel1.setVisible(false);
        			lblNewLabel2.setVisible(false);
        		}
        	}
        });
        btnConfirm.setFont(new Font("Times New Roman", Font.BOLD, 38));
        btnConfirm.setBounds(421, 470, 290, 70);
        contentPane.add(btnConfirm);
        
        
        setVisible(true);
	}
}
