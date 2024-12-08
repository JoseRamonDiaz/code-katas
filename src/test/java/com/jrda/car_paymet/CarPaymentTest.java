package com.jrda.car_paymet;

import org.junit.Test;

import com.jrda.car_payment.CarPayment;

public class CarPaymentTest {
	
	@Test
	public void test() throws InterruptedException {
		CarPayment carPayment = new CarPayment();
		carPayment.paymentTable(100_000, 12, 8_884.88);
	}
	
	@Test
	public void testMonthPayment() {
		CarPayment carPayment = new CarPayment();
		carPayment.monthPayment(100_000, 12, 12);
	}

	@Test
	public void testMonthPayment2() {
		CarPayment carPayment = new CarPayment();
		carPayment.monthPayment2(100_000, 12, 12);
	}

	
	@Test
	public void testPay() {
		CarPayment carPayment = new CarPayment();
		carPayment.pay(1000, 12, 100);
	}
}
