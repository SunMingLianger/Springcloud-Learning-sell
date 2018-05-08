package com.sml.servicemiya.repository;

import com.sml.servicemiya.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by 神迷的亮
 * 2018-05-08 11:23
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ProductCategoryRepositoryTest
{

    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findByCategoryTypeIn()
    {
        List<Integer> categotyList = new ArrayList<>();
        categotyList.add(0);
        categotyList.add(1);
        categotyList.add(10);

        List<ProductCategory> productCategoryList = this.repository.findByCategoryTypeIn(categotyList);

        Assert.assertTrue(productCategoryList.size() > 0);
    }
}