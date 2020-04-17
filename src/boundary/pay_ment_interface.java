package boundary;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;

import entity.Order;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JCheckBox;

public class pay_ment_interface extends JFrame {
	//继续调用getOrderDetailed方法，并且展示订单。最终结束
	private JPanel contentPane;
	private Order order;
	/**
	 * Launch the application.
	 */
/*	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pay_ment_interface frame = new pay_ment_interface();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
*/
	/**
	 * Create the frame.
	 */
	public pay_ment_interface(Order order) {
		this.order = order;
		setTitle("Your order is ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(740, 200, 800, 740);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblYouCanChoose = new JLabel("Your order is as follows:");
		lblYouCanChoose.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblYouCanChoose.setBounds(25, 32, 546, 35);
		contentPane.add(lblYouCanChoose);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(25, 77, 721, 412);
		contentPane.add(scrollPane);

		String[][] orderDetail = order.getOrderDetail();
		double price = order.getTotalPrice();
		System.out.print(orderDetail);
	    String [] columnName = {
	            "Items",
                "Number",
                "Price"
        };
	    JTable jTable=new JTable(orderDetail,columnName);
        jTable.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        jTable.setRowHeight(25);
        scrollPane.setViewportView(jTable);
        
/*        JTable jTable=new JTable(data,columnName);
        jTable.setRowHeight(25);
        scrollPane.setViewportView(jTable);*/
        
        JButton btnNewButton = new JButton("pay by bank card");
        btnNewButton.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent arg0) {
        		setVisible(false);
        		order.printOrder();
        		order.outPutOrder();
        		order.orderFinish();
        		JFrame deal_complete = new deal_complete();
        	}
        });
        btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
        btnNewButton.setBounds(36, 615, 334, 59);
        contentPane.add(btnNewButton);
        
        JButton btnConfirm = new JButton("pay by cash");
        btnConfirm.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		setVisible(false);
        		order.printOrder();
        		order.outPutOrder();
        		order.orderFinish();
        		JFrame deal_complete = new deal_complete();
        	}
        });
        btnConfirm.setFont(new Font("Times New Roman", Font.BOLD, 20));
        btnConfirm.setBounds(406, 615, 334, 59);
        contentPane.add(btnConfirm);
        
        JPanel panel1 = new JPanel();
        panel1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(125, 125, 125), new Color(125, 125, 125)));
        panel1.setBounds(36, 518, 340, 48);
        contentPane.add(panel1);
        panel1.setLayout(null);
        
        double discountValue = 0.0;
        double totalprice = order.getTotalPrice();//the total price of the order
        double needPay = totalprice;
        if(order.getMember() != null) {
        	if(Integer.parseInt(order.getMember().getStamps(order.getMember().getmID())) >= 10) {
	        	order.discount();
	        	needPay = order.getTotalPrice();
	        	discountValue = totalprice - needPay; //the total discount of the order 
	        }
        }        
        JLabel total = new JLabel("in total:");
        total.setFont(new Font("Times New Roman", Font.BOLD, 20));
        total.setBounds(10, 9, 106, 27);
        panel1.add(total);
        JLabel total2 = new JLabel(""+totalprice);
        total2.setFont(new Font("Times New Roman", Font.BOLD, 20));
        total2.setBounds(275, 9, 106, 27);
        panel1.add(total2);
        
        JPanel panel2 = new JPanel();
        panel2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(125, 125, 125), new Color(125, 125, 125)));
        panel2.setBounds(405, 518, 340, 48);
        contentPane.add(panel2);
        panel2.setLayout(null);

        JLabel discount = new JLabel ("discount:");
        discount.setFont(new Font("Times New Roman", Font.BOLD, 20));
        discount.setBounds(10, 9, 106, 27);
        panel2.add(discount);
        JLabel discount2 = new JLabel (""+discountValue);
        discount2.setFont(new Font("Times New Roman", Font.BOLD, 20));
        discount2.setBounds(275, 9, 106, 27);
        panel2.add(discount2);
        
        JPanel panel3 = new JPanel();
        panel3.setBounds(220, 570, 340, 48);
        contentPane.add(panel3);
        panel3.setLayout(null);
        JLabel needPayLabel = new JLabel ("You need to pay "+needPay+"$");
        needPayLabel.setFont(new Font("Times New Roman", Font.BOLD, 23));
        needPayLabel.setHorizontalAlignment(SwingConstants.CENTER);
        needPayLabel.setBounds(10, 9, 306, 27);
        panel3.add(needPayLabel);
        
        setVisible(true);
	}

}
