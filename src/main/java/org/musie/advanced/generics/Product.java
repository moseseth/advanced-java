package org.musie.advanced.generics;


// Generics allow you to write more reusable and flexible code by providing compile-time
// type checking for collections and classes that work with different types.
public class Product {
    private final String name;
    private final double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
