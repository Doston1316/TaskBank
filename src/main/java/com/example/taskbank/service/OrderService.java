package com.example.taskbank.service;

import com.example.taskbank.mapper.OrderMapper;
import com.example.taskbank.model.Order;
import com.example.taskbank.model.Payment;
import com.example.taskbank.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

import javax.swing.plaf.PanelUI;
import java.util.Date;
import java.util.List;


@Service
public class OrderService {
    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private OrderMapper orderMapper;


    //orders_without_details
    String query="select * from orders as o where o.date < '2016-09-06' ";
    public List<Order>orders_without_details(){
        return namedParameterJdbcTemplate.query(query,orderMapper);
    }


    public Order saveOrder(Order order){
        return orderRepository.save(order);
    }

//    findByOrderId
    public Order findByOrderId(Integer id){
        return orderRepository.findById(id).get();
    }








}
