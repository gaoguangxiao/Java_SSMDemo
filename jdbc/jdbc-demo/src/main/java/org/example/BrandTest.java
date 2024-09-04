package org.example;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.alibaba.druid.util.JdbcUtils;
import org.junit.jupiter.api.Test;
import pojo.Brand;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class BrandTest {
    public static void main(String[] args) {

        try {
            testUpdate();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void testUpdate() throws  Exception {
        String bn = "苹果笔记本";
        String bcn = "苹果有限公司";
        int odId = 60;
        String des = "苹果电脑是最好用的电脑";
        int status = 0;

        Properties properties = new Properties();
        properties.load(new FileInputStream("jdbc-demo/src/druid.properties"));
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
//        //获取链接对象
        Connection connection = dataSource.getConnection();

        String sql = "update tb_brand set brand_name = ?,componey_name = ?,ordered = ?,decription = ?,status = ? where id = 4";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setString(1,bn);
        preparedStatement.setString(2,bcn);
        preparedStatement.setInt(3,odId);
        preparedStatement.setString(4,des);
        preparedStatement.setInt(5,status);

        //影响的行数
        int count = preparedStatement.executeUpdate();

        if (count > 0) {
            System.out.println("更新成功");
        } else  {
            System.out.println("更新失败");
        }
    }
    @Test
    public static void testAdd() throws Exception {

        String bn = "苹果笔记本";
        String bcn = "苹果有限公司";
        int odId = 60;
        String des = "苹果电脑是最好用的电脑";
        int status = 1;

        Properties properties = new Properties();
        properties.load(new FileInputStream("jdbc-demo/src/druid.properties"));
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
//        //获取链接对象
        Connection connection = dataSource.getConnection();

        String sql = "insert into tb_brand (brand_name,componey_name,ordered,decription,status) values (?,?,?,?,?)";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setString(1,bn);
        preparedStatement.setString(2,bcn);
        preparedStatement.setInt(3,odId);
        preparedStatement.setString(4,des);
        preparedStatement.setInt(5,status);

        //影响的行数
        int count = preparedStatement.executeUpdate();

        if (count > 0) {
            System.out.println("插入成功");
        } else  {
            System.out.println("插入失败");
        }
    }

    public static void testSelectAll() throws Exception {

        Properties properties = new Properties();
        properties.load(new FileInputStream("jdbc-demo/src/druid.properties"));

        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
        //获取链接对象
        Connection connection = dataSource.getConnection();

        String sql = "select * from tb_brand;";

        //获取pre
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        ResultSet resultSet = preparedStatement.executeQuery();

        Brand brand;
        List<Brand> list = new ArrayList<Brand>();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String brandName = resultSet.getString("brand_name");
            String componeyName = resultSet.getString("componey_name");
            int ordered = resultSet.getInt("ordered");
            String decription = resultSet.getString("decription");
            int status = resultSet.getInt("status");

            brand = new Brand();
            brand.setId(id);
            brand.setBrandName(brandName);
            brand.setCompanyName(componeyName);
            brand.setOrdered(ordered);
            brand.setStatus(status);

            list.add(brand);
        }

        System.out.println(list);

        resultSet.close();
        preparedStatement.close();
        ;
        connection.close();
    }
}
