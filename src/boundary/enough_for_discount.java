package boundary;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import entity.Member;
import entity.Order;

import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 * Functions: 
 * 	1. present the number of stamps of the VIP customer.
 * 	2. remind the VIP customer that he or she can pay with a discount.
 */
public class enough_for_discount extends JFrame {

	private JPanel contentPane;
	private Order order;
	private Member member;
	
	/**
	 * Create the frame.
	 * @param order The order of this customer.
	 * @param memberNumber The number of this member.
	 */
	public enough_for_discount(Order order, String memberNumber) {
		this.order = order;
		this.order.setMember(memberNumber);
		member = this.order.getMember();
		String stampNum = member.getStamps(memberNumber);
		
		setTitle("Log in successfully");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(740, 200, 800, 740);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblThePriceOf = new JLabel("Congratulation , you have at least 10 stamps!");
		lblThePriceOf.setHorizontalAlignment(SwingConstants.CENTER);
		lblThePriceOf.setFont(new Font("Times New Roman", Font.PLAIN, 29));
		lblThePriceOf.setBounds(62, 58, 660, 35);
		contentPane.add(lblThePriceOf);
		
		JLabel lblNotEnoughFor = new JLabel("Enough for discount");
		lblNotEnoughFor.setHorizontalAlignment(SwingConstants.CENTER);
		lblNotEnoughFor.setFont(new Font("Times New Roman", Font.PLAIN, 29));
		lblNotEnoughFor.setBounds(62, 123, 660, 35);
		contentPane.add(lblNotEnoughFor);
		
		ImageIcon image1 =new ImageIcon("picture\\enough2.png");
		JLabel imagelable1 = new JLabel(image1);
		imagelable1.setBounds(315, 150, 150, 150);
		contentPane.add(imagelable1);
		
		JLabel lblYouHaveX = new JLabel("You have "+stampNum+" virtual stamps.");
		lblYouHaveX.setHorizontalAlignment(SwingConstants.CENTER);
		lblYouHaveX.setFont(new Font("Times New Roman", Font.PLAIN, 36));
		lblYouHaveX.setBounds(62, 290, 660, 35);
		contentPane.add(lblYouHaveX);
		
		JLabel lblPlease = new JLabel("It will consume 10 stamps for a discount~");
		lblPlease.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlease.setFont(new Font("Times New Roman", Font.PLAIN, 29));
		lblPlease.setBounds(62, 360, 660, 35);
		contentPane.add(lblPlease);
		
		JButton btnNewButton = new JButton("OK, continue paying with discount");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnNewButton) {
					member.useStamps(memberNumber);
					Double total = order.getTotalPrice();
					setVisible(false);
					order.discount();
					JFrame pay_ment_interface= new pay_ment_interface(order,total);
					
				}
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnNewButton.setBounds(174, 522, 437, 58);
		contentPane.add(btnNewButton);
		
		setVisible(true);
	}

}
