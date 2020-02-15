package com.fly.spring.init;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author 张攀钦
 * @date 2019-11-17-12:41
 * @description 小鸟初始化类
 */
//@Configuration
public class BirdConfig implements InitializingBean, DisposableBean, BeanPostProcessor, ApplicationContextAware {
    @Bean
    public Bird bird() {
        return new Bird();
    }

    public BirdConfig(){
        System.out.println("BirdConfig 初始化 构造函数");
    }

    @PostConstruct
    public void init() {
        System.out.println("BirdConfig 类 @PostConstruct 标记的方法");
    }

    @PreDestroy
    public void destory() {
        System.out.println("BirdConfig 类 @PreDestroy 标记的方法");
    }

    @Override
    public void destroy() {
        System.out.println("BirdConfig 类 DisposableBean.destroy");
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("BirdConfig 类 InitializingBean.afterPropertiesSet");
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BirdConfig 类 BeanPostProcessor.postProcessBeforeInitialization");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BirdConfig 类 BeanPostProcessor.postProcessAfterInitialization");
        return bean;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("BirdConfig ApplicationContextAware.setApplicationContext");
    }
}
