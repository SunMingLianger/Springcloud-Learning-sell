package com.sml.order.dto;

import lombok.Data;

/**
 * Created by 神迷的亮
 * 2018-05-09 15:14
 */
@Data
public class CartDTO
{
    private String productId;

    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity)
    {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }

    public CartDTO()
    {
    }

}
