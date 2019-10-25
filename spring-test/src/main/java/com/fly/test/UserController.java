package com.fly.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 张攀钦
 * @date 2019-10-24-16:00
 * @description UserController
 */
@RestController
public class UserController {

    @GetMapping(value = "/users")
    public ResponseDataUtil listUsers(){
        return ResponseDataUtil.ok();
    }
}
