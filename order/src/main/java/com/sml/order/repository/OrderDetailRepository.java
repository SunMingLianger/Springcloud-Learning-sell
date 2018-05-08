package com.sml.order.repository;

import com.sml.order.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 神迷的亮
 * 2018-05-08 14:02
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String>
{
}
