package com.fly.aop.controller;

import com.fly.aop.annotation.AopAnnotation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 张攀钦
 * @date 2019-08-30-14:14
 * @description 测试 Aop
 */
@RestController
public class AopController {

    @AopAnnotation
    @GetMapping(value = "/aop/annotation")
    public Map getMessage() {
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("1", "2");
        return objectObjectHashMap;
    }
}
