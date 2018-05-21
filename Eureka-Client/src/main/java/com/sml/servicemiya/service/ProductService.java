package com.sml.servicemiya.service;

import com.sml.servicemiya.dataobject.ProductInfo;
import com.sml.servicemiya.dto.CartDTO;

import java.util.List;

/**
 * Created by 神迷的亮
 * 2018-05-08 11:29
 */
public interface ProductService
{
    List<ProductInfo> findUpAll();

    List<ProductInfo> findList(List<String> productIdList);

    void decreaseStock(List<CartDTO> cartDTOList);
}
