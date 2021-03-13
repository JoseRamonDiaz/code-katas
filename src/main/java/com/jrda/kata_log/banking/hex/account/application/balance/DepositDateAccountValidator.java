package com.jrda.kata_log.banking.hex.account.application.balance;

import com.jrda.kata_log.banking.hex.account.domain.Account;

import java.time.ZonedDateTime;

public class DepositDateAccountValidator implements AccountValidator {
    private AccountValidator nextAccountValidator;

    @Override
    public void setNextValidator(AccountValidator accountValidator) {
        this.nextAccountValidator = accountValidator;
    }

    @Override
    public boolean validate(Account account) {
        if (lastDepositIsOlderThan30Days(account))
            return true;
        else
            return nextAccountValidator != null && nextAccountValidator.validate(account);
    }

    private boolean lastDepositIsOlderThan30Days(Account account) {
        ZonedDateTime now = ZonedDateTime.now();
        ZonedDateTime thirtyDaysAgo = now.plusDays(-30);

        return account.getStatement().get(account.getStatement().size() - 1).getDate().toInstant().isBefore(thirtyDaysAgo.toInstant());
    }
}
