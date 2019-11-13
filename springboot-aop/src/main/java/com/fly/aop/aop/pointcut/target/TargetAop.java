package com.fly.aop.aop.pointcut.target;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class TargetAop {

    /**
     * 被代理对象实现了接口或类
     */

    @Pointcut("target(com.fly.aop.aop.pointcut.target.service.TargetService)&&args(java.lang.String)")
    public void checkParam() {
    }

    @Before("checkParam()")
    public void before() {
        System.out.println("before");
    }
}