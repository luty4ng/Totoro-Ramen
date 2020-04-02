package boundary;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class whether_register extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					whether_register frame = new whether_register();
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
	public whether_register() {
		setTitle("Whether register or not?");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(740, 200, 800, 740);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblThePriceOf = new JLabel("Whould you like to register as a VIP member?");
		lblThePriceOf.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		lblThePriceOf.setBounds(69, 122, 661, 35);
		contentPane.add(lblThePriceOf);
		
		JButton btnNewButton = new JButton("Yes, register now!");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				JFrame VIP_register= new VIP_register();
			}
		});
		btnNewButton.setBounds(219, 260, 349, 74);
		contentPane.add(btnNewButton);
		
		JButton btnNoIAmnt = new JButton("No, skip it");
		btnNoIAmnt.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		btnNoIAmnt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				JFrame pay_ment_interface= new pay_ment_interface();
			}
		});
		btnNoIAmnt.setBounds(219, 371, 349, 74);
		contentPane.add(btnNoIAmnt);
		
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
		btnBack.setBounds(313, 546, 155, 70);
		contentPane.add(btnBack);
		
		setVisible(true);
	}

}
