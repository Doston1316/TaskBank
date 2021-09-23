package com.example.taskbank.controller;

import com.example.taskbank.Enum.Status;
import com.example.taskbank.model.Order;
import com.example.taskbank.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/orders_without_details")
    public ResponseEntity wrong_data_invoices(){
        return ResponseEntity.ok(orderService.orders_without_details());
    }

    @PostMapping("/order")
    public ResponseEntity create(@RequestBody Order order){
        Order saveOrder=new Order();
        saveOrder.setId(order.getId());
        saveOrder.setCustomer(order.getCustomer());
        saveOrder.setDate(order.getDate());
        saveOrder.setDetails(order.getDetails());
        saveOrder.setInvoice(order.getInvoice());
        saveOrder.setStatus(Status.SUCCESS);
        return ResponseEntity.ok(orderService.saveOrder(saveOrder));
    }

    @GetMapping("/order/details/{id}")
    public ResponseEntity findByOrderId(@PathVariable Integer id){
        return ResponseEntity.ok(orderService.findByOrderId(id));
    }





}
