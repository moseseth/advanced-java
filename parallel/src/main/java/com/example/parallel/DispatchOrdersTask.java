package com.example.parallel;

import com.example.parallel.entity.KitchenTask;
import com.example.parallel.entity.Order;
import com.example.parallel.repository.KitchenTaskRepository;

import java.util.List;
import java.util.concurrent.RecursiveAction;

public class DispatchOrdersTask extends RecursiveAction {
    private List<Order> orders;
    private KitchenTaskRepository kitchenTaskRepository;
    public DispatchOrdersTask(List<Order> orders, KitchenTaskRepository kitchenTaskRepository) {
        this.orders = orders;
        this.kitchenTaskRepository = kitchenTaskRepository;
    }

    @Override
    protected void compute() {
        if (orders.isEmpty()) {
            return;
        }

        if (orders.size() == 1) {
            // If there's only one order, dispatch it to the kitchen
            Order order = orders.get(0);
            createAndStoreKitchenTask(order);
        } else {
            // Split the list of orders into two subtasks
            int middle = orders.size() / 2;
            List<Order> leftOrders = orders.subList(0, middle);
            List<Order> rightOrders = orders.subList(middle, orders.size());

            // Create two subtasks to process left and right orders in parallel
            DispatchOrdersTask leftTask = new DispatchOrdersTask(leftOrders, kitchenTaskRepository);
            DispatchOrdersTask rightTask = new DispatchOrdersTask(rightOrders, kitchenTaskRepository);

            // Fork the subtasks
            invokeAll(leftTask, rightTask);
        }
    }

    private void createAndStoreKitchenTask(Order order) {
        // Create a kitchen task for the order
        KitchenTask kitchenTask = new KitchenTask();
        kitchenTask.setOrderId(order.getId());
        kitchenTask.setItems(order.getItems());

        // Save the kitchen task in the database
        kitchenTaskRepository.save(kitchenTask);

        // You can add additional logic here, such as sending a notification to the kitchen
    }
}
