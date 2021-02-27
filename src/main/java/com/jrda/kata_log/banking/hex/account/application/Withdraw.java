package com.jrda.kata_log.banking.hex.account.application;

import com.jrda.kata_log.banking.hex.account.domain.Account;
import com.jrda.kata_log.banking.hex.account.domain.AccountRepository;
import com.jrda.kata_log.banking.hex.account.domain.WithdrawException;
import com.jrda.kata_log.banking.hex.transaction.domain.Transaction;

import java.util.Date;

public class Withdraw {
    public Withdraw(int amount, int accountId, AccountRepository accountRepository) throws WithdrawException {
        Account account = accountRepository.getById(accountId);

        if (account.getBalance() < amount)
            throw new WithdrawException("Not enought founds");

        account.setBalance(account.getBalance() - amount);
        account.addTransaction(new Transaction(new Date(), "-", amount, account.getBalance()));
    }
}
