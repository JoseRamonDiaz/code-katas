package com.jrda.kata_log.banking;

public class Transaction {
	private String date;
	private String operation;
	private String ammount;

	public Transaction(String date, String operation, String ammount) {
		this.date = date;
		this.operation = operation;
		this.ammount = ammount;
	}

	public String getDate() {
		return date;
	}

	public String getOperation() {
		return operation;
	}

	public String getAmmount() {
		return ammount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ammount == null) ? 0 : ammount.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((operation == null) ? 0 : operation.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transaction other = (Transaction) obj;
		if (ammount == null) {
			if (other.ammount != null)
				return false;
		} else if (!ammount.equals(other.ammount))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (operation == null) {
			if (other.operation != null)
				return false;
		} else if (!operation.equals(other.operation))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Transaction [date=" + date + ", operation=" + operation + ", ammount=" + ammount + "]";
	}
	
}
