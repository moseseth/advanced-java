package com.example.parallel.service;

import com.example.parallel.DispatchOrdersTask;
import com.example.parallel.entity.Order;
import com.example.parallel.repository.KitchenTaskRepository;
import com.example.parallel.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.ForkJoinPool;

@Service
public class OrderReceptionService {
    private final OrderRepository orderRepository;

    private final KitchenTaskRepository kitchenTaskRepository;

    public OrderReceptionService(OrderRepository orderRepository, KitchenTaskRepository kitchenTaskRepository) {
        this.orderRepository = orderRepository;
        this.kitchenTaskRepository = kitchenTaskRepository;
    }

    public void receiveAndDispatchOrders(List<Order> orders) {
        ForkJoinPool pool = new ForkJoinPool();
        pool.invoke(new DispatchOrdersTask(orders, kitchenTaskRepository));
    }
}

