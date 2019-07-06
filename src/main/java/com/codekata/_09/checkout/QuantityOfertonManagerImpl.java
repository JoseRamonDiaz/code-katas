package com.codekata._09.checkout;

import java.util.HashMap;
import java.util.Map;

public class QuantityOfertonManagerImpl implements QuantityOfertonManager{

    @Override
    public Map<Character, Integer> getQuantityOfertones() {
        Map<Character, Integer> quantityOfertonList = new HashMap<>();

        quantityOfertonList.put('a', 3);
        quantityOfertonList.put('b', 2);

        return quantityOfertonList;
    }
}
