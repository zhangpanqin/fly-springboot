package com.fly.druid;

import com.fly.druid.druid.DepotDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DruidDemoApplicationTests {

    @Autowired
    private DepotDao depotDao;

    @Test
    public void contextLoads() throws InterruptedException {
        int a=0;

        if(a<=500){
            new Thread(()->{
                System.out.printf("", depotDao.allDepots(1));
            }).start();
            a++;
        }

        Thread.sleep(1000);
        a=0;
        if(a<=500){
            new Thread(()->{
                System.out.printf("", depotDao.allDepots(1));
            }).start();
            a++;
        }
    }

}
