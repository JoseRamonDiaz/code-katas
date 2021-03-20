package com.jrda.kata_log.banking.hex.transaction.domain;

import java.util.Date;

public class Transaction {
	private Date date;
	private String operation;
	private int amount;
	private int balance;

	public Transaction(Date date, String operation, int amount, int balance) {
		this.date = date;
		this.operation = operation;
		this.amount = amount;
		this.balance = balance;
	}

	public Date getDate() {
		return date;
	}

	public String getOperation() {
		return operation;
	}

	public int getAmount() {
		return amount;
	}

	public int getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "Transaction{" +
				"date=" + date +
				", operation='" + operation + '\'' +
				", amount=" + amount +
				", balance=" + balance +
				'}';
	}
}
