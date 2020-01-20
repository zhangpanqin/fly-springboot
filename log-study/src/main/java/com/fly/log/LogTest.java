package com.fly.log;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author 张攀钦
 * @date 2019-12-12-15:18
 * @description
 */
@Component
@Slf4j
public class LogTest {
    @Scheduled(fixedDelayString = "5000")
    public void log() {
        MDC.put("userid", "12345");
        log.info("info 日志级别");
        log.error("error 日志级别");
        log.warn("warn 日志级别", new RuntimeException("测试异常"));
    }
}
