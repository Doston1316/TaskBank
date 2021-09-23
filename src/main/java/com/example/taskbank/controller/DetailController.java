package com.example.taskbank.controller;

import com.example.taskbank.service.DetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DetailController {
    @Autowired
    private DetailService detailService;

    @GetMapping("/order_without_invoice")
    public ResponseEntity order_without_invoice(){
        return ResponseEntity.ok(detailService.order_without_invoice());
    }




}
