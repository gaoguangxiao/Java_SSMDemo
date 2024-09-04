package com.itheima.dao.impl;

import com.itheima.dao.BookDao;

public class BookDaoImpl implements BookDao {

    private String name;
    public void save() {
        System.out.println("bool dao save...");
    }

    public BookDaoImpl(String name) {
        this.name = name;

        System.out.println("构造方式---" + name);
    }

//    public BookDaoImpl(String name) {
//        System.out.println("构造方式---");
//    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
}
