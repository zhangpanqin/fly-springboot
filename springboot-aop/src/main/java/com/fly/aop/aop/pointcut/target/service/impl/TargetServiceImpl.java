package com.fly.aop.aop.pointcut.target.service.impl;

import com.fly.aop.aop.pointcut.target.service.TargetService;
import org.springframework.stereotype.Service;

/**
 * @author 张攀钦
 * @date 2019-09-01-15:06
 * @description
 */
@Service
public class TargetServiceImpl extends TargetService {

    @Override
    public void log() {
        System.out.println("TargetServiceImpl.log");
    }
}
