package com.sml.order.config;

import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.nio.charset.StandardCharsets;

/**
 * springboot配置tomcat的一些参数方式
 * Created by 神迷的亮
 * 2018-05-10 13:12
 */
@Configuration
public class TomcatConfig
{
    @Bean
    public EmbeddedServletContainerFactory servletContainer()
    {
        TomcatEmbeddedServletContainerFactory tomcat = new TomcatEmbeddedServletContainerFactory();
        tomcat.setUriEncoding(StandardCharsets.UTF_8);
        return tomcat;
    }

}
