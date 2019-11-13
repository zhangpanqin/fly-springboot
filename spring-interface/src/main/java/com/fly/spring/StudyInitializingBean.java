package com.fly.spring;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author 张攀钦
 * @date 2019-10-24-17:05
 * @description 学习 InitializingBean
 */
@Component
public class StudyInitializingBean {

    @PostConstruct
    public void test() {
        System.out.println("PostConstruct");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("preDestroy");
    }
}
