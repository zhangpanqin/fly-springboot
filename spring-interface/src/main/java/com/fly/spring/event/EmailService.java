package com.fly.spring.event;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class EmailService implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher publisher;


    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    public void sendEmail() {
        publisher.publishEvent(new DemoEvent("测试发送消息"));
    }

    @EventListener(classes = DemoEvent.class)
    @Async
    public void testEventListener(DemoEvent demoEvent) {
        System.out.println(demoEvent.getSource());
    }

    @EventListener(classes = DemoEvent.class)
    public void testEventListener2(DemoEvent demoEvent) {
        System.out.println(demoEvent.getSource());
    }
}