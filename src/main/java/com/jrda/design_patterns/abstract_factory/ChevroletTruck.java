package com.jrda.design_patterns.abstract_factory;

public class ChevroletTruck implements Truck {
    @Override
    public void load() {
        System.out.println("Loading on a chevrolet truck");
    }
}
