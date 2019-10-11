package com.fly.spring.factory;

import com.fly.spring.MyListener;
import com.fly.spring.WebMvcConfig;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author 张攀钦
 * @date 2019-10-11-11:04
 * @description BeanPostProcessor 学习
 */
@Configuration
public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof WebMvcConfig){
            System.out.println(bean);
            System.out.println(beanName);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof WebMvcConfig){
            System.out.println(bean);
            System.out.println(beanName);
            Method[] allDeclaredMethods = ReflectionUtils.getAllDeclaredMethods(bean.getClass());
            for (Method allDeclaredMethod : allDeclaredMethods) {
                MyListener annotation = AnnotationUtils.findAnnotation(allDeclaredMethod, MyListener.class);
                if (annotation!=null){
                    try {
                        System.out.println(allDeclaredMethod.invoke(bean));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return bean;
    }
}
