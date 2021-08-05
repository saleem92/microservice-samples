package com.microservices.client.tracing.demo.service;

import com.microservices.client.tracing.demo.dto.OrderDTO;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class OrderServiceImpl implements OrderService {

    private final List<OrderDTO> dtos = new ArrayList<>();

    @Override
    public List<OrderDTO> getOrders(String userId) {
        return dtos.stream().filter(x -> x.getUserId().equals(userId)).collect(Collectors.toList());
    }

    @PostConstruct
    public void createMock() {
        OrderDTO dto1 = OrderDTO.builder().orderId(UUID.randomUUID()).userId("demo1").build();
        OrderDTO dto2 = OrderDTO.builder().orderId(UUID.randomUUID()).userId("demo2").build();

        dtos.add(dto1);
        dtos.add(dto2);
    }
}
