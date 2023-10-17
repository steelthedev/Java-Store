package com.steelthedev.inventoryservice.repository;

import com.steelthedev.inventoryservice.model.Inventory;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface InventoryRepository extends CrudRepository<Inventory, Long> {

    List<Inventory> findBySkuCodeIn(List<String> skuCode);
}
