package com.fly.async.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;

import java.util.concurrent.CompletableFuture;
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

    /**
     * 添加回调函数
     */
    @Async
    public Future<String> asyncWithResult3() throws InterruptedException {
        Thread.sleep(5000);
        log.info("异步方法内部线程名称：{}", Thread.currentThread().getName());
        ListenableFuture<String> stringListenableFuture = AsyncResult.forValue("hello async-5");
        stringListenableFuture.addCallback((t) -> {
            log.info("执行成功" + t);
        }, (t) -> {
            log.info("执行失败");
        });
        return stringListenableFuture;
    }

    /**
     * 添加回调函数 CompletableFuture
     */
    @Async
    public Future<String> asyncWithResult4() throws InterruptedException {
        Thread.sleep(5000);
        log.info("异步方法内部线程名称：{}", Thread.currentThread().getName());
        ListenableFuture<String> stringListenableFuture = AsyncResult.forValue("hello async-5");
        CompletableFuture<String> completable = stringListenableFuture.completable();
        completable.handleAsync((t, u) -> {
            log.error("测试异常", u);
            log.info("completable.handleAsync 所在线程".concat(Thread.currentThread().getName()).concat(t));
            return u;
        });
        return completable;
    }
}
