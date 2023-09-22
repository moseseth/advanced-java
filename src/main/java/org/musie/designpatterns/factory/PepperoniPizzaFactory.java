package org.musie.designpatterns.factory;

class PepperoniPizzaFactory implements PizzaFactory {
    @Override
    public Pizza createPizza() {
        return new PepperoniPizza();
    }
}

// restaurant ordering system
