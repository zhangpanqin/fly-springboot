package com.fly.exception.service;

import org.springframework.stereotype.Component;

/**
 * @author 张攀钦
 * @date 2019-11-15-19:10
 * @description
 */
@Component
public class EmailService {

    public int sendEmail(String message) {
        System.out.println(message);
        return 200;
    }
}
