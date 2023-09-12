package com.steelthedev.productservice.dto;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Table(name = "Products")
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class ProductResponse {
    private Long Id;
    private String name;
    private String description;
    private BigDecimal price;
}

