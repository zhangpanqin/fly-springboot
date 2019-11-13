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
import java.util.StringJoiner;
import java.util.stream.Collectors;

/**
 * @author 张攀钦
 * @date 2019/8/21-13:43
 * 解决乱码问题
 */
@Slf4j
@WebFilter(filterName = "com.fly.web.springboot.web.common.filter.ContentTypeCharsetFilter", urlPatterns = "/*")
@Component
public class ContentTypeCharsetFilter implements Filter {

    @Autowired
    private DemoService demoService;

    @Override
    public void destroy() {
        System.out.println("ContentTypeCharsetFilter-destroy-过滤器销毁");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        // 使用 原始的 httpServletRequest 进行业务操作
        String body = request.getReader().lines().collect(Collectors.joining());
        System.out.println(body);
        // 传递包装类
        chain.doFilter(request, response);

    }

    @Override
    public void init(FilterConfig config) throws ServletException {
        System.out.println("ContentTypeCharsetFilter-init-过滤器初始化");
    }
}