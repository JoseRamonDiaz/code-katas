package com.jrda.kata_log.banking;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class AccountTest {
    @Rule
    public ExpectedException expectedEx = ExpectedException.none();
    private Account account;

    @Before
    public void Init() {
        account = new Account();
    }

    @Test
    public void testDeposit() {
        account.deposit(10);
        assertEquals(10, account.getBalance());

        account.deposit(15);
        assertEquals(25, account.getBalance());
    }

    @Test
    public void testWithdraw() throws WithdrawException {
        account.deposit(15);
        account.withdraw(10);
        assertEquals(5, account.getBalance());

        account.withdraw(1);
        assertEquals(4, account.getBalance());
    }

    @Test
    public void testWithdrawBalanceInZero() throws WithdrawException {
        expectedEx.expect(WithdrawException.class);
        expectedEx.expectMessage("Can not withdraw more than you have in your account!");

        account.withdraw(1);
    }

    @Test
    public void testGetStatement() throws WithdrawException {
        List<Transaction> statement = account.getStatement();
        assertNotNull(statement);
        TimeService timeService = Mockito.mock(TimeService.class);
        when(timeService.getDate()).thenReturn("2021-01-30 05:41:58.178", "2021-01-30 05:48:13.934", "2021-01-30 06:10:57.576", "2021-01-30 07:48:13.934");
        account.setTimeService(timeService);
        
        account.deposit(100);
        assertFalse(statement.isEmpty());
        assertEquals(new Transaction("2021-01-30 05:41:58.178", "+100", "100"), statement.get(0));
        
        account.deposit(50);
        assertEquals(2, account.getStatement().size());
        assertEquals(new Transaction("2021-01-30 05:48:13.934", "+50", "150"), statement.get(1));
        
        account.withdraw(75);
        assertEquals(new Transaction("2021-01-30 06:10:57.576", "-75", "75"), statement.get(2));
        
        account.withdraw(25);
        assertEquals(new Transaction("2021-01-30 07:48:13.934", "-25", "50"), statement.get(3));
    }
    
}
