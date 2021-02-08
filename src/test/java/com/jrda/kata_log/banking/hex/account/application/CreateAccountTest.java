package com.jrda.kata_log.banking.hex.account.application;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

import com.jrda.kata_log.banking.hex.account.domain.Account;
import com.jrda.kata_log.banking.hex.account.domain.AccountRepository;

public class CreateAccountTest {
	@Test
	public void testCreateAccount() {
		AccountRepository accountRepository = Mockito.mock(AccountRepository.class);
		when(accountRepository.createAccount()).thenReturn(0, 1);
		Account account0 = new Account(0);
		when(accountRepository.getById(0)).thenReturn(account0);
		Account account1 = new Account(1);
		when(accountRepository.getById(1)).thenReturn(account1);
		
		AccountCreator accountCreator = new AccountCreator(accountRepository);
		assertEquals(0, accountCreator.create());
		assertEquals(1, accountCreator.create());
		assertEquals(account0, accountRepository.getById(0));
		assertEquals(account1, accountRepository.getById(1));
	}
}
