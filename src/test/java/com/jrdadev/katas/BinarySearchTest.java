package com.jrdadev.katas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BinarySearchTest {
	BinarySearch bs = new BinarySearch();

	@Test
	public void searchTest() {
		assertEquals(0, bs.search(0, new int[] {0, 1, 2, 3}));
		assertEquals(1, bs.search(1, new int[] {0, 1, 2, 3}));
		assertEquals(2, bs.search(2, new int[] {0, 1, 2, 3}));
		assertEquals(3, bs.search(3, new int[] {0, 1, 2, 3}));

		assertEquals(-1, bs.search(3, new int[] {}));
		assertEquals(-1, bs.search(3, new int[] {1}));
		assertEquals(0,  bs.search(1, new int[] {1}));

		assertEquals(0,  bs.search(1, new int[] {1, 3, 5}));
		assertEquals(1,  bs.search(3, new int[] {1, 3, 5}));
		assertEquals(2,  bs.search(5, new int[] {1, 3, 5}));
		assertEquals(-1, bs.search(0, new int[] {1, 3, 5}));
		assertEquals(-1, bs.search(2, new int[] {1, 3, 5}));
		assertEquals(-1, bs.search(4, new int[] {1, 3, 5}));
		assertEquals(-1, bs.search(6, new int[] {1, 3, 5}));

		assertEquals(0,  bs.search(1, new int[] {1, 3, 5, 7}));
		assertEquals(1,  bs.search(3, new int[] {1, 3, 5, 7}));
		assertEquals(2,  bs.search(5, new int[] {1, 3, 5, 7}));
		assertEquals(3,  bs.search(7, new int[] {1, 3, 5, 7}));
		assertEquals(-1, bs.search(0, new int[] {1, 3, 5, 7}));
		assertEquals(-1, bs.search(2, new int[] {1, 3, 5, 7}));
		assertEquals(-1, bs.search(4, new int[] {1, 3, 5, 7}));
		assertEquals(-1, bs.search(6, new int[] {1, 3, 5, 7}));
		assertEquals(-1, bs.search(8, new int[] {1, 3, 5, 7}));
	}
}
