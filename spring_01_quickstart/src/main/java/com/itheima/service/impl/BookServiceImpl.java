package com.itheima.service.impl;

import com.itheima.dao.BookDao;
import com.itheima.dao.impl.BookDaoImpl;
import com.itheima.service.BookService;

public class BookServiceImpl implements BookService {

    /**
     * 采用IOC方式，那么new对象这种操作，需要交给Spring容器，而不是下面这种
     * */
//    private BookDao bookDao = new BookDaoImpl();

    private BookDao bookDao;
    public void save() {
        bookDao.save();
    }

    public void setBookDao(BookDaoImpl bookDao) {
        this.bookDao = bookDao;
    }
}
