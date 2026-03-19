package com.leet_code;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ZeroMatrixTest {
	@Test
	public void testZeroMatrix() {
		ZeroMatrix zm = new ZeroMatrix();
		assertEquals(0, zm.minFlips(new int[][] {{0}}));
	}
	
	@Test
	public void testOneEntry() {
		ZeroMatrix zm = new ZeroMatrix();
		assertEquals(1, zm.minFlips(new int[][] {{1}}));
	}
	
	@Test
	public void testTwoByOneImpossible() {
	    ZeroMatrix zm = new ZeroMatrix();
	    assertEquals(-1, zm.minFlips(new int[][] {
	        {1},
	        {0}
	    }));
	}
	
	@Test
	public void testTwoByTwoSimple() {
	    ZeroMatrix zm = new ZeroMatrix();
	    assertEquals(2, zm.minFlips(new int[][] {
	        {0,1},
	        {1,0}
	    }));
	}
	
	@Test
	public void testTwoByTwoAllOnes() {
	    ZeroMatrix zm = new ZeroMatrix();
	    assertEquals(4, zm.minFlips(new int[][] {
	        {1,1},
	        {1,1}
	    }));
	}
	
	@Test
	public void testExampleLeetCode() {
	    ZeroMatrix zm = new ZeroMatrix();
	    assertEquals(3, zm.minFlips(new int[][] {
	        {0,0},
	        {0,1}
	    }));
	}
}
