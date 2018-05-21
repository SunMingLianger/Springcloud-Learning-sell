package com.sml.order.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 神迷的亮
 * 2018-05-15 17:37
 */
@RestController
@RequestMapping("/env")
public class EnvController
{
    @Value("${env}")
    private String env;

    @GetMapping("/get")
    public String getEnv()
    {
        return "hello" + env;
    }

}
