package com.fly.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * @author 张攀钦
 * @date 2019-12-12-15:54
 * @description
 */
//@Component
@Slf4j
public class LogTest3 {
    @Scheduled(fixedDelayString = "4000")
    public void log() {
        System.out.println(111);
        log.info("LogTest3-info 日志级别");
        log.error("LogTest3-error 日志级别");
        log.warn("LogTest3-warn 日志级别");
    }
}
