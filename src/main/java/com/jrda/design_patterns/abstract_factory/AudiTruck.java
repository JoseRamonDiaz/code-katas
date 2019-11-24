package com.jrda.design_patterns.abstract_factory;

public class AudiTruck implements Truck {
    @Override
    public void load() {
        System.out.println("Loading on an Audi truck");
    }
}
