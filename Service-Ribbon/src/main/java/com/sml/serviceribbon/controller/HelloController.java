package com.sml.serviceribbon.controller;

import com.sml.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController
{
    @Autowired
    private HelloService helloService;

    @GetMapping("/hello")
    public String sayHi(@RequestParam String name)
    {
        return helloService.hiService(name);
    }
}
