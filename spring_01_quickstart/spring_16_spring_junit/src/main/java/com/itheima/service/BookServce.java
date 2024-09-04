package com.itheima.service;

import com.itheima.pojo.User;

import java.util.List;

public interface BookServce {

    User findByid(int id);

    List<User>findAll();
}
