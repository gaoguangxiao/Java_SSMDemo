package com.itheima.service.impl;

import com.itheima.service.UserService;

public class UserServiceimpl implements UserService {

//  构造方式
//    public UserServiceimpl() {
//        System.out.println("user constructor is running ....");
//    }

//  私有和公有都能造出，Spring造bean用的是无参构造方式，如果添加参数 构造失败
    private UserServiceimpl() {
        System.out.println("user constructor is running ....");
    }

    //Spring报错
//    从下面开始看，比如构造方式报错
//    Caused by: java.lang.NoSuchMethodException: com.itheima.service.impl.UserServiceimpl.<init>()
//    No default constructor found

//    public UserServiceimpl(int u) {
//        System.out.println("user constructor is running ....");
//    }

    public void save() {
        System.out.println("user service save ...");
    }

}
