package com.example.taskbank.controller;

import com.example.taskbank.model.Invoice;
import com.example.taskbank.service.InvoiceService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api")
public class InvoicesController {
    @Autowired
    private InvoiceService invoiceService;

    @GetMapping("/expired_invoices")
    private ResponseEntity expired_invoices() {
            return ResponseEntity.ok(invoiceService.expired_invoices());
    }



    @GetMapping("/wrong_data_invoices")
    public ResponseEntity wrong_data_invoices(){
            return ResponseEntity.ok(invoiceService.wrong_data_invoices());
        }
    }