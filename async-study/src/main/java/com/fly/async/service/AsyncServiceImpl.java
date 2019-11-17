package com.fly.async.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.concurrent.Future;

/**
 * @author 张攀钦
 * @date 2019-11-17-12:58
 * @description 简单演示异步编程
 */
@Component
@Slf4j
public class AsyncServiceImpl {

    /***
     * 异步调用
     * @author 张攀钦
     * @date 2019/11/17-14:56
     * @title a
     * @param
     */

    @Async
    public void asyncLog(String name) throws InterruptedException {
        Thread.sleep(8000);
        log.info("==================异步测试打印东西22==================");
    }

    public void syncLog() throws InterruptedException {
        Thread.sleep(8000);
        log.info("==================同步测试打印东西==================");
    }
    @Async
    public Future<String> asyncWithResult() throws InterruptedException {
        Thread.sleep(8000);
        log.info("异步方法内部线程名称：{}", Thread.currentThread().getName());
        return new AsyncResult<>("hello async");
    }

    @Async
    public Future<String> asyncWithResult2() throws InterruptedException {
        Thread.sleep(5000);
        log.info("异步方法内部线程名称：{}", Thread.currentThread().getName());
        return new AsyncResult<>("hello async-5");
    }
}
