package com.fly.spring.context;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 张攀钦
 * @date 2019-10-30-15:04
 * @description
 */
@Configuration
public class DemoConfigurationB {

    @Bean
    public A initA() {
        return new A();
    }


}

class A {
}