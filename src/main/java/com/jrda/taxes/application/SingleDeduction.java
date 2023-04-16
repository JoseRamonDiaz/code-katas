package com.jrda.taxes.application;

import com.jrda.taxes.domain.Deduction;
import com.jrda.taxes.domain.DeductionRequest;

public class SingleDeduction {
	private CalculateTax calTax;
	
	public SingleDeduction(CalculateTax calTax) {
		this.calTax = calTax;
	}
	
	public Deduction calculate(Double income, DeductionRequest dr) {
		Double taxWithoutDeduction = calTax.calculate(income);
		Double taxWithDeduction = calTax.calculate(income - dr.getValidValueToDeduce(income));
		
		return new Deduction(taxWithoutDeduction, taxWithDeduction);
	}
}
