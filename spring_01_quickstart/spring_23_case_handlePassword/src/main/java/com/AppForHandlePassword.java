package com;

import com.itheima.config.springConfig;
import com.itheima.dao.ResourceDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppForHandlePassword {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(springConfig.class);
        ResourceDao resourceDao = ctx.getBean(ResourceDao.class);
        boolean flag =  resourceDao.openURL("http://www.baidu/com","root ");
        System.out.println(flag);
    }
}
