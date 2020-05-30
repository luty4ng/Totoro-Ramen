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
public class view extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		/**
		 * Launch the application.
		 * @return none
		 */
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					view frame = new view();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public view() {
		/**
		 * Create the frame.
		 * @return none
		 */
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(740, 200, 800, 740);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("sales in past week");
		lblNewLabel.setBounds(200, 20, 400, 100);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("saleroom");
		btnNewButton.setBounds(100, 120, 500, 100);
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnNewButton) {
					saleroom_view bar = new saleroom_view();
					bar.Bar();
				}
			}
		});
		
		JButton btnViewStates = new JButton("add-ones");
		btnViewStates.setBounds(100, 230, 500, 100);
		btnViewStates.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		contentPane.add(btnViewStates);
		btnViewStates.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnViewStates) {
					addon_view bar = new addon_view();
					bar.Bar();
				}
			}
		});
		
		JButton btnvolume = new JButton("sales volume");
		btnvolume.setBounds(100, 340, 500, 100);
		btnvolume.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		contentPane.add(btnvolume);
		btnvolume.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnvolume) {
					sale_valume lin = new sale_valume();
					lin.GetDataset();
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
					JFrame view_state = new view_states();
				}
			}
		});
		setVisible(true);
	}
}