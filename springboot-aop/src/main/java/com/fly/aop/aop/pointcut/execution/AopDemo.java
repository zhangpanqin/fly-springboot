package com.fly.aop.aop.pointcut.execution;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import javax.validation.Validator;

/**
 * @author 张攀钦
 * @date 2019-08-30-01:16
 * @description 切入点表达式
 */
@Configuration
@Aspect
public class AopDemo {

    /**
     * 注解 修饰符 返回值类型 全限定类名.方法名(方法参数)
     */
    
    @Pointcut("execution(@(com.fly.aop.aop.annotation.AopAnnotation || io.swagger.annotations.ApiOperation) public * com.fly..*.*(..)))")
    public void checkParam(){
    }


    @Before("checkParam()")
    public void validationParam(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        System.out.println(args);
    }
}
