package com.jrda.kata_log.banking.hex.account.application;

import com.jrda.kata_log.banking.hex.account.domain.AccountRepository;

public class AccountCreator {
	private AccountRepository accountRepository;

	public AccountCreator(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}

	public int create() {
		return accountRepository.createAccount();
	}

}
