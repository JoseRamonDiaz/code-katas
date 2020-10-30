package com.jrdadev.katas;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InfixTest {
	@Test
	public void testEmptyString() {
		Infix infix = new Infix();
		assertEquals("", infix.toPostfix(null));
		assertEquals("", infix.toPostfix(""));
		assertEquals("3", infix.toPostfix("3"));
		assertEquals("3 2 *", infix.toPostfix("3*2"));
		assertEquals("3 2 *", infix.toPostfix("3 * 2"));
		assertEquals("3 2 5 + *", infix.toPostfix("3 * 2 + 5"));
	}
}
