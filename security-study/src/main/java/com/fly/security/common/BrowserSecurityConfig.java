package com.fly.security.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.stereotype.Component;

@Component
public class BrowserSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private MyLogOutSuccessHandler logOutSuccessHandler;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.formLogin() // 表单方式
                .and().authorizeRequests() // 授权配置
                .anyRequest()  // 所有请求
                .authenticated()// 都需要认证
                .and().logout()
//                .logoutSuccessUrl("/signout/success")
                .logoutSuccessHandler(logOutSuccessHandler).deleteCookies("JSESSIONID");
    }
}