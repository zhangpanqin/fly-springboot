package com.fly.exception.common.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;

import java.util.concurrent.Executor;

/**
 * @author 张攀钦
 * @date 2019-11-16-13:12
 * @description 异步配置
 */
@Configuration
@EnableAsync
public class AsyncConfig implements AsyncConfigurer {
    private static final String THREAD_PREFIX_NAME = "mFlyYou-";

    @Override
    public Executor getAsyncExecutor() {
        final ThreadPoolTaskExecutor threadPoolTaskExecutor = new ThreadPoolTaskExecutor();
        threadPoolTaskExecutor.setCorePoolSize(5);
        threadPoolTaskExecutor.setMaxPoolSize(10);
        threadPoolTaskExecutor.setKeepAliveSeconds(60);
        threadPoolTaskExecutor.setThreadNamePrefix(THREAD_PREFIX_NAME);
        threadPoolTaskExecutor.setQueueCapacity(150);
        threadPoolTaskExecutor.initialize();
        return threadPoolTaskExecutor;
    }
}
