package com.fly.aop.aop.pointcut.within.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author 张攀钦
 * @date 2019-09-01-15:22
 * @description
 */
@Component
@Primary
public class Parent {
    public void log() {
        System.out.println("Parent.log");
    }
}
