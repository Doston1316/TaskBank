package com.example.taskbank.mapper;

import com.example.taskbank.model.Order;
import com.example.taskbank.model.Product;
import lombok.Data;

import javax.persistence.ManyToOne;
import java.util.Date;
@Data
public class DetailResult {

    private Integer quantity;
    private Integer productId;
    private Integer orderId;
    private Date orderDate;
    private float price;
    private String name;
}
