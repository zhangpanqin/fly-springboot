package com.app.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.Arrays;

/**
 * @author 张攀钦
 * @date 2019-09-17-9:30
 * @description
 */
@Configuration
public class CorsFilterConfig {

    /**
     * 配置 cors 过滤器
     */
    private CorsConfigurationSource getMyCorsConfigurationSource(String path) {
        CorsConfiguration config = new CorsConfiguration();
        // 设置跨域允许携带 cookie
        config.setAllowCredentials(true);
        // 配置允许那些 网址跨域
        config.setAllowedOrigins(Arrays.asList("*"));
        // 配置多长时间不用跨域预检请求
        config.setMaxAge(1800L);
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration(path, config);
        return source;
    }

    @Bean
    public FilterRegistrationBean registrationCorsFilterBean() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        // 所有的请求跨域
        CorsConfigurationSource myCorsConfigurationSource = getMyCorsConfigurationSource("/**");
        CorsFilter corsFilterConfig = new CorsFilter(myCorsConfigurationSource);
        filterRegistrationBean.setFilter(corsFilterConfig);
        return filterRegistrationBean;
    }
}