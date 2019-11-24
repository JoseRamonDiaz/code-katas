package com.jrda.design_patterns.factory_method;

public class Ship implements Transport {
    @Override
    public String delivery() {
        return "Sea delivery";
    }
}
