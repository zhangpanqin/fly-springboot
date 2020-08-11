package com.fly.web.springboot.web.controller;

import com.fly.web.springboot.web.common.interceptor.UserInfoDTO;
import com.fly.web.springboot.web.common.interceptor.UserInfoInterceptor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 张攀钦
 * @date 2020-06-27-20:56
 */
@RestController
public class UserInfoController {
    @RequestMapping("/user/info")
    public UserInfoDTO getUserInfoDTO() {
        return UserInfoInterceptor.getCurrentRequestUserInfoDTO();
    }
}
