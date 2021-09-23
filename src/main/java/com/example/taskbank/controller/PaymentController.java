package com.example.taskbank.controller;

import com.example.taskbank.Enum.Status;
import com.example.taskbank.model.Payment;
import com.example.taskbank.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @GetMapping("/overpaid_invoices")
    public ResponseEntity overpaid_invoices(){
        return ResponseEntity.ok(paymentService.overpaid_invoices());
    }

    @PostMapping("/payment")
    public ResponseEntity create(@RequestBody Payment payment){
        Payment savePayment=new Payment();
        savePayment.setInvoice(payment.getInvoice());
        savePayment.setId(payment.getId());
        savePayment.setTime(payment.getTime());
        savePayment.setAmount(payment.getAmount());
        savePayment.setStatus(Status.SUCCESS);
        return ResponseEntity.ok(paymentService.savePayment(savePayment));
    }


    @GetMapping("/payment/details/{id}")
    public ResponseEntity payment_details_id(@PathVariable Integer id){
        return ResponseEntity.ok(paymentService.payment_details_id(id));
    }

}
