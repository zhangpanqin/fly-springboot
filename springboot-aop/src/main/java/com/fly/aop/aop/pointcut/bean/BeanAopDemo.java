package com.fly.aop.aop.pointcut.bean;

import org.springframework.context.annotation.Configuration;

/**
 * @author 张攀钦
 * @date 2019-09-01-14:56
 * @description
 */
@Configuration
public class BeanAopDemo {

    public void log() {
        System.out.println("log1");
    }
}
