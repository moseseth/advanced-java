package org.musie.designpatterns.decorator;

// Concrete component
class BasicCoffee implements Coffee {
    @Override
    public double cost() {
        return 2.0;
    }

    @Override
    public String description() {
        return "Basic Coffee";
    }
}
