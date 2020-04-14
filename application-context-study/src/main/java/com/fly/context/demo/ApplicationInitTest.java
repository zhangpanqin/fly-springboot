package com.fly.context.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 张攀钦
 * @date 2020-04-03-12:52
 */
public class ApplicationInitTest {
    public static void main(String[] args) throws InterruptedException {
        final AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
        annotationConfigApplicationContext.register(AppConfig.class);
        annotationConfigApplicationContext.refresh();
        Thread.sleep(3000);
        annotationConfigApplicationContext.close();
    }
}
