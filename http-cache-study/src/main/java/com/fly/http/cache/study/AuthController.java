package com.fly.http.cache.study;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author 张攀钦
 * @date 2020-04-04-17:50
 * 认证
 */
@RestController
public class AuthController {
    @GetMapping("/auth")
    public ResponseEntity<String> res(HttpServletRequest request) {
        Cookie[] cookies = Optional.ofNullable(request.getCookies()).orElse(new Cookie[0]);
         Optional<Cookie> authorization1 = Stream.of(cookies).filter(item -> {
             String value = item.getName();
            return Objects.equals("Authorization", value);
        }).findFirst();
        if (authorization1.isPresent()){
            return ResponseEntity.status(200).body("success");
        }
        return ResponseEntity.status(403).body("fail");
    }

    @GetMapping("/login")
    public RedirectView request(HttpServletRequest request, HttpServletResponse response){
        final Cookie cookie = new Cookie("Authorization", "Authorization");
        cookie.setPath("/");
        cookie.setDomain("localhost");
        response.addCookie(cookie);
        final String oriUrl = request.getParameter("oriUrl");
        final RedirectView redirectView = new RedirectView();
        redirectView.setUrl(oriUrl);
        return redirectView;
    }
}
