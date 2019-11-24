package com.jrda.design_patterns.factory_method;

public class Truck implements Transport {
    @Override
    public String delivery() {
        return "Road delivery";
    }
}
