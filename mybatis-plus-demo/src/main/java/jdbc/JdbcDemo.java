package jdbc;

import java.sql.*;

/**
 * @author 张攀钦
 * @date 2019-11-28-22:23
 * @description
 */
public class JdbcDemo {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/study_mysql";
        String username = "root";
        String password = "123456";
        Connection connection = DriverManager.getConnection(url, username, password);

        PreparedStatement ps = connection.prepareStatement("SELECT * FROM role LIMIT 1");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            System.out.println("Id = " + rs.getString("id") + "  note = " + rs.getString("note") + "  role_name=" + rs.getString("role_name"));
        }
        rs.close();
        ps.close();
        connection.close();
    }
}
