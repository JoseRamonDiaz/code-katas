package com.jrda.kata_log.banking.hex.account.application.balance;

import com.jrda.kata_log.banking.hex.account.domain.Account;

public class AmountAccountValidator implements AccountValidator {
    private AccountValidator nextAccountValidator;

    @Override
    public void setNextValidator(AccountValidator accountValidator) {
        this.nextAccountValidator = accountValidator;
    }

    @Override
    public boolean validate(Account account) {
        int MIN_TO_NOT_PAY = 5_000;

        if (account.getBalance() < MIN_TO_NOT_PAY)
            return true;
        else
            return nextAccountValidator != null && nextAccountValidator.validate(account);
    }
}
