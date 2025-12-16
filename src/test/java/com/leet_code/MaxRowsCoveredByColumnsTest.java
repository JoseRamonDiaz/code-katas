package com.leet_code;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaxRowsCoveredByColumnsTest {
	@Test
	public void testCombinations() {
		MaxRowsCoveredByColumns mr = new MaxRowsCoveredByColumns();
		assertEquals(6, mr.generateCombination(4, 2).size());
		assertEquals(4, mr.generateCombination(4, 3).size());
		assertEquals(4, mr.generateCombination(4, 1).size());
	}
	
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
