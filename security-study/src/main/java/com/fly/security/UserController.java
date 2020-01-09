package com.fly.security;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 张攀钦
 * @date 2019-12-19-18:36
 * @description
 */
@RestController
public class UserController {

    @GetMapping(value = "/users")
    public String getUser() {
        return "访问成功";
    }

    @RequestMapping(value = "/logout")
    public String getUser2() {
        return "退出成功";
    }

    @RequestMapping("/signout/success")
    public String signout() {
        return "退出成功，请重新登录";
    }

    @GetMapping("session/invalid")
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public String sessionInvalid() {
        return "session已失效，请重新认证";
    }
}
