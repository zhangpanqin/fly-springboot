package com.fly.web.springboot.web.common.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * @author 张攀钦
 * @date 2018/12/21-19:53
 * 测试 MyHttpSessionListener
 */
@Slf4j
@WebListener
@Component
public class MyHttpSessionListener implements HttpSessionListener {

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        log.info("Session 被创建" + se.getSession().getId());
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        log.info("Session 被创建" + se.getSession().getId());
    }

}