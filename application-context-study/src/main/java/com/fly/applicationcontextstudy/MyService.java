package com.fly.applicationcontextstudy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author 张攀钦
 * @date 2020-01-22-13:36
 * @description
 */
@Component
public class MyService {
    @Autowired
    private Environment environment;
}
