package com.itheima.dao.impl;

import com.itheima.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.swing.*;

@Repository("BookDao2")
public class BookDaoImpl2 implements BookDao {

//    @Value("小修")
    @Value("${username}")
    private String name;
    public void save() {
        System.out.println("book dao save...2" + name);
    }

}
