package com.jrda.kata_log.banking;

public class Account {
	private int balance = 0;
	
    public void deposit(int ammount) {
    	balance += ammount;
    }

    public int getBalance() {
        return balance;
    }

	public void withdraw(int ammount) throws WithdrawException {
		if (balance < ammount)
			throw new WithdrawException("Can not withdraw more than you have in your account!");
			
		balance -= ammount;
	}

	public String getStatement() {
		return "Date	Amount	Balance";
	}
}
