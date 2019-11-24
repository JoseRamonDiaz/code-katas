package com.jrda.design_patterns.factory_method;

public class EarthLogistic extends Logistic {
    @Override
    protected Transport createTransport() {
        return new Truck();
    }
}
