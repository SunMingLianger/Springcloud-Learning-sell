package com.sml.servicemiya.utils;

import com.sml.servicemiya.vo.ResultVo;

/**
 * Created by 神迷的亮
 * 2018-05-08 13:14
 */
public class ResultVoUtil
{
    public static ResultVo success(Object o)
    {
        ResultVo<Object> resultVo = new ResultVo<>();

        resultVo.setMessage("成功");
        resultVo.setCode(0);
        resultVo.setData(o);

        return resultVo;
    }
}
