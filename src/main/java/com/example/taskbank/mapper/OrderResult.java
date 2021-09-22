package com.example.taskbank.mapper;

import com.example.taskbank.model.Customer;
import com.example.taskbank.model.Invoice;
import lombok.Data;

import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.util.Date;
@Data
public class OrderResult {

    private Integer id;
    private Date date;
    private Integer customer;
    private Integer invoice;

}
