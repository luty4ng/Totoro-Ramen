package TDD;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

import boundary.pay_ment_interface;
import entity.Order;

class pay_ment_interfaceTest {
	private Order order;
	private double price = 9.9;
	@Test
	void test() {
		Date orderTime = new Date();
		order = new Order(orderTime);
		new pay_ment_interface(order, price);
	}

}
