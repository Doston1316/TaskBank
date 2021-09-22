package com.example.taskbank.mapper;

import com.example.taskbank.model.Invoice;
import lombok.Data;

import javax.persistence.ManyToOne;
@Data
public class PaymentResult {

    private float amount;
    private int invoice;
}
