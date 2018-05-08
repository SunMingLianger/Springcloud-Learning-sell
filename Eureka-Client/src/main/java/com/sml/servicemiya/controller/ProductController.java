package com.sml.servicemiya.controller;

import com.sml.servicemiya.dataobject.ProductCategory;
import com.sml.servicemiya.dataobject.ProductInfo;
import com.sml.servicemiya.service.CategoryService;
import com.sml.servicemiya.service.ProductService;
import com.sml.servicemiya.utils.ResultVoUtil;
import com.sml.servicemiya.vo.ProductInfoVo;
import com.sml.servicemiya.vo.ProductVo;
import com.sml.servicemiya.vo.ResultVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by 神迷的亮
 * 2018-05-08 10:58
 */
@RestController
@RequestMapping("/product")
public class ProductController
{
    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;

    /**
     * 1.查询所有在架的商品
     * 2.获取类目type列表
     * 3.查询类目
     * 4.构造数据
     */
    @GetMapping("list")
    public ResultVo<ProductVo> list()
    {
        List<ProductInfo> productInfoList = productService.findUpAll();

        List<Integer> categoryTypeList = productInfoList.stream().map(ProductInfo::getCategoryType).collect(Collectors.toList());

        List<ProductCategory> productCategoryList = categoryService.findByCategoryTypeIn(categoryTypeList);
        List<ProductVo> productVoList = new ArrayList<>();

        for (ProductCategory productCategory : productCategoryList)
        {
            ProductVo productVo = new ProductVo();
            productVo.setCategoryName(productCategory.getCategoryName());
            productVo.setCategoryType(productCategory.getCategoryType());

            List<ProductInfoVo> productInfoVoList = new ArrayList<>();
            for (ProductInfo productInfo : productInfoList)
            {
                if (productInfo.getCategoryType().equals(productCategory.getCategoryType()))
                {
                    ProductInfoVo productInfoVo = new ProductInfoVo();
                    BeanUtils.copyProperties(productInfo, productInfoVo);
                    productInfoVoList.add(productInfoVo);

                }
            }
            productVo.setProductInfoVoList(productInfoVoList);
            productVoList.add(productVo);
        }
        return ResultVoUtil.success(productVoList);
    }
}
