package com.itheima.dao.impl;

import com.itheima.dao.BookDao;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Repository("BookDao")
//默认单例，改为非单例
//@Scope("prototype")
//单例
@Scope("singleton")
public class BookDaoImpl implements BookDao {

    public void save() {
        System.out.println("book dao save...");
    }

    public BookDaoImpl() {
        System.out.println("book constructor...");
    }

//    生命周期方法名可以任意写，添加注解

    //构造方法执行之后执行 的方法 init或者其他名称
    @PostConstruct
    public void init(){
        System.out.println("book init...");
    }

//    对象彻底销毁前执行的操作,
    @PreDestroy
    public void  destory121(){
        System.out.println("book destory...");
    }
}
