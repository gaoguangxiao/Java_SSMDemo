package com.itheima.service.impl;

import com.itheima.dao.BookDao;
import com.itheima.dao.UserDao;
import com.itheima.service.BookServce;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BookServiceImpl implements BookServce {
    private BookDao bookDao;

    private UserDao userDao;
    public void save() {
        System.out.println("bool service save...");
        bookDao.save();
        userDao.save();
    }

//    构造器注入方法
    public BookServiceImpl(BookDao bookDao) {
        this.bookDao = bookDao;
    }


    public BookServiceImpl(BookDao bookDao, UserDao userDao) {
        this.bookDao = bookDao;
        this.userDao = userDao;
    }
}
