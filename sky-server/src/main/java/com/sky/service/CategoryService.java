package com.sky.service;

import com.sky.dto.CategoryDTO;

public interface CategoryService {
    /**
     * 添加菜品分类
     * @param categoryDTO
     */
    void save(CategoryDTO categoryDTO);
}
