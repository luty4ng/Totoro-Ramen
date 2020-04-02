package boundary;

import java.awt.BorderLayout;
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
import javax.swing.JTextField;

public class VIP_log_in extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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

	/**
	 * Create the frame.
	 */
	public VIP_log_in() {
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
		contentPane.add(textField);
		textField.setColumns(10);
		
		final JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnBack) {
					setVisible(false);
					JFrame loyalty_scheme= new loyalty_scheme();
				}
			}
		});
		btnBack.setFont(new Font("Times New Roman", Font.BOLD, 38));
		btnBack.setBounds(65, 470, 290, 70);
		contentPane.add(btnBack);
		
		final JButton btnConfirm = new JButton("Confirm!");
        btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnConfirm) {
					setVisible(false);
					JFrame less_than_10= new less_than_10();
				}
			}
		});
        btnConfirm.setFont(new Font("Times New Roman", Font.BOLD, 38));
        btnConfirm.setBounds(421, 470, 290, 70);
        contentPane.add(btnConfirm);
        
        setVisible(true);
	}
}
