package com.leet_code;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaxRowsCoveredByColumnsTest {
	@Test
	public void testMaxRowsCovered() {
		MaxRowsCoveredByColumns mr = new MaxRowsCoveredByColumns();
		int[][] m = new int[][] {
			{0, 0, 0},
			{1, 0, 1},
			{0, 1, 1},
			{0, 0, 1}
		};
		assertEquals(3, mr.maximumRows(m, 2));
	}
}
