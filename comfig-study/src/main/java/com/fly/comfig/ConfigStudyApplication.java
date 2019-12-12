package com.fly.comfig;

import com.enable.EnableTest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @author uinnova
 */
@SpringBootApplication
@EnableTest
public class ConfigStudyApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(ConfigStudyApplication.class, args);
        ConfigurableEnvironment environment = run.getEnvironment();
        System.out.println(environment.getProperty("fly.name"));
    }

}
