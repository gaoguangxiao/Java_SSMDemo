package com.itheima.config;

import org.springframework.context.annotation.*;

//声明此注解配置类
@Configuration
//扫描
@ComponentScan("com.itheima")
//告诉程序要用注解开发AOP
@EnableAspectJAutoProxy
public class SpringConfig {

}
