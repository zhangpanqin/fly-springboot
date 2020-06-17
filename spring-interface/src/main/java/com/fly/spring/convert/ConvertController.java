package com.fly.spring.convert;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 张攀钦
 * @date 2020-02-27-17:55
 * @description
 */
@RestController
public class ConvertController {

    @GetMapping(value = "/convert")
    public String convert(QuerySexDTO request) {
        System.out.println(35);
        System.out.println(request);
        return "success";
    }
}
