package com.itheima.dao.impl;

import com.itheima.dao.ResourceDao;
import org.springframework.stereotype.Repository;

@Repository
public class ResourceDaoImpl implements ResourceDao {
    public boolean openURL(String url, String psw) {
        System.out.println("url:" + url);
        return psw.equals("root");
    }
}
