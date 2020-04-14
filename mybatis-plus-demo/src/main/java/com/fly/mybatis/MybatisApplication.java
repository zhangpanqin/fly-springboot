package com.fly.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 张攀钦
 * @date 2019/10/22-9:50
 * Mybatis plus 学习
 */
@SpringBootApplication
@MapperScan("com.fly.mybatis.mapper")
public class MybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisApplication.class, args);
    }

}
