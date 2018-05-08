package com.sml.servicefeign.controller;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Author is sunmingliang, Email sunmlcn@163.com,
 * Date on 2018-04-13 17:35.
 * PS: Not easy to write code, please indicate.
 */
@FeignClient(value = "service-hi")
public interface FeignService
{
    @GetMapping("/hello")
    String getFeign(@RequestParam(value = "name") String name);

}
