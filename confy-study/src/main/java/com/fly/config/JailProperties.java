package com.fly.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Data
@Component
@PropertySource(value = "classpath:person.properties")
@ConfigurationProperties(prefix = "test")
public class JailProperties {
    private String name;

    private App app;

    private List<Menus> menus;

    private Map<String, String> map;

    @Data
    private static class App {
        private String name;
        private String url;
        private String version;
    }

    @Data
    private static class Menus {
        private String title;
        private String name;
        private String path;
    }
}