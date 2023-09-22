package org.musie.designpatterns.factory;

public class Main {
    public static void main(String[] args) {
        /////////////////////////Factory design////////////////////////

        PizzaFactory margheritaFactory = new MargheritaPizzaFactory();
        Pizza margheritaPizza = margheritaFactory.createPizza();
        margheritaPizza.prepare();
        margheritaPizza.bake();
        margheritaPizza.cut();
        margheritaPizza.box();

        PizzaFactory pepperoniFactory = new PepperoniPizzaFactory();
        Pizza pepperoniPizza = pepperoniFactory.createPizza();
        pepperoniPizza.prepare();
        pepperoniPizza.bake();
        pepperoniPizza.cut();
        pepperoniPizza.box();
    }
}
