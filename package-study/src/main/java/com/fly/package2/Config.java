package com.fly.package2;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.context.annotation.Configuration;

import java.io.Serializable;

/**
 * @author 张攀钦
 * @date 2020-03-17-12:52
 */
@Data
@Configuration
@ConfigurationProperties("test")
@ConstructorBinding
public class Config implements Serializable {
    private static final long serialVersionUID = 8050963492018235939L;

    private String main;
    private String dev;
    private String fileMain;
    private String fileDev;
}
