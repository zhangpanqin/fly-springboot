package com.fly.spring.init;

import com.fly.spring.imp.ImpDemo1;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 张攀钦
 * @date 2019-11-17-12:37
 * @description 初始化类
 */
@Slf4j
public class InitMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(WebConfig.class);
        User user = context.getBean(User.class);
        Bird bird = context.getBean(Bird.class);
        ImpDemo1 impDemo1 = context.getBean(ImpDemo1.class);
        log.info(impDemo1.getClass().getName() + "================");
        // 关闭 IOC 容器
        context.close();
    }
}
