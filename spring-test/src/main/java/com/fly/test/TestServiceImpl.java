package com.fly.test;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 张攀钦
 * @date 2019-10-28-16:42
 * @description aa
 */
@Service
public class TestServiceImpl {

    private TestMapper testMapper;

    void updateUsers() {
        Map map = new HashMap<>(16);
        map.entrySet().forEach(item -> {
            testMapper.updateUser(item);
        });
    }
}
