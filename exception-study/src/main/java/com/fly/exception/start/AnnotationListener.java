package com.fly.exception.start;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author 张攀钦
 * @date 2019-11-16-21:19
 * @description 通过注解的进行监听
 */
@Component
public class AnnotationListener {

    @EventListener(value={ApplicationReadyEvent.class})
    public void annotationListener(){
        System.out.println(AnnotationListener.class.getName()+"启动成功了");
    }

}
