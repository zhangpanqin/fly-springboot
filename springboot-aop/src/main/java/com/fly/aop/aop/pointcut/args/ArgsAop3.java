package com.fly.aop.aop.pointcut.args;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ArgsAop3 {

    /**
     * 被代理对象实现了接口或类，或者某个包下的类
     */

    @Pointcut("within(com.fly.aop..*)&&@args(com.fly.aop.aop.pointcut.args.annotation.ArgsTest)")
    public void checkParam(){
    }

    @Before(value = "checkParam()")
    public void before(){
        System.out.println("before");
    }
}