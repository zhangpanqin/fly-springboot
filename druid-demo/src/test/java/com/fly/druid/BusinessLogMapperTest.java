package com.fly.druid;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author 张攀钦
 * @date 2019-12-10-17:28
 * @description
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class BusinessLogMapperTest {

    @Autowired
    private BusinessLogMapper businessLogMapper;


    @Test
    public void run2() {
        BusinessLog businessLog = businessLogMapper.selectById("22");
        System.out.println(businessLog);
    }
}