package com.jrda.kata_log.banking;

import java.util.Formatter;
import java.util.List;

public class StatementFormatter {

	public String format(List<Transaction> statement) {
		StringBuilder sb = new StringBuilder();
		
		try(Formatter formatter = new Formatter(sb)) {
			addHeader(formatter);
			for (Transaction t : statement) {
				formatter.format("%-30s%-15s%-15s%n", t.getDate(), t.getOperation(), t.getAmmount());
			}
		}
		
		return sb.toString();
	}

	private void addHeader(Formatter formatter) {
		formatter.format("%-30s%-15s%-15s%n", "Date", "Operation", "Ammount");
	}

}
