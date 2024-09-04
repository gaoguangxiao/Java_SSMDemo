package com;

import com.itheima.config.SpringConfig;
import com.itheima.dao.BookDao;
import com.itheima.service.impl.BookServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForAnnotation {
    public static void main(String[] args) {
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicattionContext.xml");

        //纯注解开发配置，使用这个
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = ctx.getBean(BookDao.class);
//        BookDao bookDao = (BookDao) ctx.getBean("BookDao");
        bookDao.save();
//        System.out.println(bookDao);

//        BookServiceImpl bookService = ctx.getBean(BookServiceImpl.class);
//        bookService.save();

    }
}
