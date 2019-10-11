package com.fly.web.springboot.web.common.config;

import com.fly.web.springboot.web.common.entity.MyTomcatProperties;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * @author 张攀钦
 * @date 2019-10-11-10:39
 * @description
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TomcatConfigTest {

    @Autowired
    private MyTomcatProperties myTomcatProperties;

    @Test
    public void getTomcatProperties() {
        System.out.println(myTomcatProperties);
    }
}
