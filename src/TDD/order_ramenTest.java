package TDD;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

import boundary.order_ramen;
import entity.Order;

class order_ramenTest {

	@Test
	void test() {
		Date orderTime = new Date();
		Order order = new Order(orderTime);
		new order_ramen(order);
	}

}
