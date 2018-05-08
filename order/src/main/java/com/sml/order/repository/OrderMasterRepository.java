package com.sml.order.repository;

import com.sml.order.dataobject.OrderMaster;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 神迷的亮
 * 2018-05-08 14:01
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster, String>
{

}
