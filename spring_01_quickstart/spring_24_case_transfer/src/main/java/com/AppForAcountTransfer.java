package com;

import com.itheima.config.SpringConfig;
import com.itheima.dao.AccountDao;
import com.itheima.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class AppForAcountTransfer {
    public static void main(String[] args) throws IOException {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountService accountService = (AccountService) ctx.getBean(AccountService.class);
        accountService.transfer("z","l",100.0);
    }

}
