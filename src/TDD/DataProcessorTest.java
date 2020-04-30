package TDD;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import entity.DataProcessor;

class DataProcessorTest {
	@Test
	void CreateObj() {
		DataProcessor csv = new DataProcessor("data/test.csv");

		assertEquals("Create Success", csv.test());
	}
	
	@Test
	void ReadbyCondition() {
		DataProcessor csv = new DataProcessor("data/test.csv");
		ArrayList<String> result = csv.Read("Age=20");
		assertEquals("Bob,Bob@163.com,20", result.get(0));
	}
	
	@Test
	void ReadAll() {
		DataProcessor csv = new DataProcessor("data/test.csv");
		ArrayList<String> result = csv.Read();
		assertEquals(4,result.size());
	}
	
	@Test
	void WriteAll() {
		DataProcessor csvw = new DataProcessor("data/test2.csv");
		ArrayList<String> data = new ArrayList<String>();
		data.add("2,3,4");
		csvw.Write(data);
		assertEquals(data.get(0), csvw.Read().get(0));
	}
	
	@Test 
	void WriteLine() {
		DataProcessor csvw = new DataProcessor("data/test2.csv");
		csvw.WriteLine("6,6,6");
		ArrayList<String> result = csvw.Read();
		assertEquals("6,6,6",result.get(result.size()-1));
	}
}
