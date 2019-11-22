package com.fly.async.controller;

import com.fly.async.service.AsyncServiceImpl;
import com.fly.async.util.RetUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Clock;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * @author 张攀钦
 * @date 2019-11-17-13:03
 * @description 异步编程控制器
 */
@RestController
public class AsyncController {

    @Autowired
    private AsyncServiceImpl asyncService;

    @GetMapping(value = "/async")
    public RetUtil async() throws InterruptedException {
        asyncService.asyncLog("11");
        return RetUtil.success();
    }

    @GetMapping(value = "/sync")
    public RetUtil sync() throws InterruptedException {
        asyncService.syncLog();
        return RetUtil.success();
    }
    @GetMapping(value = "/sync-result")
    public RetUtil syncWithResult() throws InterruptedException, ExecutionException {
        final Future<String> stringFuture = asyncService.asyncWithResult();
        final String s = stringFuture.get();
        return RetUtil.success(s);
    }
    @GetMapping(value = "/sync-result/2")
    public RetUtil syncWithResult2() throws InterruptedException, ExecutionException {
        final long millis = Clock.systemUTC().millis();
        final Future<String> stringFuture = asyncService.asyncWithResult();
        final Future<String> stringFuture2 = asyncService.asyncWithResult2();
        final String s = stringFuture.get();
        final String s2 = stringFuture2.get();
        final long millis2 = Clock.systemUTC().millis();
        Map ret= new HashMap<>(4);
        ret.put("time",millis2-millis);
        ret.put("str",s2.concat(s));
        return RetUtil.success(ret);
    }

    @GetMapping(value = "/sync-result/3")
    public RetUtil syncWithResult3() throws InterruptedException, ExecutionException {
        final long millis = Clock.systemUTC().millis();

        Future<String> stringFuture = asyncService.asyncWithResult3();
        final long millis2 = Clock.systemUTC().millis();
        Map ret = new HashMap<>(4);
        ret.put("time", millis2 - millis);
        return RetUtil.success(ret);
    }

    @GetMapping(value = "/sync-result/4")
    public RetUtil syncWithResult4() throws InterruptedException, ExecutionException {
        final long millis = Clock.systemUTC().millis();

        Future<String> stringFuture = asyncService.asyncWithResult4();
        final long millis2 = Clock.systemUTC().millis();
        Map ret = new HashMap<>(4);
        ret.put("time", millis2 - millis);
        return RetUtil.success(ret);
    }
}
