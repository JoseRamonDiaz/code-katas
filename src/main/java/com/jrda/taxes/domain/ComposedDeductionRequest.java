package com.jrda.taxes.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ComposedDeductionRequest {
	private final Double amount;
	private final List<DeductionRequest> deductionRequestList;
	
	public ComposedDeductionRequest(Double amount) {
		this.amount = amount;
		this.deductionRequestList = new ArrayList<>();
	}
	
	public void addDeduction(DeductionRequest dr) {
		deductionRequestList.add(dr);
	}
	
	public DeductionRequest getSumOfDeductions() {
		return new DeductionRequest(deductionRequestList.stream().collect(Collectors.summingDouble(a -> a.getValidValueToDeduce(amount))), 100d);
	}
	
	public Double getAmmount() {
		return amount;
	}
}
