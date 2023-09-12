package com.steelthedev.productservice.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.math.BigDecimal;


@Entity
@Table(name = "Products")
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
@Setter
@Getter
public class Product {

    @Id
    @GeneratedValue
    private Long Id;
    private String name;
    private String description;
    private BigDecimal price;


}
