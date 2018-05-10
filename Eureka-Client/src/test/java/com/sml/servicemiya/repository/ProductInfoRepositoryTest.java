package com.sml.servicemiya.repository;

import com.sml.servicemiya.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

/**
 * Created by 神迷的亮
 * 2018-05-08 11:14
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest
{
    @Autowired
    private ProductInfoRepository repository;

    @Test
    public void findByProductStatus()
    {
        List<ProductInfo> productInfoList = repository.findByProductStatus(0);

        Assert.assertTrue(productInfoList.size() > 0);
    }

    @Test
    public void findId()
    {
        List<String> idList = Arrays.asList("123456", "123457", "123458");

        List<ProductInfo> productInfos = repository.findByProductIdIn(idList);

        Assert.assertNotNull(productInfos);
    }
}