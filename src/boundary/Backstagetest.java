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

public class Backstagetest extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Backstagetest frame = new Backstagetest();
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
	public Backstagetest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(740, 200, 800, 740);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Backstage managment");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		lblNewLabel.setBounds(200, 75, 400, 100);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("modify menu");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		btnNewButton.setBounds(200, 250, 400, 100);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				JFrame modify_menu = new modify_menu();
			}
		});
		
		final JButton btnViewStates = new JButton("view states");
		btnViewStates.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		btnViewStates.setBounds(200, 400, 400, 100);
		contentPane.add(btnViewStates);
		btnViewStates.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnViewStates) {
				setVisible(false);
				JFrame view_states = new view_states();
				}
			}
		});
		
		final JButton btnBack = new JButton("back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnBack) {
					setVisible(false);
					JFrame welcome = new welcome();
				}
			}
		});
		btnBack.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		btnBack.setBounds(200, 568, 200, 55);
		contentPane.add(btnBack);
		
		setVisible(true);
	}

}
