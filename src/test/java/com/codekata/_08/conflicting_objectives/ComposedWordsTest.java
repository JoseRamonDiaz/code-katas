package com.codekata._08.conflicting_objectives;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import com.codekata._04.datamunging.DataReader;

public class ComposedWordsTest {
	
	@Test
	public void testDualComposedWords() {
		List<String> diccionary = new DataReader("wordlist.txt").getLines();
		ComposedWordChecker c = new DoualComposedWordChecker(diccionary);
		assertTrue(c.isComposed("albums"));
		assertFalse(c.isComposed("taquito"));
		assertTrue(c.isComposed("barely"));
	}
	
}
