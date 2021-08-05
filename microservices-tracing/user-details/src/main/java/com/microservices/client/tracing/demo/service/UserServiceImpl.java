package com.microservices.client.tracing.demo.service;

import com.microservices.client.tracing.demo.dto.UserDTO;
import com.microservices.client.tracing.demo.dto.UserOrdersDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.netflix.eureka.EurekaDiscoveryClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final EurekaDiscoveryClient eurekaDiscoveryClient;

    private final RestTemplate restTemplate;

    @Override
    public List<UserDTO> getUserDetails() {
        List<UserDTO> dtos = new ArrayList<>();
        UserDTO dto1 = UserDTO.builder().id(UUID.randomUUID()).name("demo 1").salary(1000).build();
        UserDTO dto2 = UserDTO.builder().id(UUID.randomUUID()).name("demo 2").salary(2000).build();
        dtos.add(dto1);
        dtos.add(dto2);

        return dtos;
    }

    @Override
    public UserOrdersDTO[] getUserOrders(String userId) {
        return restTemplate.getForObject("http://ORDERS-SERVICE/orders/" + userId, UserOrdersDTO[].class);
    }
}
