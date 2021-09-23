package com.example.taskbank.service;

import com.example.taskbank.mapper.ProductBulkMapper;
import com.example.taskbank.mapper.ProductMapper;
import com.example.taskbank.model.Detail;
import com.example.taskbank.model.Product;
import com.example.taskbank.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ProductBulkMapper productBulkMapper;


//    high_demand_products
    String query="select p.category_id, d.quantity from product as p inner join detail d on p.id = d.id where d.quantity>'10'";
    public List<Product>high_demand_products(){
        return namedParameterJdbcTemplate.query(query,productMapper);
    }



//    bulk_products
    String bulkQuery="select p.id, p.price from product as p inner join detail d on p.id = d.id where d.quantity>='8'";
    public List<Product>bulk_products(){
        return namedParameterJdbcTemplate.query(bulkQuery,productBulkMapper);
    }



//    getProductByCategory_Id
    public List<Product>getProductByCategory_Id(Integer id){
        return productRepository.getProductByCategory_Id(id);
    }

//    product/list
    public List<Product>productList(){
        return productRepository.findAll();
    }

    //    product/details/product_id
    public Product productDetailsProduct_id(Integer id){
        return productRepository.findById(id).get();
    }



}
