package boundary;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import entity.Member;
import entity.Order;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Functions: 
 * 	1. present the number of stamps of the VIP customer.
 * 	2. remind the VIP customer that he or she can not pay with a discount.
 */
public class less_than_10 extends JFrame {

	private JPanel contentPane;
    private Order order;
    private Member member;
    
	/**
	 * Create the frame.
	 * @param order The order of this customer.
	 * @param memberNumber The number of this member.
	 */
	public less_than_10(Order order, String memberNumber) {
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
		
		JLabel lblThePriceOf = new JLabel("Sorry, your virtual stamps is less than 10");
		lblThePriceOf.setHorizontalAlignment(SwingConstants.CENTER);
		lblThePriceOf.setFont(new Font("Times New Roman", Font.PLAIN, 29));
		lblThePriceOf.setBounds(62, 58, 660, 35);
		contentPane.add(lblThePriceOf);
		
		JLabel lblNotEnoughFor = new JLabel("Not Enough for discount");
		lblNotEnoughFor.setHorizontalAlignment(SwingConstants.CENTER);
		lblNotEnoughFor.setFont(new Font("Times New Roman", Font.PLAIN, 29));
		lblNotEnoughFor.setBounds(62, 123, 660, 35);
		contentPane.add(lblNotEnoughFor);
		
		ImageIcon image1 =new ImageIcon("picture\\notenough.png");
		JLabel imagelable1 = new JLabel(image1);
		imagelable1.setBounds(315, 148, 150, 150);
		contentPane.add(imagelable1);
		
		JLabel lblYouHaveX = new JLabel("You have "+stampNum+" virtual stamps.");
		lblYouHaveX.setHorizontalAlignment(SwingConstants.CENTER);
		lblYouHaveX.setFont(new Font("Times New Roman", Font.PLAIN, 36));
		lblYouHaveX.setBounds(62, 290, 660, 35);
		contentPane.add(lblYouHaveX);
		
		JLabel lblPlease = new JLabel("Please accmulate more stamps~");
		lblPlease.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlease.setFont(new Font("Times New Roman", Font.PLAIN, 29));
		lblPlease.setBounds(62, 360, 660, 35);
		contentPane.add(lblPlease);
		
		JButton btnNewButton = new JButton("OK, continue paying");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnNewButton) {
					setVisible(false);
					order.getMember().addStamps(order.getMember().getmID());
					JFrame pay_ment_interface= new pay_ment_interface(order,order.getTotalPrice());
				}
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnNewButton.setBounds(229, 519, 335, 58);
		contentPane.add(btnNewButton);
		
		setVisible(true);
	}

}
