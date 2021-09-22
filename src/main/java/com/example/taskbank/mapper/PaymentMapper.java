package com.example.taskbank.mapper;

import com.example.taskbank.model.Payment;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
@Component
public class PaymentMapper implements RowMapper {
    @Override
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        PaymentResult paymentResult=new PaymentResult();
        paymentResult.setInvoice(rs.getInt("invoice_id"));
        paymentResult.setAmount(rs.getFloat("amount"));
        return paymentResult;
    }
}
