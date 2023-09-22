package org.musie.designpatterns.strategy;

public class PaymentStrategyExample {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Adding items to the cart and calculating the total amount
        int totalAmount = 150;

        // Using Credit Card for payment
        cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456", "John Doe"));
        cart.checkout(totalAmount);

        // Using PayPal for payment
        cart.setPaymentStrategy(new PayPalPayment("john.doe@example.com"));
        cart.checkout(totalAmount);
    }
}
