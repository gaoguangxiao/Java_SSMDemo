package com.itheima.config;

import org.springframework.context.annotation.*;

//声明此注解配置类
@Configuration
//扫描
@ComponentScan("com.itheima")
//导入配置文件
@PropertySource("jdbc.properties")
//导入配置类
@Import({jdbcConfig.class,MybatisConfig.class})

@EnableAspectJAutoProxy
public class SpringConfig {

}
