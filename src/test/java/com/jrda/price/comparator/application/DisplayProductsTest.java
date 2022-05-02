package com.jrda.price.comparator.application;

import com.jrda.price.comparator.domain.Product;
import org.junit.Test;

import java.util.Iterator;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DisplayProductsTest {
    @Test
    public void testDisplay() {
        AddProduct addProduct = new AddProduct();
        DisplayProducts displayProducts = new DisplayProducts();

        Product[] products = new Product[3];
        products[0] = new Product(1, 1);
        products[1] = new Product(2, 1);
        products[2] = new Product(3, 1);

        addProduct.addProduct(products[2]);
        addProduct.addProduct(products[1]);
        addProduct.addProduct(products[0]);

        assertOrder(products, displayProducts.getProducts());
    }

    private void assertOrder(Product[] expectedOrder, Set<Product> currentOrder) {
        Iterator<Product> currentIte = currentOrder.iterator();
        int i = 0;
        while(currentIte.hasNext()) {
            assertTrue("Length differs",i < expectedOrder.length);
            assertEquals(expectedOrder[i], currentIte.next());
            i++;
        }

    }
}