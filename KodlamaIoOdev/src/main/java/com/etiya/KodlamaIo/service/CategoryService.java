package com.etiya.KodlamaIo.service;

import com.etiya.KodlamaIo.entity.Category;
import com.etiya.KodlamaIo.entity.User;
import com.etiya.KodlamaIo.repository.ICategoryRepository;
import com.etiya.KodlamaIo.repository.IUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final ICategoryRepository categoryRepository;

    public Category createCategory(Category category){
        return categoryRepository.save(category);
    }







}