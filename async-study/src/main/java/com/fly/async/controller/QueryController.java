package com.fly.async.controller;

import com.fly.async.User;
import com.fly.async.util.RetUtil;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/**
 * @author 张攀钦
 * @date 2019-11-28-10:27
 * @description
 */
@RestController
public class QueryController {

    @RequestMapping(value = "/demo/args")
    public RetUtil getArgs(@RequestHeader(defaultValue = "default") String Authorization, @RequestHeader(defaultValue = "default") String header1, User user, @RequestHeader(defaultValue = "default") String headerNginx, @CookieValue(defaultValue = "default", name = "token") String cookie) throws UnsupportedEncodingException {
        header1 = URLDecoder.decode(header1, "UTF-8");
        headerNginx = URLDecoder.decode(headerNginx, "UTF-8");
        user.setCookie(cookie);
        user.setHeader1(header1);
        user.setHeaderNginx(headerNginx);
        user.setAuthorization(Authorization);
        return RetUtil.success(user);
    }
}
