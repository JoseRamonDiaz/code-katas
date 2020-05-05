package com.project_euler;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaxPathSumTriangleTest {
	
	@Test
	public void testTriangle() {
		int[][] input = {
							{3, 0, 0, 0},
							{7, 4, 0, 0},
							{2, 4, 6, 0},
							{8, 5, 9, 3}
						};
		
		MaxPathSumTriangle max = new MaxPathSumTriangle();
		assertEquals(23, max.getMaxSum(input, 4, 4));
	}
}
