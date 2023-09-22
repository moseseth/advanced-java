package org.musie.designpatterns.state;


class SoldOutState implements VendingMachineState {
    private VendingMachine vendingMachine;

    public SoldOutState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectItem(String item) {
        System.out.println("Machine is sold out.");
    }

    @Override
    public void insertMoney(double amount) {

    }

    @Override
    public void purchaseItem() {

    }

    @Override
    public void dispenseItem() {

    }

    // Other methods are no-op in this state
    // insertMoney, purchaseItem, dispenseItem do nothing
}
