package com.sml.servicemiya.repository;

import com.sml.servicemiya.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by 神迷的亮
 * 2018-05-08 11:11
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo, String>
{
    List<ProductInfo> findByProductStatus(Integer productStatus);

    List<ProductInfo> findByProductIdIn(List<String> productIdList);
}
