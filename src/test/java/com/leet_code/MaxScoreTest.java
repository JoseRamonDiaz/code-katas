package com.leet_code;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaxScoreTest {
	@Test
	public void testKadane() {
		MaxScore ms = new MaxScore();
		assertEquals(3, ms.kadane(new int[] {1, 2}));
		assertEquals(10, ms.kadane(new int[] {1, 2, 3, 4}));
		assertEquals(5, ms.kadane(new int[] {-2, 3, 2, -1}));
		assertEquals(-1, ms.kadane(new int[] {-3, -5, -1, -7}));
		assertEquals(6, ms.kadane(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
		assertEquals(5, ms.kadane(new int[] {5}));
		assertEquals(-5, ms.kadane(new int[] {-5}));
		assertEquals(0, ms.kadane(new int[] {0, 0, 0}));
		assertEquals(6, ms.kadane(new int[] {4, 2, -5, 1}));
		assertEquals(7, ms.kadane(new int[] {-3, -1, 5, 2}));
		assertEquals(8, ms.kadane(new int[] {-1, 2, 3, -2, 5, -10}));
		assertEquals(4, ms.kadane(new int[] {1, -1, 1, -1, 1, -1, 4}));
	}
	
	@Test
	public void testMaxScore() {
		MaxScore ms = new MaxScore();
		assertEquals(210, ms.maximumsSplicedArray(new int[] {60, 60, 60}, new int[] {10, 90, 10}));
		assertEquals(220, ms.maximumsSplicedArray(new int[] {20,40,20,70,30}, new int[] {50,20,50,40,20}));
		assertEquals(31, ms.maximumsSplicedArray(new int[] {7, 11, 13}, new int[] {1, 1, 1}));
		assertEquals(230, ms.maximumsSplicedArray(new int[] {10,20,50,15,30,10}, new int[] {40,20,10,100,10,10}));
	}
}
