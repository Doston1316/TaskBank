package com.example.taskbank.repository;

import com.example.taskbank.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category,Integer> {


    @Query(value = "select * from category as c inner join product  p on c.id = p.category_id",nativeQuery = true)
    List<Category>findAllCategory();



}
