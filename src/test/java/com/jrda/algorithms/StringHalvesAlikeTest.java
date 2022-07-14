package com.jrda.algorithms;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StringHalvesAlikeTest {
	@Test
	public void testFalse() {
		StringHalvesAlike stringHalvesAlike = new StringHalvesAlike();
		assertFalse(stringHalvesAlike.halvesAreAlike("textbook"));
	}
	
	@Test
	public void testTrue() {
		StringHalvesAlike stringHalvesAlike = new StringHalvesAlike();
		assertTrue(stringHalvesAlike.halvesAreAlike("book"));
		assertTrue(stringHalvesAlike.halvesAreAlike("ibooki"));
		assertTrue(stringHalvesAlike.halvesAreAlike("hola"));
		assertTrue(stringHalvesAlike.halvesAreAlike("boOk"));
		assertTrue(stringHalvesAlike.halvesAreAlike("AbCdEfGh"));
	}
}
