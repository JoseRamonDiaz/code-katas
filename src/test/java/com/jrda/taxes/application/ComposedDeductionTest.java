package com.jrda.taxes.application;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.jrda.taxes.domain.ComposedDeductionRequest;
import com.jrda.taxes.domain.Deduction;
import com.jrda.taxes.domain.DeductionRequest;
import com.jrda.taxes.domain.GettingTableException;
import com.jrda.taxes.infrastructure.CSVTaxTableService;

public class ComposedDeductionTest {
	@Test
	public void testComposedDeduction() throws GettingTableException {
		ComposedDeduction compDeduction = new ComposedDeduction(new CalculateTax(new CSVTaxTableService()));
		ComposedDeductionRequest cdr = new ComposedDeductionRequest(880000d);
		cdr.addDeduction(new DeductionRequest(88000d, 10d));
		cdr.addDeduction(new DeductionRequest(88000d, 10d));
		assertEquals(new Deduction(206633.44, 153833.44), compDeduction.calculate(cdr));
	}
}
