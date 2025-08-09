package com.jrda.algorithms.phone_digit_to_letter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

public class PhoneDigitToLetterDFSTest {
	@Test
	public void testNoDigit() {
		PhoneDigitToLetterDFS dfs = new PhoneDigitToLetterDFS();
		assertTrue(dfs.getCombinations(null).isEmpty());
		assertTrue(dfs.getCombinations("").isEmpty());
		assertTrue(dfs.getCombinations("1").isEmpty());
	}
	
	@Test
	public void testOneDigit() {
		PhoneDigitToLetterDFS dfs = new PhoneDigitToLetterDFS();
		assertEquals(List.of("a", "b", "c"), dfs.getCombinations("2"));
	}
	
	@Test
	public void testTwoDigits() {
		PhoneDigitToLetterDFS dfs = new PhoneDigitToLetterDFS();
		assertEquals(List.of(
				"ad", "ae", "af",  
				"bd", "be", "bf", 
				"cd", "ce", "cf"), dfs.getCombinations("23"));
	}

	@Test
	public void testThreeDigit() {
		PhoneDigitToLetterDFS dfs = new PhoneDigitToLetterDFS();
		List<String> l = List.of(
			    "adg", "adh", "adi",
			    "aeg", "aeh", "aei",
			    "afg", "afh", "afi",
			    "bdg", "bdh", "bdi",
			    "beg", "beh", "bei",
			    "bfg", "bfh", "bfi",
			    "cdg", "cdh", "cdi",
			    "ceg", "ceh", "cei",
			    "cfg", "cfh", "cfi"
			);
		assertEquals(l, dfs.getCombinations("234"));
	}
}
