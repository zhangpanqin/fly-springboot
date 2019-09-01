package com.fly.aop.aop.pointcut.within;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class WithinAop {

    /**
     * 被代理对象实现了接口或类，或者某个包下的类
     */

    @Pointcut("within(com.fly.aop.aop.pointcut.within.bean.Parent+)&&args(java.lang.String)")
    public void checkParam(){
    }

    @Before(value = "checkParam()&&args(name)")
    public void before(String name){
        System.out.println("before"+name);
    }
}