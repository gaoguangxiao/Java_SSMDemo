package com.itheima.service.impl;

import com.itheima.dao.BookDao;
import com.itheima.service.BookServce;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BookServiceImpl implements BookServce, InitializingBean, DisposableBean {
    private BookDao bookDao;
    public void save() {
        System.out.println("bool service save...");
        bookDao.save();
    }
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    //通过接口形式
    public void destroy() throws Exception {
        System.out.println("book service destroy");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("service init");
    }
}
