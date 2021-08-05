package com.microservices.client.tracing.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserOrdersDTO {

//    private List<UserOrder> userOrderList;
//
//    @Data
//    class UserOrder {
//
//    }

    private UUID orderId;
    private String userId;
}
