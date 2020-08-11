package com.fly.config;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 张攀钦
 * @date 2020-07-15-15:53
 */
@RestController
public class TestController {
    @RequestMapping("/test/api")
    public String getContent(HttpServletRequest request, @RequestBody String s) {
        final String name = request.getHeader("name");
        return "111-" + name + "请求内容" + s;
    }
}
