package com.fly.test.ceshi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class EntStrategyHolder {

    // 关键功能 Spring 会自动将 EntStrategy 接口的类注入到这个Map中
    @Autowired
    private Map<String, EntStrategy> entStrategyMap;

    public EntStrategy getBy(String entNum) {
        return entStrategyMap.get(entNum);
    }
}