package com.sky.service.impl;

import java.time.LocalDateTime;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sky.constant.StatusConstant;
import com.sky.context.BaseContext;
import com.sky.dto.CategoryDTO;
import com.sky.entity.Category;
import com.sky.mapper.CategoryMapper;
import com.sky.service.CategoryService;
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;
    @Override
    public void save(CategoryDTO categoryDTO) {
        Category category = Category.builder()
                        .status(StatusConstant.ENABLE)
                        .createTime(LocalDateTime.now())
                        .updateTime(LocalDateTime.now())
                        .createUser(BaseContext.getCurrentId())
                        .updateUser(BaseContext.getCurrentId())
                        .build();
        BeanUtils.copyProperties(categoryDTO,category);
        categoryMapper.insert(category);
    }
    
}
