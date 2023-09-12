package com.steelthedev.productservice.repository;

import com.steelthedev.productservice.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
