package com.fly.log;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class LogStudyApplication {

    public static void main(String[] args) {
        System.setProperty("fileName", "fly");
        ConfigurableApplicationContext run = SpringApplication.run(LogStudyApplication.class, args);
        System.out.println(run.getEnvironment().getProperty("logging.level.root"));
        System.out.println(run.getEnvironment().getProperty("app.name"));
    }


}
