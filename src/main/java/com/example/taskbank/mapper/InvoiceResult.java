package com.example.taskbank.mapper;


import lombok.Data;

import java.util.Date;
@Data
public class InvoiceResult {
    private Integer id;
    private Integer orderId;
    private Date orderDate;
    private Date issued;

}
