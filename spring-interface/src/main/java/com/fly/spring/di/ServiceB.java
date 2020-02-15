package com.fly.spring.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author 张攀钦
 * @date 2020-02-09-18:45
 * @description
 */
@Component
public class ServiceB {
//    @Autowired
    private ServiceA serviceA;

    @Autowired
    public ServiceB(ServiceA serviceA) {
        this.serviceA = serviceA;
    }
}
