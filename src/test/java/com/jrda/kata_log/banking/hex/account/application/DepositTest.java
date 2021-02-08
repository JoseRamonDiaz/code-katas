package com.jrda.kata_log.banking.hex.account.application;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

import com.jrda.kata_log.banking.hex.account.domain.Account;
import com.jrda.kata_log.banking.hex.account.domain.AccountRepository;

public class DepositTest {
	@Test
	public void testWithdraw() {
		AccountRepository accountRepository = Mockito.mock(AccountRepository.class);
		Account account = new Account(0);
		when(accountRepository.getById(0)).thenReturn(account);
		
		new Deposit(50, 0, accountRepository);
		verify(accountRepository, times(1)).save(any(Account.class));
		assertEquals(50, account.getBalance());
		
		new Deposit(500, 0, accountRepository);
		assertEquals(550, account.getBalance());
		
		assertFalse(account.getStatement().isEmpty());
		assertEquals(50, account.getStatement().get(0).getBalance());
		assertEquals(50, account.getStatement().get(0).getAmount());
		assertEquals("+", account.getStatement().get(0).getOperation());
		
		assertEquals(550, account.getStatement().get(1).getBalance());
		assertEquals(500, account.getStatement().get(1).getAmount());
		assertEquals("+", account.getStatement().get(1).getOperation());
	}
}
