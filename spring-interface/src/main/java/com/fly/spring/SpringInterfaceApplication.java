package com.fly.spring;

import com.fly.spring.enable.EnableMyConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.TypeExcludeFilter;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication
@EnableMyConfiguration
// 排除注解扫描的类
@ComponentScan(excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Avoid.class)})
public class SpringInterfaceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringInterfaceApplication.class, args);
    }

}
