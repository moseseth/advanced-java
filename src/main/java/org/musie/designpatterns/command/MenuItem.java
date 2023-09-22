package org.musie.designpatterns.command;

record MenuItem(String name, double price) {
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

