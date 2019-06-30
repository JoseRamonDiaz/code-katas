package com.codekata._11.sorting;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class RackTest {

	@Test
	public void testAdd() {
		Rack rack = new Rack();
		rack.add(10);
		assertArrayEquals(new Integer[]{10} , rack.balls());
	}
	
	@Test
	public void testSort() {
		Rack rack = new Rack();
		rack.add(20);
		assertArrayEquals(new Integer[] {20}, rack.balls());
		rack.add(10);
		Integer[] result = rack.balls();
		assertArrayEquals(new Integer[] {10, 20}, result);
	}
}
