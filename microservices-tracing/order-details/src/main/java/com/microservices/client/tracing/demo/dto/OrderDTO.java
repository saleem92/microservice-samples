package com.microservices.client.tracing.demo.dto;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class OrderDTO {
    private UUID orderId;
    private String userId;
}
