package boundary;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import boundary.backstage;
import entity.Order;

import javax.swing.JLabel;

public class welcome extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					welcome frame = new welcome();
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
	public welcome() {
//		Date orderTime;
		setTitle("Welcome You");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(740, 200, 800, 740);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcome = new JLabel("Welcome to Totoro Ramen!");
		lblWelcome.setFont(new Font("Times New Roman", Font.PLAIN, 49));
		lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcome.setBounds(62, 91, 690, 80);
		contentPane.add(lblWelcome);
		
		JPanel panel = new JPanel();
		panel.setBounds(146, 550, 481, 209);
		contentPane.add(panel);
		
		JButton btnNewButton = new JButton("Administrator");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnNewButton) {
					setVisible(false);
					JFrame Backstagetest= new backstage();
				}
			}
		});
		panel.setLayout(null);
		btnNewButton.setBounds(14, 0, 212, 123);
		panel.add(btnNewButton);
		
		JButton btnCustomer = new JButton("Customer");
		btnCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnCustomer) {
					Date orderTime = new Date();
//					System.out.print(orderTime);
					Order order = new Order(orderTime);
					setVisible(false);
					JFrame order_ramen= new order_ramen(order);
				}
			}
		});
		btnCustomer.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		btnCustomer.setBounds(259, 0, 208, 123);
		panel.add(btnCustomer);
		
		JLabel lblWhatIsYourIdentity = new JLabel("Choose Your Identity Please");
		lblWhatIsYourIdentity.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		lblWhatIsYourIdentity.setHorizontalAlignment(SwingConstants.CENTER);
		lblWhatIsYourIdentity.setBounds(227, 480, 337, 80);
		contentPane.add(lblWhatIsYourIdentity);
		
		JLabel lblNewLabel = new JLabel("Find Delicacy Here");
		lblNewLabel.setFont(new Font("MV Boli", Font.PLAIN, 42));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(204, 168, 384, 64);
		contentPane.add(lblNewLabel);
		
		ImageIcon image=new ImageIcon("picture\\ramen.jpg");
		JLabel imagelable = new JLabel(image);
		imagelable.setBounds(204, 230, 384, 270);
		contentPane.add(imagelable);
		
		setVisible(true);
	}

}
