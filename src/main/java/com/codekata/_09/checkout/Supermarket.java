package com.codekata._09.checkout;

import java.util.HashMap;
import java.util.Map;

public class Supermarket {
	Map<Character, Double> priceList = new HashMap<>();
	
	public Supermarket() {
		priceList.put('a', 0.50);
		priceList.put('b', 0.30);
		priceList.put('c', 0.20);
		priceList.put('d', 0.15);
	}
	
	public double price(String products) {
		Oferton oferton = new QuantityOferton();
		Double totalPrice = 0d;
		Double priceOff = 0d;
		
		for(Character c : products.toCharArray()) {
			totalPrice += priceList.get(c);
			priceOff += oferton.getPriceOff(c);
		}
		
		return totalPrice - priceOff;
	}
	
}
