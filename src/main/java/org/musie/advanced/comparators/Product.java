package org.musie.advanced.comparators;


// The Comparable interface is used to define the natural order of objects.
record Product(String name, double price) implements Comparable<Product> {

    @Override
    public int compareTo(Product other) {
        return Double.compare(this.price, other.price);
    }
}

