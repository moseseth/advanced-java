package org.musie.advanced.comparables;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.util.ArrayList;
import java.util.Base64;
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

//    public static void main(String[] args) throws Exception {
//        // Generate a new AES secret key
//        SecretKey secretKey = generateAESKey();
//
//        // Convert the secret key to a Base64-encoded string
//        String base64Key = encodeSecretKey(secretKey);
//
//        System.out.println("AES Secret Key (Base64): " + base64Key);
//    }
//
//    // Generate a new AES secret key
//    public static SecretKey generateAESKey() throws Exception {
//        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
//        keyGenerator.init(256); // Key size in bits (AES-256)
//        return keyGenerator.generateKey();
//    }
//
//    // Encode a SecretKey as a Base64-encoded string
//    public static String encodeSecretKey(SecretKey secretKey) {
//        byte[] keyBytes = secretKey.getEncoded();
//        return Base64.getEncoder().encodeToString(keyBytes);
//    }
}

