package org.musie.designpatterns.command;

class AddItemCommand implements OrderCommand {
    private final Order order;
    private final MenuItem item;

    public AddItemCommand(Order order, MenuItem item) {
        this.order = order;
        this.item = item;
    }

    @Override
    public void execute() {
        order.addItem(item);
    }

    @Override
    public void cancel() {
        order.removeItem(item);
    }
}
