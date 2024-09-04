package com.itheima.test;

import com.itheima.Util.SqlSessionFactoryUtils;
import com.itheima.mapper.BrandMapper;
import com.itheima.mapper.UserMapper;
import com.itheima.pojo.Brand;
import com.itheima.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MybatisTest {

    private SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();
    @Test
    public void testSelectAll() throws IOException {
        System.out.println("获取所有数据");

//        String resource = "mybatis-config.xml";
//        InputStream inputStream = Resources.getResourceAsStream(resource);
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        List<Brand> brands = brandMapper.selectAll();
        for (Brand brand : brands) {
            System.out.println(brand);
        }
//        5、释放资源
        sqlSession.close();
    }

    //    查询某条详情
    @Test
    public void testSelectByid() throws IOException {
//        String resource = "mybatis-config.xml";
//        InputStream inputStream = Resources.getResourceAsStream(resource);
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        Brand brand = brandMapper.selectById(1);

        System.out.println(brand);
//        5、释放资源
        sqlSession.close();
    }

    @Test
    public void testselectCondition() throws IOException {

        Integer status = 0;
        String cname = "公司";
        String bName = "华为";

        cname = "%" + cname + "%";
        bName = "%" + bName + "%";

        Map map = new HashMap<>();
//        map.put("status",status);
//        map.put("brandName",bName);
        map.put("componeyName", cname);

        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
//        List<Brand> brands = brandMapper.selectByCondition(status,cname,bName);
        List<Brand> brands = brandMapper.selectByCondition(map);
        for (Brand brand : brands) {
            System.out.println(brand);
        }
//        5、释放资源
        sqlSession.close();
    }

    @Test
    public void testAdd() throws IOException {

        String cname = "波导手机";
        String bName = "波导";
        String des = "手机中的战斗机";
        int order = 1000;
        Integer status = 1;

        Brand brand = new Brand();
        brand.setBrandName(bName);
        brand.setComponeyName(cname);
        brand.setOrdered(order);
        brand.setDecription(des);
        brand.setStatus(status);

        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        brandMapper.add(brand);
//        提交事务

        System.out.println(brand.getId());
//        sqlSession.commit();

//        5、释放资源
        sqlSession.close();
    }

    @Test
    public void testUpdate() throws IOException {

        String cname = "波导手机";
        String bName = "波导";
        String des = "波导手机手机中的战斗机";
        int order = 5000;
        Integer status = 1;

        int id = 12;

        Brand brand = new Brand();
//        brand.setBrandName(bName);
//        brand.setComponeyName(cname);
        brand.setOrdered(order);
//        brand.setDecription(des);
//        brand.setStatus(status);
        brand.setId(id);

        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);

        int count = brandMapper.update(brand);

        System.out.println(count);
//        sqlSession.commit();

//        5、释放资源
        sqlSession.close();
    }

    @Test
    public void testDeleteByid() throws IOException {
        int id = 12;

        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        brandMapper.deleteById(id);

        sqlSession.close();
    }

    @Test
    public void testDeleteByids() throws IOException {
        int[] ids = {4,11,13};

        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        BrandMapper brandMapper = sqlSession.getMapper(BrandMapper.class);
        brandMapper.deleyeByids(ids);

        sqlSession.close();
    }
}
