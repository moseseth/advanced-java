package org.musie.designpatterns.state;

class NoSelectionState implements VendingMachineState {
    private final VendingMachine vendingMachine;

    public NoSelectionState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectItem(String item) {
        vendingMachine.setSelectedItem(item);
        vendingMachine.changeState(new HasSelectionState(vendingMachine));
        System.out.println(item + " selected.");
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
