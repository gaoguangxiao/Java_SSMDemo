package com.itheima.dao;

import com.itheima.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BookDao {
    @Select("select * from sMybatis where id = #{id}")
    User findById(int id);

    @Select("select * from sMybatis")
    List<User>findAll();
}
