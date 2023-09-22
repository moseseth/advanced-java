package org.musie.designpatterns.command;

class RemoveItemCommand implements OrderCommand {
    private final Order order;
    private final MenuItem item;

    public RemoveItemCommand(Order order, MenuItem item) {
        this.order = order;
        this.item = item;
    }

    @Override
    public void execute() {
        order.removeItem(item);
    }

    @Override
    public void cancel() {
        order.addItem(item);
    }
}
