package com.example.taskbank.controller;

import com.example.taskbank.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/high_demand_products")
    public ResponseEntity high_demand_products(){
        return ResponseEntity.ok(productService.high_demand_products());
    }


    @GetMapping("/bulk_products")
    public ResponseEntity bulk_products(){
        return ResponseEntity.ok(productService.bulk_products());
    }

}
