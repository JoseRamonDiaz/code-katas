package com.jrda.taxes.domain;

public class Tax {
	private double lowerBound;
	private double upperBound;
	private double fixedFee;
	private double offset;

	public Tax(String[] values) {
		lowerBound = Double.parseDouble(values[0]);
		upperBound = 0; //Double.parseDouble(values[1]);
		fixedFee = Double.parseDouble(values[2]);
		offset = Double.parseDouble(values[3]);
	}
	
	public double getLowerBound() {
		return lowerBound;
	}
	public void setLowerBound(double lowerBound) {
		this.lowerBound = lowerBound;
	}
	public double getUpperBound() {
		return upperBound;
	}
	public void setUpperBound(double upperBound) {
		this.upperBound = upperBound;
	}
	public double getFixedFee() {
		return fixedFee;
	}
	public void setFixedFee(double fixedFee) {
		this.fixedFee = fixedFee;
	}
	public double getOffset() {
		return offset;
	}
	public void setOffset(double offset) {
		this.offset = offset;
	}
}
