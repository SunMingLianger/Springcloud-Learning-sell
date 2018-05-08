package com.sml.order.dto;

import com.sml.order.dataobject.OrderDetail;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by 神迷的亮
 * 2018-05-08 14:22
 */
@Data
public class OrderDTO
{
    //订单ID
    private String orderId;

    //买家名字
    private String buyerName;

    //买家手机号
    private String buyerPhone;

    //买家地址
    private String buyerAddress;

    //买家微信 openID
    private String buyerOpenid;

    //订单总金额
    private BigDecimal orderAmount;

    //订单状态 默认为0新下单
    private Integer orderStatus;

    //支付状态 默认为0未支付
    private Integer payStatus;

    private List<OrderDetail> orderDetailList;

}
