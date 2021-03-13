package com.jrda.kata_log.banking.hex.account.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.jrda.kata_log.banking.hex.transaction.domain.Transaction;

public class Account {
	private int balance;
	private List<Transaction> statement = new ArrayList<>();
	private String id;
	private AccountType accountType;
	
	public Account(AccountType accountType) {
		this.accountType = accountType;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public List<Transaction> getStatement() {
		return statement;
	}

	public void addTransaction(Transaction transaction) {
		statement.add(transaction);
	}

	@Override
	public Account clone() {
		Account clonedAccount = new Account(this.accountType);
		clonedAccount.setBalance(this.balance);
		clonedAccount.statement = this.statement.stream().collect(Collectors.toList());
		return clonedAccount;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}
}
