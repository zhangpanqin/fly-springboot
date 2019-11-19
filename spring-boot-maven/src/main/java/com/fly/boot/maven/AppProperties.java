package com.fly.boot.maven;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author 张攀钦
 * @date 2019-11-19-11:36
 * @description 测试业务数据
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "app")
public class AppProperties {
    private String name;
    private Integer age;
}
