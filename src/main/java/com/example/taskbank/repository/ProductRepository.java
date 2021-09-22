package com.example.taskbank.repository;

import com.example.taskbank.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Integer> {

    @Query(value = "select p.id, p.price from product as p inner join detail d on p.id = d.id where d.quantity>='8'",nativeQuery = true)
    List<Product>bulk_products();

}
