package com;

import com.alibaba.druid.pool.DruidDataSource;
import com.itheima.config.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


//插入一条数据
//        String sql = "insert into annotationthirdbeanmanager (name) values ('张三')";
//        Connection connection = druidDataSource.getConnection();
//        PreparedStatement preparedStatement = connection.prepareStatement(sql);
//        int count = preparedStatement.executeUpdate();
//        if (count > 0) {
//            System.out.println("插入成功");
//        } else  {
//            System.out.println("插入失败");
//        }

public class AppForAnnotationthirdBaenManager {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        DruidDataSource druidDataSource = (DruidDataSource) ctx.getBean(DataSource.class);
        System.out.println(druidDataSource);
    }
}
