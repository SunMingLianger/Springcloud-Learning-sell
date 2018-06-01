package com.sml.order.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

/**
 * Created by 神迷的亮
 * 2018-05-31 09:32
 */
@RestController
@DefaultProperties(defaultFallback = "fallback")
@EnableHystrixDashboard
public class HystrixController
{
    @GetMapping("/getProductList")
    //超time配置
    //    @HystrixCommand(commandProperties = {@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "2000")})
    //服务熔断
    @HystrixCommand(commandProperties = {@HystrixProperty(name = "", value = ""), @HystrixProperty(name = "", value = ""),
            @HystrixProperty(name = "", value = ""), @HystrixProperty(name = "", value = ""),

    })
    public String getProductList()
    {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForObject("http://localhost:8080/product/listForOrder", Arrays.asList("123456"), String.class);
    }

    private String fallback()
    {
        return "你好，出了点小问题，请稍等哦";
    }
}
