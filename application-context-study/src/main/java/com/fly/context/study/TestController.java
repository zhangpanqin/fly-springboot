package com.fly.context.study;

import com.fly.context.demo.Bar;
import com.fly.starter.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 张攀钦
 * @date 2020-03-19-17:37
 */
@RestController
public class TestController {
    @Autowired
    private MyService myService;



    @GetMapping("/test")
    public String getTest() {
        System.out.println(myService.getName());
        return "success";
    }
}
