package com.jrda.kata_log.banking.hex.account.application.balance;

import com.jrda.kata_log.banking.hex.account.domain.Account;

public class InvestmentBalanceCalculator implements BalanceCalculator{
    @Override
    public void calculate(Account account) {
        //verify period of time for investment
        //verify there is no retirements
        //add %
        System.out.println("Re-calculating investment account balance");
    }
}
