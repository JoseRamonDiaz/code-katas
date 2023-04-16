package com.jrda.taxes.domain;

public interface TaxTableService {
	String[][] getTaxTable() throws GettingTableException;
}
