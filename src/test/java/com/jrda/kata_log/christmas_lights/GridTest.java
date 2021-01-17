package com.jrda.kata_log.christmas_lights;

import static org.junit.Assert.assertEquals;
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
		assertSquare(0, 0, 1, 1, 1, matrix);
		
		grid.on(0, 0, 2, 2);
		assertSquare(0, 0, 1, 1, 2, matrix);
		checkRow(2, 2, 1, matrix);
		checkColum(2, 2, 1, matrix);
	}

	private void checkColum(int column, int height, int expectedBrightness, Light[][] matrix) {
		for (int i = 0; i < height; i++) {
			assertEquals(expectedBrightness, matrix[i][column].getBrightness());
		}
	}

	@Test
	public void testOff() {
		grid.on(0, 0, 999, 999);//turn on all lights
		grid.off(0, 0, 1, 1);
		Light[][] matrix = grid.getMatrix();
		assertSquare(0, 0, 1, 1, 0, matrix);
		
		grid.off(0, 0, 2, 2);
		assertSquare(0, 0, 2, 2, 0, matrix);
	}
	
	@Test
	public void testToggle() {
		grid.toggle(0, 0, 1, 1);
		Light[][] matrix = grid.getMatrix();
		assertSquare(0, 0, 1, 1, 2, matrix);
	}

	private void assertSquare(int originX, int originY, int destX, int destY, int brightness, Light[][] matrix) {
		for (int i = originX; i <= destX; i++) {
    		for (int j = originY; j <= destY; j++) {
				assertEquals(brightness, matrix[i][j].getBrightness());
			}
		}
	}
	
	private void checkRow(int row, int width, int expectedBrightness, Light[][] matrix) {
		for (int i = 0; i < width; i++ ) {
			assertEquals(expectedBrightness, matrix[row][i].getBrightness());
		}
	}
}
