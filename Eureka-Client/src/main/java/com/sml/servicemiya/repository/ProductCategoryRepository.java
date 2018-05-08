package com.sml.servicemiya.repository;

import com.sml.servicemiya.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by 神迷的亮
 * 2018-05-08 11:20
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer>
{
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categorytypeList);
}
