package com.itheima.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.itheima.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class jdbcConfig {

    @Value("${driveClassName}")
    private String drivename;

    @Value("${url}")
    private String url;

    @Value("${us ername}")
    private String username;

    @Value("${password}")
    private String password;
    //定义一个方法获得要管理的对象
    //添加注解bean，表示当前方法的返回是一个bean
    @Bean
    public DataSource DataSource(BookDao bookDao){
        System.out.println("bookDao" + bookDao);
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(drivename);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }

    @Override
    public String toString() {
        return "jdbcConfig{" +
                "drivename='" + drivename + '\'' +
                ", url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
