package druid;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.util.Properties;

public class DemoDruid {
    public static void main(String[] args) throws Exception {
        //1、导入jar包
        //2、定义配置文件
        Properties properties = new Properties();
        properties.load(new FileInputStream("jdbc-demo/src/druid.properties"));

        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);

        //获取链接对象
        Connection connection = dataSource.getConnection();

//        connection.createStatement();
        System.out.println(connection);
    }
}
