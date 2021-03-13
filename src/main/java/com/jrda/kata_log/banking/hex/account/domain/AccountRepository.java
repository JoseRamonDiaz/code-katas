package com.jrda.kata_log.banking.hex.account.domain;

import java.util.List;

public interface AccountRepository {
	Account getById(int id);
	int save(Account account);
	List<Account> getAccountsToRecalculateBalance();
}
