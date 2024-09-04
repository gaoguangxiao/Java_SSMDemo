package com.itheima.service.impl;

import com.itheima.dao.BookDao;
import com.itheima.service.BookServce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookServce {
    @Autowired
    @Qualifier("BookDao2")
    private BookDao bookDao;

    public void save() {
        System.out.println("bool service save...");
        bookDao.save();
    }

}
