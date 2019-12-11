package com.fly.exception.common.runner;

import com.fly.exception.common.exception.StartException;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author 张攀钦
 * @date 2019-11-16-18:17
 * @description 测试抛出异常
 */
//@Component
public class MyRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        throw new StartException("模拟启动失败的异常");
    }
}
