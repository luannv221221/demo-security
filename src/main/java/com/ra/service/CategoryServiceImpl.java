package com.ra.service;

import com.ra.model.dto.CategoryRequestDTO;
import com.ra.model.dto.CategoryResponseDTO;
import com.ra.model.entity.Category;
import com.ra.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService{
    @Autowired
    private CategoryRepository categoryRepository;
    @Override
    public List<CategoryResponseDTO> findAll() {
        List<Category> categories = categoryRepository.findAll();
//        List<CategoryResponseDTO> list = new ArrayList<>();
//        for (Category category : categories) {
//            list.add(new CategoryResponseDTO(category));
//        }
        return categories.stream().map(CategoryResponseDTO::new).toList();
    }

    @Override
    public CategoryResponseDTO create(CategoryRequestDTO categoryRequestDTO) {

        Category category = categoryRepository.save(
                Category.builder().
                        categoryName(categoryRequestDTO.getCategoryName())
                        .categoryStatus(categoryRequestDTO.getCategoryStatus())
                        .build()
        );

        return new CategoryResponseDTO(category);
    }
}
