package com.itheima.dao;

import com.itheima.pojo.User;
import org.apache.ibatis.annotations.Select;

public interface BookDao {
    @Select("select * from sMybatis where id = #{id}")
    User findById(int id);
}
