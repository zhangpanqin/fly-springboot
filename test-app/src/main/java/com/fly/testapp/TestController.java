package com.fly.testapp;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author 张攀钦
 * @date 2020-01-20-22:09
 * @description
 */
@RestController
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class TestController {

    private TestService testService;

    @GetMapping(value = "/test/app")
    public String testApp(HttpServletResponse response) {
        final Cookie cookie = new Cookie("username", "测试");
        cookie.setPath("/");
        response.addCookie(cookie);
        return "adfas";
    }

    @GetMapping(value = "/cookie")
    public String getValue(HttpServletRequest request) {
        final Cookie[] cookies = request.getCookies();
        final Optional<Cookie> username = Stream.of(cookies).filter(item -> {
            return Objects.equals("username", item.getName());
        }).findFirst();

        if (username.isPresent()) {
            return "cookie 为 :" + username.get().getValue();
        }
        return "没有 cookie";
    }
}
