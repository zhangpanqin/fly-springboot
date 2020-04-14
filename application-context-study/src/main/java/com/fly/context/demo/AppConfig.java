package com.fly.context.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;


/**
 * @author zhangpanqin
 */
@Import(AppConfig2.class)
public class AppConfig {

    @Bean(initMethod = "init")
    public Foo foo() {
        return new Foo();
    }

    @Bean(destroyMethod = "cleanup")
    public Bar bar() {
        return new Bar();
    }
}