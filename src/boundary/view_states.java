package boundary;


import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JRadioButton;

/*** This class is data visualization
* @author Yujun Jin
* @version 0.5
*/
public class view_states extends JFrame {

	private JPanel contentPane;
	public static boolean hasWeek;
	public static void main(String[] args) {
		/**
		* Launch the application.
		* @return none
		*/
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					view_states frame = new view_states();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public view_states() {
		/**
		* Create the frame.
		* @return none
		*/
		hasWeek = false;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(740, 200, 800, 740);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("View states");
		lblNewLabel.setBounds(200, 75, 400, 100);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("sales in past week");
		btnNewButton.setBounds(200, 200, 400, 100);
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnNewButton) {
					setVisible(false);
					JFrame view = new view();
				}
			}
		});
		
		JButton btnViewStates = new JButton("spicious survey");
		btnViewStates.setBounds(200, 350, 400, 100);
		btnViewStates.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		contentPane.add(btnViewStates);
		btnViewStates.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnViewStates) {
					spiciness_view pie = new spiciness_view();
					pie.piechart();
				}
			}
		});
		
		final JButton btnBack = new JButton("back");
		btnBack.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		contentPane.add(btnBack);
		btnBack.setBounds(200, 568, 200, 55);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnBack) {
					setVisible(false);
					JFrame Backstagetest = new backstage();
				}
			}
		});
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("weekly report generation");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hasWeek = !hasWeek;
			}
		});
		rdbtnNewRadioButton.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		rdbtnNewRadioButton.setBounds(200, 475, 400, 40);
		contentPane.add(rdbtnNewRadioButton);
		
		setVisible(true);
	}
}
