package com.fly.testapp;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 张攀钦
 * @date 2020-01-20-22:09
 * @description
 */
@RestController
@RequiredArgsConstructor(onConstructor_ ={@Autowired} )
public class TestController {

    private TestService testService;

    @GetMapping(value = "/test/app")
    public String testApp(){
        return "adfas";
    }
}
