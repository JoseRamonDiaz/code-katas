package com.project_euler;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SumEvenFibonacciTest {
	@Test
	public void testSum() {
		SumEvenFibonacci sumFib = new SumEvenFibonacci();
		assertEquals(0, sumFib.sum(0));
		assertEquals(0, sumFib.sum(1));
		assertEquals(2, sumFib.sum(2));
		assertEquals(2, sumFib.sum(3));
		assertEquals(2, sumFib.sum(5));
		assertEquals(10, sumFib.sum(8));
		assertEquals(10, sumFib.sum(13));
		assertEquals(10, sumFib.sum(21));
		assertEquals(44, sumFib.sum(34));
//		System.out.println(sumFib.sum(4000000));
	}
}
