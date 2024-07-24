package com.praktyka.order.service.controller;


import com.praktyka.order.service.dto.OrderRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/product")
public class OrderController {


    @PostMapping
    public String placeOrder(@RequestBody OrderRequest orderRequest){
        return "Order Placed Succesfully";
    }
}
