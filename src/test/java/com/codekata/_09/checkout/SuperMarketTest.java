package com.codekata._09.checkout;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SuperMarketTest {

	@Test
	public void testGetPrice() {
		Supermarket sm = new Supermarket();
		assertEquals(0, sm.price(""), 0);
		assertEquals(0.50, sm.price("a"), 0);
		assertEquals(0.80, sm.price("ab"), 0);
		assertEquals(1.15, sm.price("abcd"), 0);
		
		assertEquals(1.0, sm.price("aa"), 0);
		assertEquals(1.30, sm.price("aaa"), 0);
		assertEquals(1.80, sm.price("aaaa"), 0);
		assertEquals(2.30, sm.price("aaaaa"), 0);
		assertEquals(2.60, sm.price("aaaaaa"), 0);
		
		assertEquals(1.60, sm.price("aaab"), 0);
		assertEquals(1.75, sm.price("aaabb"), 0);
		assertEquals(1.90, sm.price("aaabbd"), 0);
	}
	
}
