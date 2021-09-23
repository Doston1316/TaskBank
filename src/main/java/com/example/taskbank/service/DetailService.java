package com.example.taskbank.service;

import com.example.taskbank.mapper.DetailMapper;
import com.example.taskbank.model.Detail;
import com.example.taskbank.repository.DetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetailService {
    @Autowired
    private DetailRepository detailRepository;
    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    @Autowired
    private DetailMapper detailMapper;

//    order_without_invoice
    String query="select d.quantity,o.id,o.date,d.product_id,p.price,p.name from detail as d inner join product p on d.id=p.id inner join orders o on o.id = d.order_id";
    public List<?>order_without_invoice(){
        return namedParameterJdbcTemplate.query(query,detailMapper);
    }






}
