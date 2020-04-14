package com.fly.package2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.nio.file.Path;
import java.nio.file.Paths;

@SpringBootApplication
public class PackageStudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(PackageStudyApplication.class, args);
        Path path = Paths.get("");
        System.out.println(path.toAbsolutePath());

        System.out.println(System.getProperty("user.dir"));

        System.out.println("app.home 的地址为:"+System.getProperty("app.home"));

    }

}
