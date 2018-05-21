package com.sml.servicemiya.exception;

import com.sml.servicemiya.enums.ResultEnum;

/**
 * Created by 神迷的亮
 * 2018-05-09 13:59
 */
public class ProductException extends RuntimeException
{
    private Integer code;

    public ProductException(Integer code, String msg)
    {
        super(msg);
        this.code = code;
    }

    public ProductException(ResultEnum resultEnum)
    {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();

    }
}
