package com.fly.log;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author 张攀钦
 * @date 2019-12-12-15:54
 * @description
 */
@Component
@Slf4j
public class LogTest2 {
    @Scheduled(fixedDelayString = "4000")
    public void log() {
        log.info("LogTest2-info 日志级别");
        log.error("LogTest2-error 日志级别");
        log.warn("LogTest2-warn 日志级别");
    }
}
