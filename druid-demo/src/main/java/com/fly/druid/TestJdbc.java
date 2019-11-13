package com.fly.druid;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author 张攀钦
 * @date 2019-11-01-13:53
 * @description 测试数据库链接
 */
public class TestJdbc {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String JDBC_Driver = "com.mysql.cj.jdbc.Driver";//JDBC驱动
        String Url = "jdbc:mysql://localhost:3306/study_mysql" +
                "?autoReconnect=true&useSSL=false&useUnicode=true&characterEncoding=utf-8&zeroDateTimeBehavior=convertToNull&serverTimezone=GMT%2B8&waitTimeout=10";//数据库链接地址
        String Account = "root";//你的数据库用户名
        String Password = "123456";//你的数据库密码

        Class.forName(JDBC_Driver);//加载驱动
        Connection conn = DriverManager.getConnection(Url, Account, Password);//链接数据库

        if (!conn.isClosed()) {
            System.out.print("数据库链接成功");
        }
    }
}
