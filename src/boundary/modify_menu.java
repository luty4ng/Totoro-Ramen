package boundary;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entity.MQDocument;
import entity.Order;
import entity.OrderMenu;

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
import javax.swing.BorderFactory;
import javax.swing.JButton;

public class modify_menu extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private OrderMenu ordermenu;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private MQDocument doc1 = null;
	private MQDocument doc2 = null;
	private MQDocument doc3 = null;
	private MQDocument doc4 = null;
	private MQDocument doc5 = null;
	private MQDocument doc6 = null;
	private MQDocument doc7 = null;
	private MQDocument doc8 = null;
	private MQDocument doc9 = null;

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
		this.ordermenu = new OrderMenu();
		doc1 = new MQDocument();
		doc2 = new MQDocument();
		doc3 = new MQDocument();
		doc4 = new MQDocument();
		doc5 = new MQDocument();
		doc6 = new MQDocument();
		doc7 = new MQDocument();
		doc8 = new MQDocument();
		doc9 = new MQDocument();
		double ramenprice = ordermenu.getnoodlePrice(), noriprice = ordermenu.getnoriPrice(),
			   eggprice = ordermenu.geteggPrice(), bambooprice = ordermenu.getbambooPrice(), 
			   chashuprice = ordermenu.getchashuPrice();
		int noriAvailable = ordermenu.getnoriAvailable(), eggAvailable = ordermenu.geteggAvailable(),
			bambooAvailable = ordermenu.getbambooAvailable(), chashuAvailable = ordermenu.getchashuAvailable();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(740, 200, 800, 740);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Modify Menu");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 42));
		lblNewLabel.setBounds(292, 39, 273, 49);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("current");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(194, 182, 101, 40);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblMenu = new JLabel("menu");
		lblMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenu.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblMenu.setBounds(14, 182, 200, 40);
		contentPane.add(lblMenu);
		
		JLabel lblAvailable = new JLabel("modify");
		lblAvailable.setHorizontalAlignment(SwingConstants.CENTER);
		lblAvailable.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblAvailable.setBounds(562, 182, 178, 40);
		contentPane.add(lblAvailable);
		
		JLabel lblRamen = new JLabel("ramen");
		lblRamen.setHorizontalAlignment(SwingConstants.CENTER);
		lblRamen.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblRamen.setBounds(14, 257, 200, 40);
		contentPane.add(lblRamen);
		
		JLabel lblNori = new JLabel("nori");
		lblNori.setHorizontalAlignment(SwingConstants.CENTER);
		lblNori.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblNori.setBounds(14, 332, 200, 40);
		contentPane.add(lblNori);
		
		JLabel lblEgg = new JLabel("egg");
		lblEgg.setHorizontalAlignment(SwingConstants.CENTER);
		lblEgg.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblEgg.setBounds(14, 407, 200, 40);
		contentPane.add(lblEgg);
		
		JLabel lblBamboo = new JLabel("bamboo");
		lblBamboo.setHorizontalAlignment(SwingConstants.CENTER);
		lblBamboo.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblBamboo.setBounds(14, 482, 200, 40);
		contentPane.add(lblBamboo);
		
		JLabel lblChashu = new JLabel("chashu");
		lblChashu.setHorizontalAlignment(SwingConstants.CENTER);
		lblChashu.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblChashu.setBounds(14, 557, 200, 40);
		contentPane.add(lblChashu);
		
		JLabel lblModify = new JLabel("modify");
		lblModify.setHorizontalAlignment(SwingConstants.CENTER);
		lblModify.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblModify.setBounds(309, 182, 115, 40);
		contentPane.add(lblModify);
		
		JLabel lblInt = new JLabel(""+ramenprice);
		lblInt.setHorizontalAlignment(SwingConstants.CENTER);
		lblInt.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblInt.setBounds(194, 257, 101, 40);
		contentPane.add(lblInt);
		
		JLabel lblInt_1 = new JLabel(""+noriprice);
		lblInt_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblInt_1.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblInt_1.setBounds(194, 332, 101, 40);
		contentPane.add(lblInt_1);
		
		JLabel lblInt_2 = new JLabel(""+eggprice);
		lblInt_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblInt_2.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblInt_2.setBounds(194, 407, 101, 40);
		contentPane.add(lblInt_2);
		
		JLabel lblInt_3 = new JLabel(""+bambooprice);
		lblInt_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblInt_3.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblInt_3.setBounds(194, 482, 101, 40);
		contentPane.add(lblInt_3);
		
		JLabel lblInt_4 = new JLabel(""+chashuprice);
		lblInt_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblInt_4.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblInt_4.setBounds(194, 557, 101, 40);
		contentPane.add(lblInt_4);
		
		textField = new JTextField(""+ramenprice);
		textField.setBounds(323, 262, 101, 40);
		textField.setDocument(doc1);
		doc1.errorBeep(true);
		doc1.setCharLimit("[0-9,.]");
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField(""+noriprice);
		textField_1.setColumns(10);
		textField_1.setBounds(323, 332, 101, 40);
		textField_1.setDocument(doc2);
		doc2.errorBeep(true);
		doc2.setCharLimit("[0-9,.]");
		contentPane.add(textField_1);
		
		textField_2 = new JTextField(""+eggprice);
		textField_2.setColumns(10);
		textField_2.setBounds(323, 407, 101, 40);
		textField_2.setDocument(doc3);
		doc3.errorBeep(true);
		doc3.setCharLimit("[0-9,.]");
		contentPane.add(textField_2);
		
		textField_3 = new JTextField(""+bambooprice);
		textField_3.setColumns(10);
		textField_3.setBounds(323, 482, 101, 40);
		textField_3.setDocument(doc4);
		doc4.errorBeep(true);
		doc4.setCharLimit("[0-9,.]");
		contentPane.add(textField_3);
		
		textField_4 = new JTextField(""+chashuprice);
		textField_4.setColumns(10);
		textField_4.setBounds(323, 557, 101, 40);
		textField_4.setDocument(doc5);
		doc5.errorBeep(true);
		doc5.setCharLimit("[0-9,.]");
		contentPane.add(textField_4);
		
		final JButton btnNewButton = new JButton("back");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		btnNewButton.setBounds(88, 621, 200, 40);
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
		btnNewButton_1.setBounds(508, 621, 200, 40);
		contentPane.add(btnNewButton_1);
		
		textField_6 = new JTextField(""+noriAvailable);
		textField_6.setColumns(10);
		textField_6.setBounds(601, 337, 101, 40);
		textField_6.setDocument(doc6);
		doc6.errorBeep(true);
		doc6.setCharLimit("[0-9]");
		contentPane.add(textField_6);
		
		textField_7 = new JTextField(""+eggAvailable);
		textField_7.setColumns(10);
		textField_7.setBounds(601, 412, 101, 40);
		textField_7.setDocument(doc7);
		doc7.errorBeep(true);
		doc7.setCharLimit("[0-9]");
		contentPane.add(textField_7);
		
		textField_8 = new JTextField(""+bambooAvailable);
		textField_8.setColumns(10);
		textField_8.setBounds(601, 487, 101, 40);
		textField_8.setDocument(doc8);
		doc8.errorBeep(true);
		doc8.setCharLimit("[0-9]");
		contentPane.add(textField_8);
		
		textField_9 = new JTextField(""+chashuAvailable);
		textField_9.setColumns(10);
		textField_9.setBounds(601, 557, 101, 40);
		textField_9.setDocument(doc9);
		doc9.errorBeep(true);
		doc9.setCharLimit("[0-9]");
		contentPane.add(textField_9);
		
		JLabel lblAvailable_1 = new JLabel("current");
		lblAvailable_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblAvailable_1.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblAvailable_1.setBounds(472, 182, 101, 40);
		contentPane.add(lblAvailable_1);
		
		JLabel label_2 = new JLabel(""+noriAvailable);
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		label_2.setBounds(472, 332, 101, 40);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel(""+eggAvailable);
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		label_3.setBounds(472, 407, 101, 40);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel(""+bambooAvailable);
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		label_4.setBounds(472, 482, 101, 40);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel(""+chashuAvailable);
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		label_5.setBounds(472, 557, 101, 40);
		contentPane.add(label_5);
		
		JLabel label = new JLabel("Absolutely Enough");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		label.setBounds(472, 257, 236, 40);
		contentPane.add(label);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrice.setFont(new Font("Times New Roman", Font.PLAIN, 32));
		lblPrice.setBounds(194, 124, 230, 45);
		lblPrice.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		contentPane.add(lblPrice);
		
		JLabel lblStock = new JLabel("Stock");
		lblStock.setHorizontalAlignment(SwingConstants.CENTER);
		lblStock.setFont(new Font("Times New Roman", Font.PLAIN, 32));
		lblStock.setBounds(472, 124, 230, 45);
		lblStock.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		contentPane.add(lblStock);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnNewButton_1) {
					if(!textField.getText().trim().equals("")) {
						ordermenu.setnoodlePrice(Double.parseDouble(textField.getText()));
					}
					if(!textField_1.getText().trim().equals("")) {
						ordermenu.setnoriPrice(Double.parseDouble(textField_1.getText()));
					}
					if(!textField_2.getText().trim().equals("")) {
						ordermenu.seteggPrice(Double.parseDouble(textField_2.getText()));
					}
					if(!textField_3.getText().trim().equals("")) {
						ordermenu.setbambooPrice(Double.parseDouble(textField_3.getText()));
					}
					if(!textField_4.getText().trim().equals("")) {
						ordermenu.setchashuPrice(Double.parseDouble(textField_4.getText()));
					}
					if(!textField_6.getText().trim().equals("")) {
						ordermenu.setnoriAvailable(Integer.parseInt(textField_6.getText()));
					}
					if(!textField_7.getText().trim().equals("")) {
						ordermenu.seteggAvailable(Integer.parseInt(textField_7.getText()));
					}
					if(!textField_8.getText().trim().equals("")) {
						ordermenu.setbambooAvailable(Integer.parseInt(textField_8.getText()));
					}
					if(!textField_9.getText().trim().equals("")) {
						ordermenu.setchashuAvailable(Integer.parseInt(textField_9.getText()));
					}
					ordermenu.writeMenu();
					setVisible(false);
					JFrame Backstagetest = new Backstagetest();
				}
			}
		});
		
		setVisible(true);
	}
}
