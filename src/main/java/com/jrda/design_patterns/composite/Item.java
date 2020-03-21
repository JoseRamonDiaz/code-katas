package com.jrda.design_patterns.composite;

public class Item implements Product {
    private double price;

    public Item(double price) {
        this.price = price;
    }

    @Override
    public Double getPrice() {
        return price;
    }
}
