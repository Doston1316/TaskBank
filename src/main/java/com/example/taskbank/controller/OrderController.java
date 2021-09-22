package com.example.taskbank.controller;

import com.example.taskbank.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/orders_without_details")
    public ResponseEntity wrong_data_invoices(){
        return ResponseEntity.ok(orderService.orders_without_details());
    }



}
