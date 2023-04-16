package com.jrda.taxes.domain;

public class GettingTableException extends Exception {

	private static final long serialVersionUID = 1L;

	public GettingTableException() {
	}

	public GettingTableException(String message) {
		super(message);
	}

	public GettingTableException(Throwable cause) {
		super(cause);
	}

	public GettingTableException(String message, Throwable cause) {
		super(message, cause);
	}

	public GettingTableException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
