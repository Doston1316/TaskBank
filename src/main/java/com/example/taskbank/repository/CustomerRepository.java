package com.example.taskbank.repository;

import com.example.taskbank.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {


    @Query(value = "select * from Customer as c inner join orders o on c.id = o.customer_id where '2015-12-31'<o.date and o.date <'2017-01-01'",nativeQuery = true)
    List<Customer>getAllCustomer();



    @Query(value = "select * from customer as c inner join orders o on c.id = o.customer_id order by o.date desc limit 1",nativeQuery = true)
    Customer findCustomerLastOrder();


    @Query(value = "select * from Customer as c inner join orders o on c.id = o.customer_id where '2015-12-31'<o.date and o.date <'2017-01-01'",nativeQuery = true)
    List<Customer>number_of_products_in_year();

}
