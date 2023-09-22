package org.musie.designpatterns.command;

import java.util.ArrayList;
import java.util.List;

class Order {
    private final List<MenuItem> items = new ArrayList<>();

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public void removeItem(MenuItem item) {
        items.remove(item);
    }

    public double getTotalPrice() {
        return items.stream().mapToDouble(MenuItem::getPrice).sum();
    }

    public void displayOrder() {
        System.out.println("Order:");
        for (MenuItem item : items) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }
        System.out.println("Total: $" + getTotalPrice());
    }
}
