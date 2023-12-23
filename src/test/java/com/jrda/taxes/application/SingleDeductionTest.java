package com.jrda.taxes.application;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.jrda.taxes.domain.Deduction;
import com.jrda.taxes.domain.DeductionRequest;
import com.jrda.taxes.domain.GettingTableException;
import com.jrda.taxes.infrastructure.CSVTaxTableService;

public class SingleDeductionTest {
	@Test
	public void testSingleDeduction() throws GettingTableException {
		CalculateTax calTax = new CalculateTax(new CSVTaxTableService());
		SingleDeduction sd = new SingleDeduction(calTax);
		
		assertEquals(new Deduction(209033.44, 182633.44), sd.calculate(888000d, new DeductionRequest(88000d, 10d)));
	}
	
	//TODO https://leetcode.com/problems/pyramid-transition-matrix/
}
