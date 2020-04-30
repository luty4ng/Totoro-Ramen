package TDD;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

import boundary.loyalty_scheme;
import entity.Order;

class loyalty_schemeTest {

	@Test
	void test() {
		Date orderTime = new Date();
		Order order = new Order(orderTime);
		new loyalty_scheme(order);
	}

}
