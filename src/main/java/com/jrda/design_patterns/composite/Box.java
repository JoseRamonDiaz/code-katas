package com.jrda.design_patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Box implements Product {
    private List<Product> productList;
    private double price;

    public Box(List<Product> productList, Double price) {
        this.productList = productList;
        this.price = price;
    }

    public void addProduct(Product p) throws Exception {
        //if the new product to add is this object, we should throw an exception
        if(this == p) {
            throw new Exception("We can't create a circular reference");
        }

        if (productList == null) {
            productList = new ArrayList<>();
        }
        productList.add(p);
    }

    public void removeProduct(Product p) {
        if (productList == null) {
            return;
        }

        productList.remove(p);
    }

    @Override
    public Double getPrice() {
        return price + productList.stream().mapToDouble(p -> p.getPrice()).sum();
    }
}
