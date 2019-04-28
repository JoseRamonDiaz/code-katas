package com.cleancode.oo;

public class CompactCar implements Vehicle {

	@Override
	public void accelerate() {
		System.out.println("accelerating...");
	}

	@Override
	public void breaks() {
		System.out.println("breaking...");
	}

	@Override
	public void carryPeople(int numOfPersons) {
		int maxCapacity = 5;
		if(numOfPersons > maxCapacity) {
			throw new OverCrowdException("Maximum capacity maxCapacity"); 
		} else {
			System.out.println("Carrying people");
		}
	}

}
