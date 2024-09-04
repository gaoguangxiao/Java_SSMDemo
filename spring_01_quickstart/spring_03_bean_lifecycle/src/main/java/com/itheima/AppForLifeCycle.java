package com.itheima;

import com.itheima.dao.BookDao;
import com.itheima.service.BookServce;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForLifeCycle {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicattionContext.xml");

        //第二种关闭:注册关闭钩子，关闭虚拟机之前，先把容器关闭。在任何时候都可以关闭，相对于close方式，比较委婉
        ctx.registerShutdownHook();

        BookServce bookServce = (BookServce) ctx.getBean("bookService");
        bookServce.save();

//        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
//        bookDao.save();


//        ApplicationContext 并没有这个close方法，关闭bean对象 只能使用ClassPathXmlApplicationContext实例，这种方法容器关闭比较暴力
//        ctx.close();

    }
}
