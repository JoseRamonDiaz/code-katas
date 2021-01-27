package com.jrda.kata_log.banking;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class AccountTest {
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
    
    @Rule
    public ExpectedException expectedEx = ExpectedException.none();
    
    @Test
    public void testWithdrawBalanceInZero() throws WithdrawException {
    	expectedEx.expect(WithdrawException.class);
        expectedEx.expectMessage("Can not withdraw more than you have in your account!");
        
    	account.withdraw(1);
    }
    
}
