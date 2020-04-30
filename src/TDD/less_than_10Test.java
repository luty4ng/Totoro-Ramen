package TDD;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

import boundary.less_than_10;
import entity.Order;

class less_than_10Test {

	@Test
	void test() {
		Date orderTime = new Date();
		Order order = new Order(orderTime);
		String memberNumber = "123456";
		new less_than_10(order, memberNumber);
	}

}
