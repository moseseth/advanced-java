package org.musie.designpatterns.state;

class SoldState implements VendingMachineState {
    private final VendingMachine vendingMachine;

    public SoldState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectItem(String item) {
        System.out.println("Purchase in progress...");
    }

    @Override
    public void insertMoney(double amount) {
        System.out.println("Purchase in progress...");
    }

    @Override
    public void purchaseItem() {
        System.out.println("Purchase in progress...");
    }

    @Override
    public void dispenseItem() {
        vendingMachine.releaseItem();
        if (vendingMachine.getItemCount() > 0) {
            vendingMachine.changeState(new NoSelectionState(vendingMachine));
        } else {
            vendingMachine.changeState(new SoldOutState(vendingMachine));
        }
    }
}
