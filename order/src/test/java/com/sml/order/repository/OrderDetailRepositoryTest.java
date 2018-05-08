package com.sml.order.repository;

import com.sml.order.OrderApplicationTests;
import com.sml.order.dataobject.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

/**
 * Created by 神迷的亮
 * 2018-05-08 14:14
 */
@Component
public class OrderDetailRepositoryTest extends OrderApplicationTests
{
    @Autowired
    private OrderDetailRepository repository;

    @Test
    @Transactional
    public void testSave()
    {
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("12");
        orderDetail.setOrderId("123");
        orderDetail.setProductIcon("1222323232");
        orderDetail.setProductName("sml");
        orderDetail.setProductPrice(new BigDecimal(19));
        orderDetail.setProductQuantity(2);
        orderDetail.setProductId("123");
        repository.save(orderDetail);

        Assert.assertNotNull(repository.save(orderDetail));
    }

}