package com.jrda.kata_log.banking.hex.account.application;

import com.jrda.kata_log.banking.hex.account.domain.Account;

public class SavingBalanceCalculator implements BalanceCalculator {
    @Override
    public void calculate(Account account) {
        //minimum account
        //recent movements
        //apply charges if necessary
        System.out.println("Re-calculating balance for saving account");
    }
}
