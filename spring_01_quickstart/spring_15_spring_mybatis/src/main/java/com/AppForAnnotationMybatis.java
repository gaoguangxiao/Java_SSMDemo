package com;

import com.itheima.config.SpringConfig;
import com.itheima.pojo.User;
import com.itheima.service.BookServce;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class AppForAnnotationMybatis {
    public static void main(String[] args) throws IOException {

//        String resource = "SqlMapConfig.xml";
//        InputStream inputStream = Resources.getResourceAsStream(resource);
//        //创建sqlsessionFacory工厂
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//        //获取sqlsession
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//        //执行查询语句
//        BookDao bookDao = sqlSession.getMapper(BookDao.class);
//        User user = bookDao.findById(1);
//        System.out.println(user);
//        sqlSession.close();

        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookServce bookServce = (BookServce) ctx.getBean(BookServce.class);
        User user = bookServce.findByid(1);
        System.out.println(user);
    }
}
