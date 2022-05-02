package com.jrda.price.comparator.application;

import com.jrda.price.comparator.domain.Product;
import com.jrda.price.comparator.domain.ProductCollection;

public class AddProduct {
    public void addProduct(double price, double quantity) {
        ProductCollection.getInstance().addProduct(new Product(price, quantity));
    }

    public void addProduct(Product p) {
        ProductCollection.getInstance().addProduct(p);
    }

}
