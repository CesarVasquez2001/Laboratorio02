import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyFirstClassTest {

	@Test
	public void myFirstMethod() {
		String str = "JUnit is working fine";
		assertEquals("JUnit is working fine", str);
	}
}
