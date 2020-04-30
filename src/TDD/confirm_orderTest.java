package TDD;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

import boundary.confirm_order;
import entity.Order;

class confirm_orderTest {

	@Test
	void test() {
		Date orderTime = new Date();
		Order order = new Order(orderTime);
		new confirm_order(order);
	}

}
