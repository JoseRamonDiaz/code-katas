package com.codekata._08.conflicting_objectives;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class ComposedWordsTest {
	
	@Test
	public void testComposedWords() {
		ComposedWordChecker c = new ComposedWordChecker(Arrays.asList("al", "bums", "to", "bar", "ely")) ;
		assertTrue(c.isComposed("albums"));
		assertFalse(c.isComposed("taquito"));
		assertTrue(c.isComposed("barely"));
	}
	
}
