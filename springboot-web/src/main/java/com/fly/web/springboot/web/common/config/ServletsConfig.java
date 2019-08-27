package com.fly.web.springboot.web.common.config;

import com.fly.web.springboot.web.common.servlet.MyServletJson;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.annotation.WebServlet;

/**
 * @author 张攀钦
 * @date 2019-08-21-12:54
 * @description 注册 servlet
 */
@Configuration
public class ServletsConfig {

    /**
     * 注册 MyServletJson
     */

    @Bean
    public ServletRegistrationBean registrationMyServletJsonBean(MyServletJson myServletJson) {
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean();
        servletRegistrationBean.setServlet(myServletJson);
        WebServlet annotation = myServletJson.getClass().getAnnotation(WebServlet.class);
        servletRegistrationBean.addUrlMappings(annotation.urlPatterns());
        return servletRegistrationBean;
    }
}
