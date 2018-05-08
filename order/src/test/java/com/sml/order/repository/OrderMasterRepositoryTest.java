package com.sml.order.repository;

import com.sml.order.OrderApplicationTests;
import com.sml.order.dataobject.OrderMaster;
import com.sml.order.enums.OrderStatusEnum;
import com.sml.order.enums.PayStatusEnum;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

/**
 * Created by 神迷的亮
 * 2018-05-08 14:03
 */
@Component
@Slf4j
public class OrderMasterRepositoryTest extends OrderApplicationTests
{
    @Autowired
    private OrderMasterRepository repository;

    @Test
    @Transactional
    public void testSave()
    {
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("1234");
        orderMaster.setBuyerAddress("sdsd");
        orderMaster.setBuyerName("sml");
        orderMaster.setBuyerOpenid("12345");
        orderMaster.setBuyerPhone("12");
        orderMaster.setPayStatus(PayStatusEnum.WAIT.getCode());
        orderMaster.setOrderAmount(new BigDecimal(192.0));
        orderMaster.setOrderStatus(OrderStatusEnum.NEW.getCode());

        OrderMaster save = repository.save(orderMaster);

        Assert.assertNotNull(save);
    }
}