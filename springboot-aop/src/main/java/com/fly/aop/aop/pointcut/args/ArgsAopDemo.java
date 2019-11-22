package com.fly.aop.aop.pointcut.args;

import com.fly.aop.aop.pointcut.args.entity.ArgsBean;
import com.fly.aop.aop.pointcut.args.entity.ArgsBeanNoAnnotation;
import org.springframework.context.annotation.Configuration;

/**
 * @author 张攀钦
 * @date 2019-09-01-19:12
 * @description 测试 args
 */
@Configuration
public class ArgsAopDemo {
    public void noAnnotation(ArgsBeanNoAnnotation argsBean) {
        System.out.println(argsBean);
    }

    public void withAnnotation(ArgsBean argsBean) {
        System.out.println(argsBean);
    }
}
