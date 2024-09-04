package com;

import com.itheima.config.springConfig;
import com.itheima.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppForAdviceData {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(springConfig.class);
        BookDao bookDao = ctx.getBean(BookDao.class);
        bookDao.findName(100,"qwertyu");
    }
}
