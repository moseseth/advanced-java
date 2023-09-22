package org.musie.advanced.generics;

public class ClothingProduct extends Product {
    private final String size;

    public ClothingProduct(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    public String getSize() {
        return size;
    }
}
