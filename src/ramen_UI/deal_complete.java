package ramen_UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class deal_complete extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					deal_complete frame = new deal_complete();
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
	public deal_complete() {
		setTitle("Deal complete");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(740, 200, 800, 740);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcome = new JLabel("Your meal is being prepared!");
		lblWelcome.setFont(new Font("Times New Roman", Font.PLAIN, 49));
		lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcome.setBounds(62, 95, 690, 80);
		contentPane.add(lblWelcome);
		
		JPanel panel = new JPanel();
		panel.setBounds(177, 390, 436, 209);
		contentPane.add(panel);
		
		JButton finish = new JButton("finish");
		finish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == finish) {
					setVisible(false);
					System.exit(0);
				}
			}
		});
		finish.setFont(new Font("Times New¡¡Roman", Font.PLAIN, 22));
		finish.setBounds(234, 44, 175, 123);
		panel.add(finish);
		
		JLabel lblNewLabel = new JLabel("thanks for your patronize");
		lblNewLabel.setFont(new Font("Edwardian Script ITC", Font.PLAIN, 36));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(243, 188, 305, 64);
		contentPane.add(lblNewLabel);
		
		setVisible(true);
	}

}
