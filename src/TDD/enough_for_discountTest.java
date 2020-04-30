package TDD;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

import boundary.enough_for_discount;
import entity.Order;

class enough_for_discountTest {

	@Test
	void test() {
		Date orderTime = new Date();
		Order order = new Order(orderTime);
		String memberNumber = "123456";
		new enough_for_discount(order, memberNumber);
	}

}
