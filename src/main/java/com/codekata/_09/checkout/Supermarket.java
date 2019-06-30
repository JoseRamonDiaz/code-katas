package com.codekata._09.checkout;

public class Supermarket {
	PriceList priceList;
	
	public Supermarket() {
		priceList = new PriceList();
	}
	
	public double price(String products) {
		Oferton oferton = new QuantityOferton();
		Double totalPrice = 0d;
		Double priceOff = 0d;
		
		for(Character c : products.toCharArray()) {
			totalPrice += priceList.getPrice(c);
			priceOff += oferton.getPriceOff(c);
		}
		
		return totalPrice - priceOff;
	}
	
}
