package com.example.taskbank.mapper;

import com.example.taskbank.model.Order;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
@Component
public class OrderMapper implements RowMapper {
    @Override
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
       OrderResult orderResult=new OrderResult();
        orderResult.setId(rs.getInt("id"));
        orderResult.setCustomer(rs.getInt("customer_id"));
        orderResult.setDate(rs.getDate("date"));
        orderResult.setInvoice(rs.getInt("invoice_id"));
        return orderResult;
    }
}
