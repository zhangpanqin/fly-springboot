package com.fly.spring;

import java.lang.annotation.*;

/**
 * @author uinnova
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyListener {}