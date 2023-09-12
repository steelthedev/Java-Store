package com.steelthedev.productservice.services;

import com.steelthedev.productservice.dto.ProductRequest;
import com.steelthedev.productservice.model.Product;
import com.steelthedev.productservice.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ProductServices {

     private final ProductRepository productRepository;

    public ProductServices(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void createProduct(ProductRequest productRequest){
        Product.ProductBuilder builder = Product.builder();
        builder.name(productRequest.name());
        builder.description(productRequest.decription());
        builder.price(productRequest.price());
        Product product = builder.build();

        productRepository.save(product);
        log.info("Product {} is saved", product.getId());
    }
}
