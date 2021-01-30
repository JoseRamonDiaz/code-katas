package com.jrda.kata_log.banking;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private int balance = 0;
    private List<Transaction> statement = new ArrayList<>();
    private TimeService timeService = new DateTime();

    public void deposit(int ammount) {
        balance += ammount;
        statement.add(new Transaction(timeService.getDate(), "+" + ammount, "" + balance));
    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(int ammount) throws WithdrawException {
        if (balance < ammount)
            throw new WithdrawException("Can not withdraw more than you have in your account!");

        balance -= ammount;
        statement.add(new Transaction(timeService.getDate(), "-" + ammount, "" + balance));
    }

    public List<Transaction> getStatement() {
    	return statement;
    }

	protected void setTimeService(TimeService timeService) {
		this.timeService = timeService;
	}
}
