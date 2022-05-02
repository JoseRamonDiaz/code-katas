package com.jrda.price.comparator.domain;

import java.util.Set;
import java.util.TreeSet;

public class ProductCollection {
    private final Set<Product> productList;
    private static ProductCollection productCollection;

    private ProductCollection() {
        productList = new TreeSet<>();
    }

    public static ProductCollection getInstance() {
        if (productCollection == null)
            productCollection = new ProductCollection();

        return productCollection;
    }

    public void addProduct(Product p) {
        productList.add(p);
    }

    public Set<Product> getProductList() {
        return productList;
    }
}
