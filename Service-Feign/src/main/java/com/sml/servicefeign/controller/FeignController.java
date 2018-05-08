package com.sml.servicefeign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author is sunmingliang, Email sunmlcn@163.com,Date on 2018-04-13 17:44.
 * PS: Not easy to write code, please indicate.
 */
@RestController
public class FeignController
{
    @Autowired
    FeignService feignService;

    @GetMapping("/hello")
    public String sayHellowithFeign(@RequestParam("name") String name)
    {
        return feignService.getFeign(name);
    }
}
