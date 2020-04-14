package com.fly.starter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 张攀钦
 * @date 2020-03-19-17:57
 */
@RestController
public class MyController1 {
    @Autowired
    private MyService myService;

    @GetMapping("my-test")
    public String getTEst() {
        System.out.println(myService.getName());
        return "success";
    }
}
