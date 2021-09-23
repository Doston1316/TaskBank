package com.example.taskbank.controller;

import com.example.taskbank.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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




    @GetMapping("/category/{id}")
    public ResponseEntity getProductByCategory_Id(@PathVariable Integer id){
        return ResponseEntity.ok(productService.getProductByCategory_Id(id));
    }


    @GetMapping("/product/list")
    public ResponseEntity findAll(){
        return ResponseEntity.ok(productService.productList());
    }



    @GetMapping("/product/details/{id}")
    public ResponseEntity getDetailByProductId(@PathVariable Integer id){
        return ResponseEntity.ok(productService.productDetailsProduct_id(id));
    }




}
