package org.musie.designpatterns.factory;

// Concrete factories
class MargheritaPizzaFactory implements PizzaFactory {
    @Override
    public Pizza createPizza() {
        return new MargheritaPizza();
    }
}
