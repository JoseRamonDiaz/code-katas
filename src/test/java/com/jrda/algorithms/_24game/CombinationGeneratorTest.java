package com.jrda.algorithms._24game;

import static org.junit.Assert.*;

import org.junit.Test;

public class CombinationGeneratorTest {
	@Test
	public void testOneCombination() {
		CombinationGenerator combinationGenerator = new CombinationGenerator();
		assertNotNull(combinationGenerator.generate(new String[] {"a"}));
		assertArrayEquals(new String[][] {new String[] {"a"}}, combinationGenerator.generate(new String[] {"a"}));
	}
	
	@Test
	public void testTwoCombination() {
		CombinationGenerator combinationGenerator = new CombinationGenerator();
		String[][] res = combinationGenerator.generate(new String[] {"a", "b"});
		assertEquals(4, res.length);
		assertArrayEquals(new String[][] {{"a", "a"}, {"a", "b"}, {"b", "a"}, {"b", "b"}}, res);
	}
	
	@Test
	public void testThreeCombination() {
		CombinationGenerator combinationGenerator = new CombinationGenerator();
		String[][] res = combinationGenerator.generate(new String[] {"a", "b", "c"});
		assertEquals(27, res.length);
	}
}
