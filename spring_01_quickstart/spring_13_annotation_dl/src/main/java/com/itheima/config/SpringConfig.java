package com.itheima.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//声明此注解配置类
@Configuration
@ComponentScan("com.itheima")

@PropertySource("jdbc.properties")
public class SpringConfig {
}
