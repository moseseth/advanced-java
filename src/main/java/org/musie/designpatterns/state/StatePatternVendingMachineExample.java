package org.musie.designpatterns.state;

public class StatePatternVendingMachineExample {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine(3);

        vendingMachine.selectItem("Coke");
        vendingMachine.insertMoney(1.0);
        vendingMachine.purchaseItem();
        vendingMachine.displayStatus(); // Outputs: Current state: SoldState

        vendingMachine.selectItem("Chips");
        vendingMachine.insertMoney(1.5);
        vendingMachine.purchaseItem();
        vendingMachine.displayStatus(); // Outputs: Current state: SoldState

        vendingMachine.insertMoney(1.0);
        vendingMachine.purchaseItem();
        vendingMachine.displayStatus(); // Outputs: Current state: SoldOutState
    }
}

