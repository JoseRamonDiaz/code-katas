package com.jrda.kata_log.banking;

public class WithdrawException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public WithdrawException(String msg) {
		super(msg);
	}
}
