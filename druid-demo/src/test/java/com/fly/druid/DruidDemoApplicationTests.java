package com.fly.druid;

import com.fly.druid.druid.DepotDao;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class DruidDemoApplicationTests {

    @Autowired
    private DepotDao depotDao;

    @Test
    public void contextLoads() throws InterruptedException {
        int a = 0;

        if (a <= 500) {
            new Thread(() -> {
                System.out.printf("", depotDao.allDepots(1));
            }).start();
            a++;
        }

        Thread.sleep(1000);
        a = 0;
        if (a <= 500) {
            new Thread(() -> {
                System.out.printf("", depotDao.allDepots(1));
            }).start();
            a++;
        }
    }

    @Test
    public void run33() {
        Path path = Paths.get("E:\\");
        File file = path.toFile();
        String[] list = file.list();
        System.out.println(Stream.of(list).collect(Collectors.joining()));
    }


}
