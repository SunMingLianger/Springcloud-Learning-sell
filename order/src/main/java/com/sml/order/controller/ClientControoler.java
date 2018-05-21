package com.sml.order.controller;

import com.sml.order.client.ProductClient;
import com.sml.order.dataobject.ProductInfo;
import com.sml.order.dto.CartDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by 神迷的亮
 * 2018-05-08 15:41
 */
@RestController
@Slf4j
public class ClientControoler
{

    //    @Autowired
    //    private LoadBalancerClient loadBalancerClient;

        @Autowired
        private RestTemplate restTemplate;

    @Autowired
    private ProductClient productClient;

    @GetMapping("/getProductMsg")
    public String getProductMsg()
    {
        /**
         * resttemplate的三种使用方式
         */
        //1。直接使用Rest 写死了URL
        //        RestTemplate restTemplate = new RestTemplate();

        //String response = restTemplate.getForObject("http://localhost:8762/msg", String.class);

        //2 通过loadbalanceclient获取应用名url,然后再使用resttemplate
        //        ServiceInstance serviceInstance = loadBalancerClient.choose("PRODUCT");
        //
        //        String url = String.format("http://%s:%s", serviceInstance.getHost(), serviceInstance.getPort()) + "/msg";
        //
        //        String response = restTemplate.getForObject(url, String.class);

        //3.
        //        String response = restTemplate.getForObject("http://PRODUCT/msg", String.class);
        //        log.info("response = {}", response);
        //        return response;
        String response = productClient.productMsg();

        log.info("response = {}", response);
        return response;

    }

    @GetMapping("/getProductList")
    public String getList()
    {
        List<ProductInfo> list = productClient.listForOrder(Arrays.asList("123456", "123457"));

        log.info("list = {}", list);

        return "ok";
    }

    @GetMapping("/decreaseStock")
    public String decreaseStock()
    {
        productClient.decreaseStock(Arrays.asList(new CartDTO("123456", 3)));
        return "ok";
    }

}
