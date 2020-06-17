package com.fly.http.cache.study;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.ServerRequest;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author 张攀钦
 * @date 2020-03-02-21:52
 * @description http 缓存
 */
@RestController
public class HttpCacheController {

    @GetMapping("/no-cache/png")
    public void noCachePng(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println(request.getHeader("host"));
        System.out.println(request.getHeader("test1"));
        final Cookie[] cookies = request.getCookies();
        final Optional<Cookie> cookie2 = Stream.of(cookies).filter(item -> {
            final String name = item.getName();
            return Objects.equals("cookie2", name);
        }).findFirst();
        final Cookie cookie = cookie2.orElse(new Cookie("cookie2", "默认值"));
        System.out.println(cookie.getValue());
        response.setHeader("Content-Type", "image/png");
        response.setHeader("Cache-Control", "max-age=10");
        ServletOutputStream outputStream = response.getOutputStream();
        ClassPathResource classPathResource = new ClassPathResource("static/a.png");
        InputStream inputStream = classPathResource.getInputStream();
        IOUtils.copy(inputStream, outputStream);
        inputStream.close();
    }

    @GetMapping("/ip")
    public IpData getIPData(HttpServletRequest request) {
        final String header = request.getHeader("X-Forwarded-For");
        final String realIp = request.getHeader("X-REAL-IP");
        final IpData ipData = new IpData();
        ipData.setXForwardFor(header);
        ipData.setXRealIp(realIp);
        return ipData;
    }

    @GetMapping("/proxy")
    public ResponseEntity<String> proxy(HttpServletRequest request) {
        System.out.println(request.getHeader("Host"));
        final String collect = Stream.generate(() -> {
            return "a";
        }).limit(1024 * 1024 * 10).collect(Collectors.joining());
        final String collect1 = Stream.generate(() -> "b").limit(1024 * 4).collect(Collectors.joining());
        return ResponseEntity.status(200).header("a", "collect1").body("collect");
    }
}
