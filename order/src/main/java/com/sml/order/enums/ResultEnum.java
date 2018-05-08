package com.sml.order.enums;

import lombok.Getter;

/**
 * Created by 神迷的亮
 * 2018-05-08 14:44
 */
@Getter
public enum ResultEnum
{
    PARAM_ERROR(0, "参数错误"), CART_EMPTY(1, "购物车为空"),;

    private Integer code;

    private String msg;

    ResultEnum(Integer code, String msg)
    {
        this.code = code;
        this.msg = msg;
    }
}
