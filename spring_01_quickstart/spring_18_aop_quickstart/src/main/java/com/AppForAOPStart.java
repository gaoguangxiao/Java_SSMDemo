package com;

import com.itheima.config.SpringConfig;
import com.itheima.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class AppForAOPStart {
    public static void main(String[] args) throws IOException {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = (BookDao) ctx.getBean(BookDao.class);

//        System.out.println(bookDao);//查看对象
//        System.out.println(bookDao.getClass());//查看类型
        bookDao.save();
//
        bookDao.update();
//
        bookDao.select();
    }
}
