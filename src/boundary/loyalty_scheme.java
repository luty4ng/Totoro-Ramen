package boundary;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class loyalty_scheme extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loyalty_scheme frame = new loyalty_scheme();
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
	public loyalty_scheme() {
		setTitle("Are you a VIP member?");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(740, 200, 800, 740);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblThePriceOf = new JLabel("Are you a VIP member?");
		lblThePriceOf.setFont(new Font("Times New Roman", Font.PLAIN, 37));
		lblThePriceOf.setBounds(221, 137, 404, 57);
		contentPane.add(lblThePriceOf);
		
		JButton btnNewButton = new JButton("YES, I am");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 42));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				JFrame VIP_log_in= new VIP_log_in();
			}
		});
		btnNewButton.setBounds(251, 257, 296, 74);
		contentPane.add(btnNewButton);
		
		JButton btnNoIAmnt = new JButton("No, I am not");
		btnNoIAmnt.setFont(new Font("Times New Roman", Font.PLAIN, 42));
		btnNoIAmnt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				JFrame whether_register = new whether_register();
			}
		});
		btnNoIAmnt.setBounds(251, 368, 296, 74);
		contentPane.add(btnNoIAmnt);
		
		setVisible(true);
	}

}
