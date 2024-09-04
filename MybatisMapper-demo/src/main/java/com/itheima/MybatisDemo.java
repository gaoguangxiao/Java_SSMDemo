package com.itheima;

import com.itheima.Util.SqlSessionFactoryUtils;
import com.itheima.mapper.UserMapper;
import com.itheima.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import javax.servlet.http.Cookie;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisDemo {

    static SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();

    public static void main(String[] args) throws IOException {

        SqlSession sqlSession = factory.openSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = userMapper.selectAll();
        for (User user : users) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void testLogin() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//        //获取sqlsession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        String username = "zhangsan";
        String psw = "123";

        User user = userMapper.select(username,psw);

        System.out.println(user);

        sqlSession.close();
    }

    @Test
    public void testSelectByid() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//        //获取sqlsession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        User user = userMapper.selectById(1);

        System.out.println(user);

        sqlSession.close();
    }
}
