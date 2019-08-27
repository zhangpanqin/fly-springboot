package com.fly.web.springboot.web.common.config;

import com.fly.web.springboot.web.common.filter.ContentTypeCharsetFilter;
import com.fly.web.springboot.web.common.filter.JsonFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.annotation.WebFilter;
import java.util.Arrays;

/**
 * @author 张攀钦
 * @date 2019-08-21-14:29
 * @description 配置过滤器
 */
@Configuration
public class FiltersConfig {

    /**
     * 注册 ContentTypeCharsetFilter
     */

    @Bean
    public FilterRegistrationBean getContentTypeCharsetFilter(ContentTypeCharsetFilter contentTypeCharsetFilter) {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(contentTypeCharsetFilter);
        WebFilter annotation = contentTypeCharsetFilter.getClass().getAnnotation(WebFilter.class);
        filterRegistrationBean.setUrlPatterns(Arrays.asList(annotation.urlPatterns()));
        return filterRegistrationBean;
    }

    @Bean
    public FilterRegistrationBean getJsonFilter(JsonFilter jsonFilter) {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(jsonFilter);
        WebFilter annotation = jsonFilter.getClass().getAnnotation(WebFilter.class);
        filterRegistrationBean.setUrlPatterns(Arrays.asList(annotation.urlPatterns()));
        return filterRegistrationBean;
    }
}
