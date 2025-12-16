package com.leet_code;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SortIntegersBy1BitsTest {
	@Test
	public void test() {
		SortIntegersBy1Bits si = new SortIntegersBy1Bits();
		assertArrayEquals(new int[] {0,1,2,4,8,3,5,6,7}, si.sortByBits(new int[] {0,1,2,3,4,5,6,7,8}));
	}

	@Test
	public void test1() {
		SortIntegersBy1Bits si = new SortIntegersBy1Bits();
		assertArrayEquals(new int[] {1,2,4,8,16,32,64,128,256,512,1024}, si.sortByBits(new int[] {1024,512,256,128,64,32,16,8,4,2,1}));
	}

}
