package com.fly.context.study;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.AntPathMatcher;


class ApplicationContextStudyApplicationTests {

    @Test
    void contextLoads() {
        final AntPathMatcher antPathMatcher = new AntPathMatcher();
        final boolean match = antPathMatcher.match("/id/{number}", "/id/222/2");
        System.out.println(match);
    }

}
