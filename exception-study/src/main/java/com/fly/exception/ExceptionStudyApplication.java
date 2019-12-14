package com.fly.exception;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 张攀钦
 */
@SpringBootApplication
public class ExceptionStudyApplication {

    public static void main(String[] args) {
        System.setProperty("ceshi", "ceshi34153145");
        SpringApplication.run(ExceptionStudyApplication.class, args);
    }

}
