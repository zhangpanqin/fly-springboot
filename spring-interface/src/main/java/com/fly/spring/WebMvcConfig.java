package com.fly.spring;

import org.springframework.context.annotation.Configuration;

/**
 * @author 张攀钦
 * @date 2019-10-11-11:07
 * @description
 */
@Configuration
public class WebMvcConfig{
    @MyListener
    public String log(){
        return "测试";
    }
}
