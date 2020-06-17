package mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author 张攀钦
 * @date 2019-11-28-21:06
 * @description
 */
public class MybatisMain {
    public static void main(String[] args) {
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory = null;
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        try (SqlSession sqlSession = sqlSessionFactory.openSession();) {
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            Role role = roleMapper.getRole(1L);
            System.out.println(role);
            sqlSession.commit();

        }
    }


}
