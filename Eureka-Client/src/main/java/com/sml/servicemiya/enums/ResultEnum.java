package com.sml.servicemiya.enums;

import lombok.Getter;

/**
 * Created by 神迷的亮
 * 2018-05-09 14:01
 */
@Getter
public enum ResultEnum
{
    PRODUCT_NOT_EXIST(1, "商品不存在"), PRODUCT_STOCK_ERROR(2, "库存有误"),;

    private Integer code;

    private String msg;

    ResultEnum(Integer code, String msg)
    {
        this.code = code;
        this.msg = msg;
    }
}
