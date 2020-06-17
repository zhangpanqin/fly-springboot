package com.fly.jetcache.caffeine;

import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;

import java.util.concurrent.TimeUnit;

/**
 * @author 张攀钦
 * @date 2020-02-10-12:45
 * @description
 */
public class CaffeineDemo {
    public static void main(String[] args) {
        Cache<String, String> cache = Caffeine.newBuilder()
//            expireAfterWrite：代表着写了之后多久过期。
                .expireAfterWrite(1, TimeUnit.SECONDS)
//                    expireAfterAccess: 代表着最后一次访问了之后多久过期。
                .expireAfterAccess(1, TimeUnit.SECONDS)
                .maximumSize(10)
                .build();
        cache.put("hello", "hello");
    }
}
