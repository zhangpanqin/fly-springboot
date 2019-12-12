package com.fly.config;

import com.enable.EnableTest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * @author 张攀钦
 * @date 2019/12/12-00:36
 * 启动类
 */

@SpringBootApplication
@EnableTest
public class ConfyStudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfyStudyApplication.class, args);
    }

}
