package com.sml.servicemiya.service.impl;

import com.sml.servicemiya.dataobject.ProductInfo;
import com.sml.servicemiya.dto.CartDTO;
import com.sml.servicemiya.enums.ProductStatusEnum;
import com.sml.servicemiya.enums.ResultEnum;
import com.sml.servicemiya.exception.ProductException;
import com.sml.servicemiya.repository.ProductInfoRepository;
import com.sml.servicemiya.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
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

    @Override
    public List<ProductInfo> findList(List<String> productIdList)
    {
        return productInfoRepository.findByProductIdIn(productIdList);
    }

    @Override
    @Transactional
    public void decreaseStock(List<CartDTO> cartDTOList)
    {
        for (CartDTO cartDTO : cartDTOList)
        {
            ProductInfo productInfo = productInfoRepository.findOne(cartDTO.getProductId());
            //判断商品是否存在
            if (productInfo == null)
            {
                throw new ProductException(ResultEnum.PRODUCT_NOT_EXIST);
            }

            Integer result = productInfo.getProductStock() - cartDTO.getProductQuantity();
            //库存是否足够
            if (result < 0)
            {
                throw new ProductException(ResultEnum.PRODUCT_STOCK_ERROR);
            }
            productInfo.setProductStock(result);
            productInfoRepository.save(productInfo);
        }
    }
}
