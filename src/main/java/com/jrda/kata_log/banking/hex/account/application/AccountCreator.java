package com.jrda.kata_log.banking.hex.account.application;

import com.jrda.kata_log.banking.hex.account.domain.Account;
import com.jrda.kata_log.banking.hex.account.domain.AccountRepository;
import com.jrda.kata_log.banking.hex.account.domain.AccountType;

public class AccountCreator {
	private AccountRepository accountRepository;

	public AccountCreator(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}

	public int createSaving() {
		Account account = new Account(AccountType.SAVING);
		return accountRepository.save(account);
	}

	public int createInvestment() {
		Account account = new Account(AccountType.INVESTMENT);
		return accountRepository.save(account);
	}
}
