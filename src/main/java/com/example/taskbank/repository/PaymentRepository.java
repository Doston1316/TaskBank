package com.example.taskbank.repository;

import com.example.taskbank.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PaymentRepository extends JpaRepository<Payment,Integer> {

    @Query("select p.invoice.id,p.invoice.amount from Payment as p inner join Invoice i on p.id = i.id")
    List<Payment>overpaidInvoice();


}
