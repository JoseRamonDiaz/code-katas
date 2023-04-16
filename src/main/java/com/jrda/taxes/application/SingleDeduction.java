package com.jrda.taxes.application;

import com.jrda.taxes.domain.Deduction;

public class SingleDeduction {
	private CalculateTax calTax;
	
	public SingleDeduction(CalculateTax calTax) {
		this.calTax = calTax;
	}

	/*
	 * INPUT
	 * original mount
	 * how much we want to deduce
	 * percentage to be used
	 */
	
	/*
	 * OUTPUT
	 * taxes to pay without deduction
	 * taxes to pay with deduction
	 */
	
	public Deduction calculate(Double income, Double toDeduce, Double cappedPercentage) {
		Double taxWithoutDeduction = calTax.calculate(income);
		Double limitToDeduce = income*(cappedPercentage/100);
		Double taxWithDeduction = calTax.calculate(toDeduce <= limitToDeduce ? income-toDeduce : income-limitToDeduce);
		
		return new Deduction(taxWithoutDeduction, taxWithDeduction);
	}
}
