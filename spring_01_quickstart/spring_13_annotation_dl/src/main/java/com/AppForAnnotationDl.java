package com;

import com.itheima.config.SpringConfig;
import com.itheima.dao.BookDao;
import com.itheima.dao.impl.BookDaoImpl;
import com.itheima.service.BookServce;
import com.itheima.service.impl.BookServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//此模块 了解注解生命周期范围，
public class AppForAnnotationDl {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
//        BookDao bookDao = ctx.getBean(BookDao.class);

        BookServce bookService = ctx.getBean(BookServce.class);
        bookService.save();
    }
}
