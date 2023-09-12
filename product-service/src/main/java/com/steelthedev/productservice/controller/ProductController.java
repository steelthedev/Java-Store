package com.steelthedev.productservice.controller;


import com.steelthedev.productservice.dto.ProductRequest;
import com.steelthedev.productservice.dto.ProductResponse;
import com.steelthedev.productservice.services.ProductServices;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductServices productServices;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductRequest productRequest){
        productServices.createProduct(productRequest);
    }


    @GetMapping("")
    @ResponseStatus(HttpStatus.OK)
    public Iterable<ProductResponse> getAllProducts(){
        return productServices.getAllProducts();
    }

}
