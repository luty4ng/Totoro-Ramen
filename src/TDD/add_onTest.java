package TDD;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

import boundary.backstage;
import boundary.add_on;
import entity.NoodleOrder;
import entity.Order;

class add_onTest {
	private Order order;
	private String id;
	private String soup = "Tonkotsu";
    private String noodles = "Soft";
    private String springOnion = "No please";
    private String nori = "Yes";
    private String chashu = "Yes";
    private String boiledEgg = "Yes";
    private int spiciness = 0;
    private int n;
	
	@Test
	void test() {
		Date orderTime = new Date();
		order = new Order(orderTime);
		NoodleOrder noodle = new NoodleOrder(n, id, soup, noodles, springOnion, nori, chashu, boiledEgg, spiciness);
		new add_on(order,noodle);
	}
	
	void BackstagetestTest() {
		new backstage();
	}


}
