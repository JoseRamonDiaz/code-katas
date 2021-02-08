package com.jrda.kata_log.banking.hex.account.application;

import java.util.Date;

import com.jrda.kata_log.banking.hex.account.domain.Account;
import com.jrda.kata_log.banking.hex.account.domain.AccountRepository;
import com.jrda.kata_log.banking.hex.transaction.domain.Transaction;

public class Deposit {
	public Deposit(int ammount, int accountId, AccountRepository accountRepository) {
		Account account = accountRepository.getById(accountId);
		account.setBalance(ammount + account.getBalance());
		account.addTransaction(new Transaction(new Date(), "+", ammount, account.getBalance()));
		accountRepository.save(account);
	}
}
