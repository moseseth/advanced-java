package org.musie.advanced.generics;

public class ElectronicProduct extends Product {
    private final String brand;

    public ElectronicProduct(String name, double price, String brand) {
        super(name, price);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}
