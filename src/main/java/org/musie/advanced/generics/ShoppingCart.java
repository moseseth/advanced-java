package org.musie.advanced.generics;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart<T extends Product> {
    private final List<T> products;

    public ShoppingCart() {
        products = new ArrayList<>();
    }

    public void addProduct(T product) {
        products.add(product);
    }

    public List<T> getProducts() {
        return products;
    }
}
