package com.fly.aop;

import com.fly.aop.aop.pointcut.bean.BeanAopDemo;
import com.fly.aop.aop.pointcut.bean.BeanAopDemo2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.validation.Validator;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudyAopApplicationTests {

    @Autowired
    private BeanAopDemo beanAopDemo;

    @Autowired
    private BeanAopDemo2 beanAopDemo2;
    @Test
    public void contextLoads() {
     beanAopDemo.log();
    }

    @Test
    public void test2() {
        beanAopDemo2.log();
    }

}
