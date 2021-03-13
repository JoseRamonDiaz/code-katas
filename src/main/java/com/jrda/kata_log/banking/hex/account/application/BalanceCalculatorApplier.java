package com.jrda.kata_log.banking.hex.account.application;

import com.jrda.kata_log.banking.hex.account.domain.Account;

public abstract class BalanceCalculatorApplier {
    public void recalculate(Account account) {
        BalanceCalculator balanceCalculator = createBalanceCalculator();
        balanceCalculator.calculate(account);
    }

    protected abstract BalanceCalculator createBalanceCalculator();
}
