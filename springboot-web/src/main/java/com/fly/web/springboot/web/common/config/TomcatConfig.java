package com.fly.web.springboot.web.common.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fly.web.springboot.web.common.entity.MyTomcatProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnResource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.IOException;

/**
 * @author 张攀钦
 * @date 2019-10-11-10:35
 * @description tomcat 配置测试
 */
@Configuration
@Slf4j
public class TomcatConfig {
    private static final String TOMCAT_JSON_PATH="classpath:config/tomcat.json";

    @Bean
    @ConditionalOnResource(resources={TOMCAT_JSON_PATH})
    public MyTomcatProperties getTomcatProperties() throws IOException {
        log.info("---------------------------初始化配置文件---------------------------------------");
        File tomcatConfigJson = ResourceUtils.getFile(TOMCAT_JSON_PATH);
        return new ObjectMapper().readValue(tomcatConfigJson, MyTomcatProperties.class);
    }
}
