package com.jrda.design_patterns.factory_method;

public class SeaLogistic extends Logistic{
    @Override
    protected Transport createTransport() {
        return new Ship();
    }
}
