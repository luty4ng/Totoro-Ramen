package entity;

import java.util.ArrayList;
import java.util.Date;

public class Order {
	private String oID;
	private Date dateOrder;
	private String diningOption;
	private double totalPrice;
	private Member member;
	
	
	private ArrayList<NoodleOrder> noodleOrder;
	
	public Order() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
