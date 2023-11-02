package com.itheima.dao.impl;

import com.itheima.dao.BookDao;

public class BookDaoImpl implements BookDao {
    public void save() {
        System.out.println("bool dao save...");
    }

    //bean初始化对应的操作
    public void init() {
        System.out.println("init....");
    }

    //bean销毁前对应的操作
    public void destory() {
        System.out.println("destory...");
    }
}
