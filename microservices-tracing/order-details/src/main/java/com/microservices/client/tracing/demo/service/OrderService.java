package com.microservices.client.tracing.demo.service;

import com.microservices.client.tracing.demo.dto.OrderDTO;

import java.util.List;

public interface OrderService {
    List<OrderDTO> getOrders(String userId);
}
