package com.fly.web.springboot.web.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * @author 张攀钦
 * @date 2019-11-10-01:13
 * @description
 */
@Component
public class ApplicationContextDemo implements CommandLineRunner {


    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    private DispatcherServlet dispatcherServlet;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(applicationContext);
        System.out.println(dispatcherServlet.getWebApplicationContext());
    }
}
