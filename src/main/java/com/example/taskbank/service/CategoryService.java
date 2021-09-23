package com.example.taskbank.service;

import com.example.taskbank.model.Category;
import com.example.taskbank.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

//    allProductCategoryList
    public List<Category> allProductCategoryList(){
        return categoryRepository.findAllCategory();
    }



}
