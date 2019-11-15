package com.fly.web.springboot.web.common.filter;

import com.fly.web.springboot.web.service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.io.IOException;
import java.util.stream.Collectors;

/**
 * @author 张攀钦
 * @date 2019/8/21-13:50
 * 注册过滤器拦截
 */
@WebFilter(filterName = "com.fly.web.springboot.web.common.filter.JsonFilter", urlPatterns = "/*")
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
        // 传递包装类
        chain.doFilter(request, response);
    }

    @Override
    public void init(FilterConfig config) throws ServletException {
        System.out.println("JsonFilter-init-过滤器初始化");
    }

}