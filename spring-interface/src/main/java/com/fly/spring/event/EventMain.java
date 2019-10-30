package com.fly.spring.event;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 张攀钦
 * @date 2019-10-30-15:48
 * @description
 */
public class EventMain {
    @Test
    public void run1() {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext("com.fly.spring.event");
        EmailService bean = annotationConfigApplicationContext.getBean(EmailService.class);
        bean.sendEmail();
    }


}
