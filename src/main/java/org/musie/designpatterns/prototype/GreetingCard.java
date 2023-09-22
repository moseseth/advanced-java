package org.musie.designpatterns.prototype;

import java.util.logging.Level;
import java.util.logging.Logger;

// Prototype interface
class GreetingCard implements Cloneable {
    private String recipientName;
    private String occasion;
    private String message;

    public GreetingCard(String recipientName, String occasion, String message) {
        this.recipientName = recipientName;
        this.occasion = occasion;
        this.message = message;
    }

    public void customize(String recipientName, String occasion, String message) {
        this.recipientName = recipientName;
        this.occasion = occasion;
        this.message = message;
    }

    public void print() {
        System.out.println("Greeting Card:");
        System.out.println("Recipient: " + recipientName);
        System.out.println("Occasion: " + occasion);
        System.out.println("Message: " + message);
        System.out.println("Card design and layout...");
    }

    @Override
    public GreetingCard clone() {
        try {
            return (GreetingCard) super.clone();
        } catch (CloneNotSupportedException e) {
            Logger.getLogger(GreetingCard.class.getName()).log(Level.SEVERE, "Clone failed", e);
            return null;
        }
    }
}

