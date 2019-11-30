package mybatis;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.datasource.DataSourceFactory;

import javax.sql.DataSource;
import java.util.Properties;

public class MyDataSourceFactory implements DataSourceFactory {

    private DataSource dataSource;

    public MyDataSourceFactory() {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        druidDataSource.setUrl("jdbc:mysql://localhost:3306/study_mysql");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("123456");
        dataSource = druidDataSource;
    }

    private Properties properties;

    @Override
    public void setProperties(Properties props) {
        this.properties = props;
    }

    @Override
    public DataSource getDataSource() {
        return dataSource;
    }
}