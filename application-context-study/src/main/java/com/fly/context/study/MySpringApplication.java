package com.fly.context.study;

import com.fly.context.demo.AppConfig;
import com.fly.starter.FlyAutoConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MySpringApplication extends SpringApplication {

    public MySpringApplication(Class<?>[] classes) {
        super(classes);
    }

    @Override
    protected ConfigurableApplicationContext createApplicationContext() {

        AnnotationConfigApplicationContext parent = new AnnotationConfigApplicationContext();
        parent.register(AppConfig.class);
        parent.refresh();
        final AnnotationConfigServletWebServerApplicationContext child = new AnnotationConfigServletWebServerApplicationContext();
        child.setParent(parent);
        child.refresh();
        return child;
    }
}