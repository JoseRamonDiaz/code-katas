package com.jrda.kata_log_christmas_lights;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class GridTest {
	private Grid grid;
	
	@Before
	public void init() {
		grid = new Grid();
	}
	
	@Test
	public void testMatrix() {
		Light[][] matrix = grid.getMatrix();
		assertNotNull(matrix);
		assertEquals(1000, matrix.length);
		assertEquals(1000, matrix[0].length);
	}
	
	@Test
	public void testOn() {
		grid.on(0, 0, 1, 1);
		Light[][] matrix = grid.getMatrix();
		assertSquare(1, true, matrix);
		
		grid.on(0, 0, 2, 2);
		assertSquare(2, true, matrix);
	}
	
	@Test
	public void testOff() {
		grid.on(0, 0, 999, 999);//turn on all lights
		grid.off(0, 0, 1, 1);
		Light[][] matrix = grid.getMatrix();
		assertSquare(1, false, matrix);
		
		grid.off(0, 0, 2, 2);
		assertSquare(2, false, matrix);
	}
	
	@Test
	public void testToggle() {
		grid.toggle(0, 0, 1, 1);
		Light[][] matrix = grid.getMatrix();
		assertSquare(1, true, matrix);
		
		grid.toggle(0, 0, 1, 1);
		assertOnlySquare(1, false, matrix);
		
		grid.toggle(0, 0, 2, 2);
		assertSquare(2, true, matrix);
	}
	
	private void assertOnlySquare(int size, boolean b, Light[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (i <= size && j <= size) {
					assertEquals(b, matrix[i][j].isOn());
				}
			}
		}
	}

	private void assertSquare(int size, boolean b, Light[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (i <= size && j <= size) {
					assertEquals(b, matrix[i][j].isOn());
				} else {
					assertNotEquals(b,matrix[i][j].isOn());
				}
			}
		}
	}
}
