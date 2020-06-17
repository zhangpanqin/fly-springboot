package com.fly.spring;

import com.fly.spring.convert.IntegerCodeToEnumConverterFactory;
import com.fly.spring.convert.StringCodeToEnumConverterFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author 张攀钦
 * @date 2019-10-11-11:07
 * @description
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @MyListener
    public String log() {
        return "测试";
    }

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverterFactory(new IntegerCodeToEnumConverterFactory());
        registry.addConverterFactory(new StringCodeToEnumConverterFactory());
    }
}
