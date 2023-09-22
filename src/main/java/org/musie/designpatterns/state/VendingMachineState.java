package org.musie.designpatterns.state;

interface VendingMachineState {
    void selectItem(String item);
    void insertMoney(double amount);
    void purchaseItem();
    void dispenseItem();
}
