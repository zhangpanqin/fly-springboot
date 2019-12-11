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

    /***
     * 测试 jdbc
     * @author 张攀钦
     * @date 2019/12/10-17:19
     * @title run
     *
     */
//    @Test
    public void run() throws ClassNotFoundException, SQLException {
        String JDBC_Driver = "com.mysql.cj.jdbc.Driver";//JDBC驱动
        String Url = "jdbc:mysql://localhost:3306/study_mysql" + "?autoReconnect=true&useSSL=false&useUnicode=true&characterEncoding=utf-8&zeroDateTimeBehavior=convertToNull&serverTimezone=GMT%2B8&waitTimeout=10";//数据库链接地址
        String Account = "root";//你的数据库用户名
        String Password = "123456";//你的数据库密码

        Class.forName(JDBC_Driver);//加载驱动
        Connection conn = DriverManager.getConnection(Url, Account, Password);//链接数据库
    @Test
    public void contextLoads() throws InterruptedException {
        System.out.println(depotDao.allDepots(1));
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
