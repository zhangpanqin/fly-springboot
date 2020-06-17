package com.fly.package2;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 张攀钦
 * @date 2020-03-17-09:27
 * 测试接口
 */
@RestController
public class TestController {
    @Autowired
    private Config config;

    @GetMapping(value = "/test")
    public Config getBody() {
        Config config2 = new Config();
        BeanUtils.copyProperties(config, config2);
        return config2;
    }
}
