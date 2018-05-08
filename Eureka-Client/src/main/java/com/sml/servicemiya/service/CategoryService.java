package com.sml.servicemiya.service;

import com.sml.servicemiya.dataobject.ProductCategory;

import java.util.List;

/**
 * 类目
 * Created by 神迷的亮
 * 2018-05-08 11:40
 */
public interface CategoryService
{
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryList);

}
