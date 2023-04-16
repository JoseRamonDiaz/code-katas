package com.jrda.taxes.application;

import java.util.NavigableMap;
import java.util.TreeMap;

import com.jrda.taxes.domain.GettingTableException;
import com.jrda.taxes.domain.Tax;
import com.jrda.taxes.domain.TaxTableService;

public class CalculateTax {
	private TaxTableService taxTableService;
	private NavigableMap<Double, Tax> taxMap;
	
	public CalculateTax(TaxTableService taxTableService) throws GettingTableException {
		this.taxTableService = taxTableService;
		taxMap = createMap();
	}
	
	public Double calculate(Double income) {
		Tax t = taxMap.floorEntry(income).getValue();
		Double excedentFee = (income - t.getLowerBound()) * (t.getOffset()/100);
		
		return t.getFixedFee() + excedentFee;
	}
	
	private NavigableMap<Double, Tax> createMap() throws GettingTableException {
		NavigableMap<Double, Tax> m = new TreeMap<>();
		
		String[][] taxTable = taxTableService.getTaxTable();
		
		for (int i = 0; i < taxTable.length; i++) {
			Tax tax = new Tax(taxTable[i]);
			m.put(tax.getLowerBound(), tax);
		}
		
		return m;
	}

}
