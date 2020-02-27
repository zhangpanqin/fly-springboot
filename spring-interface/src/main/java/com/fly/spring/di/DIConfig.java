package com.fly.spring.di;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author 张攀钦
 * @date 2020-02-09-18:55
 * @description
 */
@Configuration
@Import(ServiceB.class)
public class DIConfig {
}
