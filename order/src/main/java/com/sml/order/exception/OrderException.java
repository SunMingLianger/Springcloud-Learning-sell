package com.sml.order.exception;

import com.sml.order.enums.ResultEnum;

/**
 * Created by 神迷的亮
 * 2018-05-08 14:44
 */
public class OrderException extends RuntimeException
{

    private static final long serialVersionUID = -6604566105423846605L;

    private Integer code;

    public OrderException(Integer code, String message)
    {
        super(message);
        this.code = code;
    }

    public OrderException(ResultEnum resultEnum)
    {
        super(resultEnum.getMsg());

        this.code = resultEnum.getCode();

    }
}
