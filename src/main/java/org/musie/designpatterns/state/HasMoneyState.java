package org.musie.designpatterns.state;

class HasMoneyState implements VendingMachineState {
    private final VendingMachine vendingMachine;

    public HasMoneyState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectItem(String item) {
        System.out.println("Already selected an item.");
    }

    @Override
    public void insertMoney(double amount) {
        vendingMachine.addMoney(amount);
        System.out.println("Money inserted: $" + amount);
    }

    @Override
    public void purchaseItem() {
        if (vendingMachine.getSelectedItem() != null) {
            vendingMachine.changeState(new SoldState(vendingMachine));
            System.out.println("Purchase in progress...");
            vendingMachine.dispenseItem();
        } else {
            System.out.println("No item selected.");
        }
    }

    @Override
    public void dispenseItem() {
        System.out.println("No purchase made.");
    }
}
