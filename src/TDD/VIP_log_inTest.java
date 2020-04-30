package TDD;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

import boundary.VIP_log_in;
import entity.Order;

class VIP_log_inTest {

	@Test
	void test() {
		Date orderTime = new Date();
		Order order = new Order(orderTime);
		new VIP_log_in(order);
	}

}
