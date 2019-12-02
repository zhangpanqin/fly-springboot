package com.fly.aop;

import com.fly.aop.aop.pointcut.bean.BeanAopDemo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(exclude = {})
public class StudyAopApplication {

    public static void main(String[] args) {
        final ConfigurableApplicationContext run =
                SpringApplication.run(StudyAopApplication.class, args);
        final BeanAopDemo bean = run.getBean(BeanAopDemo.class);
        bean.log();
    }

}
