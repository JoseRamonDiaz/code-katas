package com.jrda.kata_log.banking.hex.account.application.balance;

import com.jrda.kata_log.banking.hex.account.domain.Account;

public abstract class BalanceCalculatorApplier {
    public void recalculate(Account account) {
        BalanceCalculator balanceCalculator = createBalanceCalculator();
        balanceCalculator.calculate(account);
    }

    //factory method pattern
    protected abstract BalanceCalculator createBalanceCalculator();
}
