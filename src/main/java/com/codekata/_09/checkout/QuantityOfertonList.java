package com.codekata._09.checkout;

import java.util.HashMap;
import java.util.Map;

public class QuantityOfertonList {
	Map<Character, Integer> quantityOfertonList;
	Map<Character, Double> priceoffList;
	
	public QuantityOfertonList() {
		quantityOfertonList = new HashMap<>();
		quantityOfertonList.put('a', 3);
		quantityOfertonList.put('b', 2);
		
		priceoffList = new HashMap<>();
		priceoffList.put('a', 0.20);
		priceoffList.put('b', 0.15);
	}
	
	public Integer getQuantityToPriceOff(Character product) {
		return quantityOfertonList.get(product);
	}
	
	public Double getPriceOff(Character product) {
		return priceoffList.get(product);
	}
}
