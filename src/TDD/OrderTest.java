package TDD;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.Test;

class OrderTest {

	@Test
	void Datetest() {
		Date date = new Date();
		Calendar cal = Calendar.getInstance(); 
		cal.setTime(date);
		int weekday = cal.get(cal.DAY_OF_WEEK);
		System.out.println(weekday);
	}

}
