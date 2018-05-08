package com.sml.servicemiya.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * http请求返回的最外层对象
 * Created by 神迷的亮
 * 2018-05-08 11:48
 */
@Data
public class ResultVo<T> implements Serializable
{
    private static final long serialVersionUID = -5390583734831029159L;

    /**
     * 错误吗 正常0
     */
    private Integer code;

    //提示信息
    private String message;

    //具体内容
    private T data;
}
