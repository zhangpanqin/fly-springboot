package com.fly.spring.context;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 张攀钦
 * @date 2019-10-30-15:04
 * @description
 */
@Configuration
@Slf4j
public class DemoConfigurationAa {
    //    @Autowired
//    private A a;
    @Bean
    public A2 initA2(A a) {
        log.info("DemoConfigurationAa", a);
        return new A2();
    }

}

class A2 {
}