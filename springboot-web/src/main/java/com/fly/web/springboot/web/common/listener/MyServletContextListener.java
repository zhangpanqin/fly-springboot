package com.fly.web.springboot.web.common.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @author 张攀钦
 * @date 2018/12/21-19:53
 * 测试 MyServletContextListener
 */
@WebListener
@Component
@Slf4j
public class MyServletContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        log.info("ServletContext 初始化");
        log.info(sce.getServletContext().getServerInfo());
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

        log.info("ServletContext 销毁");
    }

}
