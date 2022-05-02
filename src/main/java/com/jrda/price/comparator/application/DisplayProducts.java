package com.jrda.price.comparator.application;

import com.jrda.price.comparator.domain.Product;
import com.jrda.price.comparator.domain.ProductCollection;

import java.util.Set;

public class DisplayProducts {
    public Set<Product> getProducts() {
        return ProductCollection.getInstance().getProductList();
    }
}
