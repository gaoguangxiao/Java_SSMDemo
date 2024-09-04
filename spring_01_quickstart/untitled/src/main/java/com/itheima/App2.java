package com.itheima;

import com.itheima.dao.BookDao;
import com.itheima.service.BookService;
import com.itheima.service.impl.BookServiceimpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicattionContext.xml");
//        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
//        bookDao.save();

        BookService bookService = (BookService) ctx.getBean("bookServiceimp");

        bookService.save();
    }
}
