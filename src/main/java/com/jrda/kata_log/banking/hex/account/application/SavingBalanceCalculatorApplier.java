package com.jrda.kata_log.banking.hex.account.application;

public class SavingBalanceCalculatorApplier extends BalanceCalculatorApplier {
    @Override
    protected BalanceCalculator createBalanceCalculator() {
        return new SavingBalanceCalculator();
    }
}
