package com.jrda.kata_log.banking.hex.account.application;

public class InvestmentBalanceCalculatorApplier extends BalanceCalculatorApplier {
    @Override
    protected BalanceCalculator createBalanceCalculator() {
        return new InvestmentBalanceCalculator();
    }
}
