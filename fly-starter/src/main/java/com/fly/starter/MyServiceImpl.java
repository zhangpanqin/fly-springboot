package com.fly.starter;

/**
 * @author 张攀钦
 * @date 2020-03-19-17:24
 */
public class MyServiceImpl implements MyService {
    @Override
    public String getName() {
        return MyServiceImpl.class.getName();
    }
}
