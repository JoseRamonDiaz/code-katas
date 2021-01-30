package com.jrda.kata_log.banking;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class TransactionTest {
	private Transaction transaction;
	
	@Before
	public void init() {
		transaction = new Transaction("date", "operation", "ammount");
	}
	
	@Test
	public void testDate() {
		assertNotNull(transaction.getDate());
		assertFalse(transaction.getDate().isEmpty());
		assertEquals("date", transaction.getDate());
		
		transaction = new Transaction("other date", "+", "a");
		assertEquals("other date", transaction.getDate());
	}
	
	@Test
	public void testOperation() {
		assertNotNull(transaction.getOperation());
		assertFalse(transaction.getOperation().isEmpty());
		assertEquals("operation", transaction.getOperation());
		
		transaction = new Transaction("other date", "+", "a");
		assertEquals("+", transaction.getOperation());
	}
	
	@Test
	public void testAmmount() {
		assertNotNull(transaction.getAmmount());
		assertFalse(transaction.getAmmount().isEmpty());
		assertEquals("ammount", transaction.getAmmount());
		
		transaction = new Transaction("other date", "+", "a");
		assertEquals("a", transaction.getAmmount());
	}
}
