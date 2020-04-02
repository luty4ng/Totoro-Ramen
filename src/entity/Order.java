package entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class Order {
	private String oID;
	private Date orderTime;
	private String diningOption;
	private double totalPrice;
	//Link reference to VIP member;
	private Member member;
	public static OrderMenu menu;
	private ArrayList<NoodleOrder> noodleOrder;
	
	public Order(Date orderTime) {
		DataProcessor processor = new DataProcessor("../../data/configure.csv");
		ArrayList<String> test = processor.Read();
		System.out.println(test.size());
		String currentOID = test.get(0);
		this.oID = "1";
		for(int i=0;i<(5-currentOID.length());i++)
			this.oID += "0";
		this.oID += currentOID;
		
		Order.menu = new OrderMenu();
		this.orderTime = orderTime;
		this.diningOption = null;
		this.totalPrice = 0.0;
	}

	public String getoID() {
		return oID;
	}

	public void setoID(String oID) {
		this.oID = oID;
	}

	public Date getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

	public String getDiningOption() {
		return diningOption;
	}

	public void setDiningOption(String diningOption) {
		this.diningOption = diningOption;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date=new Date();
		date.UTC(1999, 4, 30, 1, 2, 3);
		Order order = new Order(date);
	}
}
