package org.musie.designpatterns.prototype;

public class Main {

    public static void main(String[] args) {
        /////////////////////Prototype design////////////////////////

        GreetingCardManager manager = new GreetingCardManager();

        GreetingCard birthdayCardPrototype = manager.getPrototype("birthday");
        birthdayCardPrototype.customize(
                "Alice",
                "Birthday",
                "May your day be filled with joy!");
        birthdayCardPrototype.print();

        GreetingCard anniversaryCardPrototype = manager.getPrototype("anniversary");
        anniversaryCardPrototype.customize(
                "John & Jane",
                "Anniversary",
                "Another year of love and togetherness.");
        anniversaryCardPrototype.print();
    }
}
