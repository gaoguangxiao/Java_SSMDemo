package com;

import com.itheima.config.SpringConfig;
import com.itheima.dao.BookDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//此模块 了解注解生命周期范围，
public class AppForAnnotationManager {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = ctx.getBean(BookDao.class);

        System.out.println(bookDao);

        BookDao bookDao1 = ctx.getBean(BookDao.class);
        System.out.println(bookDao1);

        ctx.close();
    }
}
