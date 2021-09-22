package com.example.taskbank.repository;

import com.example.taskbank.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order,Integer> {


}
