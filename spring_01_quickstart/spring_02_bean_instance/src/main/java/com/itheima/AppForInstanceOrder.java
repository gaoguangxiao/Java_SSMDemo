package com.itheima;

import com.itheima.factory.OrderDaoFactory;
import com.itheima.service.OrderService;
import com.itheima.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForInstanceOrder {
    public static void main(String[] args) {

//        听前辈们说，早些年创建对象部分是通过工厂方法，如果改为bean创建怎么做
//        OrderService orderService = OrderDaoFactory.getOrderService();
//        orderService.save();

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicattionContext.xml");
//
        OrderService orderServicebean = (OrderService) ctx.getBean("OrderService");
//
        orderServicebean.save();


    }
}
