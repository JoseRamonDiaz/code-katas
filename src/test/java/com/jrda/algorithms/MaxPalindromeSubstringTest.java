package com.jrda.algorithms;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaxPalindromeSubstringTest {
	@Test
	public void test() {
		MaxPalindromeSubstring mps = new MaxPalindromeSubstring();
		assertEquals("aba", mps.get("aba"));
		assertEquals("abba", mps.get("abba"));
		assertEquals("bab", mps.get("babad"));
	}
}
