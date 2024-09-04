package com.itheima.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

//声明此注解配置类
@Configuration
//扫描
@ComponentScan("com.itheima.dao")
//导入配置类
@Import(jdbcConfig.class)
//导入配置文件
@PropertySource("jdbc.properties")
public class SpringConfig {

}
