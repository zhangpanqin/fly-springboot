package com.fly.aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {})
public class StudyAopApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudyAopApplication.class, args);
    }

}
