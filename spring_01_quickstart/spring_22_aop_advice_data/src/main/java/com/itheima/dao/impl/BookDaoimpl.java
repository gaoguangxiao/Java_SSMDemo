package com.itheima.dao.impl;

import com.itheima.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoimpl implements BookDao {
    public String findName(int id, String psw) {
        System.out.println("id:" + id);
        return "itcast";
    }
}
