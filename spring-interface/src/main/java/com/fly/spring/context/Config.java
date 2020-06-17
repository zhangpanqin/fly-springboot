package com.fly.spring.context;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author 张攀钦
 * @date 2019-10-30-14:50
 * @description
 */
@ComponentScan(value = "com.fly.spring.context")
public class Config {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Config.class);
        Demo bean = annotationConfigApplicationContext.getBean(Demo.class);
        bean.log();
    }

    @Test
    public void run2() {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(DemoConfigurationA.class);
        A1 bean = annotationConfigApplicationContext.getBean(A1.class);
        A bean1 = annotationConfigApplicationContext.getBean(A.class);
        System.out.println(bean);
        System.out.println(bean1);
    }

    @Test
    public void run3() {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext("com.fly.spring.context");
        A1 bean = annotationConfigApplicationContext.getBean(A1.class);
        A bean1 = annotationConfigApplicationContext.getBean(A.class);
        System.out.println(bean);
        System.out.println(bean1);
    }
}
