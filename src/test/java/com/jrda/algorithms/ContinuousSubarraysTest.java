package com.jrda.algorithms;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ContinuousSubarraysTest {
	@Test
	public void testTriangularNumbers() {
		ContinuousSubarrays continuousSubarrays = new ContinuousSubarrays();
		assertEquals(1, continuousSubarrays.triangularNumbers(1));
		assertEquals(3, continuousSubarrays.triangularNumbers(2));
		assertEquals(6, continuousSubarrays.triangularNumbers(3));
	}
	
	@Test
	public void testContinuousSubarrayIterative() {
		ContinuousSubarrays continuousSubarrays = new ContinuousSubarrays();
		assertEquals(1, continuousSubarrays.continuousSubarraysIterative(new int[] {1}));
		assertEquals(2, continuousSubarrays.continuousSubarraysIterative(new int[] {1, 5}));
		assertEquals(4, continuousSubarrays.continuousSubarraysIterative(new int[] {1, 5, 7}));
		assertEquals(6, continuousSubarrays.continuousSubarraysIterative(new int[] {1,2,3}));
		assertEquals(8, continuousSubarrays.continuousSubarraysIterative(new int[] {5,4,2,4}));
		assertEquals(43, continuousSubarrays.continuousSubarraysIterative(new int[] {65,66,67,66,66,65,64,65,65,64}));
	}
	
	@Test
	public void testContinuousSubtarray() {
		ContinuousSubarrays continuousSubarrays = new ContinuousSubarrays();
		assertEquals(1, continuousSubarrays.continuousSubarrays(new int[] {1}));
		assertEquals(2, continuousSubarrays.continuousSubarrays(new int[] {1, 5}));
		assertEquals(4, continuousSubarrays.continuousSubarrays(new int[] {1, 5, 7}));
		assertEquals(6, continuousSubarrays.continuousSubarrays(new int[] {1,2,3}));
		assertEquals(8, continuousSubarrays.continuousSubarrays(new int[] {5,4,2,4}));
		assertEquals(43, continuousSubarrays.continuousSubarrays(new int[] {65,66,67,66,66,65,64,65,65,64}));
	}
}
