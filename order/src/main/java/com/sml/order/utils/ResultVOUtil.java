package com.sml.order.utils;

import com.sml.order.vo.ResultVO;

/**
 * Created by 神迷的亮
 * 2018-05-08 14:40
 */
public class ResultVOUtil
{
    public static ResultVO success(Object object)
    {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        resultVO.setData(object);
        return resultVO;
    }
}
