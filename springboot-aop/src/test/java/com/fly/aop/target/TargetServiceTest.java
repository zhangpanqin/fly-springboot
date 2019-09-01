package com.fly.aop.target;

import com.fly.aop.aop.pointcut.target.service.TargetService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author 张攀钦
 * @date 2019-09-01-15:07
 * @description
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class TargetServiceTest {
    @Autowired
    private TargetService targetService;

    @Test
    public void log() {
        targetService.log();
    }

}
