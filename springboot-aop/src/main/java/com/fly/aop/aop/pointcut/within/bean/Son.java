package com.fly.aop.aop.pointcut.within.bean;

import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;

/**
 * @author 张攀钦
 * @date 2019-09-01-15:23
 * @description
 */
@Component
public class Son extends Parent {
    public void log( String name) {

        System.out.println(name);
    }
    public void log( Integer name) {

        System.out.println(name);
    }
}
