package boundary;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class less_than_10 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					less_than_10 frame = new less_than_10();
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
	public less_than_10() {
		setTitle("Log in successfully");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(740, 200, 800, 740);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblThePriceOf = new JLabel("Sorry, your virtual stamps is less than 10");
		lblThePriceOf.setHorizontalAlignment(SwingConstants.CENTER);
		lblThePriceOf.setFont(new Font("Times New Roman", Font.PLAIN, 29));
		lblThePriceOf.setBounds(62, 58, 660, 35);
		contentPane.add(lblThePriceOf);
		
		JLabel lblNotEnoughFor = new JLabel("Not Enough for discount");
		lblNotEnoughFor.setHorizontalAlignment(SwingConstants.CENTER);
		lblNotEnoughFor.setFont(new Font("Times New Roman", Font.PLAIN, 29));
		lblNotEnoughFor.setBounds(62, 123, 660, 35);
		contentPane.add(lblNotEnoughFor);
		
		JLabel lblYouHaveX = new JLabel("You have X virtual stamps.");
		lblYouHaveX.setHorizontalAlignment(SwingConstants.CENTER);
		lblYouHaveX.setFont(new Font("Times New Roman", Font.PLAIN, 36));
		lblYouHaveX.setBounds(62, 279, 660, 35);
		contentPane.add(lblYouHaveX);
		
		JLabel lblPlease = new JLabel("Please accmulate more stamps~");
		lblPlease.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlease.setFont(new Font("Times New Roman", Font.PLAIN, 29));
		lblPlease.setBounds(62, 360, 660, 35);
		contentPane.add(lblPlease);
		
		JButton btnNewButton = new JButton("OK, continue paying");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnNewButton) {
					setVisible(false);
					JFrame pay_ment_interface= new pay_ment_interface();
				}
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnNewButton.setBounds(229, 519, 335, 58);
		contentPane.add(btnNewButton);
		
		setVisible(true);
	}

}
