package com.codekata._09.checkout;

import java.util.Map;

public class QuantityOfertonList {
	Map<Character, Integer> quantityOfertonList;
	Map<Character, Double> priceoffList;
	
	public QuantityOfertonList() {
		quantityOfertonList = new QuantityOfertonManagerImpl().getQuantityOfertones();
		priceoffList = new PriceOffManagerImpl().getPriceOffList();
	}
	
	public Integer getQuantityToPriceOff(Character product) {
		return quantityOfertonList.get(product);
	}
	
	public Double getPriceOff(Character product) {
		return priceoffList.get(product);
	}
}
