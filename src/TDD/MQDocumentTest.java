package TDD;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import entity.MQDocument;

class MQDocumentTest {
	MQDocument doc = null;
	@Test
	void test() {
		doc = new MQDocument();
		
		doc.setCharLimit("[0-9]");
		String limit = doc.getCharLimit();
		assertEquals(limit,"[0-9]");
		assertTrue(doc.isOfLimit(limit));
		
		doc.setMaxLength(6);
		int maxLength = doc.getMaxLength();
		assertEquals(doc.getMaxLength(), 6);
		
		doc.errorBeep(true);
		boolean beep = doc.isErrorBeep();
		assertTrue(beep);
	}

}
