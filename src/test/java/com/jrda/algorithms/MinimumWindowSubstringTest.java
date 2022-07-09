package com.jrda.algorithms;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MinimumWindowSubstringTest {
	@Test
	public void testBigString() {
		MinimumWindowSubstring minimumWindowSubstring = new MinimumWindowSubstring();
		assertEquals("BANC", minimumWindowSubstring.minWindow("ADOBECODEBANC", "ABC"));
	}
	
	@Test
	public void testOneChar() {
		MinimumWindowSubstring minimumWindowSubstring = new MinimumWindowSubstring();
		assertEquals("A", minimumWindowSubstring.minWindow("A", "A"));
	}
	
	@Test
	public void testNotMinSubStr() {
		MinimumWindowSubstring minimumWindowSubstring = new MinimumWindowSubstring();
		assertEquals("", minimumWindowSubstring.minWindow("A", "AA"));
	}
	
	@Test
	public void test() {
		MinimumWindowSubstring minimumWindowSubstring = new MinimumWindowSubstring();
		assertEquals("cwae", minimumWindowSubstring.minWindow("cabwefgewcwaefgcf", "cae"));
	}
}
