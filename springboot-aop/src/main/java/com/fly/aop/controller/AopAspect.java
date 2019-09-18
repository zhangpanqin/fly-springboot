package com.fly.aop.controller;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author 张攀钦
 * @date 2019-08-30-14:16
 * @description
 */
@Component
@Aspect
public class AopAspect {

    @Pointcut(value = "@annotation(com.fly.aop.annotation.AopAnnotation)")
    public void annotationPointcut(){

    }

    @Before(value = "annotationPointcut()")
    public void before(){
        System.out.println(111);
    }
}
