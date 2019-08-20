package com.fly.web.springboot.web.common;

import org.springframework.context.annotation.Configuration;
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
     * Configure simple automated controllers pre-configured with the response
     * status code and/or a view to render the response body. This is useful in
     * cases where there is no need for custom controller logic -- e.g. render a
     * home page, perform simple site URL redirects, return a 404 status with
     * HTML content, a 204 with no content, and more.
     *
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login*").setViewName("forward:/index.html");
        registry.addViewController("/login/**").setViewName("forward:/index.html");
        registry.addViewController("/login-1/index").setViewName("forward:/index.html");
        registry.addViewController("/login-2/index/**").setViewName("forward:/index.html");

    }
}
