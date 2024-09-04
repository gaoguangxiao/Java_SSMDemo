package com.itheima.dao.impl;

import com.itheima.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository("BookDao")
public class BookDaoImpl implements BookDao {
    public void save() {
        //记录程序当前执行（开始时间）
//        Long startTime = System.currentTimeMillis();
//        System.out.println(startTime);
        System.out.println("book dao save...");
    }

    public void update() {
        System.out.println("book dao update...");
    }

    public void delete() {
        System.out.println("book dao delete...");
    }

    public void select() {
        System.out.println("book dao select...");
    }
}
