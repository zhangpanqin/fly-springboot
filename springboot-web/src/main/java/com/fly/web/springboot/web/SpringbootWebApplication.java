package com.fly.web.springboot.web;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootWebApplication {

    @Autowired
    private BeanFactory beanFactory;

    public static void main(String[] args) {
        final ConfigurableApplicationContext run = SpringApplication.run(SpringbootWebApplication.class, args);
        final ConfigurableListableBeanFactory beanFactory = run.getBeanFactory();
        System.out.println(beanFactory);
    }

}
