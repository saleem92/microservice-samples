package com.microservices.client.tracing.demo.controller;

import com.microservices.client.tracing.demo.dto.OrderDTO;
import com.microservices.client.tracing.demo.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class OrderDetailsController {
    private final OrderService orderService;

    @GetMapping("/orders/{userId}")
    public List<OrderDTO> getOrders(@PathVariable("userId") String userId) {
        return orderService.getOrders(userId);
    }
}
