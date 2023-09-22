package org.musie.advanced.generics;

public class Main {
    public static void main(String[] args) {
        ShoppingCart<ElectronicProduct> electronicCart = new ShoppingCart<>();
        electronicCart.addProduct(new ElectronicProduct("Laptop", 999.99, "Brand"));

        ShoppingCart<ClothingProduct> clothingCart = new ShoppingCart<>();
        clothingCart.addProduct(new ClothingProduct("T-Shirt", 19.99, "Medium"));

        // Print the products in each cart
        System.out.println("Electronic Cart:");
        for (ElectronicProduct electronicProduct : electronicCart.getProducts()) {
            System.out.println(electronicProduct.getName() + " - " + electronicProduct.getBrand());
        }

        System.out.println("\nClothing Cart:");
        for (ClothingProduct clothingProduct : clothingCart.getProducts()) {
            System.out.println(clothingProduct.getName() + " - " + clothingProduct.getSize());
        }
    }
}
