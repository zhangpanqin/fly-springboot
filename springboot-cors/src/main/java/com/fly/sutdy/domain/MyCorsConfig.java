package com.fly.sutdy.domain;

import org.springframework.beans.factory.annotation.Autowired;
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
 * @date 2019-08-23-14:16
 * @description cors 跨域配置
 */
@Configuration
public class MyCorsConfig {

    @Autowired
    private AppProperties appProperties;

    /**
     * 配置 cors 过滤器
     */
    private CorsConfigurationSource getMyCorsConfigurationSource(String path) {
        CorsConfiguration config = new CorsConfiguration();
        // 设置跨域允许携带 cookie
        config.setAllowCredentials(true);
        // 配置允许那些 网址跨域
        config.setAllowedOrigins(appProperties.getAllowIp());
        // 配置多长时间不用跨域预检请求
        config.setMaxAge(1800L);
        // 自定义的请求头不允许，前端 xhr 会报错
        config.setAllowedHeaders(Arrays.asList("au1", "au2"));
        // 配置前端通过 js 可以获得的请求头
        config.addExposedHeader("au3");
        config.addExposedHeader("au5");
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration(path, config);
        return source;
    }

    @Bean
    public FilterRegistrationBean registrationCorsFilterBean() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        // 所有的请求跨域
        CorsConfigurationSource myCorsConfigurationSource = getMyCorsConfigurationSource("/**");
        CorsFilter corsFilter = new CorsFilter(myCorsConfigurationSource);
        filterRegistrationBean.setFilter(corsFilter);
        return filterRegistrationBean;
    }
}
