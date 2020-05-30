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
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;

import entity.NoodleOrder;
import entity.Order;
import entity.OrderMenu;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JCheckBox;

/**
 * Functions: 
 * 1. show all ramen orders and prices in details in a table.
 * 2. choose another bowl of ramen as well as its add-ons.
 * 3. calculate and present the total price.
 * 4. the user can confirm and submit the order after browsing the detials.
 * 
 * @author Wenlong Liu
 *
 */
public class confirm_order extends JFrame {

	private JPanel contentPane;
	private Order order;
	private int restNum1 = 0;
	private int restNum2 = 0;
	private int restNum3 = 0;
	private int restNum4 = 0;
	private OrderMenu ordermenu;
	private String[][] detail;

	/**
	 * Create the frame.
	 * @param order The order of this customer.
	 */
	public confirm_order(Order order) {
		this.order = order;
		this.order.setDiningOption("Eat In");
		this.ordermenu = Order.menu;
		int noriAvailable = ordermenu.getnoriAvailable(), eggAvailable = ordermenu.geteggAvailable(),
				bambooAvailable = ordermenu.getbambooAvailable(), chashuAvailable = ordermenu.getchashuAvailable();
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
		// TODO Auto-generated constructor stub
		setTitle("Confirm your order");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(740, 200, 800, 740);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblYouCanChoose = new JLabel("Comfirm your order as follows:");
		lblYouCanChoose.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		lblYouCanChoose.setBounds(25, 26, 546, 41);
		contentPane.add(lblYouCanChoose);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(25, 77, 721, 412);
		contentPane.add(scrollPane);

		String[][] orderDetail = order.getOrderDetail();
		double price = order.getTotalPrice();
	    String [] columnName = {
	            "Items",
                "Number",
                "Price"
        };
        JTable jTable=new JTable(orderDetail,columnName);
        jTable.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        jTable.setRowHeight(25);
        scrollPane.setViewportView(jTable);
        
        JButton btnNewButton = new JButton("Add another bowl of noodles");
        btnNewButton.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent arg0) {
        		setVisible(false);
				JFrame order_ramen= new order_ramen(order);
        	}
        });
        btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 25));
        btnNewButton.setBounds(36, 609, 350, 59);
        contentPane.add(btnNewButton);
        
        JButton btnConfirm = new JButton("Confirm!");
        btnConfirm.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		ordermenu.setnoriAvailable(restNum1);
        		ordermenu.seteggAvailable(restNum2);
        		ordermenu.setbambooAvailable(restNum3);
        		ordermenu.setchashuAvailable(restNum4);
        		ordermenu.writeMenu();
        		setVisible(false);
        		
        		JFrame loyalty_scheme = new loyalty_scheme(order);
        		
        	}
        });
        btnConfirm.setFont(new Font("Times New Roman", Font.BOLD, 25));
        btnConfirm.setBounds(406, 609, 350, 59);
        contentPane.add(btnConfirm);
        
        JPanel panel = new JPanel();
        panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 255, 0), new Color(0, 0, 255)));
        panel.setBounds(185, 518, 276, 59);
        contentPane.add(panel);
        panel.setLayout(null);
        
        ButtonGroup group =new ButtonGroup();
        
        JCheckBox chckbxNewCheckBox = new JCheckBox("Eat In");
        chckbxNewCheckBox.setFont(new Font("Times New Roman", Font.PLAIN, 25));
        chckbxNewCheckBox.setBounds(10, 9, 106, 41);
        group.add(chckbxNewCheckBox);
        panel.add(chckbxNewCheckBox);
        chckbxNewCheckBox.setSelected(true);
        
        JCheckBox chckbxTakeAway = new JCheckBox("Take Away");
        chckbxTakeAway.setFont(new Font("Times New Roman", Font.PLAIN, 25));
        chckbxTakeAway.setBounds(120, 9, 143, 41);
        chckbxTakeAway.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		if(e.getSource() == chckbxTakeAway)
        			order.setDiningOption("Take Away");
        	}
        });
        group.add(chckbxTakeAway);
        panel.add(chckbxTakeAway);
        
        JLabel lblNewLabel = new JLabel("Dining options:");
        lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        lblNewLabel.setBounds(36, 530, 150, 33);
        contentPane.add(lblNewLabel);
        
        JLabel lblTotalPrice = new JLabel("Total Price:");
        lblTotalPrice.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        lblTotalPrice.setBounds(476, 530, 116, 33);
        contentPane.add(lblTotalPrice);
        
        JPanel panel_1 = new JPanel();
        panel_1.setLayout(null);
        panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 255, 0), new Color(0, 0, 255)));
        panel_1.setBounds(589, 518, 157, 59);
        contentPane.add(panel_1);
        
        JLabel lblNewLabel_1 = new JLabel(String.valueOf(price));
        lblNewLabel_1.setBounds(14, 0, 125, 59);
        panel_1.add(lblNewLabel_1);
        lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
        
        setVisible(true);
	}

}
