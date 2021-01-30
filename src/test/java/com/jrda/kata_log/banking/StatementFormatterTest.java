package com.jrda.kata_log.banking;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.Mockito;

public class StatementFormatterTest {
	@Test
	public void testStatementFormatter() throws WithdrawException {
		Account account = new Account();
		TimeService timeService = Mockito.mock(TimeService.class);
		when(timeService.getDate()).thenReturn("2021-01-30 05:41:58.178", "2021-01-30 05:48:13.934",
				"2021-01-30 06:10:57.576", "2021-01-30 07:48:13.934");
		account.setTimeService(timeService);

		account.deposit(500);
		account.deposit(50);
		account.withdraw(100);
		account.withdraw(25);

		StatementFormatter statementFormatter = new StatementFormatter();
		String formatedStatementString = statementFormatter.format(account.getStatement());
		String expectedStrStatement = "Date                          Operation      Ammount        \n"
				+ "2021-01-30 05:41:58.178       +500           500            \n"
				+ "2021-01-30 05:48:13.934       +50            550            \n"
				+ "2021-01-30 06:10:57.576       -100           450            \n"
				+ "2021-01-30 07:48:13.934       -25            425            \n";
		assertEquals(expectedStrStatement, formatedStatementString);
	}
}
