package com.codekata._04.datamunging;

import static org.junit.Assert.*;
import org.junit.Test;

public class MatrixCreatorTest {

	@Test
	public void testMatrix() {
		String weatherFilePath = "weather.dat";
		String footFilePath = "football.dat";
		
		assertMatrix(weatherFilePath, 33, 17); 
		assertMatrix(footFilePath, 22, 8);
	}
	
	private void assertMatrix(String filePath,int numberOfRows,int numberOfColumns) {
		MatrixCreator mc = new MatrixCreator(filePath);
		
		assertNotNull(mc.getMatrix());
		assertEquals(numberOfRows, mc.getRowsLength());
		assertEquals(numberOfColumns, mc.getColumnsLength());
	}
	
}
