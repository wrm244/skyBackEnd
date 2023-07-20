package com.sky.dto;

import lombok.Data;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Data
@ApiModel(description = "菜品分类")
public class CategoryDTO implements Serializable {

    @ApiModelProperty("id")
    //主键
    private Long id;
    @ApiModelProperty("具体分类")
    //类型 1 菜品分类 2 套餐分类
    private Integer type;

    //分类名称
    @ApiModelProperty("分类名称")
    private String name;

    //排序
    @ApiModelProperty("排序")
    private Integer sort;

}
