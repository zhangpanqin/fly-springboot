package com.fly.sutdy.domain;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * @author 张攀钦
 * @date 2019-08-23-14:17
 * @description App 配置文件
 */
@Configuration
@ConfigurationProperties(prefix = "app.cors")
@Data
public class AppProperties {
    private List<String> allowIp;
}
