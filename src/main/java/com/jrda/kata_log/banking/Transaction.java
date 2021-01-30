package com.jrda.kata_log.banking;

public class Transaction {
	private String date;
	private String operation;
	private String ammount;

	public Transaction(String date, String operation, String ammount) {
		this.date = date;
		this.operation = operation;
		this.ammount = ammount;
	}

	public String getDate() {
		return date;
	}

	public String getOperation() {
		return operation;
	}

	public String getAmmount() {
		return ammount;
	}
}
