package com.sml.servicemiya.service.impl;

import com.sml.servicemiya.dataobject.ProductInfo;
import com.sml.servicemiya.enums.ProductStatusEnum;
import com.sml.servicemiya.repository.ProductInfoRepository;
import com.sml.servicemiya.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 神迷的亮
 * 2018-05-08 11:31
 */
@Service
public class ProductServiceImpl implements ProductService
{
    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Override
    public List<ProductInfo> findUpAll()
    {
        List<ProductInfo> productInfoList = productInfoRepository.findByProductStatus(ProductStatusEnum.UP.getCode());
        return productInfoList;
    }
}
