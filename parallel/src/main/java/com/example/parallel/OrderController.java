package com.example.parallel;

import com.example.parallel.entity.Order;
import com.example.parallel.service.OrderReceptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {
    private final OrderReceptionService orderReceptionService;

    public OrderController(OrderReceptionService orderReceptionService) {
        this.orderReceptionService = orderReceptionService;
    }

    @PostMapping("/submit")
    public ResponseEntity<String> submitOrders(@RequestBody List<Order> orders) {
        orderReceptionService.receiveAndDispatchOrders(orders);
        return ResponseEntity.ok("Orders submitted successfully");
    }
}
