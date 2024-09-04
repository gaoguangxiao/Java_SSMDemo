package com.itheima.factory;

import com.itheima.service.OrderService;
import com.itheima.service.impl.OrderServiceimpl;

public class OrderDaoFactory {
    public static OrderService getOrderService (){
        //在bean中 有一个属性 配置工厂里面具体实现的某个方法
//        factory-method="getOrderService"
        OrderService orderService = new OrderServiceimpl();
        return orderService;
    }

}
