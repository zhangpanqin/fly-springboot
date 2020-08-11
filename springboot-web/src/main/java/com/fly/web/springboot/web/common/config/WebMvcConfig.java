package com.fly.web.springboot.web.common.config;

import com.fly.web.springboot.web.common.interceptor.UserInfoInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author 张攀钦
 * @date 2019-08-20-13:38
 * @description 配置和 mvc 相关
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    /**
     * 简单的url 转发或重定向
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login*").setViewName("forward:/index.html");
        registry.addViewController("/login/**").setViewName("forward:/index.html");
        registry.addViewController("/login-1/index").setViewName("forward:/index.html");
        registry.addViewController("/login-2/index/**").setViewName("forward:/index.html");

    }

    /**
     * 添加拦截器
     */

    @Bean
    public UserInfoInterceptor getUserInfoInterceptor() {
        return new UserInfoInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(getUserInfoInterceptor()).addPathPatterns("/**");
    }
}
