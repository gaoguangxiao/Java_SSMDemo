package com;

import com.itheima.dao.BookDao;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class AppForBeanFactory {
    public static void main(String[] args) {
        Resource resource = new ClassPathResource("applicattionContext.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);//判断和createApplication加载顺序
        BookDao bookDao = beanFactory.getBean(BookDao.class);
        bookDao.save();
    }
}
