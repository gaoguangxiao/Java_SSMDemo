package com.itheima.service;

import com.itheima.config.SpringConfig;
import com.itheima.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//1、设置类运行器
@RunWith(SpringJUnit4ClassRunner.class)

//上下文配置
@ContextConfiguration(classes = SpringConfig.class)
public class UserServiceTest {
    @Autowired
    private BookService bookServce;

    @Test
    public void testfindById(){
        bookServce.findByid(1);
    }

    @Test
    public void testfindAll(){
//        List<User> users = bookServce.findAll();
//        System.out.println(users);
    }
}
