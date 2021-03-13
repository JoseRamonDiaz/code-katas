package com.jrda.kata_log.banking.hex.account.application.balance;

import com.jrda.kata_log.banking.hex.account.domain.Account;
import com.jrda.kata_log.banking.hex.account.domain.AccountRepository;
import com.jrda.kata_log.banking.hex.account.domain.AccountType;

import java.util.ArrayList;
import java.util.List;

/**
 * Run every day looking for accounts that needs to recalculate its balance
 */
public class ScheduledBalanceAdjuster {
    private final AccountRepository accountRepository;
    private BalanceCalculatorApplier balanceCalculatorApplier;
    private List<Account> toBeBalanceRecalculated;

    public ScheduledBalanceAdjuster(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
        toBeBalanceRecalculated = new ArrayList<>();
    }

    public void start() {
        toBeBalanceRecalculated = accountRepository.getAccountsToRecalculateBalance();
        toBeBalanceRecalculated.forEach(this::reCalculateBalance);
    }

    private void reCalculateBalance(Account account) {
        if (account.getAccountType().equals(AccountType.SAVING))
            balanceCalculatorApplier = new SavingBalanceCalculatorApplier();

        if (account.getAccountType().equals(AccountType.INVESTMENT))
            balanceCalculatorApplier = new InvestmentBalanceCalculatorApplier();

        balanceCalculatorApplier.recalculate(account);
    }
}
