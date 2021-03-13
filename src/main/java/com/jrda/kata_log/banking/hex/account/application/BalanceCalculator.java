package com.jrda.kata_log.banking.hex.account.application;

import com.jrda.kata_log.banking.hex.account.domain.Account;

public interface BalanceCalculator {
    public void calculate(Account account);
}
