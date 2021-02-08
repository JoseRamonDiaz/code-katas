package com.jrda.kata_log.banking.hex.account.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Date;

import org.junit.Test;

import com.jrda.kata_log.banking.hex.transaction.domain.Transaction;

public class AccountTest {
	@Test
	public void testCreateAcount() {
		Account account = new Account(0);
		assertEquals(0, account.getBalance());
		account.setBalance(500);
		assertEquals(500, account.getBalance());
		
		assertNotNull(account.getStatement());
		assertTrue(account.getStatement().isEmpty());
		
		Transaction t = new Transaction(new Date(), "+", 500, 1000);
		account.addTransaction(t);
		assertFalse(account.getStatement().isEmpty());
		assertEquals(t, account.getStatement().get(0));
	}
	
	@Test
	public void testClone() {
		Account account = new Account(0);
		account.setBalance(1000);
		Transaction t = new Transaction(new Date(), "+", 500, 1000);
		account.addTransaction(t);
		
	 	Account clonedAccount =  account.clone();
	 	assertNotNull(clonedAccount);
	 	assertEquals(1000, clonedAccount.getBalance());
	 	assertEquals(clonedAccount.getStatement(), account.getStatement());
	 	
	 	clonedAccount.setBalance(1100);
	 	assertNotEquals(clonedAccount.getBalance(), account.getBalance());
	 	
	 	clonedAccount.addTransaction(new Transaction(new Date(), "+", 100, 1100));
	 	assertNotEquals(clonedAccount.getStatement(), account.getStatement());
	}
	
	@Test
	public void testSetId() {
		Account account = new Account(0);
		assertEquals(0, account.getId());
		
		Account account2 = new Account(2);
		assertEquals(2, account2.getId());
	}
}
