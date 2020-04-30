package TDD;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

import boundary.VIP_register;
import entity.Order;

class VIP_registerTest {

	@Test
	void test() {
		Date orderTime = new Date();
		Order order = new Order(orderTime);
		new VIP_register(order);
	}

}
