package com.itheima.service.impl;

import com.itheima.dao.BookDao;
import com.itheima.pojo.User;
import com.itheima.service.BookServce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookServce {

    @Autowired
    private BookDao bookDao;

    public User findByid(int id) {
        return bookDao.findById(id);
    }

    public List<User> findAll() {
        return bookDao.findAll();
    }


}
