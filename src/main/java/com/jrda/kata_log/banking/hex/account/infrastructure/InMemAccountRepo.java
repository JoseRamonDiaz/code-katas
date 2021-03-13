package com.jrda.kata_log.banking.hex.account.infrastructure;

import com.jrda.kata_log.banking.hex.account.domain.Account;
import com.jrda.kata_log.banking.hex.account.domain.AccountRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemAccountRepo implements AccountRepository {
	private int counter = 0;
	
	private Map<String, Account> accounts = new HashMap<>();

	@Override
	public Account getById(int id) {
		return accounts.get(id).clone();
	}

	@Override
	public int save(Account account) {
		account.setId(counter++ + "");
		accounts.put(account.getId(), account);
		return counter - 1;
	}

	@Override
	public List<Account> getAccountsToRecalculateBalance() {
		return new ArrayList<>(accounts.values());
	}

}
