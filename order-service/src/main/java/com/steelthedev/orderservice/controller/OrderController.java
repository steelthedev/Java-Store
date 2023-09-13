package com.steelthedev.orderservice.controller;


import com.steelthedev.orderservice.dto.OrderRequest;
import com.steelthedev.orderservice.services.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;


    @PostMapping("/place")
    public String placeHolder(@RequestBody OrderRequest orderRequest){
        orderService.placeOrder(orderRequest);
        return "Order Placed Successfully";
    }

}
