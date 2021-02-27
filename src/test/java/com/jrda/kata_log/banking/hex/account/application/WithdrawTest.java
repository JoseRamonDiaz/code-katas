package com.jrda.kata_log.banking.hex.account.application;

import com.jrda.kata_log.banking.hex.account.domain.Account;
import com.jrda.kata_log.banking.hex.account.domain.AccountRepository;
import com.jrda.kata_log.banking.hex.account.domain.WithdrawException;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

public class WithdrawTest {
    @Test
    public void testWithdraw() throws WithdrawException, InterruptedException {
        Date startDate = new Date();
        Thread.sleep(1);
        AccountRepository accountRepository = Mockito.mock(AccountRepository.class);
        Account account = new Account(0);
        when(accountRepository.getById(0)).thenReturn(account);

        new Deposit(50, 0, accountRepository);

        new Withdraw(10, 0, accountRepository);
        assertEquals(40, account.getBalance());
        assertEquals(2, account.getStatement().size());
        assertEquals("-", account.getStatement().get(1).getOperation());
        assertEquals(10, account.getStatement().get(1).getAmount());
        assertEquals(40, account.getStatement().get(1).getBalance());

        Thread.sleep(1);

        Date endDate = new Date();
        assertTrue(account.getStatement().get(1).getDate().compareTo(startDate) > 0);
        assertTrue(account.getStatement().get(1).getDate().compareTo(endDate) < 0);

        new Withdraw(20, 0, accountRepository);
        assertEquals(20, account.getBalance());
    }

    @Test (expected = WithdrawException.class)
    public void testWithdrawWithoutFounds() throws WithdrawException {
        AccountRepository accountRepository = Mockito.mock(AccountRepository.class);
        Account account = new Account(0);
        when(accountRepository.getById(0)).thenReturn(account);

        new Withdraw(10, 0, accountRepository);
    }
}
