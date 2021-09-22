package com.example.taskbank.mapper;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
@Component
public class ProductBulkMapper implements RowMapper {
    @Override
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        ProductBulkResult productBulkResult=new ProductBulkResult();
        productBulkResult.setProductId(rs.getInt("id"));
        productBulkResult.setPrice(rs.getFloat("price"));
        return productBulkResult;
    }
}
