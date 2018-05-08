package com.sml.servicemiya.service;

import com.sml.servicemiya.EurekaClientApplicationTests;
import com.sml.servicemiya.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Created by 神迷的亮
 * 2018-05-08 11:43
 */
@Component
public class CategoryServiceTest extends EurekaClientApplicationTests
{
    @Autowired
    private CategoryService categoryService;

    @Test
    public void findByCategoryTypeIn()
    {
        List<ProductCategory> list = categoryService.findByCategoryTypeIn(Arrays.asList(0, 1, 10));
        Assert.assertTrue(list.size() > 0);
    }
}