package com.codekata._06.anagrams;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AnagramCheckerTest {
	@Test
	public void areAnagramTest() {
		assertTrue(AnagramChecker.areAnagrams("kinship", "pinkish"));
		assertTrue(AnagramChecker.areAnagrams( "fresher","refresh"));
		assertFalse(AnagramChecker.areAnagrams( "fresher","refres"));
	}
}
