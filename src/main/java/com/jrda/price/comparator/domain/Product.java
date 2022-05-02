package com.jrda.price.comparator.domain;

import java.util.Objects;

public class Product implements Comparable<Product> {
    private final double price;
    private final double quantity;
    private final double pricePerQuantity;

    public Product(double price, double quantity) {
        this.price = price;
        this.quantity = quantity;
        this.pricePerQuantity = price/quantity;
    }

    @Override
    public int compareTo(Product other) {
        double difference = this.pricePerQuantity - other.pricePerQuantity;

        if (difference == 0)
            return 0;

        return this.pricePerQuantity - other.pricePerQuantity > 0 ? 1 : -1;
    }

    public double getPrice() {
        return price;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getPricePerQuantity() {
        return pricePerQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 && Double.compare(product.quantity, quantity) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, quantity);
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", quantity=" + quantity +
                ", pricePerQuantity=" + pricePerQuantity +
                '}';
    }
}
