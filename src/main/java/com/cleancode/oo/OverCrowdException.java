package com.cleancode.oo;

public class OverCrowdException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public OverCrowdException(String message) {
		super(message);
	}
}
