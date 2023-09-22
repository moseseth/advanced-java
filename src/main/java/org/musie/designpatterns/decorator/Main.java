package org.musie.designpatterns.decorator;

public class Main {
    public static void main(String[] args) {
        /////////////////////// Decorator pattern //////////////////
        Coffee basicCoffee = new BasicCoffee();
        System.out.println("Cost: $" + basicCoffee.cost() + ", Description: " + basicCoffee.description());

        Coffee milkCoffee = new MilkDecorator(new BasicCoffee());
        System.out.println("Cost: $" + milkCoffee.cost() + ", Description: " + milkCoffee.description());

        Coffee sugarMilkCoffee = new SugarDecorator(new MilkDecorator(new BasicCoffee()));
        System.out.println("Cost: $" + sugarMilkCoffee.cost() + ", Description: " + sugarMilkCoffee.description());
    }
}
