package com.fly.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 张攀钦
 * @date 2020-01-22-01:30
 * @description
 */
@Configuration
@Avoid
public class TestNotScan {

    @Bean
    public String testString(){
        System.out.println("TestNotScan 执行了");
            return "测试";
    }
}
