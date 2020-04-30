package TDD;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

import entity.NoodleOrder;
import entity.Order;

class NoodleOrderTest {

	@Test
	void test() {
		Date d = new Date(2017,2,4);
		new Order(d);
		//Order.menu.getnoodlePrice();
		
		NoodleOrder noodle = new NoodleOrder(1,"140001","Tonkotsu","Soft","No_please","yes","no","yes",5);
		noodle.add(0, 1, 2, 0);
		noodle.subOrderDetail();
		String id = noodle.getId();
		assertEquals("14000101",id);
		double price = noodle.getPrice();
		double price2 = noodle.price();
		assertEquals(price,price2);
		noodle.toString();
		String nori = noodle.getNori();
		assertEquals("yes",nori);
		String chashu = noodle.getchashu();
		assertEquals("no",chashu);
		String egg = noodle.getegg();
		assertEquals("yes",egg);
		
		NoodleOrder noodle2 = new NoodleOrder(15,"140021","Tonkotsu","Soft","No_please","yes","yes","yes",5);
		noodle2.add(0, 1, 2, 0);
		String id2 = noodle2.getId();
		assertEquals("14002115",id2);
	}

}
