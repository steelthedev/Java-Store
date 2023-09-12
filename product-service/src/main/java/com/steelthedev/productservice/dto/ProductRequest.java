package com.steelthedev.productservice.dto;

import java.math.BigDecimal;

public record ProductRequest(
        String name, String decription, BigDecimal price
) {
}