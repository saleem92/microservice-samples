package com.microservices.client.tracing.demo.controller;

import com.microservices.client.tracing.demo.dto.UserDTO;
import com.microservices.client.tracing.demo.dto.UserOrdersDTO;
import com.microservices.client.tracing.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/users")
    public List<UserDTO> getUserDetails() {
        return userService.getUserDetails();
    }

    @GetMapping("/users/{userId}/orders")
    public UserOrdersDTO[] getUserOrders(@PathVariable String userId) {
        return userService.getUserOrders(userId);
    }
}
