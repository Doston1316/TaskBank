package com.example.taskbank.mapper;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import java.sql.ResultSet;
import java.sql.SQLException;
@Component
public class InvoicesMapper implements RowMapper {


    @Override
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        InvoiceResult invoiceResult=new InvoiceResult();
        invoiceResult.setId(rs.getInt("id"));
        invoiceResult.setIssued(rs.getDate("issued"));
        invoiceResult.setOrderId(rs.getInt("order_id"));
        invoiceResult.setOrderDate(rs.getDate("date"));
        return invoiceResult;
    }
}
