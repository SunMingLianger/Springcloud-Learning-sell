package com.sml.servicemiya.service.impl;

import com.sml.servicemiya.EurekaClientApplicationTests;
import com.sml.servicemiya.dataobject.ProductInfo;
import com.sml.servicemiya.service.ProductService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductServiceImplTest extends EurekaClientApplicationTests
{

    @Autowired
    private ProductService productService;

    @Test
    public void testFindUpAll() throws Exception
    {

        List<ProductInfo> productInfoList = productService.findUpAll();

        Assert.assertTrue(productInfoList.size() > 0);
    }

}   
  