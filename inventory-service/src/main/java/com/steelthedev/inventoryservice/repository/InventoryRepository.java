package com.steelthedev.inventoryservice.repository;

import com.steelthedev.inventoryservice.model.Inventory;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface InventoryRepository extends CrudRepository<Inventory, Long> {

    Optional<Inventory> findBySkuCode(String skuCode);
}
