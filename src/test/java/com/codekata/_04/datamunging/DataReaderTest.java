package com.codekata._04.datamunging;

import static org.junit.Assert.*;
import org.junit.Test;

public class DataReaderTest {
	
	@Test
	public void testNumberOfLines() {
		String filePath = "weather.dat";
		DataReader dataReader = new DataReader(filePath);
		
		assertEquals(33, dataReader.getNumberOfLines());
		assertNotNull(dataReader.getLines());
	}
	
	@Test
	public void testFileName() {
		String filePath = "football.dat";
		DataReader dataReader = new DataReader(filePath);
		
		assertEquals(22, dataReader.getNumberOfLines());
		assertNotNull(dataReader.getLines());
	}
	
}
