package com.fly.starter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 张攀钦
 * @date 2020/3/19-17:26
 */

@Configuration
public class FlyAutoConfig {

    @Bean
    public MyServiceImpl myService() {
        return new MyServiceImpl();
    }

    @Bean
    public MyController1 getM() {
        return new MyController1();
    }
}
