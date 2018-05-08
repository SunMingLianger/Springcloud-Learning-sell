package com.sml.order.enums;

import lombok.Getter;

/**
 * Created by 神迷的亮
 * 2018-05-08 14:07
 */
@Getter
public enum OrderStatusEnum
{
    NEW(0, "新订单"), FINISHED(1, "订单已完结"), CANCEL(2, "取消订单"),;

    private Integer code;

    private String msg;

    OrderStatusEnum(Integer code, String msg)
    {
        this.code = code;
        this.msg = msg;
    }
}
