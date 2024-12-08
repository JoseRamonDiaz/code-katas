package com.jrda.car_payment;

import java.text.DecimalFormat;

public class CarPayment {
	
	public void paymentTable(double amount, double interestRate, double monthPayment) throws InterruptedException {
		double debt = amount;
		double annualPayment = monthPayment * 12;
		
		while(debt > 0) {
			double yearInterest = debt * interestRate / 100;
			debt = debt - (annualPayment - yearInterest);
			DecimalFormat formato = new DecimalFormat("#,###.###");
			System.out.println("Year payment: " + formato.format(annualPayment) + ", year interest: " + formato.format(yearInterest) + ", new debt:" + formato.format(debt));
		}
		
	}
	
	public void monthPayment(double ammount, double interestRate, double monthsToPay ) {
		double tasaMensual = interestRate / 100 / 12;

        double montlyPayment = (ammount * tasaMensual * Math.pow(1 + tasaMensual, monthsToPay)) /
                              (Math.pow(1 + tasaMensual, monthsToPay) - 1);

        printMonthPayment(montlyPayment);
	}
	
	public void monthPayment2(double pv, double r, double n) {
		r = r / 100 / 12;
		double montlyPayment = (pv * r) / (1 - Math.pow((1 + r), -n));
		printMonthPayment(montlyPayment);
	}
	
	private void printMonthPayment(double montlyPayment) {
		System.out.printf("You will pay per month: %.2f\n", montlyPayment);
	}

	public void pay(double debt, double interest, double payment) {
		double montlyInterest = interest / 12;
		double interestPayment = debt * (montlyInterest / 100);
		double capitalPayment = payment - interestPayment;
		debt = debt - capitalPayment;
		
		System.out.println("Interest payment: " + interestPayment);
		System.out.println("Capital payment: " + capitalPayment);
		System.out.println("New debt: " + debt);
	}

}
