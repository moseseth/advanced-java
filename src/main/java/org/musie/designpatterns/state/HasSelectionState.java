package org.musie.designpatterns.state;

class HasSelectionState implements VendingMachineState {
    private final VendingMachine vendingMachine;

    public HasSelectionState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectItem(String item) {
        System.out.println("Already selected an item.");
    }

    @Override
    public void insertMoney(double amount) {
        vendingMachine.addMoney(amount);
        vendingMachine.changeState(new HasMoneyState(vendingMachine));
        System.out.println("Money inserted: $" + amount);
    }

    @Override
    public void purchaseItem() {

    }

    @Override
    public void dispenseItem() {

    }

    // Other methods are no-op in this state
    // purchaseItem, dispenseItem do nothing
}
