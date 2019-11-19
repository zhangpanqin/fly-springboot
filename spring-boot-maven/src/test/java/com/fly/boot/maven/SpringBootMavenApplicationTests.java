package com.fly.boot.maven;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SpringBootMavenApplicationTests {

    @Autowired
    private AppProperties appProperties;

    @Test
    public void contextLoads() {
        System.out.println(appProperties);

    }

}
