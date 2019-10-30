package com.fly.spring.context;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author 张攀钦
 * @date 2019-10-30-15:04
 * @description
 */
@Configuration
@Import(DemoConfigurationB.class)
public class DemoConfigurationA {
    @Bean
    public A1 initA1(A a) {
        System.out.println(a);
        return new A1();
    }

}

class A1 {
}