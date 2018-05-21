package com.sml.order.client;

import com.sml.order.dataobject.ProductInfo;
import com.sml.order.dto.CartDTO;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * Created by 神迷的亮
 * 2018-05-08 17:32
 */
@FeignClient(name = "product")
public interface ProductClient
{
    @GetMapping("/msg")
    String productMsg();

    /**
     * 当含有@requestbody注解时，必须使用post方式。切记
     **/
    @PostMapping("/product/listForOrder")
    List<ProductInfo> listForOrder(@RequestBody List<String> productList);

    @PostMapping("/product/decreaseStock")
    void decreaseStock(@RequestBody List<CartDTO> cartDTOList);
}
