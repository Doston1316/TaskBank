package com.example.taskbank.mapper;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class DetailMapper implements RowMapper {
    @Override
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        DetailResult detailResult = new DetailResult();
        detailResult.setOrderId(rs.getInt("id"));
        detailResult.setName(rs.getString("name"));
        detailResult.setOrderDate(rs.getDate("date"));
        detailResult.setPrice(rs.getFloat("price"));
        detailResult.setQuantity(rs.getInt("quantity"));
        detailResult.setProductId(rs.getInt("product_id"));
        return detailResult;
    }
}
