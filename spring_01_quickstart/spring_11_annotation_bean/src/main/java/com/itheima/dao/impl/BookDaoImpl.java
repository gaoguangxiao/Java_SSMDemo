package com.itheima.dao.impl;

import com.itheima.dao.BookDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//组件component
//@Component
@Component("BookDao") //配置bean名称
//@Repository
public class BookDaoImpl implements BookDao {

    private String name;
    public void save() {
        System.out.println("bool dao save...");
    }

}
