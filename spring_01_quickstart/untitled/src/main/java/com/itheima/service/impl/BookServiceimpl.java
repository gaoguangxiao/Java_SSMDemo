package com.itheima.service.impl;

import com.itheima.dao.BookDao;
import com.itheima.dao.impl.BookDaoImpl;
import com.itheima.service.BookService;

public class BookServiceimpl implements BookService {

    private BookDao bookDao;

    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }

//  IOC容器执行set方式
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
