package com.itheima;

import com.itheima.factory.MatchDaoFactory;
import com.itheima.service.MatchService;
import com.itheima.service.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static com.itheima.factory.OrderDaoFactory.getOrderService;

public class AppForInstanceMatch {
    public static void main(String[] args) {

//        实例工厂 创建
//        MatchDaoFactory matchDaoFactory = new MatchDaoFactory();
//        MatchService matchService = matchDaoFactory.getMatchService();
//        matchService.save();

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicattionContext.xml");
        MatchService matchService1  = (MatchService) ctx.getBean("MatchService");
        matchService1.save();
    }
}
