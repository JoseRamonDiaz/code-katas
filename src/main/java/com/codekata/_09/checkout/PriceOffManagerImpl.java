package com.codekata._09.checkout;

import java.util.HashMap;
import java.util.Map;

public class PriceOffManagerImpl implements PriceOffManager{
    @Override
    public Map<Character, Double> getPriceOffList() {
        Map<Character, Double> priceoffList = new HashMap<>();
        priceoffList.put('a', 0.20);
        priceoffList.put('b', 0.15);
        return priceoffList;
    }
}
