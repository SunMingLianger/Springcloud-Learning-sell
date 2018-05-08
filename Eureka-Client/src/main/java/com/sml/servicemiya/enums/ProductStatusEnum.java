package com.sml.servicemiya.enums;

import lombok.Getter;

/**
 * Created by 神迷的亮
 * 2018-05-08 11:32
 */
@Getter
public enum ProductStatusEnum
{

    UP(0, "在架"),

    DOWN(1, "下架"),;

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message)
    {
        this.code = code;
        this.message = message;
    }
}
