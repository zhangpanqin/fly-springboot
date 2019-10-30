package com.fly.spring.context;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 张攀钦
 * @date 2019-10-30-14:51
 * @description
 */
@Service
public class Demo {
    @Autowired
    private DemoDao demoDao;

    public void log() {
        demoDao.log();
    }
}
