package com.sml.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_DECORATION_FILTER_ORDER;
import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_TYPE;

/**
 * 鉴权 权限拦截（区分卖家买家）
 * Created by 神迷的亮
 * 2018-05-21 17:15
 */
@Component
public class AuthFilter extends ZuulFilter
{
    @Override
    public String filterType()
    {
        return PRE_TYPE;
    }

    @Override
    public int filterOrder()
    {
        return PRE_DECORATION_FILTER_ORDER - 1;
    }

    @Override
    public boolean shouldFilter()
    {
        return true;
    }

    @Override
    public Object run()
    {
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
        /**
         * /order/create 只能买家访问
         * /order/finish  只能卖家访问
         * /product/list 都可访问
         */

        return null;
    }
}
