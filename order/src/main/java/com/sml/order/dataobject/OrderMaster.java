package com.sml.order.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by 神迷的亮
 * 2018-05-08 13:57
 */
@Data
@Entity
@DynamicUpdate
public class OrderMaster
{
    //订单ID
    @Id
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

    // 订单创建时间
    private Date createTime;

    //订单更新时间
    private Date updateTime;
}
