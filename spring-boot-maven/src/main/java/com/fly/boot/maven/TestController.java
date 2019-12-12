package com.fly.boot.maven;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 张攀钦
 * @date 2019-12-12-12:06
 * @description
 */
@RestController
public class TestController {

    @GetMapping(value = "/test")
    public String getString() {
        return "string";
    }
}
