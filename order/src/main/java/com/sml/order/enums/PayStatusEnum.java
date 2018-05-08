package com.sml.order.enums;

import lombok.Getter;

/**
 * Created by 神迷的亮
 * 2018-05-08 14:07
 */
@Getter
public enum PayStatusEnum
{
    WAIT(0, "等待支付"), SUCCESS(1, "支付成功"),;

    private Integer code;

    private String msg;

    PayStatusEnum(Integer code, String msg)
    {
        this.code = code;
        this.msg = msg;
    }
}
