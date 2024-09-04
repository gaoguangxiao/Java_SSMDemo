package com;

import com.itheima.config.SpringConfig;
import com.itheima.pojo.User;
import com.itheima.service.BookServce;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class AppForJunit {
    public static void main(String[] args) throws IOException {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookServce bookServce = (BookServce) ctx.getBean(BookServce.class);
        User user = bookServce.findByid(1);
        System.out.println(user);
    }
}
