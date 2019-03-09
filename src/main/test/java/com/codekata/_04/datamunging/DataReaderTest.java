package com.codekata._04.datamunging;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DataReaderTest {
	private DataReader dataReader = new DataReader();
	
	@Test
	public void testNumberOfLines() {
		assertEquals(31, dataReader.getNumberOfLines());
	}

}
