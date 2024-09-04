package com.itheima.mapper;

import com.itheima.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    List<User> selectAll();
//    User select(@Param("username") String username,@Param("password") String password);
    /*
    * 多参数"封装为Map集合，可使用param注解，param
    * */
    User select(String username, String password);

    @Select("select * from tb_user where id = #{id}")
    User selectById(int id);
}