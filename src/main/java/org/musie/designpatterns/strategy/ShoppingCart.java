package org.musie.designpatterns.strategy;


// Context class that uses the strategy
public class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(int totalAmount) {
        paymentStrategy.pay(totalAmount);
    }
}
