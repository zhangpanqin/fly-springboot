package com.fly.spring.event;

import lombok.Data;
import org.springframework.context.ApplicationEvent;

/**
 * @author 张攀钦
 * @date 2019/10/30-15:42
 * 测试事件推送
 */
@Data
public class DemoEvent extends ApplicationEvent {

    public DemoEvent(String name) {
        super(name);
    }
}