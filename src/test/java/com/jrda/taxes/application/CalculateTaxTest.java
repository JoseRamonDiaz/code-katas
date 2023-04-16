package com.jrda.taxes.application;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.jrda.taxes.domain.GettingTableException;
import com.jrda.taxes.infrastructure.CSVTaxTableService;

public class CalculateTaxTest {
	@Test
	public void testCalculateTax() throws GettingTableException {
		CalculateTax ct = new CalculateTax(new CSVTaxTableService());
		assertEquals(Double.valueOf(96d), ct.calculate(5000d), 0.001);
		assertEquals(Double.valueOf(165.47d), ct.calculate(8000d), 0.001);
	}
}
