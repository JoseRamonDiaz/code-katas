package com.jrda.kata_log.banking.hex.account.application;

import java.util.Formatter;
import java.util.List;

import com.jrda.kata_log.banking.hex.account.domain.AccountRepository;
import com.jrda.kata_log.banking.hex.transaction.domain.Transaction;

public class Reporter {
	private AccountRepository accountRepository;
	
	public Reporter(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}

	public String report(int id) {
		return format(accountRepository.getById(id).getStatement());
	}

	private String format(List<Transaction> statement) {
		StringBuilder sb = new StringBuilder();
		
		try(Formatter formatter = new Formatter(sb)) {
			addHeader(formatter);
			for (Transaction t : statement) {
				formatter.format("%-30s%s%-15s%-15s%n", t.getDate(), t.getOperation(), t.getAmount(), t.getBalance());
			}
		}
		
		return sb.toString();
	}

	private void addHeader(Formatter formatter) {
		formatter.format("%-30s%-15s%-15s%n", "Date", "Operation", "Ammount");
	}
}
