package com.sml.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * Created by 神迷的亮
 * 2018-05-22 09:30
 */
@RestController
public class LoginController
{
    @Autowired
    private StringRedisTemplate redisTemplate;

    @GetMapping("/login")
    public String getLogin()
    {
        redisTemplate.opsForValue().set("token_" + UUID.randomUUID().toString().trim().replaceAll("-", ""), "sml", 7200L, TimeUnit.SECONDS);

        return String.format("token_%s", "sun");
    }
}
