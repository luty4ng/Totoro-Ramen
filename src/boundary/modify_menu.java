package boundary;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class modify_menu extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					modify_menu frame = new modify_menu();
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
	public modify_menu() {
		
		int ramenprice = 0, noriprice = 0, eggprice = 0, bambooprice = 0, chashuprice = 0;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(740, 200, 800, 740);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("modify menu");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 38));
		lblNewLabel.setBounds(300, 50, 200, 40);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("price");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(300, 125, 101, 40);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblMenu = new JLabel("menu");
		lblMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenu.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblMenu.setBounds(90, 125, 200, 40);
		contentPane.add(lblMenu);
		
		JLabel lblAvailable = new JLabel("available");
		lblAvailable.setHorizontalAlignment(SwingConstants.CENTER);
		lblAvailable.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblAvailable.setBounds(510, 125, 200, 40);
		contentPane.add(lblAvailable);
		
		JLabel lblRamen = new JLabel("ramen");
		lblRamen.setHorizontalAlignment(SwingConstants.CENTER);
		lblRamen.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblRamen.setBounds(90, 200, 200, 40);
		contentPane.add(lblRamen);
		
		JLabel lblNori = new JLabel("nori");
		lblNori.setHorizontalAlignment(SwingConstants.CENTER);
		lblNori.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblNori.setBounds(90, 275, 200, 40);
		contentPane.add(lblNori);
		
		JLabel lblEgg = new JLabel("egg");
		lblEgg.setHorizontalAlignment(SwingConstants.CENTER);
		lblEgg.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblEgg.setBounds(90, 350, 200, 40);
		contentPane.add(lblEgg);
		
		JLabel lblBamboo = new JLabel("bamboo");
		lblBamboo.setHorizontalAlignment(SwingConstants.CENTER);
		lblBamboo.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblBamboo.setBounds(90, 425, 200, 40);
		contentPane.add(lblBamboo);
		
		JLabel lblChashu = new JLabel("chashu");
		lblChashu.setHorizontalAlignment(SwingConstants.CENTER);
		lblChashu.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblChashu.setBounds(90, 500, 200, 40);
		contentPane.add(lblChashu);
		
		JLabel lblModify = new JLabel("modify");
		lblModify.setHorizontalAlignment(SwingConstants.CENTER);
		lblModify.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblModify.setBounds(399, 125, 101, 40);
		contentPane.add(lblModify);
		
		JLabel lblInt = new JLabel(""+ramenprice);
		lblInt.setHorizontalAlignment(SwingConstants.CENTER);
		lblInt.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblInt.setBounds(300, 200, 101, 40);
		contentPane.add(lblInt);
		
		JLabel lblInt_1 = new JLabel(""+noriprice);
		lblInt_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblInt_1.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblInt_1.setBounds(300, 275, 101, 40);
		contentPane.add(lblInt_1);
		
		JLabel lblInt_2 = new JLabel(""+eggprice);
		lblInt_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblInt_2.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblInt_2.setBounds(300, 350, 101, 40);
		contentPane.add(lblInt_2);
		
		JLabel lblInt_3 = new JLabel(""+bambooprice);
		lblInt_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblInt_3.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblInt_3.setBounds(300, 425, 101, 40);
		contentPane.add(lblInt_3);
		
		JLabel lblInt_4 = new JLabel(""+chashuprice);
		lblInt_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblInt_4.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblInt_4.setBounds(300, 500, 101, 40);
		contentPane.add(lblInt_4);
		
		textField = new JTextField();
		textField.setBounds(399, 200, 101, 40);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(399, 275, 101, 40);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(399, 350, 101, 40);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(399, 425, 101, 40);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(399, 500, 101, 40);
		contentPane.add(textField_4);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("");
		rdbtnNewRadioButton.setBounds(589, 214, 121, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("");
		rdbtnNewRadioButton_1.setBounds(589, 289, 121, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("");
		rdbtnNewRadioButton_2.setBounds(589, 364, 121, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("");
		rdbtnNewRadioButton_3.setBounds(589, 439, 121, 23);
		contentPane.add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("");
		rdbtnNewRadioButton_4.setBounds(589, 514, 121, 23);
		contentPane.add(rdbtnNewRadioButton_4);
		
		final JButton btnNewButton = new JButton("back");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		btnNewButton.setBounds(90, 600, 200, 40);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnNewButton) {
					setVisible(false);
					JFrame Backstagetest = new Backstagetest();
				}
			}
		});
		
		final JButton btnNewButton_1 = new JButton("save");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		btnNewButton_1.setBounds(510, 600, 200, 40);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnNewButton_1) {
					setVisible(false);
					JFrame Backstagetest = new Backstagetest();
				}
			}
		});
		
		setVisible(true);
	}
}
