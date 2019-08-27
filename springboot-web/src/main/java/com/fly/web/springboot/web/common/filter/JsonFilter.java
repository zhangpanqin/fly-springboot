package com.fly.web.springboot.web.common.filter;

import com.fly.web.springboot.web.service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author 张攀钦
 * @date 2019/8/21-13:50
 * 注册过滤器拦截
 */
@WebFilter(filterName = "com.fly.web.springboot.web.common.filter.JsonFilter", urlPatterns = "/servlet/json/*")
@Slf4j
@Component
public class JsonFilter implements Filter {

    @Autowired
    private DemoService demoService;

    @Override
    public void destroy() {
        System.out.println("JsonFilter-过滤器销毁");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("JsonFilter-执行过滤操作");
        demoService.log();
        chain.doFilter(request, response);
        System.out.println("JsonFilter-chain.doFilter-执行过滤操作");
    }

    @Override
    public void init(FilterConfig config) throws ServletException {
        System.out.println("JsonFilter-init-过滤器初始化");
    }

}