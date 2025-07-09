package com.jrda.algorithms;

import org.junit.Test;

public class TwoSumTest {
	@Test
	public void testTwoSum() {
		TwoSum ts = new TwoSum();
		int[] result = ts.getTarget(new int[] {1, 3, 7, 6}, 7);
		print(result);
	}

	@Test
	public void testTwoSum1() {
		TwoSum ts = new TwoSum();
		int[] result = ts.getTarget(new int[] {1, 5, 5, 6}, 10);
		print(result);
	}
	
	private void print(int[] a) {
		for (int i : a) {
			System.out.println(i);
		}
	}
}
