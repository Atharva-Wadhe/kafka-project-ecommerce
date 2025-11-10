package com.ecommerce.orders.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.orders.dto.OrderEvent;
import com.ecommerce.orders.producer.OrderProducer;

@RestController
@RequestMapping("/api/order")
public class OrderController {

    @Autowired
    private OrderProducer producer;

    @PostMapping("/create")
    public ResponseEntity<String> createOrder(@RequestBody OrderEvent event) {
        event.setStatus("CREATED");
        producer.sendOrderEvent(event);
        return ResponseEntity.ok("Order event sent!");
    }
}

