package com.microservices.client.tracing.demo.service;

import com.microservices.client.tracing.demo.controller.UserController;
import com.microservices.client.tracing.demo.dto.UserDTO;
import com.microservices.client.tracing.demo.dto.UserOrdersDTO;

import java.util.List;

public interface UserService {

    public List<UserDTO> getUserDetails();

    UserOrdersDTO[] getUserOrders(String userId);
}
