package com.fly.spring;

import com.fly.spring.enable.EnableMyConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableMyConfiguration
public class SpringInterfaceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringInterfaceApplication.class, args);
    }

}
