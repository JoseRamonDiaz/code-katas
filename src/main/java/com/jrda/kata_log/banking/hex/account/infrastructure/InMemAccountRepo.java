package com.jrda.kata_log.banking.hex.account.infrastructure;

import java.util.HashMap;
import java.util.Map;

import com.jrda.kata_log.banking.hex.account.domain.Account;
import com.jrda.kata_log.banking.hex.account.domain.AccountRepository;

public class InMemAccountRepo implements AccountRepository {
	private int counter = 0;
	
	private Map<Integer, Account> accounts = new HashMap<>();

	@Override
	public Account getById(int id) {
		return accounts.get(id).clone();
	}

	@Override
	public int createAccount() {
		accounts.put(counter, new Account(0));
		counter++;
		return counter - 1;
	}

	@Override
	public int save(Account account) {
		accounts.put(account.getId(), account);
		return account.getId();
	}
	
}
