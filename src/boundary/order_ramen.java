package boundary;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import javax.swing.JSlider;

public class order_ramen extends JFrame {
	//����Order�������Լ��ڵ��ȷ��֮������һ��NoodleOrder����
	//���߶�������һ��frame
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					order_ramen frame = new order_ramen();
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
	public order_ramen() {
		setTitle("Order a bowl of ramen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(740, 200, 800, 740);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		JLabel lblThePriceOf = new JLabel("The price of a ramen is fixed at \u00A39.99");
		lblThePriceOf.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		lblThePriceOf.setBounds(26, 32, 547, 35);
		contentPane.add(lblThePriceOf);
		
		JLabel lblYouCanChoose = new JLabel("You can choose the flavor!");
		lblYouCanChoose.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		lblYouCanChoose.setBounds(26, 88, 547, 35);
		contentPane.add(lblYouCanChoose);
		
		JPanel panel = new JPanel();
		panel.setBounds(14, 147, 754, 476);
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Affirmatively Chosen Items", TitledBorder.LEADING, TitledBorder.TOP, new java.awt.Font("Times New Roman",0,20), Color.RED));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Soup");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel.setToolTipText("");
		lblNewLabel.setBounds(15, 39, 125, 25);
		panel.add(lblNewLabel);
		
		ButtonGroup group1=new ButtonGroup();
		JRadioButton rdbtnTonkotsu = new JRadioButton("Tonkotsu");
		rdbtnTonkotsu.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		rdbtnTonkotsu.setBounds(150, 39, 121, 27);
		group1.add(rdbtnTonkotsu);
		panel.add(rdbtnTonkotsu);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton(" Shoyu");
		rdbtnNewRadioButton.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		rdbtnNewRadioButton.setBounds(350, 39, 121, 27);
		group1.add(rdbtnNewRadioButton);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnShio = new JRadioButton("Shio");
		rdbtnShio.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		rdbtnShio.setBounds(550, 39, 132, 27);
		group1.add(rdbtnShio);
		panel.add(rdbtnShio);
		
		
		JLabel lblNoddles = new JLabel("Noddles");
		lblNoddles.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNoddles.setBounds(15, 104, 125, 25);
		panel.add(lblNoddles);
		
		ButtonGroup group2=new ButtonGroup();
		JRadioButton rdbtnSoft = new JRadioButton("Soft");
		rdbtnSoft.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		rdbtnSoft.setBounds(150, 104, 77, 27);
		group2.add(rdbtnSoft);
		panel.add(rdbtnSoft);
		
		JRadioButton rdbtnMedium = new JRadioButton("Medium");
		rdbtnMedium.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		rdbtnMedium.setBounds(350, 104, 110, 27);
		group2.add(rdbtnMedium);
		panel.add(rdbtnMedium);
		
		JRadioButton rdbtnFirm = new JRadioButton("Firm");
		rdbtnFirm.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		rdbtnFirm.setBounds(550, 104, 101, 27);
		group2.add(rdbtnFirm);
		panel.add(rdbtnFirm);
		
		JLabel lblSpringOnion = new JLabel("Spring onion");
		lblSpringOnion.setToolTipText("");
		lblSpringOnion.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblSpringOnion.setBounds(14, 169, 126, 25);
		panel.add(lblSpringOnion);
		
		ButtonGroup group3=new ButtonGroup();
		JRadioButton rdbtnNoPlease = new JRadioButton("No please");
		rdbtnNoPlease.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		rdbtnNoPlease.setBounds(150, 169, 121, 27);
		group3.add(rdbtnNoPlease);
		panel.add(rdbtnNoPlease);
		
		JRadioButton rdbtnJustALittle = new JRadioButton("Just a little");
		rdbtnJustALittle.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		rdbtnJustALittle.setBounds(350, 169, 150, 27);
		group3.add(rdbtnJustALittle);
		panel.add(rdbtnJustALittle);
		
		JRadioButton rdbtnALot = new JRadioButton("A lot!");
		rdbtnALot.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		rdbtnALot.setBounds(550, 169, 101, 27);
		group3.add(rdbtnALot);
		panel.add(rdbtnALot);
		
		JLabel lblNori = new JLabel("Nori");
		lblNori.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNori.setBounds(15, 234, 125, 25);
		panel.add(lblNori);
		
		ButtonGroup group4=new ButtonGroup();
		JRadioButton rdbtnYes = new JRadioButton("Yes");
		rdbtnYes.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		rdbtnYes.setBounds(150, 234, 93, 27);
		group4.add(rdbtnYes);
		panel.add(rdbtnYes);
		
		JRadioButton rdbtnNo = new JRadioButton("No");
		rdbtnNo.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		rdbtnNo.setBounds(350, 234, 77, 27);
		group4.add(rdbtnNo);
		panel.add(rdbtnNo);
	
		JLabel lblChashu = new JLabel("Chashu");
		lblChashu.setToolTipText("");
		lblChashu.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblChashu.setBounds(15, 299, 125, 25);
		panel.add(lblChashu);
		
		ButtonGroup group5=new ButtonGroup();
		JRadioButton rdbtnYes_2 = new JRadioButton("Yes");
		rdbtnYes_2.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		rdbtnYes_2.setBounds(150, 299, 77, 27);
		group5.add(rdbtnYes_2);
		panel.add(rdbtnYes_2);

		JRadioButton rdbtnNo_1 = new JRadioButton("No");
		rdbtnNo_1.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		rdbtnNo_1.setBounds(350, 299, 58, 27);
		group5.add(rdbtnNo_1);
		panel.add(rdbtnNo_1);
		
		JLabel lblBoiledEgg = new JLabel("Boiled egg");
		lblBoiledEgg.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblBoiledEgg.setBounds(15, 364, 125, 25);
		panel.add(lblBoiledEgg);
		
		ButtonGroup group6=new ButtonGroup();
		JRadioButton rdbtnYes_1 = new JRadioButton("Yes");
		rdbtnYes_1.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		rdbtnYes_1.setBounds(150, 364, 66, 27);
		group6.add(rdbtnYes_1);
		panel.add(rdbtnYes_1);
		
		JRadioButton rdbtnNo_2 = new JRadioButton("No");
		rdbtnNo_2.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		rdbtnNo_2.setBounds(350, 364, 58, 27);
		group6.add(rdbtnNo_2);
		panel.add(rdbtnNo_2);
		
		JLabel lblSpiciness = new JLabel("Spiciness");
		lblSpiciness.setToolTipText("");
		lblSpiciness.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblSpiciness.setBounds(15, 429, 125, 25);
		panel.add(lblSpiciness);
		
		ButtonGroup group7=new ButtonGroup();
		
		JSlider slider = new JSlider();
		slider.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		slider.setValue(0);
		slider.setSnapToTicks(true);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setMajorTickSpacing(1);
		slider.setMaximum(5);
		slider.setBounds(150, 409, 249, 54);
		panel.add(slider);
		
		JLabel lblnoAnd = new JLabel("Notice: 0 (No) and 5 (Max)");
		lblnoAnd.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		lblnoAnd.setBounds(447, 431, 257, 23);
		panel.add(lblnoAnd);
		
		JButton btnNext = new JButton("Have Completed. NEXT");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnNext) {
					setVisible(false);
					JFrame add_on= new add_on();
				}
			}
		});
		btnNext.setFont(new Font("Times New Roman", Font.BOLD, 26));
		btnNext.setBounds(219, 628, 329, 52);
		contentPane.add(btnNext);
		
		setVisible(true);
	}
}