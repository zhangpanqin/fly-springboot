package com.fly.exception.start;

import com.fly.exception.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationFailedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.StringJoiner;

/**
 * @author 张攀钦
 * @date 2019-11-15-19:06
 * @description 监听启动失败的事件
 */
@Component
public class StartFailedApplicationListener implements ApplicationListener<ApplicationFailedEvent> {

    @Autowired
    private EmailService emailService;

    @Override
    public void onApplicationEvent(ApplicationFailedEvent applicationFailedEvent) {
        // 发送邮件告诉启动失败了
        Throwable exception = applicationFailedEvent.getException();

//        31  红色   32  绿色 33  黄色
        StringJoiner stringJoiner = new StringJoiner("", "\031[32;4m", "\031[0m");
        String join = String.join("", "服务器 ip: 192.168.11.11 启动失败, 异常原因为：", exception.getMessage());
        String s = stringJoiner.add(join).toString();
        emailService.sendEmail(s);
    }
}
