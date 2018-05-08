package com.sml.servicemiya.service.impl;

import com.sml.servicemiya.dataobject.ProductCategory;
import com.sml.servicemiya.repository.ProductCategoryRepository;
import com.sml.servicemiya.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 神迷的亮
 * 2018-05-08 11:41
 */
@Service
public class CategoryServiceImpl implements CategoryService
{
    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryList)
    {
        return productCategoryRepository.findByCategoryTypeIn(categoryList);
    }
}
