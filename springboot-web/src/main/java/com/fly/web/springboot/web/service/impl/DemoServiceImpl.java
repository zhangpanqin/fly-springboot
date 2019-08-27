package com.fly.web.springboot.web.service.impl;

import com.fly.web.springboot.web.service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author 张攀钦
 * @date 2019-08-21-14:57
 * @description
 */
@Service
@Slf4j
public class DemoServiceImpl implements DemoService {

    @Override
    public void log() {
        log.info("DemoServiceImpl.log-被调用");
    }
}
