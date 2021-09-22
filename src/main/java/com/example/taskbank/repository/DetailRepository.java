package com.example.taskbank.repository;

import com.example.taskbank.model.Detail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetailRepository extends JpaRepository<Detail,Integer> {

}
