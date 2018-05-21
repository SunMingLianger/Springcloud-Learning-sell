package com.sml.order.service.impl;

import com.sml.order.client.ProductClient;
import com.sml.order.dataobject.OrderDetail;
import com.sml.order.dataobject.OrderMaster;
import com.sml.order.dataobject.ProductInfo;
import com.sml.order.dto.CartDTO;
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
import java.math.BigInteger;
import java.util.List;
import java.util.stream.Collectors;

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

    @Autowired
    private ProductClient productClient;

    @Override
    public OrderDTO create(OrderDTO orderDTO)
    {
        String orderId = KeyUtil.generateKey();
        //TODO 查询商品信息
        List<String> productIdList = orderDTO.getOrderDetailList().stream().map(OrderDetail::getProductId).collect(Collectors.toList());
        List<ProductInfo> productInfoList = productClient.listForOrder(productIdList);
        //  计算总价
        BigDecimal orderAmount = new BigDecimal(BigInteger.ZERO);
        for (OrderDetail orderDetail : orderDTO.getOrderDetailList())
        {
            for (ProductInfo productInfo : productInfoList)
            {
                //单价＊数量
                if (productInfo.getProductId().equals(orderDetail.getProductId()))
                {
                    orderAmount = productInfo.getProductPrice().multiply(new BigDecimal(orderDetail.getProductQuantity())).add(orderAmount);
                    BeanUtils.copyProperties(productInfo, orderDetail);
                    orderDetail.setOrderId(orderId);
                    orderDetail.setDetailId(KeyUtil.generateKey());
                    //订单详情入库
                    orderDetailRepository.save(orderDetail);
                }
            }

        }
        //  扣库存

        productClient.decreaseStock(
                orderDTO.getOrderDetailList().stream().map(e -> new CartDTO(e.getProductId(), e.getProductQuantity())).collect(Collectors.toList()));
        //  订单入库
        OrderMaster orderMaster = new OrderMaster();
        orderDTO.setOrderId(orderId);
        BeanUtils.copyProperties(orderDTO, orderMaster);
        orderMaster.setOrderAmount(orderAmount);
        orderMaster.setOrderStatus(OrderStatusEnum.NEW.getCode());
        orderMaster.setPayStatus(PayStatusEnum.WAIT.getCode());

        orderMasterRepository.save(orderMaster);
        return orderDTO;
    }
}
