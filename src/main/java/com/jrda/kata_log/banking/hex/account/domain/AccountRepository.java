package com.jrda.kata_log.banking.hex.account.domain;

public interface AccountRepository {
	public Account getById(int id);
	public int createAccount();
	public int save(Account account);
}
