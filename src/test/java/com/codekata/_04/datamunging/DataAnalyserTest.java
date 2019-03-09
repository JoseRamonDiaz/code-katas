package com.codekata._04.datamunging;

import static org.junit.Assert.*;
import org.junit.Test;

public class DataAnalyserTest {

	@Test
	public void testMinSpread() {
		DataAnalyser dataAnalyser = new DataAnalyser();
		String expectedResult = "14";
		
		String actualResult = dataAnalyser.getMinSpread("weather.dat", 0, 1, 2);
		assertNotNull(actualResult);
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void testFootball() {
		DataAnalyser dataAnalyser = new DataAnalyser();
		String expectedResult = "Aston_Villa";
		
		String actualResult = dataAnalyser.getMinSpread("football.dat", 1, 6, 8);
		assertNotNull(actualResult);
		assertEquals(expectedResult, actualResult);
	}
}
