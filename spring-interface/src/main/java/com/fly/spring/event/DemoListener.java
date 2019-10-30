package com.fly.spring.event;

import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoListener implements ApplicationListener<DemoEvent> {


    /**
     * Handle an application event.
     *
     * @param event the event to respond to
     */
    @Override
    public void onApplicationEvent(DemoEvent event) {
        System.out.println(event.getSource());
    }
}