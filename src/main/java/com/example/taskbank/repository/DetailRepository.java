package com.example.taskbank.repository;

import com.example.taskbank.model.Detail;
import com.example.taskbank.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DetailRepository extends JpaRepository<Detail,Integer> {



}
