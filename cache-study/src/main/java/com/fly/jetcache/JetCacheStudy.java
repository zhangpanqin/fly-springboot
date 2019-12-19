package com.fly.jetcache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.CacheManager;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JetCacheStudy {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(JetCacheStudy.class);
        CacheManager bean = run.getBean(CacheManager.class);
        System.out.println(bean);
    }
}