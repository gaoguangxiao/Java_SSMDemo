package com.itheima;

import com.itheima.dao.UserDao;
import com.itheima.dao.impl.UserDaoImpl;
import com.itheima.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForDISet {
    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicattionContext.xml");

        UserService userService = (UserService) ctx.getBean("userService");
        userService.save();

        UserDaoImpl userDao = (UserDaoImpl) ctx.getBean("userDao");
        System.out.println("姓名" + userDao.getName() + "年龄是" + userDao.getAge());
    }
}
