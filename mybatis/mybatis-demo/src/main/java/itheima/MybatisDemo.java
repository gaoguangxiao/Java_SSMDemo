package itheima;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisDemo {
    public static void main(String[] args) throws IOException {
        //1、加载Mybatis
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //获取sqlsession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        List<com.itheima.pojo.User> users = sqlSession.selectList("test.selectAll");
        for (com.itheima.pojo.User user : users) {
            System.out.println(user);
        }
        sqlSession.close();
    }
}
