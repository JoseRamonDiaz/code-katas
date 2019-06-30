package com.codekata._09.checkout;

import java.util.HashMap;
import java.util.Map;

public class QuantityOferton implements Oferton {
	Map<Character, Integer> productQuantity = new HashMap<>();
	QuantityOfertonList qol;
	
	public QuantityOferton() {
		qol = new QuantityOfertonList();
		productQuantity.put('a', 0);
		productQuantity.put('b', 0);
		productQuantity.put('c', 0);
		productQuantity.put('d', 0);
	}

	@Override
	public double getPriceOff(Character c) {
		
		Integer quantity = productQuantity.get(c);
		productQuantity.put(c, quantity + 1);
		
		if(productQuantity.get(c) == qol.getQuantityToPriceOff(c)) {
			productQuantity.put(c, 0);
			return qol.getPriceOff(c);
		}
		
		return 0;
	}

}
