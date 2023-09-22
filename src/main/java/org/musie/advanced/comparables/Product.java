package org.musie.advanced.comparables;

// The Comparator interface provides a way to define custom comparison logic for
// objects that might not implement
// Comparable or when you want to sort objects in different
// ways without modifying their original class.
public record Product(String name, double price){
    public String getName() {
        return name;
    }
}

