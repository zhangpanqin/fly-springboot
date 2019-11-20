package com.fly.async;

import org.junit.Test;

import java.time.Clock;
import java.time.ZoneId;

public class AsyncStudyApplicationTests {

    @Test
   public void contextLoads() {
        Clock system = Clock.system(ZoneId.of("+8"));
        System.out.println(system.millis());
        System.out.println(System.currentTimeMillis());
    }

}
