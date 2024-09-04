package com.itheima.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

//声明此注解配置类
@Configuration
//扫描
@ComponentScan("com.itheima")
//导入配置类
//@Import({jdbcConfig.class,MybatisConfig.class})
public class SpringConfig {

}
