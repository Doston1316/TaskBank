package com.example.taskbank.controller;

import com.example.taskbank.model.Customer;
import com.example.taskbank.model.Order;
import com.example.taskbank.repository.CustomerRepository;
import com.example.taskbank.service.CustomerService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/customers_without_order")
    public ResponseEntity customers_without_order() {
      return ResponseEntity.ok(customerService.customers_without_order());
    }

    @GetMapping("/customers_last_orders")
    public ResponseEntity customers_last_orders(){
        return ResponseEntity.ok(customerService.customers_last_orders());
    }

    @GetMapping("/number_of_products_in_year")
    public ResponseEntity number_of_products_in_year(){
        return ResponseEntity.ok(customerService.number_of_products_in_year());
    }



}
