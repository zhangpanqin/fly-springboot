package com.fly.sutdy.domain;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.ClassUtils;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudyDomainApplicationTests {

    @Autowired
    private AppProperties appProperties;
    @Autowired
    private WebApplicationContext webApplicationContext;
    @Test
    public void contextLoads() {
        System.out.println(appProperties);
        System.out.println(webApplicationContext instanceof AnnotationConfigWebApplicationContext);
    }
    
    @Test
    public void readYml() throws IOException {
        URL resource = ClassUtils.getDefaultClassLoader().getResource("application.yml");
        InputStream inputStream = resource.openStream();
        Properties properties = new Properties();
        properties.load(inputStream);
        System.out.printf(properties.toString());
    }
}
