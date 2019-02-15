package ch43_03;

import static org.junit.Assert.*;

import org.junit.Test;

public class Exercise_6_3Test {

	@Test
	public void test() {
		//fail("Not yet implemented");
	}
	@Test
	public void testReverse() {
		assertEquals(Exercise_6_3.reverse(123), 321);
		assertEquals(Exercise_6_3.reverse(12321), 12321);
		assertEquals(Exercise_6_3.reverse(1), 1);
	}
	@Test
	public void isPalindrome() {
		assertTrue(Exercise_6_3.isPalindrome(12321));
		assertFalse(Exercise_6_3.isPalindrome(1321));
	}
}
