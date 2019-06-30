package com.codekata._09.checkout;

import java.util.HashMap;
import java.util.Map;

public class PriceList {
	Map<Character, Double> priceList;
	
	public PriceList() {
		priceList = new HashMap<>();
		
		priceList.put('a', 0.50);
		priceList.put('b', 0.30);
		priceList.put('c', 0.20);
		priceList.put('d', 0.15);
	}
	
	public Double getPrice(Character product) {
		return priceList.get(product);
	}

}
