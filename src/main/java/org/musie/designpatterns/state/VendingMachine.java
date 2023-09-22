package org.musie.designpatterns.state;

class VendingMachine {
    private VendingMachineState currentState;
    private String selectedItem;
    private double moneyInserted;
    private int itemCount;

    public VendingMachine(int itemCount) {
        this.itemCount = itemCount;
        if (itemCount > 0) {
            currentState = new NoSelectionState(this);
        } else {
            currentState = new SoldOutState(this);
        }
    }

    public void changeState(VendingMachineState newState) {
        currentState = newState;
    }

    public void selectItem(String item) {
        currentState.selectItem(item);
    }

    public void insertMoney(double amount) {
        currentState.insertMoney(amount);
    }

    public void purchaseItem() {
        currentState.purchaseItem();
    }

    public void dispenseItem() {
        currentState.dispenseItem();
    }

    public void releaseItem() {
        if (itemCount > 0) {
            System.out.println(selectedItem + " dispensed.");
            itemCount--;
        }
    }

    public void addMoney(double amount) {
        moneyInserted += amount;
    }

    public String getSelectedItem() {
        return selectedItem;
    }

    public void setSelectedItem(String selectedItem) {
        this.selectedItem = selectedItem;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void displayStatus() {
        System.out.println("Current state: " + currentState.getClass().getSimpleName());
        System.out.println("Items in machine: " + itemCount);
    }
}

