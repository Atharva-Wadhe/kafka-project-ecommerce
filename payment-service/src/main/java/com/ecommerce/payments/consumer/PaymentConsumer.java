package com.ecommerce.payments.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.ecommerce.payments.dto.OrderEvent;

@Service
public class PaymentConsumer {

    @KafkaListener(topics = "orders", groupId = "payment-group")
    public void consume(OrderEvent event) {
        System.out.println("Payment service received ORDER event:");
        System.out.println("Order ID: " + event.getOrderId());
        System.out.println("User ID: " + event.getUserId());
        System.out.println("Amount: " + event.getAmount());
        System.out.println("Status: " + event.getStatus());
    }
}

