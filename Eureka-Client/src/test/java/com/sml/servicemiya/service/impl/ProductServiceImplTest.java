package com.sml.servicemiya.service.impl;

import com.sml.servicemiya.EurekaClientApplicationTests;
import com.sml.servicemiya.dataobject.ProductInfo;
import com.sml.servicemiya.dto.CartDTO;
import com.sml.servicemiya.service.ProductService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
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

    @Test
    public void testFindList()
    {
        List<String> idList = Arrays.asList("123456", "123457", "123458");

        List<ProductInfo> list = productService.findList(idList);

        Assert.assertTrue(list.size() > 0);

    }

    @Test
    public void decreaseStock() throws Exception
    {
        List<CartDTO> cartDTOList = new ArrayList<>();

        CartDTO cartDTO = new CartDTO("123456", 1);

        cartDTOList.add(cartDTO);
        productService.decreaseStock(cartDTOList);
    }
}   
  