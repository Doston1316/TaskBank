package com.example.taskbank.service;

import com.example.taskbank.model.Customer;
import com.example.taskbank.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;


    //  customers_without_order
    public List<Customer> customers_without_order() {
        return customerRepository.getAllCustomer();
    }

    //    customers_last_orders
    public Customer customers_last_orders() {
        return customerRepository.findCustomerLastOrder();
    }


    //    number_of_products_in_year
    public List<Customer> number_of_products_in_year() {
        return customerRepository.number_of_products_in_year();
    }


}
