package com.sml.order.converter;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.sml.order.dataobject.OrderDetail;
import com.sml.order.dto.OrderDTO;
import com.sml.order.enums.ResultEnum;
import com.sml.order.exception.OrderException;
import com.sml.order.form.OrderForm;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 神迷的亮
 * 2018-05-08 14:49
 */
@Slf4j
public class OrderForm2OrderDTOConverter
{

    public static OrderDTO convert(OrderForm orderForm)
    {
        Gson gson = new Gson();
        OrderDTO orderDTO = new OrderDTO();

        orderDTO.setBuyerName(orderForm.getName());
        orderDTO.setBuyerPhone(orderForm.getPhone());
        orderDTO.setBuyerAddress(orderForm.getAddress());
        orderDTO.setBuyerOpenid(orderForm.getOpenid());

        List<OrderDetail> orderDetailList = new ArrayList<>();
        try
        {
            orderDetailList = gson.fromJson(orderForm.getItems(), new TypeToken<List<OrderDetail>>()
            {
            }.getType());

        }
        catch (Exception e)
        {
            log.error("对象转换错误 ，String  = {}", orderForm.getItems());
            throw new OrderException(ResultEnum.PARAM_ERROR);
        }
        orderDTO.setOrderDetailList(orderDetailList);

        return orderDTO;
    }
}
