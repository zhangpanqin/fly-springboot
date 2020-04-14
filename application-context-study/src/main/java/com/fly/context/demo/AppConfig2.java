package com.fly.context.demo;

import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;


/**
 * @author zhangpanqin
 */
public class AppConfig2 {

    @PostConstruct
    public void init() {
        System.out.println("AppConfig2.init");

    }
}