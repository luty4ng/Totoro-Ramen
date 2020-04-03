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
import javax.swing.JToggleButton;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class add_on extends JFrame {
	//继续持有Order并传入下一个Jframe,noodleOrder调用add方法，并且存入order类中
	//order继续向后传
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					add_on frame = new add_on();
					Add_on_numbers numbers = new Add_on_numbers();
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
	public add_on() {
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
		lblExtraChashu.setBounds(14, 344, 152, 26);
		panel.add(lblExtraChashu);
		
		JLabel lblPrice = new JLabel("Unit Price");
		lblPrice.setFont(new Font("Times New Roman", Font.BOLD, 28));
		lblPrice.setBounds(270, 30, 131, 26);
		panel.add(lblPrice);
		
		JLabel lblNumber = new JLabel("Number");
		lblNumber.setFont(new Font("Times New Roman", Font.BOLD, 28));
		lblNumber.setBounds(493, 30, 131, 26);
		panel.add(lblNumber);
		
		JLabel lblPerShare = new JLabel("\u00A31");
		lblPerShare.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		lblPerShare.setBounds(270, 74, 150, 26);
		panel.add(lblPerShare);
		
		JLabel label_1 = new JLabel("\u00A31");
		label_1.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		label_1.setBounds(270, 164, 150, 26);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("\u00A31");
		label_2.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		label_2.setBounds(270, 254, 150, 26);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("\u00A32");
		label_3.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		label_3.setBounds(270, 344, 150, 26);
		panel.add(label_3);
		
		final Add_on_numbers numbers = new Add_on_numbers(); // variable numbers record the changes of numbers of add_on
		
		final JTextArea textArea1 = new JTextArea();     // Extra Nori
		textArea1.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		textArea1.setText(Integer.toString(numbers.number1));
		textArea1.setBounds(493, 74, 40, 35);
		panel.add(textArea1);
		
		final JButton button1 = new JButton("-"); 
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == button1) {
					if (numbers.number1 > 0) {
						numbers.number1 = numbers.number1 - 1;
					}
					textArea1.setText(Integer.toString(numbers.number1));
				}
			}
		});
		button1.setFont(new Font("Times New Roman", Font.BOLD, 28));
		button1.setBounds(546, 74, 45, 35);
		panel.add(button1);
		
		final JButton button2 = new JButton("+");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == button2) {
					numbers.number1 = numbers.number1 + 1;
					textArea1.setText(Integer.toString(numbers.number1));
				}
			}
		});
		button2.setFont(new Font("Times New Roman", Font.BOLD, 23));
		button2.setBounds(596, 74, 45, 35);
		panel.add(button2);
		
		final JTextArea textArea2 = new JTextArea();     // Extra boiled egg
		textArea2.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		textArea2.setText(Integer.toString(numbers.number2));
		textArea2.setBounds(493, 164, 40, 35);
		panel.add(textArea2);
		
		final JButton button3 = new JButton("-"); 
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == button3) {
					if (numbers.number2 > 0) {
						numbers.number2 = numbers.number2 - 1;
					}
					textArea2.setText(Integer.toString(numbers.number2));
				}
			}
		});
		button3.setFont(new Font("Times New Roman", Font.BOLD, 28));
		button3.setBounds(546, 164, 45, 35);
		panel.add(button3);
		
		final JButton button4 = new JButton("+");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == button4) {
					numbers.number2 = numbers.number2 + 1;
					textArea2.setText(Integer.toString(numbers.number2));
				}
			}
		});
		button4.setFont(new Font("Times New Roman", Font.BOLD, 23));
		button4.setBounds(596, 164, 45, 35);
		panel.add(button4);
		
		final JTextArea textArea3 = new JTextArea();     // Bamboo shoots
		textArea3.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		textArea3.setText(Integer.toString(numbers.number3));
		textArea3.setBounds(493, 254, 40, 35);
		panel.add(textArea3);
		
		final JButton button5 = new JButton("-"); 
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == button5) {
					if (numbers.number3 > 0) {
						numbers.number3 = numbers.number3 - 1;
					}
					textArea3.setText(Integer.toString(numbers.number3));
				}
			}
		});
		button5.setFont(new Font("Times New Roman", Font.BOLD, 28));
		button5.setBounds(546, 254, 45, 35);
		panel.add(button5);
		
		final JButton button6 = new JButton("+");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == button6) {
					numbers.number3 = numbers.number3 + 1;
					textArea3.setText(Integer.toString(numbers.number3));
				}
			}
		});
		button6.setFont(new Font("Times New Roman", Font.BOLD, 23));
		button6.setBounds(596, 254, 45, 35);
		panel.add(button6);
		
		final JTextArea textArea4 = new JTextArea();     // Extra Chashu
		textArea4.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		textArea4.setText(Integer.toString(numbers.number4));
		textArea4.setBounds(493, 344, 40, 35);
		panel.add(textArea4);
		
		final JButton button7 = new JButton("-"); 
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == button7) {
					if (numbers.number4 > 0) {
						numbers.number4 = numbers.number4 - 1;
					}
					textArea4.setText(Integer.toString(numbers.number4));
				}
			}
		});
		button7.setFont(new Font("Times New Roman", Font.BOLD, 28));
		button7.setBounds(546, 344, 45, 35);
		panel.add(button7);
		
		final JButton button8 = new JButton("+");
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == button8) {
					numbers.number4 = numbers.number4 + 1;
					textArea4.setText(Integer.toString(numbers.number4));
				}
			}
		});
		button8.setFont(new Font("Times New Roman", Font.BOLD, 23));
		button8.setBounds(596, 344, 45, 35);
		panel.add(button8);
		
		final JButton btnNext = new JButton("Have Completed. NEXT");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnNext) {
					setVisible(false);
					JFrame confirm_order= new confirm_order();
				}
			}
		});
		btnNext.setFont(new Font("Times New Roman", Font.BOLD, 26));
		btnNext.setBounds(401, 615, 305, 52);
		contentPane.add(btnNext);
		
		final JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnBack) {
					setVisible(false);
					JFrame order_ramen= new order_ramen();
				}
			}
		});
		btnBack.setFont(new Font("Times New Roman", Font.BOLD, 26));
		btnBack.setBounds(65, 615, 305, 52);
		contentPane.add(btnBack);
		
		setVisible(true);
	}
}
