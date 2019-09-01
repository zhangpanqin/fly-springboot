package com.fly.aop.aop.pointcut.args;
import com.fly.aop.aop.pointcut.args.entity.ArgsBean;
import com.fly.aop.aop.pointcut.args.entity.ArgsBeanNoAnnotation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author 张攀钦
 * @date 2019-09-01-19:16
 * @description
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ArgsAopDemoTest {

    @Autowired
    private ArgsAopDemo argsAopDemo;

    @Test
    public void noAnnotation() {
        ArgsBeanNoAnnotation argsBeanNoAnnotation = new ArgsBeanNoAnnotation();
        argsBeanNoAnnotation.setName("no-annotation");
        argsAopDemo.noAnnotation(argsBeanNoAnnotation);
    }

    @Test
    public void withAnnotation() {
        ArgsBean argsBean = new ArgsBean();
        argsBean.setName("with-annotation");
        argsAopDemo.withAnnotation(argsBean);
    }
}
