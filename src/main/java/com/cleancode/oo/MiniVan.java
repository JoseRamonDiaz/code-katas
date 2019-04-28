package com.cleancode.oo;

public class MiniVan implements Vehicle {

	@Override
	public void accelerate() {
		System.out.println("Accelerating...");
	}

	@Override
	public void breaks() {
		System.out.println("Breaking...");
	}

	@Override
	public void carryPeople(int numOfPersons) {
		int maxCapacity = 7;
		if (numOfPersons > maxCapacity) {
			System.out.println("Can't carry that people");
		} else {
			System.out.println("Carrying people");
		}
	}

}
