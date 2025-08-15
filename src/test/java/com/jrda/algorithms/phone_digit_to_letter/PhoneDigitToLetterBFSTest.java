package com.jrda.algorithms.phone_digit_to_letter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class PhoneDigitToLetterBFSTest {
	private PhoneDigitToLetterBFS bfs; 
	
	@Before
	public void init() {
		bfs = new PhoneDigitToLetterBFS();
	}
	
	@Test
	public void testNoDigit() {
		assertTrue(bfs.getCombinations(null).isEmpty());
		assertTrue(bfs.getCombinations("").isEmpty());
		assertTrue(bfs.getCombinations("1").isEmpty());
	}
	
	@Test
	public void testOneDigit() {
		assertEquals(List.of("a", "b", "c"), bfs.getCombinations("2"));
	}
	
	@Test
	public void testTwoDigits() {
		assertEquals(List.of(
				"ad", "ae", "af",  
				"bd", "be", "bf", 
				"cd", "ce", "cf"), bfs.getCombinations("23"));
	}

	@Test
	public void testThreeDigit() {
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
		assertEquals(l, bfs.getCombinations("234"));
	}
}

