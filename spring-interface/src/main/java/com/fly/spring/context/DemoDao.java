package com.fly.spring.context;

import org.springframework.stereotype.Repository;

/**
 * @author 张攀钦
 * @date 2019-10-30-14:53
 * @description
 */
@Repository
public class DemoDao {
    public void log() {
        System.out.println("DemoDao.log");
    }
}
