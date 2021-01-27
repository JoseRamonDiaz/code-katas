package com.codekata._06.anagrams;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;


public class FileAnagramsCheckerTest {
	@Ignore("Ignored because takes a lot of time to complete")
	@Test
	public void testFileAnagrams() {
		FileAnagramsChecker fac = new FileAnagramsChecker();
		
		assertEquals(8, fac.getAnagramsSets());
		//assertEquals( 48162 , fac.getAnagramsWords());
	}
}
