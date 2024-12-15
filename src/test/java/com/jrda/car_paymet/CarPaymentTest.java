package com.jrda.car_paymet;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.jrda.car_payment.CarPayment;

public class CarPaymentTest {
	
	@Test
	public void testPaymentTable() {
		CarPayment carPayment = new CarPayment();
		carPayment.paymentTable(100_000, 12, 8_884.88);
	}
	
	@Test
	public void testMonthPayment() {
		CarPayment carPayment = new CarPayment();
		double payment = carPayment.monthPayment(100_000, 12, 12);
		assertEquals(8884.88, payment, 0.01);
		printMonthPayment(payment);
	}

	@Test
	public void testMonthPayment2() {
		CarPayment carPayment = new CarPayment();
		double payment = carPayment.monthPayment(100_000, 12, 12);
		assertEquals(8884.88, payment, 0.01);
		printMonthPayment(payment);
	}

	
	@Test
	public void testPay() {
		CarPayment carPayment = new CarPayment();
		carPayment.pay(1000, 12, 100);
	}
	
	@Test
	public void testMonthPaymentTable() {
		CarPayment carPayment = new CarPayment();
		carPayment.monthPaymentTable(100_000, 12, 8_884.88);
	}
	
	private void printMonthPayment(double montlyPayment) {
		System.out.printf("You will pay per month: %.2f\n", montlyPayment);
	}
}
