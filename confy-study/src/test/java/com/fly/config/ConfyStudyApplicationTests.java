package com.fly.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ConfyStudyApplicationTests {

    @Autowired
    private JailProperties jailProperties;

    @Autowired
    private JailYmlDemo jailYmlDemo;

    @Test
    void contextLoads() {
        System.out.println(jailProperties);
        System.out.println(jailYmlDemo);

    }

}
