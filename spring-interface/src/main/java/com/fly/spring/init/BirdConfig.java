package com.fly.spring.init;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 张攀钦
 * @date 2019-11-17-12:41
 * @description 小鸟初始化类
 */
@Configuration
public class BirdConfig {
    @Bean
    public Bird bird() {
        return new Bird();
    }
}
