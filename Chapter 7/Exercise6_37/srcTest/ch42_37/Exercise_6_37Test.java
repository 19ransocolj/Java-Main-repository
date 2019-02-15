package ch42_37;

import static org.junit.Assert.*;

import org.junit.Test;

public class Exercise_6_37Test {

	@Test
	public void testFormat() {
		assertEquals(Exercise_6_37.format(123, 4), "0123");
	}

}
