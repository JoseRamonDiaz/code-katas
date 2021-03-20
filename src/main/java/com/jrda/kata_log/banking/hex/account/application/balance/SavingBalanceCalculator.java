package com.jrda.kata_log.banking.hex.account.application.balance;

import com.jrda.kata_log.banking.hex.account.application.balance.charge_validators.AccountValidator;
import com.jrda.kata_log.banking.hex.account.application.balance.charge_validators.AmountAccountValidator;
import com.jrda.kata_log.banking.hex.account.application.balance.charge_validators.DepositDateAccountValidator;
import com.jrda.kata_log.banking.hex.account.domain.Account;
import com.jrda.kata_log.banking.hex.transaction.domain.Transaction;

import java.util.Date;

public class SavingBalanceCalculator implements BalanceCalculator {

    @Override
    public void calculate(Account account) {
        AccountValidator accountValidator = createValidatorsChain(account);

        if (accountValidator.validate(account))
            applyCharges(account);
    }

    private void applyCharges(Account account) {
        int ACCOUNT_MANAGEMENT_COST = 1;
        account.setBalance(account.getBalance() - ACCOUNT_MANAGEMENT_COST);
        Transaction transaction = new Transaction(new Date(), "-", ACCOUNT_MANAGEMENT_COST, account.getBalance());
        account.addTransaction(transaction);
    }

    private AccountValidator createValidatorsChain(Account account) {
        AccountValidator amountAccountValidator = new AmountAccountValidator();
        AccountValidator depositDateAccountValidator = new DepositDateAccountValidator();
        amountAccountValidator.validate(account);
        amountAccountValidator.setNextValidator(depositDateAccountValidator);

        return amountAccountValidator;
    }
}
