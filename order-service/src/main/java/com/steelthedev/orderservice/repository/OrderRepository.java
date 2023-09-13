package com.steelthedev.orderservice.repository;

import com.steelthedev.orderservice.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order,Long> {
}
