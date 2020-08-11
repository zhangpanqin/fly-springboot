package com.fly.testapp;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;
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

    @GetMapping("/demo/test")
    public String getDemoTest() {
        return "success";
    }

    @PostMapping(value = "/test/app/{id}")
    public Map testApp(@PathVariable String id, @RequestBody Map name) {
        name.put("id", id);
        return name;
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
