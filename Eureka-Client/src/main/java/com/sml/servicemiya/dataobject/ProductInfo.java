package com.sml.servicemiya.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by 神迷的亮
 * 2018-05-08 11:06
 */
@Data
@Entity
public class ProductInfo implements Serializable
{
    private static final long serialVersionUID = -3867039632850275636L;

    @Id
    private String productId;

    /**
     * 商品名字
     */
    private String productName;

    /**
     * dan jia.
     */
    private BigDecimal productPrice;

    //ku cun
    private Integer productStock;

    //miao shu
    private String productDescription;

    //shang pin tu pian xiao tu
    private String productIcon;

    //lei mu bian  hao
    private Integer categoryType;

    private Date createTime;

    private Date updateTime;

    private Integer productStatus;

}
