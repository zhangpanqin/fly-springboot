package com.fly.exception.start;

import com.fly.exception.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.StringJoiner;

/**
 * @author 张攀钦
 * @date 2019-11-15-19:06
 * @description 监听启动失败的事件
 */
@Component
public class StartSuccessApplicationListener implements ApplicationListener<ApplicationReadyEvent> {

    @Autowired
    private EmailService emailService;

    @Override
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
        // 发送邮件告诉启动成功了
        //        31  红色   32  绿色 33  黄色
        StringJoiner stringJoiner = new StringJoiner("", "\033[32;4m", "\033[0m");
        String join = String.join("", "服务器 ip: 192.168.11.11 启动成功!");
        String s = stringJoiner.add(join).toString();
        emailService.sendEmail(s);
    }
}
