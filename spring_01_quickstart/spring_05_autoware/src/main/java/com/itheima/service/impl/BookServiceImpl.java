package com.itheima.service.impl;

import com.itheima.dao.BookDao;
import com.itheima.service.BookServce;

public class BookServiceImpl implements BookServce {
    private BookDao bookDao;

    public void save() {
        System.out.println("bool service save...");
        bookDao.save();
    }

    public BookDao getBookDao() {
        return bookDao;
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
