package com.sml.order.vo;

import lombok.Data;

/**
 * Created by 神迷的亮
 * 2018-05-08 14:41
 */
@Data
public class ResultVO<T>
{
    private Integer code;

    private String msg;

    private T data;
}
