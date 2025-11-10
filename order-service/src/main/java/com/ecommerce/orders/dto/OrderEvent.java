package com.ecommerce.orders.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderEvent {
	private String orderId;
    private String userId;
    private double amount;
    private String status; // CREATED, CANCELLED, etc.
}
