package org.musie.designpatterns.command;

import java.util.ArrayList;
import java.util.List;

class Waiter {
    private final List<OrderCommand> commands = new ArrayList<>();

    public void takeOrder(OrderCommand command) {
        commands.add(command);
    }

    public void submitOrders() {
        for (OrderCommand command : commands) {
            command.execute();
        }
        commands.clear();
    }

    public void cancelOrders() {
        for (OrderCommand command : commands) {
            command.cancel();
        }
        commands.clear();
    }
}

