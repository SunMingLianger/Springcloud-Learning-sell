package com.sml.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy//kaiqi zuul
//@EnableDiscoveryClient
@SpringBootApplication
public class ServiceZuulApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(ServiceZuulApplication.class, args);
    }

//    //动态路由功能
//    @ConfigurationProperties("zuul")
//    @RefreshScope
//    public ZuulProperties zuulProperties()
//    {
//        return new ZuulProperties();
//    }
}
