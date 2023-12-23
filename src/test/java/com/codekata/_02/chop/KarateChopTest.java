package com.codekata._02.chop;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class KarateChopTest {
	private KarateChop karateChop = null;
	
	@Before
	public void init() {
		karateChop = new KarateChop();
	}
	
	@Test
	public void testFoundInMiddle() {
		assertEquals(1, karateChop.chop(2, new int[] {1, 2, 3}));
	}
	
	@Test
	public void testFoundLastArrayLengthTwo() {
		assertEquals(1, karateChop.chop(2, new int[] {1, 2}));
	}
	
	@Test
	public void testArrayWithOneValue() {
		assertEquals(0, karateChop.chop(1, new int[] {1}));
	}
	
	@Test
	public void testArrayWithOneValueNotFound() {
		assertEquals(-1, karateChop.chop(1, new int[] {2}));
	}
	
	@Test
	public void testFoundLastArrayLength4() {
		assertEquals(1, karateChop.chop(2, new int[] {1, 2, 3, 4}));
	}

	@Test
	public void testFoundLastArrayLength4SecondHalf() {
		assertEquals(3, karateChop.chop(4, new int[] {1, 2, 3, 4}));
	}

	@Test
	public void testFoundLastArrayLength11() {
		assertEquals(10, karateChop.chop(500, new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 500}));
	}
}
