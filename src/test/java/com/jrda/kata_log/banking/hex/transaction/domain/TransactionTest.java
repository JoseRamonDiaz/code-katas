package com.jrda.kata_log.banking.hex.transaction.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.util.Date;

import org.junit.Test;

public class TransactionTest {
	@Test
	public void testCreateTransaction() throws InterruptedException {
		long dateLong = new Date().getTime();
		Transaction transaction = new Transaction(new Date(dateLong), "+", 500, 1500);
		assertNotNull(transaction.getDate());
		assertEquals(new Date(dateLong), transaction.getDate());
		
		assertNotNull(transaction.getOperation());
		assertFalse(transaction.getOperation().isEmpty());
		assertEquals("+", transaction.getOperation());
		
		assertEquals(500, transaction.getAmount());
		assertEquals(1500, transaction.getBalance());
		
		Thread.sleep(10);
		long dateLong2 = new Date().getTime();
		Transaction transaction2 = new Transaction(new Date(dateLong2), "-", 50, 560);
		assertEquals("-", transaction2.getOperation());
		assertEquals(50, transaction2.getAmount());
		assertEquals(560, transaction2.getBalance());
	}
}
