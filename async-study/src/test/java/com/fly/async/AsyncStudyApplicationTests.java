package com.fly.async;

import org.junit.jupiter.api.Test;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.time.Clock;
import java.time.ZoneId;

public class AsyncStudyApplicationTests {

    @Test
   public void contextLoads() {
        Clock system = Clock.system(ZoneId.of("+8"));
        System.out.println(system.millis());
        System.out.println(System.currentTimeMillis());
    }

    @Test
    public void run33() throws UnsupportedEncodingException {
        System.out.println(URLEncoder.encode("nginx 添加请求头", "UTF-8"));
    }

    @Test
    public void run44() throws UnsupportedEncodingException {
        System.out.println(URLDecoder.decode("nginx-%E5%BC%A0%E6%94%80%E9%92%A6", "UTF-8"));
    }

}
