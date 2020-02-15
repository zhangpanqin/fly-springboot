package com.fly.applicationcontextstudy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 张攀钦
 * @date 2020-02-13-19:34
 * @description
 */
@RestController
public class TestController {
    @GetMapping(value = "/a")
    public String getA(){
        return "aaaaa";

    }
}
