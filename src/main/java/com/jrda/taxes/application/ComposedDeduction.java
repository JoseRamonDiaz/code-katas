package com.jrda.taxes.application;

import com.jrda.taxes.domain.ComposedDeductionRequest;
import com.jrda.taxes.domain.Deduction;

public class ComposedDeduction {
	private SingleDeduction sd;
	
	public ComposedDeduction(CalculateTax calTax) {
		this.sd = new SingleDeduction(calTax);
	}
	
	public Deduction calculate(ComposedDeductionRequest cdr) {
		return sd.calculate(cdr.getAmmount(), cdr.getSumOfDeductions());
	}
	
}
