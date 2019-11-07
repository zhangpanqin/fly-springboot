package com.fly.aop.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author 张攀钦
 * @date 2019-09-14-17:59
 * @description 测试反射
 */
public class ReflectDemo {

    public String log(String name) {
        System.out.println(name);
        return name;
    }

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ReflectDemo reflectDemo = new ReflectDemo();
        Method log = reflectDemo.getClass().getMethod("log", String.class);
        Object ret = log.invoke(reflectDemo, "测试");
        System.out.println(ret);
    }
}
