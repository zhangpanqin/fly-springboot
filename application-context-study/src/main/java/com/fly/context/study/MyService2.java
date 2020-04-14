package com.fly.context.study;

import com.fly.starter.MyService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author 张攀钦
 * @date 2020-01-22-13:36
 * @description
 */
@Component
public class MyService2 implements MyService {
    @Override
    public String getName() {
        return MyService.class.getName();
    }
}
