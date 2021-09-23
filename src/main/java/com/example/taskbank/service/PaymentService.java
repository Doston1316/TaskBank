package com.example.taskbank.service;

import com.example.taskbank.mapper.PaymentMapper;
import com.example.taskbank.model.Payment;
import com.example.taskbank.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {
    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    @Autowired
    private PaymentRepository paymentRepository;
    @Autowired
    private PaymentMapper paymentMapper;

    //    overpaid_invoices
    String query = "select p.invoice_id, i.amount from payment as p inner join invoice i on p.id = i.id";
    public List<Payment> overpaid_invoices() {
        return namedParameterJdbcTemplate.query(query, paymentMapper);
    }


    //    savePayment
    public Payment savePayment(Payment payment) {
        return paymentRepository.save(payment);
    }

//    payment_details_id
    public Payment payment_details_id(Integer id){
        return paymentRepository.findById(id).get();
    }

}
