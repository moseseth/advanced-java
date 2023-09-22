package org.musie.advanced.comparables;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 999.99));
        products.add(new Product("T-Shirt", 19.99));
        products.add(new Product("Phone", 599.99));

        products.sort(Comparator.comparing(Product::getName));

        for (Product product : products) {
            System.out.println(product.name() + " - $" + product.price());
        }
    }
}

