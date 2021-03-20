package com.jrda.kata_log.banking.hex.account.application.balance.charge_validators;

import com.jrda.kata_log.banking.hex.account.domain.Account;

public interface AccountValidator {
    void setNextValidator(AccountValidator accountValidator);
    boolean validate(Account account);
}
