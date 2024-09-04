package com.itheima;


import com.itheima.service.BookServce;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForDICollection {
    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicattionContext.xml");

        BookServce bookServce = (BookServce) ctx.getBean("bookService");
        bookServce.save();

    }
}
