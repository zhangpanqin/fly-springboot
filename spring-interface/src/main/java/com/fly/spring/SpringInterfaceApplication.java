package com.fly.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringInterfaceApplication {

    public static void main(String[] args) {
        final ConfigurableApplicationContext run = SpringApplication.run(SpringInterfaceApplication.class, args);
        System.out.println(run);
    }

}
