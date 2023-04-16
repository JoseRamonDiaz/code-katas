package com.jrda.taxes.infrastructure;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.jrda.taxes.domain.GettingTableException;

public class CSVTaxTableServiceTest {
	@Test
	public void testReadFromCSV() throws GettingTableException {
		CSVTaxTableService ts = new CSVTaxTableService();
		String[][] entries = ts.getTaxTable();
		assertNotNull(entries);
		assertEquals("0.01", entries[0][0]);
		assertEquals("35", entries[10][3]);
	}
}
