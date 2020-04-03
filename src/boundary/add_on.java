package boundary;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

import entity.NoodleOrder;
import entity.Order;

import javax.swing.JToggleButton;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class add_on extends JFrame {

	private JPanel contentPane;
	private NoodleOrder noodle;
	private Order order;
//	private Add_on_numbers numbers = new Add_on_numbers();
	private int number1 = 0;
	private int number2 = 0;
	private int number3 = 0;
	private int number4 = 0;
	
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					NoodleOrder noodle = null;
//					add_on frame = new add_on(noodle);
//					Add_on_numbers numbers = new Add_on_numbers();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 * @param noodle 
	 */
	public add_on(Order order, NoodleOrder noodle) {
		this.noodle = noodle;
		this.order = order;
		
		setTitle("Order add-ons for your ramen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(740, 200, 800, 740);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblYouCanChoose = new JLabel("You can order add-ons with extra payments.");
		lblYouCanChoose.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		lblYouCanChoose.setBounds(48, 84, 625, 35);
		contentPane.add(lblYouCanChoose);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Optional Items", TitledBorder.LEADING, TitledBorder.TOP, new java.awt.Font("Times New Roman",0,20), Color.RED));
		panel.setBounds(48, 178, 673, 410);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Extra Nori");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 28));
		lblNewLabel.setBounds(14, 74, 131, 26);
		panel.add(lblNewLabel);
		
		JLabel lblExtraBoiledEgg = new JLabel("Extra Boiled Egg");
		lblExtraBoiledEgg.setFont(new Font("Times New Roman", Font.BOLD, 28));
		lblExtraBoiledEgg.setBounds(14, 158, 227, 35);
		panel.add(lblExtraBoiledEgg);
		
		JLabel lblBambooShoots = new JLabel("Bamboo Shoots");
		lblBambooShoots.setFont(new Font("Times New Roman", Font.BOLD, 28));
		lblBambooShoots.setBounds(14, 254, 198, 26);
		panel.add(lblBambooShoots);
		
		JLabel lblExtraChashu = new JLabel("Extra Chashu");
		lblExtraChashu.setFont(new Font("Times New Roman", Font.BOLD, 28));
		lblExtraChashu.setBounds(14, 344, 198, 26);
		panel.add(lblExtraChashu);
		
		JLabel lblPrice = new JLabel("Unit Price");
		lblPrice.setFont(new Font("Times New Roman", Font.BOLD, 28));
		lblPrice.setBounds(270, 30, 131, 26);
		panel.add(lblPrice);
		
		JLabel lblNumber = new JLabel("Number");
		lblNumber.setFont(new Font("Times New Roman", Font.BOLD, 28));
		lblNumber.setBounds(493, 30, 131, 26);
		panel.add(lblNumber);
		
		JLabel lblPerShare = new JLabel(String.valueOf(Order.menu.getnoriPrice()));
		lblPerShare.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		lblPerShare.setBounds(270, 74, 150, 26);
		panel.add(lblPerShare);
		
		JLabel label_1 = new JLabel(String.valueOf(Order.menu.geteggPrice()));
		label_1.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		label_1.setBounds(270, 164, 150, 26);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel(String.valueOf(Order.menu.getbambooPrice()));
		label_2.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		label_2.setBounds(270, 254, 150, 26);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel(String.valueOf(Order.menu.getchashuPrice()));
		label_3.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		label_3.setBounds(270, 344, 150, 26);
		panel.add(label_3);
		
//		Add_on_numbers numbers = new Add_on_numbers(); // variable numbers record the changes of numbers of add_on
		
		JTextArea textArea1 = new JTextArea();     // Extra Nori
		textArea1.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		textArea1.setText(Integer.toString(number1));
		textArea1.setBounds(493, 74, 40, 35);
		panel.add(textArea1);
		
		JButton button1 = new JButton("-"); 
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == button1) {
					if (number1 > 0) {
						number1 = number1 - 1;
					}
					textArea1.setText(Integer.toString(number1));
				}
			}
		});
		button1.setFont(new Font("Times New Roman", Font.BOLD, 28));
		button1.setBounds(547, 74, 49, 35);
		panel.add(button1);
		
		JButton button2 = new JButton("+");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == button2) {
					number1 = number1 + 1;
					textArea1.setText(Integer.toString(number1));
				}
			}
		});
		button2.setFont(new Font("Times New Roman", Font.BOLD, 23));
		button2.setBounds(596, 74, 49, 35);
		panel.add(button2);
		
		JTextArea textArea2 = new JTextArea();     // Extra boiled egg
		textArea2.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		textArea2.setText(Integer.toString(number2));
		textArea2.setBounds(493, 164, 40, 35);
		panel.add(textArea2);
		
		JButton button3 = new JButton("-"); 
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == button3) {
					if (number2 > 0) {
						number2 = number2 - 1;
					}
					textArea2.setText(Integer.toString(number2));
				}
			}
		});
		button3.setFont(new Font("Times New Roman", Font.BOLD, 28));
		button3.setBounds(547, 164, 49, 35);
		panel.add(button3);
		
		JButton button4 = new JButton("+");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == button4) {
					number2 = number2 + 1;
					textArea2.setText(Integer.toString(number2));
				}
			}
		});
		button4.setFont(new Font("Times New Roman", Font.BOLD, 23));
		button4.setBounds(596, 164, 49, 35);
		panel.add(button4);
		
		JTextArea textArea3 = new JTextArea();     // Bamboo shoots
		textArea3.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		textArea3.setText(Integer.toString(number3));
		textArea3.setBounds(493, 254, 40, 35);
		panel.add(textArea3);
		
		JButton button5 = new JButton("-"); 
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == button5) {
					if (number3 > 0) {
						number3 = number3 - 1;
					}
					textArea3.setText(Integer.toString(number3));
				}
			}
		});
		button5.setFont(new Font("Times New Roman", Font.BOLD, 28));
		button5.setBounds(547, 254, 49, 35);
		panel.add(button5);
		
		JButton button6 = new JButton("+");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == button6) {
					number3 = number3 + 1;
					textArea3.setText(Integer.toString(number3));
				}
			}
		});
		button6.setFont(new Font("Times New Roman", Font.BOLD, 23));
		button6.setBounds(596, 254, 49, 35);
		panel.add(button6);
		
		JTextArea textArea4 = new JTextArea();     // Extra Chashu
		textArea4.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		textArea4.setText(Integer.toString(number4));
		textArea4.setBounds(493, 344, 40, 35);
		panel.add(textArea4);
		
		JButton button7 = new JButton("-"); 
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == button7) {
					if (number4 > 0) {
						number4 = number4 - 1;
					}
					textArea4.setText(Integer.toString(number4));
				}
			}
		});
		button7.setFont(new Font("Times New Roman", Font.BOLD, 28));
		button7.setBounds(547, 344, 49, 35);
		panel.add(button7);
		
		JButton button8 = new JButton("+");
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == button8) {
					number4 = number4 + 1;
					textArea4.setText(Integer.toString(number4));
				}
			}
		});
		button8.setFont(new Font("Times New Roman", Font.BOLD, 23));
		button8.setBounds(596, 344, 49, 35);
		panel.add(button8);
		
		
		
		JButton btnNext = new JButton("Have Completed. NEXT");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnNext) {
					setVisible(false);
					noodle.add(number1,number2, number3, number4);
					System.out.print(number1);
					System.out.print(number2);
					System.out.print(number3);
					System.out.print(number4);
					order.addNoodleOrder(noodle);
					JFrame confirm_order= new confirm_order(order);
				}
			}
		});
		btnNext.setFont(new Font("Times New Roman", Font.BOLD, 26));
		btnNext.setBounds(401, 615, 310, 52);
		contentPane.add(btnNext);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnBack) {
					setVisible(false);
					JFrame order_ramen= new order_ramen(order);
				}
			}
		});
		btnBack.setFont(new Font("Times New Roman", Font.BOLD, 26));
		btnBack.setBounds(65, 615, 310, 52);
		contentPane.add(btnBack);
		
		setVisible(true);
	}
}
