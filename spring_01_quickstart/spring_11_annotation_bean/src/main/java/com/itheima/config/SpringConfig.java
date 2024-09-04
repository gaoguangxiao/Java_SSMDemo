package com.itheima.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/***
 * Spring3.0开启了纯注解开发模式，使用JAVA类替代配置文件，开启、Spring快速开发赛道
 * JAVA类替代Spring核心配置文件，这样核心配置文件就不再需要
 *
 * JAVA类文件增加注解Configuration，用于声明设定当前类为配置类，注解ComponentScan用于扫描路径，此注解只能添加一次，多个数据请用数据组格式
 * ({"com.a.b","com.a.b"})
 *
 * 如此做，可以不需要配制文件，在调用是使用
 * */
//声明此注解配置类
@Configuration
//扫描
@ComponentScan("com.itheima")
//<context:component-scan base-package="com.itheima"/>
public class SpringConfig {
}
