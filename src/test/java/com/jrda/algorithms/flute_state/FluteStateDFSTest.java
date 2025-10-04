package com.jrda.algorithms.flute_state;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class FluteStateDFSTest {
	private FluteStateDFS fs;
	
	@Before
	public void init() {
		fs = new FluteStateDFS();
	}

	@Test
	public void test() {
		List<String> states = fs.getFluteStates(3);
		assertEquals(8, states.size());
	}
	
	@Test
	public void testZero() {
		assertTrue(fs.getFluteStates(0).isEmpty());
	}
}
