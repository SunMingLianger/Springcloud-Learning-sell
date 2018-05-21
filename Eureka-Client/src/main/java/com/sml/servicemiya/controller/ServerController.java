package com.sml.servicemiya.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 神迷的亮
 * 2018-05-08 15:40
 */
@RestController
public class ServerController
{
    @GetMapping("/msg")
    public String msg()
    {
        return "this.is product msg 2";
    }
}
