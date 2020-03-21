package com.jrda.design_patterns.composite;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PriceTest {
    @Test
    public void testPrice() {
        Product item = new Item(5.0);
        List<Product> productList = new ArrayList<>();
        productList.add(item);
        Box box = new Box(productList,2.0);
        box.addProduct(item);
        box.removeProduct(item);

        assertEquals(7.0, box.getPrice(), 0.001);
    }
}
