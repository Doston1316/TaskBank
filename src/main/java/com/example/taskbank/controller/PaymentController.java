package com.example.taskbank.controller;

import com.example.taskbank.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @GetMapping("/overpaid_invoices")
    public ResponseEntity overpaid_invoices(){
        return ResponseEntity.ok(paymentService.overpaid_invoices());
    }

}
