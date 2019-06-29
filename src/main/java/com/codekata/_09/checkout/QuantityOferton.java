package com.codekata._09.checkout;

import java.util.HashMap;
import java.util.Map;

public class QuantityOferton implements Oferton {
	Map<Character, Integer> productQuantity = new HashMap<>();
	
	public QuantityOferton() {
		productQuantity.put('a', 0);
		productQuantity.put('b', 0);
		productQuantity.put('c', 0);
		productQuantity.put('d', 0);
	}

	@Override
	public double getPriceOff(Character c) {
		
		Integer quantity = productQuantity.get(c);
		productQuantity.put(c, quantity + 1);
		
		
		if(productQuantity.get('a') == 3) {
			productQuantity.put('a', 0);
			return 0.20;
		}
		
		if(productQuantity.get('b') == 2) {
			productQuantity.put('b', 0);
			return 0.15;
		}
		
		return 0;
	}

}
