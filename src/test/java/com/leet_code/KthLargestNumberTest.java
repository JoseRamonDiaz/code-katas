package com.leet_code;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class KthLargestNumberTest {
	@Test
	public void test() {
		KthLargestNumber kn = new KthLargestNumber();
		String[] a = new String[] {"3","6","7","10"};
		assertEquals("3", kn.kthLargestNumber(a, 4));
	}
}
