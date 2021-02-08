package com.jrda.kata_log.banking.hex.account.application;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.util.Date;

import org.junit.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

import com.jrda.kata_log.banking.hex.account.domain.Account;
import com.jrda.kata_log.banking.hex.account.domain.AccountRepository;
import com.jrda.kata_log.banking.hex.transaction.domain.Transaction;

public class ReporterTest {
	@Test
	public void testReport() {
		Account account = new Account(0);
		long time0 = 1612623238887l;
		long time1 = 1612623257606l;
		account.addTransaction(new Transaction(new Date(time0), "+", 100, 100));
		account.addTransaction(new Transaction(new Date(time1), "+", 500, 600));
		account.setBalance(600);
		
		AccountRepository accountRepository = Mockito.mock(AccountRepository.class);
		when(accountRepository.getById(0)).thenReturn(account);
		
		Reporter reporter = new Reporter(accountRepository);
		String reportString = reporter.report(0);
		assertNotNull(reportString);
		assertFalse(reportString.isEmpty());
		
		System.out.println(reportString);
		
		assertEquals("Date                          Operation      Ammount        \n"
				+ "Sat Feb 06 08:53:58 CST 2021  +100            100            \n"
				+ "Sat Feb 06 08:54:17 CST 2021  +500            600            \n", reportString);
	}
}
