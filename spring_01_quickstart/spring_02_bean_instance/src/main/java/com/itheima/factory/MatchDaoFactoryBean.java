package com.itheima.factory;

import com.itheima.service.MatchService;
import com.itheima.service.impl.MatchServiceimpl;
import org.springframework.beans.factory.FactoryBean;

public class MatchDaoFactoryBean implements FactoryBean<MatchService> {

    //代替原始实例工厂创建对象的方法
    public MatchService getObject() throws Exception {
        return new MatchServiceimpl();
    }

    //
    public Class<?> getObjectType() {
        return MatchService.class;
    }


//  是否创建单列对象
    public boolean isSingleton() {
        return true;
    }
}
