package org.musie.designpatterns.command;

public class CommandPatternRestaurantExample {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        Order order = new Order();

        MenuItem burger = new MenuItem("Burger", 10.99);
        MenuItem fries = new MenuItem("Fries", 3.49);

        OrderCommand addBurger = new AddItemCommand(order, burger);
        OrderCommand addFries = new AddItemCommand(order, fries);

        waiter.takeOrder(addBurger);
        waiter.takeOrder(addFries);

        waiter.submitOrders();

        order.displayOrder(); // Outputs the order details

        waiter.cancelOrders();

        order.displayOrder(); // Order should be empty after cancellation
    }
}

