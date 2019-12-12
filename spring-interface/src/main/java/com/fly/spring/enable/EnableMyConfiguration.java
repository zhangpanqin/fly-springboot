package com.fly.spring.enable;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author 张攀钦
 * @date 2019-12-11-18:56
 * @description 测试
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(EnableMyConfigurationSelector.class)
public @interface EnableMyConfiguration {
}
