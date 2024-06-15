package com.ra.service;

import com.ra.model.dto.CategoryRequestDTO;
import com.ra.model.dto.CategoryResponseDTO;

import java.util.List;

public interface CategoryService {
    List<CategoryResponseDTO> findAll();
    CategoryResponseDTO create(CategoryRequestDTO categoryRequestDTO);
}
