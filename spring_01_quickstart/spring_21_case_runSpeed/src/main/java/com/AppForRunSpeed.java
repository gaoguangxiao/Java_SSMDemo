package com;

import com.itheima.config.SpringConfig;
import com.itheima.pojo.User;
import com.itheima.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class AppForRunSpeed {
    public static void main(String[] args) throws IOException {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookService bookServce = (BookService) ctx.getBean(BookService.class);
        User user = bookServce.findByid(1);
        System.out.println(user);
    }

}
