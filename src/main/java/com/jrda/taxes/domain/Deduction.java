package com.jrda.taxes.domain;

import java.text.DecimalFormat;
import java.util.Objects;

public class Deduction {
	private final Double taxWithoutDeduction;
	private final Double taxWithDeduction;

	public Deduction(Double taxWithoutDeduction, Double taxWithDeduction) {
		this.taxWithoutDeduction = taxWithoutDeduction;
		this.taxWithDeduction = taxWithDeduction;
	}

	public Double getTaxWithoutDeduction() {
		return taxWithoutDeduction;
	}

	public Double getTaxWithDeduction() {
		return taxWithDeduction;
	}

	@Override
	public String toString() {
		DecimalFormat formatter = new DecimalFormat("#,###.00");
		return "Deduction [taxWithoutDeduction=" + formatter.format(taxWithoutDeduction) + ", taxWithDeduction="
				+ formatter.format(taxWithDeduction) + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(taxWithDeduction, taxWithoutDeduction);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Deduction other = (Deduction) obj;
		Double delta = 0.01;
		return Math.abs(taxWithDeduction - other.taxWithDeduction) <= delta
				&& Math.abs(taxWithoutDeduction - other.taxWithoutDeduction) <= delta;
	}

}
