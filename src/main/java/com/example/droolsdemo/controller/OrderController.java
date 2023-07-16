package com.example.droolsdemo.controller;

import com.example.droolsdemo.model.Order;
import com.example.droolsdemo.service.OrderService;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/main/order")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/discount")
    public HttpEntity<?> getDiscount(@RequestBody Order order) {
        return orderService.getDiscount(order);
    }

}
