package com.fly.aop.aop.pointcut.bean;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

/**
 * @author 张攀钦
 * @date 2019-09-01-14:55
 * @description
 */
@Aspect
@Configuration
public class BeanAop {

    @Pointcut("bean(beanAopDemo)")
    public void checkParam() {
    }

    @Before("checkParam()")
    public void before() {
        System.out.println("before");
    }
}
