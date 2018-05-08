package com.sml.order.service.impl;

import com.sml.order.dataobject.OrderMaster;
import com.sml.order.dto.OrderDTO;
import com.sml.order.enums.OrderStatusEnum;
import com.sml.order.enums.PayStatusEnum;
import com.sml.order.repository.OrderDetailRepository;
import com.sml.order.repository.OrderMasterRepository;
import com.sml.order.service.OrderService;
import com.sml.order.utils.KeyUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * Created by 神迷的亮
 * 2018-05-08 14:19
 */
@Service
public class OrderServiceImpl implements OrderService
{
    @Autowired
    private OrderMasterRepository orderMasterRepository;

    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Override
    public OrderDTO create(OrderDTO dto)
    {
        //TODO 查询商品信息

        //  计算总价
        //  扣库存
        //  订单入库
        OrderMaster orderMaster = new OrderMaster();
        dto.setOrderId(KeyUtil.generateKey());
        BeanUtils.copyProperties(dto, orderMaster);
        orderMaster.setOrderAmount(new BigDecimal(5));
        orderMaster.setOrderStatus(OrderStatusEnum.NEW.getCode());
        orderMaster.setPayStatus(PayStatusEnum.WAIT.getCode());
        orderMaster.setOrderId(KeyUtil.generateKey());

        orderMasterRepository.save(orderMaster);
        return dto;
    }
}
