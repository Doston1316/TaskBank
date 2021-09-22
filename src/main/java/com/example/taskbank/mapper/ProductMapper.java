package com.example.taskbank.mapper;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
@Component
public class ProductMapper implements RowMapper {
    @Override
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        ProductResult productResult=new ProductResult();
        productResult.setId(rs.getInt("category_id"));
        productResult.setQuantity(rs.getInt("quantity"));
        return productResult;
    }
}
