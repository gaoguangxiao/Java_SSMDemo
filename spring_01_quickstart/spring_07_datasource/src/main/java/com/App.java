package com;

import com.alibaba.druid.pool.DruidDataSource;
import com.itheima.dao.BookDao;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        //1、加载类路径下的配置文件
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicattionContext.xml");
//        Object dataSource = ctx.getBean("dataSource");
//        System.out.println("db info:" + dataSource);

        //2、从文件系统下加载配置文件
//        ApplicationContext ctx2 = new FileSystemXmlApplicationContext("/Users/gaoguangxiao/Documents/java-web/spring_01_quickstart/spring_07_datasource/src/main/resources/applicattionContext.xml");

        //3、加载多个配置文件
//        ApplicationContext ctx3 = new ClassPathXmlApplicationContext("bean1.xml","bean2.xml");

        //1、使用bean的名称获取
//        BookDao bookDao = (BookDao) ctx.getBean("bookDao");

        //2、使用bean名称加载制定类型
//        BookDao bookDao = ctx.getBean("bookDao",BookDao.class);

        //3、使用bean类型获取
//        BookDao bookDao = ctx.getBean(BookDao.class);
//        bookDao.save();
    }
}
