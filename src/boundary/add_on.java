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
import entity.OrderMenu;

import javax.swing.JToggleButton;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Functions: 
 * 1. show different prices of different add-ons.
 * 2. the user can order some add-ons for the ramen he order in last interface by clicking some buttons.
 * 3. return back to last interface to choose the ramen again.
 *
 */
public class add_on extends JFrame {

	private JPanel contentPane;
	private NoodleOrder noodle;
	private Order order;
	private int number1 = 0;
	private int number2 = 0;
	private int number3 = 0;
	private int number4 = 0;
	private int restNum1 = 0;
	private int restNum2 = 0;
	private int restNum3 = 0;
	private int restNum4 = 0;
	private OrderMenu ordermenu;
	private String[][] detail;
    private String nori = "Yes";
    private String chashu = "Yes";
    private String boiledEgg = "Yes";

	/**
	 * Create the frame.
	 * @param order The order of this customer.
	 * @param noodle The bowl of noodles where add on are added to.
	 */
	public add_on(Order order, NoodleOrder noodle) {
		this.noodle = noodle;
		this.order = order;
		this.ordermenu = Order.menu;
		int noriAvailable = ordermenu.getnoriAvailable(), eggAvailable = ordermenu.geteggAvailable(),
				bambooAvailable = ordermenu.getbambooAvailable(), chashuAvailable = ordermenu.getchashuAvailable();
		this.nori = noodle.getNori();
		this.chashu = noodle.getchashu();
		this.boiledEgg = noodle.getegg();
		this.restNum1 = noriAvailable;
		this.restNum2 = eggAvailable;
		this.restNum3 = bambooAvailable;
		this.restNum4 = chashuAvailable;
		if(order.getSubOrderNumber() > 0) {
			this.detail = this.order.getOrderDetail();
			for(int i=0; i<order.getSubOrderNumber(); i++) {
				this.restNum1 = this.restNum1 - Integer.parseInt(this.detail[5*i+1][1]);
				this.restNum2 = this.restNum2 - Integer.parseInt(this.detail[5*i+2][1]);
				this.restNum3 = this.restNum3 - Integer.parseInt(this.detail[5*i+3][1]);
				this.restNum4 = this.restNum4 - Integer.parseInt(this.detail[5*i+4][1]);
			}
		}
		setTitle("Order add-ons for your ramen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(740, 200, 800, 740);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblYouCanChoose = new JLabel("You can order add-ons with extra payments.");
		lblYouCanChoose.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		lblYouCanChoose.setBounds(48, 84, 700, 35);
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
		lblNumber.setBounds(469, 30, 131, 26);
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
		
		JTextArea textArea1 = new JTextArea();     // Extra Nori
		textArea1.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		textArea1.setBounds(415, 74, 128, 35);
		textArea1.setEditable(false);
		panel.add(textArea1);
		
		JButton button2 = new JButton("+");
		if (number1 >= restNum1) {
			button2.setEnabled(false);
			textArea1.setText("Unavailable");
		}
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == button2) {
					number1 = number1 + 1;
					if (number1 >= noriAvailable || number1 >= restNum1) {
						button2.setEnabled(false);
						textArea1.setText(Integer.toString(number1) + "(max)");
					}else {
						textArea1.setText(Integer.toString(number1));
					}
				}
			}
		});
		button2.setFont(new Font("Times New Roman", Font.BOLD, 23));
		button2.setBounds(596, 74, 49, 35);
		panel.add(button2);
		
		JButton button1 = new JButton("-"); 
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == button1) {
					if (number1 > 0) {
						number1 = number1 - 1;
						button2.setEnabled(true);
					}
					textArea1.setText(Integer.toString(number1));
				}
			}
		});
		button1.setFont(new Font("Times New Roman", Font.BOLD, 28));
		button1.setBounds(547, 74, 49, 35);
		panel.add(button1);
		
		if(nori == "No") {
			button1.setEnabled(false);
			button2.setEnabled(false);
		}
		if(noriAvailable!=0) {                          //whether nori is available
			textArea1.setText(Integer.toString(number1));
		}else {
			textArea1.setText("Unavailable");
			button1.setEnabled(false);
			button2.setEnabled(false);
		}
		
		
		JTextArea textArea2 = new JTextArea();     // Extra boiled egg
		textArea2.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		textArea2.setBounds(415, 164, 128, 35);
		textArea2.setEditable(false);
		panel.add(textArea2);
		
		JButton button4 = new JButton("+");
		if (number2 >= restNum2) {
			button4.setEnabled(false);
			textArea2.setText("Unavailable");
		}
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == button4) {
					number2 = number2 + 1;
					if (number2 >= eggAvailable || number2 >= restNum2) {
						button4.setEnabled(false);
						textArea2.setText(Integer.toString(number2) + "(max)");
					}else {
						textArea2.setText(Integer.toString(number2));
					}
				}
			}
		});
		button4.setFont(new Font("Times New Roman", Font.BOLD, 23));
		button4.setBounds(596, 164, 49, 35);
		panel.add(button4);
		
		JButton button3 = new JButton("-"); 
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == button3) {
					if (number2 > 0) {
						number2 = number2 - 1;
						button4.setEnabled(true);
					}
					textArea2.setText(Integer.toString(number2));
				}
			}
		});
		button3.setFont(new Font("Times New Roman", Font.BOLD, 28));
		button3.setBounds(547, 164, 49, 35);
		panel.add(button3);
		
		if(boiledEgg == "No") {
			button3.setEnabled(false);
			button4.setEnabled(false);
		}
		if(eggAvailable!=0) {                          //whether egg is available
			textArea2.setText(Integer.toString(number2));
		}else {
			textArea2.setText("Unavailable");
			button3.setEnabled(false);
			button4.setEnabled(false);
		}
		
		JTextArea textArea3 = new JTextArea();     // Bamboo shoots
		textArea3.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		textArea3.setBounds(415, 254, 128, 35);
		textArea3.setEditable(false);
		panel.add(textArea3);
		
		JButton button6 = new JButton("+");
		if (number3 >= restNum3) {
			button6.setEnabled(false);
			textArea3.setText("Unavailable");
		}
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == button6) {
					number3 = number3 + 1;
					if (number3 >= bambooAvailable || number3 >= restNum3) {
						button6.setEnabled(false);
						textArea3.setText(Integer.toString(number3) + "(max)");
					}else {
						textArea3.setText(Integer.toString(number3));
					}
				}
			}
		});
		button6.setFont(new Font("Times New Roman", Font.BOLD, 23));
		button6.setBounds(596, 254, 49, 35);
		panel.add(button6);
		
		JButton button5 = new JButton("-"); 
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == button5) {
					if (number3 > 0) {
						number3 = number3 - 1;
						button6.setEnabled(true);
					}
					textArea3.setText(Integer.toString(number3));
				}
			}
		});
		button5.setFont(new Font("Times New Roman", Font.BOLD, 28));
		button5.setBounds(547, 254, 49, 35);
		panel.add(button5);
		
		if(bambooAvailable!=0) {                          //whether bamboo is available
			textArea3.setText(Integer.toString(number3));
		}else {
			textArea3.setText("Unavailable");
			button5.setEnabled(false);
			button6.setEnabled(false);
		}
		
		JTextArea textArea4 = new JTextArea();     // Extra Chashu
		textArea4.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		textArea4.setBounds(415, 344, 128, 35);
		textArea4.setEditable(false);
		panel.add(textArea4);
		
		JButton button8 = new JButton("+");
		if (number4 >= restNum4) {
			button8.setEnabled(false);
			textArea4.setText("Unavailable");
		}
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == button8) {
					number4 = number4 + 1;
					if (number4 >= chashuAvailable || number4 >= restNum4) {
						button8.setEnabled(false);
						textArea4.setText(Integer.toString(number4) + "(max)");
					}else {
						textArea4.setText(Integer.toString(number4));
					}
				}
			}
		});
		button8.setFont(new Font("Times New Roman", Font.BOLD, 23));
		button8.setBounds(596, 344, 49, 35);
		panel.add(button8);
		
		JButton button7 = new JButton("-"); 
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == button7) {
					if (number4 > 0) {
						number4 = number4 - 1;
						button8.setEnabled(true);
					}
					textArea4.setText(Integer.toString(number4));
				}
			}
		});
		button7.setFont(new Font("Times New Roman", Font.BOLD, 28));
		button7.setBounds(547, 344, 49, 35);
		panel.add(button7);
		
		if(chashu == "No") {
			button7.setEnabled(false);
			button8.setEnabled(false);
		}
		if(chashuAvailable!=0) {                          //whether chashu is available
			textArea4.setText(Integer.toString(number4));
		}else {
			textArea4.setText("Unavailable");
			button7.setEnabled(false);
			button8.setEnabled(false);
		}
		
		JButton btnNext = new JButton("Have Completed. NEXT");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnNext) {
					setVisible(false);
					noodle.add(number1,number2, number3, number4);
					
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
