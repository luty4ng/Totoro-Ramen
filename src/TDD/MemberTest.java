package TDD;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import entity.Member;

class MemberTest {

	@Test
	void CreateObj()
	{
		Member member = new Member();
		assertNotNull(member);
	}
	
	@Test
	void RegisterAndLogin()
	{
		Member member = new Member();
		String mid = member.register("a", "b", "ddd@gmail.com", "18810727622");
		assertEquals(6, mid.length());
		assertEquals(true, member.login(mid));
	}
	
	@Test
	void UseStamps()
	{
		Member member = new Member();
		String mid = "222222";
		String pre = member.getStamps(mid);
		member.useStamps(mid);
		String after = member.getStamps(mid);
		assertEquals(10,Integer.parseInt(pre)-Integer.parseInt(after));
	}
	
	@Test
	void addStamps()
	{
		Member member = new Member();
		String mid = "222222";
		String pre = member.getStamps(mid);
		for(int i=0;i<10;i++)
			member.addStamps(mid);
		String after = member.getStamps(mid);
		assertEquals(10,Integer.parseInt(after)-Integer.parseInt(pre));
		
	}
	
	
	@Test
	void FormatChecker()
	{
		Member member = new Member();
		String phone = member.register("a", "b", "ddd@gmail.com", "1881072762d");
		String email = member.register("a", "b", "dddgmail.com", "1881072762d");
		assertEquals("email", email);
		assertEquals("phone", phone);
	}

}
