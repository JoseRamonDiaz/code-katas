package com.jrda.taxes.domain;

public class DeductionRequest {
	private final Double toDeduce;
	private final Double cappedPercetage;
	
	public DeductionRequest(Double toDeduce, Double cappedPercetage) {
		this.toDeduce = toDeduce;
		this.cappedPercetage = cappedPercetage;
	}

	public Double getToDeduce() {
		return toDeduce;
	}

	public Double getCappedPercetage() {
		return cappedPercetage;
	}
	
	public Double getValidValueToDeduce(Double income) {
		if (toDeduce <= income * (cappedPercetage/100))
			return toDeduce;
		
		return income * (cappedPercetage/100);
	}
}
