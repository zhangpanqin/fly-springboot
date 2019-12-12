package com.fly.web.springboot.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.servlet.DispatcherServlet;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootWebApplicationTests {

    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    private DispatcherServlet dispatcherServlet;

    @Test
    public void contextLoads() {
        System.out.println(applicationContext);
        System.out.println(dispatcherServlet.getWebApplicationContext());
    }

}
