package control;

import java.util.Date;



import boundary.welcome;
import entity.Member;
import entity.NoodleOrder;
import entity.Order;
import entity.OrderMenu;


/*** This class is the mainfunction to enter the system
* @author Yixuan Lu
* @version 0.5
*/
public class MainFunction {
	
    /**
  * generate each type of the entities and return to GUI
  * @param null
  * 
  */ 
	public static Order generateOrder() {
		Date orderTime = new Date();
		return new Order(orderTime);
	}
	
	public static NoodleOrder generateNoodle() {
		return new NoodleOrder();
	}
	
	public static Member generateMember() {
		return new Member();
	}
	
	public static OrderMenu generateMenu() {
		return new OrderMenu();
	}
	

	public static void main(String[] args) {
		welcome frame = new welcome();
		frame.setVisible(true); 
	}
}
