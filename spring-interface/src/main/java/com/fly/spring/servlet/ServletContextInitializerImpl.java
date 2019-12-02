package com.fly.spring.servlet;

import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.stereotype.Component;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 * @author 张攀钦
 * @date 2019-11-30-22:39
 * @description
 */
@Component
public class ServletContextInitializerImpl implements ServletContextInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        System.out.println("==========================");
    }
}
