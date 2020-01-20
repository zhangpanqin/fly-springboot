package com.fly.config;

import com.enable.EnableConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 张攀钦
 * @date 2019-12-12-21:12
 * @description
 */
@RestController
public class ConfigController {
    @Autowired
    private EnableConfiguration enableConfiguration;

    @GetMapping(value = "/config")
    public EnableConfiguration getEnableConfiguration() {
        return enableConfiguration;
    }
}
